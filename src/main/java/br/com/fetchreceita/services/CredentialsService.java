package br.com.fetchreceita.services;

import br.com.fetchreceita.dto.CredentialsDto;
import br.com.fetchreceita.models.UserModel;
import br.com.fetchreceita.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CredentialsService {

    @Autowired
    UserRepository repository;

    public void saveUser(CredentialsDto credentialsDto) {

        UserModel userModel = new UserModel();
        userModel.setUsername(credentialsDto.getUsername());
        userModel.setPassword( new BCryptPasswordEncoder().encode(credentialsDto.getPassword()));
        repository.save(userModel);

    }


}
