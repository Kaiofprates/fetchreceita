package br.com.fetchreceita.http;

import br.com.fetchreceita.configs.Properties;
import br.com.fetchreceita.dto.InfoReceitaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class FetchDataReceitaClient {

    @Autowired
    private Properties properties;

    public InfoReceitaDto getData(String cnpj) {

        String resourceUrl = properties.getUrl() + cnpj;

        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoReceitaDto> response = client.exchange(resourceUrl,
                HttpMethod.GET,
                null,
                InfoReceitaDto.class);
        InfoReceitaDto body = response.getBody();
        if(Objects.nonNull(body)) {
            body.setCnpj(cnpj);
            return body;
        }else return null;

    }

}
