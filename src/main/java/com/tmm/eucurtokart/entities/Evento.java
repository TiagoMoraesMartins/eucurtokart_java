package com.tmm.eucurtokart.entities;

import java.io.Serializable;
import java.time.LocalDate;

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

    private Usuario usuario;

    public Evento() {
    }

    public Evento(Long id, String nome, String descricao, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public Evento(Long id, String nome, String descricao, LocalDate dataEvento, String foto,
            int qtdMinInscritos, int qtdMaxInscritos, boolean confirmado, boolean realizado,
            LocalDate dataCadastro, Usuario usuario) {
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
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return LocalDate return the dataEvento
     */
    public LocalDate getDataEvento() {
        return dataEvento;
    }

    /**
     * @param dataEvento the dataEvento to set
     */
    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
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
     * @return Integer return the qtdMinInscritos
     */
    public Integer getQtdMinInscritos() {
        return qtdMinInscritos;
    }

    /**
     * @param qtdMinInscritos the qtdMinInscritos to set
     */
    public void setQtdMinInscritos(Integer qtdMinInscritos) {
        this.qtdMinInscritos = qtdMinInscritos;
    }

    /**
     * @return Integer return the qtdMaxInscritos
     */
    public Integer getQtdMaxInscritos() {
        return qtdMaxInscritos;
    }

    /**
     * @param qtdMaxInscritos the qtdMaxInscritos to set
     */
    public void setQtdMaxInscritos(Integer qtdMaxInscritos) {
        this.qtdMaxInscritos = qtdMaxInscritos;
    }

    /**
     * @return boolean return the confirmado
     */
    public boolean isConfirmado() {
        return confirmado;
    }

    /**
     * @param confirmado the confirmado to set
     */
    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    /**
     * @return boolean return the realizado
     */
    public boolean isRealizado() {
        return realizado;
    }

    /**
     * @param realizado the realizado to set
     */
    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    /**
     * @return LocalDate return the dataCadastro
     */
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return Usuario return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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