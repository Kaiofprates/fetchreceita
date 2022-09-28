package br.com.fetchreceita.models;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "TB_QSA")
public class QsaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "qsa_id")
    private UUID id;

    private String nome;
    private String qual;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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
