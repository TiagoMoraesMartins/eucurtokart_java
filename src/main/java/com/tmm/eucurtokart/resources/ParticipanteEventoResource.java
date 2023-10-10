package com.tmm.eucurtokart.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmm.eucurtokart.entities.ParticipanteEvento;
import com.tmm.eucurtokart.repositories.ParticipanteEventoRepository;

@RestController
@RequestMapping(value = "/participantesevento")
public class ParticipanteEventoResource {

    @Autowired
    private ParticipanteEventoRepository participanteEventoRepository;

    @GetMapping
    public ResponseEntity<List<ParticipanteEvento>> getFindAll() {
        List<ParticipanteEvento> list = participanteEventoRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ParticipanteEvento> findById(@PathVariable Long id) {
        ParticipanteEvento participanteEvento = participanteEventoRepository.findById(id).get();
        return ResponseEntity.ok().body(participanteEvento);
    }
}