package com.tmm.eucurtokart.entities;

import java.time.LocalDate;

public class UsuarioSeguidor {

    private static final long serialVersionUID = 1L;

    private Long id;
    private boolean ativo;
    private LocalDate dataCadastro;
    private Usuario usuario;

    public UsuarioSeguidor() {

    }

    public UsuarioSeguidor(Long id, boolean ativo, LocalDate dataCadastro, Usuario usuario) {
        this.id = id;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UsuarioSeguidor other = (UsuarioSeguidor) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}