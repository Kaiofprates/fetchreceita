package br.com.fetchreceita.models;

import br.com.fetchreceita.dto.AtividadeDto;
import br.com.fetchreceita.dto.QsaDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_INFORECEITA")
public class InfoReceitaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<AtividadeModel> atividadePrincipal;

    private String dataSituacao;

    @OneToMany(cascade = CascadeType.ALL)
    private List<AtividadeModel> atividadesSecundarias;

    @OneToMany(cascade = CascadeType.ALL)
    private List<QsaModel> qsa;

    private String cnpj;
    private String natureza;
    private Double capitalSocial;
    private String complemento;
    private String tipo;
    private String nome;
    private String efr;
    private String uf;
    private String telefone;
    private String email;
    private String situacao;
    private String bairro;
    private String logradouro;
    private String numero;
    private String cep;
    private String municipio;
    private String porte;
    private String abertura;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<AtividadeModel> getAtividadePrincipal() {
        return atividadePrincipal;
    }

    public void setAtividadePrincipal(List<AtividadeModel> atividadePrincipal) {
        this.atividadePrincipal = atividadePrincipal;
    }

    public String getDataSituacao() {
        return dataSituacao;
    }

    public void setDataSituacao(String dataSituacao) {
        this.dataSituacao = dataSituacao;
    }

    public List<AtividadeModel> getAtividadesSecundarias() {
        return atividadesSecundarias;
    }

    public void setAtividadesSecundarias(List<AtividadeModel> atividadesSecundarias) {
        this.atividadesSecundarias = atividadesSecundarias;
    }

    public List<QsaModel> getQsa() {
        return qsa;
    }

    public void setQsa(List<QsaModel> qsa) {
        this.qsa = qsa;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public Double getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(Double capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEfr() {
        return efr;
    }

    public void setEfr(String efr) {
        this.efr = efr;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
