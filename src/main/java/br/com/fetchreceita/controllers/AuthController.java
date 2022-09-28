package br.com.fetchreceita.controllers;

import br.com.fetchreceita.dto.CredentialsDto;
import br.com.fetchreceita.models.InfoReceitaModel;
import br.com.fetchreceita.services.CredentialsService;
import br.com.fetchreceita.services.InfoReceitaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/fetchreceita")
public class AuthController {

    private static final Logger log = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    CredentialsService credentialsService;

    @Autowired
    InfoReceitaService service;

    @PostMapping("/auth")
    public ResponseEntity<Object> creatCredentials(@RequestBody @Valid CredentialsDto credentialsDto) {
        log.info("dto: " + credentialsDto.toString());
        credentialsService.saveUser(credentialsDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<InfoReceitaModel> getAllCnpjs(@RequestParam(value = "cnpj", required = false) String cnpj)
            throws Exception {

        InfoReceitaModel response = service.findByCnpj(cnpj);
        return ResponseEntity.ok(response);
    }

}
