package com.tmm.eucurtokart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmm.eucurtokart.entities.FotoEvento;

@Repository
public interface FotoEventoRepository extends JpaRepository<FotoEvento, Long> {

}