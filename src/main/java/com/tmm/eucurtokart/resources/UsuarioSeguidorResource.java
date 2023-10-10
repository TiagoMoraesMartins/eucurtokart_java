package com.tmm.eucurtokart.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmm.eucurtokart.entities.UsuarioSeguidor;
import com.tmm.eucurtokart.repositories.UsuarioSeguidorRepository;

@RestController
@RequestMapping(value = "/seguidores")
public class UsuarioSeguidorResource {

    @Autowired
    private UsuarioSeguidorRepository usuarioSeguidorRepository;

    @GetMapping
    public ResponseEntity<List<UsuarioSeguidor>> getFindAll() {
        List<UsuarioSeguidor> list = usuarioSeguidorRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UsuarioSeguidor> findById(@PathVariable Long id) {
        UsuarioSeguidor usuarioSeguidor = usuarioSeguidorRepository.findById(id).get();
        return ResponseEntity.ok().body(usuarioSeguidor);
    }

}