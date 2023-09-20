package com.tmm.eucurtokart.entities;

import java.time.LocalDate;

public class FotoPostagem {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String foto;
    private boolean ativo;
    private LocalDate dataCadastro;
    private Postagem postagem;

    public FotoPostagem() {

    }

    public FotoPostagem(Long id, String foto, boolean ativo, LocalDate dataCadastro, Postagem postagem) {
        this.id = id;
        this.foto = foto;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
        this.postagem = postagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Postagem getPostagem() {
        return postagem;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FotoPostagem other = (FotoPostagem) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}