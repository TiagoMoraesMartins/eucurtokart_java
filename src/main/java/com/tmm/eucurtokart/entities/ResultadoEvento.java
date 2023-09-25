package com.tmm.eucurtokart.entities;

import java.time.LocalDate;

public class ResultadoEvento {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Evento evento;
    private String posicao;
    private LocalDate dataCadastro;
    private boolean ativo;
    private ParticipanteEvento participanteEvento;

    public ResultadoEvento() {

    }

    public ResultadoEvento(Long id, Evento evento, String posicao, LocalDate dataCadastro,
            boolean ativo, ParticipanteEvento participanteEvento) {
        this.id = id;
        this.evento = evento;
        this.posicao = posicao;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;
        this.participanteEvento = participanteEvento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
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

    public ParticipanteEvento getParticipanteEvento() {
        return participanteEvento;
    }

    public void setParticipanteEvento(ParticipanteEvento participanteEvento) {
        this.participanteEvento = participanteEvento;
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
        ResultadoEvento other = (ResultadoEvento) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}