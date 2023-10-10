package com.tmm.eucurtokart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmm.eucurtokart.entities.UsuarioSeguidor;

@Repository
public interface UsuarioSeguidorRepository extends JpaRepository<UsuarioSeguidor, Long> {

}