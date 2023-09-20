package com.tmm.eucurtokart.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmm.eucurtokart.entities.FotoPostagem;
import com.tmm.eucurtokart.repositories.FotoPostagemRepository;

@RestController
@RequestMapping(value = "/fotopostagem")
public class FotoPostagemResource {

    @Autowired
    private FotoPostagemRepository fotoPostagemRepository;

    @GetMapping
    public ResponseEntity<List<FotoPostagem>> getFindAll() {
        List<FotoPostagem> list = fotoPostagemRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<FotoPostagem> findById(@PathVariable Long id) {
        FotoPostagem fotoPostagem = fotoPostagemRepository.findById(id);
        return ResponseEntity.ok().body(fotoPostagem);

    }

}