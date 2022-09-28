package br.com.fetchreceita.dto;

import lombok.Getter;
import lombok.Setter;


public class QsaDto {

    private String nome;
    private String qual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }
}
