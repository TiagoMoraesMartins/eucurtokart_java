package com.tmm.eucurtokart.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmm.eucurtokart.entities.Postagem;
import com.tmm.eucurtokart.repositories.PostagemRepository;

@RestController
@RequestMapping(value = "/postagens")
public class PostagemResource {

	@Autowired
	private PostagemRepository postagemRepository;

	@GetMapping
	public ResponseEntity<List<Postagem>> getFindAll() {
		List<Postagem> list = postagemRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Postagem> findById(@PathVariable Long id) {
		Postagem postagem = postagemRepository.findById(id);
		return ResponseEntity.ok().body(postagem);
	}
}
