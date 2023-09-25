package com.tmm.eucurtokart.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmm.eucurtokart.entities.ResultadoEvento;
import com.tmm.eucurtokart.repositories.ResultadoEventoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/resultadosevento")
public class ResultadoEventoResource {

    @Autowired
    private ResultadoEventoRepository resultadoEventoRepository;

    @GetMapping
    public ResponseEntity<List<ResultadoEvento>> getFindAll() {
        List<ResultadoEvento> list = resultadoEventoRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ResultadoEvento> findById(@PathVariable Long id) {
        ResultadoEvento resultadoEvento = resultadoEventoRepository.findById(id);
        return ResponseEntity.ok().body(resultadoEvento);
    }

}