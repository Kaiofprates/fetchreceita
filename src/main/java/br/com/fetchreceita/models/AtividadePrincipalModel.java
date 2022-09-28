package br.com.fetchreceita.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "TB_ATIVIDADE_PRINCIPAL")
public class AtividadePrincipalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "atividade_principal_id")
    private UUID id;

    private String text;
    private String code;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}