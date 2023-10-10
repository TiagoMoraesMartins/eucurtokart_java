package com.tmm.eucurtokart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmm.eucurtokart.entities.ParticipanteEvento;

@Repository
public interface ParticipanteEventoRepository extends JpaRepository<ParticipanteEvento, Long> {

}