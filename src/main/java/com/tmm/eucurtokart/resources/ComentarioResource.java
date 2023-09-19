package com.tmm.eucurtokart.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmm.eucurtokart.entities.Comentario;
import com.tmm.eucurtokart.repositories.ComentarioRepository;

@RestController
@RequestMapping(value = "/comentarios")
public class ComentarioResource {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping
    public ResponseEntity<List<Comentario>> getFindAll() {
        List<Comentario> list = comentarioRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Comentario> findById(@PathVariable Long id) {
        Comentario comentario = comentarioRepository.findById(id);
        return ResponseEntity.ok().body(comentario);
    }

}