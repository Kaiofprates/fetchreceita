package br.com.fetchreceita.services;

import br.com.fetchreceita.dto.InfoReceitaDto;
import br.com.fetchreceita.http.FetchDataReceitaClient;
import br.com.fetchreceita.mappers.InfoModelMapper;
import br.com.fetchreceita.models.InfoReceitaModel;
import br.com.fetchreceita.repository.InfoReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class InfoReceitaService {

    @Autowired
    InfoReceitaRepository repository;

    @Autowired
    FetchDataReceitaClient client;

    public void save(InfoReceitaDto dto) {
        InfoReceitaModel model = InfoModelMapper.INSTANCE.mapFrom(dto);
        InfoReceitaModel response = repository.save(model);
        System.out.println(response);
    }

    public InfoReceitaModel findByCnpj(String cnpj) throws Exception {
        Optional<InfoReceitaModel> result =  repository.findByCnpj(cnpj);

        if(result.isPresent()) {
            return result.get();
        } else {
            InfoReceitaDto response = client.getData(cnpj);
            if(Objects.nonNull(response)) {
                save(response);
                return InfoModelMapper.INSTANCE.mapFrom(response);
            } else return null;
        }
        
    }

}
