package com.tmm.eucurtokart.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Postagem implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String descricao;
	private LocalDate dataCadastro;
	private boolean ativo;
	private Usuario usuario;

	@JsonIgnore
	private List<Comentario> comentarios = new ArrayList<>();

	@JsonIgnore
	private List<FotoPostagem> fotosPostagem = new ArrayList<>();

	public Postagem() {

	}

	public Postagem(Long id, String descricao, LocalDate dataCadastro, boolean ativo, Usuario usuario) {
		this.id = id;
		this.descricao = descricao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public List<FotoPostagem> getFotosPostagem() {
		return fotosPostagem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Postagem other = (Postagem) obj;
		return Objects.equals(id, other.id);
	}

}
