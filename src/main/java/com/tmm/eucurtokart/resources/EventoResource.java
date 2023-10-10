package com.tmm.eucurtokart.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmm.eucurtokart.entities.Evento;
import com.tmm.eucurtokart.repositories.EventoRepository;

@RestController
@RequestMapping(value = "/eventos")
public class EventoResource {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping
    public ResponseEntity<List<Evento>> getFindAll() {
        List<Evento> list = eventoRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Evento> findById(@PathVariable Long id) {
        Evento evento = eventoRepository.findById(id).get();
        return ResponseEntity.ok().body(evento);
    }

}