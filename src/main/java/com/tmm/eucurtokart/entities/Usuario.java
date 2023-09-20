package com.tmm.eucurtokart.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    private LocalDate dataCadastro;
    private boolean ativo;

    /* @JsonIgnore é uma notation para que o json não serialize os eventos */
    @JsonIgnore
    private List<Evento> eventos = new ArrayList<>();

    @JsonIgnore
    private List<Postagem> postagens = new ArrayList<>();

    @JsonIgnore
    private List<Comentario> comentarios = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Usuario(Long id, String nome, String email, LocalDate dataNascimento, String sexo, String uf, String cidade,
            String rua, String numero, String bairro, String cep, Double peso, Double altura, String foto,
            String tipoUsuario, String nomeContato, String telefoneEstabelecimento, String celular,
            LocalDate dataCadastro, boolean ativo, List<Evento> eventos, List<Postagem> postagens,
            List<Comentario> comentarios, List<FotoPostagem> fotosPostagem) {
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
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelefoneEstabelecimento() {
        return telefoneEstabelecimento;
    }

    public void setTelefoneEstabelecimento(String telefoneEstabelecimento) {
        this.telefoneEstabelecimento = telefoneEstabelecimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
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