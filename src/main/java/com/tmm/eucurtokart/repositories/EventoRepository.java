package com.tmm.eucurtokart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmm.eucurtokart.entities.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

}