package com.tmm.eucurtokart.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataEvento;
    private String foto;
    private int qtdMinInscritos;
    private int qtdMaxInscritos;
    private boolean confirmado;
    private boolean realizado;
    private LocalDate dataCadastro;
    private boolean ativo;
    private Usuario usuario;

    @JsonIgnore
    private List<FotoEvento> fotosEvento = new ArrayList<>();

    public Evento() {
    }

    public Evento(Long id, String nome, String descricao, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public Evento(Long id, String nome, String descricao, LocalDate dataEvento, String foto, int qtdMinInscritos,
            int qtdMaxInscritos, boolean confirmado, boolean realizado, LocalDate dataCadastro, boolean ativo,
            Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataEvento = dataEvento;
        this.foto = foto;
        this.qtdMinInscritos = qtdMinInscritos;
        this.qtdMaxInscritos = qtdMaxInscritos;
        this.confirmado = confirmado;
        this.realizado = realizado;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;
        this.usuario = usuario;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getQtdMinInscritos() {
        return qtdMinInscritos;
    }

    public void setQtdMinInscritos(Integer qtdMinInscritos) {
        this.qtdMinInscritos = qtdMinInscritos;
    }

    public Integer getQtdMaxInscritos() {
        return qtdMaxInscritos;
    }

    public void setQtdMaxInscritos(Integer qtdMaxInscritos) {
        this.qtdMaxInscritos = qtdMaxInscritos;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<FotoEvento> getFotosEvento() {
        return fotosEvento;
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
        Evento other = (Evento) o;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}