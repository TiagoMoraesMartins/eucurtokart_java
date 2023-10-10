package com.tmm.eucurtokart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmm.eucurtokart.entities.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}