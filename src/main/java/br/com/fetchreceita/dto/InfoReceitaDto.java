package br.com.fetchreceita.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class InfoReceitaDto {

    @JsonProperty("atividade_principal")
    private List<AtividadeDto> atividadePrincipal;

    @JsonProperty("data_situacao")
    private String dataSituacao;

    @JsonProperty("atividades_secundarias")
    private List<AtividadeDto> atividadesSecundarias;

    @JsonProperty("qsa")
    private List<QsaDto> qsa;

    @JsonProperty("natureza_juridica")
    private String natureza;

    @JsonProperty("capital_social")
    private Double capitalSocial;

    private String cnpj;
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

    public List<AtividadeDto> getAtividadePrincipal() {
        return atividadePrincipal;
    }

    public void setAtividadePrincipal(List<AtividadeDto> atividadePrincipal) {
        this.atividadePrincipal = atividadePrincipal;
    }

    public String getDataSituacao() {
        return dataSituacao;
    }

    public void setDataSituacao(String dataSituacao) {
        this.dataSituacao = dataSituacao;
    }

    public List<AtividadeDto> getAtividadesSecundarias() {
        return atividadesSecundarias;
    }

    public void setAtividadesSecundarias(List<AtividadeDto> atividadesSecundarias) {
        this.atividadesSecundarias = atividadesSecundarias;
    }

    public List<QsaDto> getQsa() {
        return qsa;
    }

    public void setQsa(List<QsaDto> qsa) {
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
