package com.tmm.eucurtokart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmm.eucurtokart.entities.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}