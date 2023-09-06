package com.tmm.eucurtokart.resources;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmm.eucurtokart.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @GetMapping
    public ResponseEntity<List<Usuario>> getfindAll() {
        List<Usuario> list = new ArrayList<>();
        list.add(new Usuario(1L, "Tiago", LocalDate.parse("1980-01-11"), "M", "PR", "Curitiba", "José Aniceto", "11",
                "CIC", "81350-686", 88.00, 1.80, "foto.png", "P", "TMM", "41-3245-6042", "41-99670-2688"));
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        return ResponseEntity.ok().body(usuario);
    }

}