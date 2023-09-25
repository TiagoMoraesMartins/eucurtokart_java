package com.tmm.eucurtokart.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmm.eucurtokart.entities.FotoEvento;
import com.tmm.eucurtokart.repositories.FotoEventoRepository;

@RestController
@RequestMapping(value = "/fotosevento")
public class FotoEventoResource {

    @Autowired
    private FotoEventoRepository fotoEventoRepository;

    @GetMapping
    public ResponseEntity<List<FotoEvento>> getFindAll() {
        List<FotoEvento> list = fotoEventoRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<FotoEvento> findById(@PathVariable Long id) {
        FotoEvento fotoEvento = fotoEventoRepository.findById(id);
        return ResponseEntity.ok().body(fotoEvento);
    }
}