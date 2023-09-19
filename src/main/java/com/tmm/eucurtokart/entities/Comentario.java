package com.tmm.eucurtokart.entities;

import java.time.LocalDate;

public class Comentario {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String descricao;
    private LocalDate dataComentario;

    private Postagem postagem;

    private Usuario usuario;

    public Comentario() {

    }

    public Comentario(Long id, String descricao, LocalDate dataComentario, Postagem postagem, Usuario usuario) {
        this.id = id;
        this.descricao = descricao;
        this.dataComentario = dataComentario;
        this.postagem = postagem;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(LocalDate dataComentario) {
        this.dataComentario = dataComentario;
    }

    public Postagem getPostagem() {
        return postagem;
    }

    public void setPostagem(Postagem postagem) {
        this.postagem = postagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

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
        Comentario other = (Comentario) o;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
