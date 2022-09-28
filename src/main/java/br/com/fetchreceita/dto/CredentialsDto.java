package br.com.fetchreceita.dto;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotNull;


public class CredentialsDto {

    @NotNull
    private String username;
    @NotNull
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
