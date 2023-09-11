package com.tmm.eucurtokart.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private String sexo;
    private String uf;
    private String cidade;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private Double peso;
    private Double altura;
    private String foto;
    private String tipoUsuario;
    private String nomeContato;
    private String telefoneEstabelecimento;
    private String celular;

    public Usuario(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Usuario(Long id, String nome, String email, LocalDate dataNascimento, String sexo,
            String uf, String cidade, String rua, String numero, String bairro, String cep,
            Double peso, Double altura, String foto, String tipoUsuario, String nomeContato,
            String telefoneEstabelecimento, String celular) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.uf = uf;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.peso = peso;
        this.altura = altura;
        this.foto = foto;
        this.tipoUsuario = tipoUsuario;
        this.nomeContato = nomeContato;
        this.telefoneEstabelecimento = telefoneEstabelecimento;
        this.celular = celular;
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param nome the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return LocalDate return the dataNascimento
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return Character return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return String return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return String return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return String return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return String return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return String return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return String return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return Float return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return Float return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * @return String return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @return Character return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return String return the nomeContato
     */
    public String getNomeContato() {
        return nomeContato;
    }

    /**
     * @param nomeContato the nomeContato to set
     */
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    /**
     * @return String return the telefoneEstabelecimento
     */
    public String getTelefoneEstabelecimento() {
        return telefoneEstabelecimento;
    }

    /**
     * @param telefoneEstabelecimento the telefoneEstabelecimento to set
     */
    public void setTelefoneEstabelecimento(String telefoneEstabelecimento) {
        this.telefoneEstabelecimento = telefoneEstabelecimento;
    }

    /**
     * @return String return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Usuario other = (Usuario) o;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}