package com.tmm.eucurtokart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmm.eucurtokart.entities.FotoPostagem;

@Repository
public interface FotoPostagemRepository extends JpaRepository<FotoPostagem, Long> {

}