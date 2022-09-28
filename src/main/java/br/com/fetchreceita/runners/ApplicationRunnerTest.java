package br.com.fetchreceita.runners;

import br.com.fetchreceita.models.CustomersEntity;
import br.com.fetchreceita.models.InfoReceitaModel;
import br.com.fetchreceita.models.OrdersEntity;
import br.com.fetchreceita.repository.CustumerRepository;
import br.com.fetchreceita.repository.InfoReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.*;

@Component
@Transactional
public class ApplicationRunnerTest implements ApplicationRunner {

    @Autowired
    InfoReceitaRepository repository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        UUID uuid = UUID.fromString("42f879cb-6fa7-477e-a9d9-9e067dfd782a");
        Optional<InfoReceitaModel> entity = repository.findById(uuid);
        if(entity.isPresent()) {
            System.out.println(entity.get().toString());
        }
    }
}
