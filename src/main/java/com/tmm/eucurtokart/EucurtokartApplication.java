package com.tmm.eucurtokart;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tmm.eucurtokart.entities.Comentario;
import com.tmm.eucurtokart.entities.Evento;
import com.tmm.eucurtokart.entities.Postagem;
import com.tmm.eucurtokart.entities.Usuario;
import com.tmm.eucurtokart.repositories.ComentarioRepository;
import com.tmm.eucurtokart.repositories.EventoRepository;
import com.tmm.eucurtokart.repositories.PostagemRepository;
import com.tmm.eucurtokart.repositories.UsuarioRepository;

@SpringBootApplication
public class EucurtokartApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private EventoRepository eventoRepository;

	@Autowired
	private PostagemRepository postagemRepository;

	@Autowired
	private ComentarioRepository comentarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(EucurtokartApplication.class, args);
		System.out.println("Projeto Eucurtokart");
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario1 = new Usuario(1L, "Tiago", "tiago@tiago.com.br");
		Usuario usuario2 = new Usuario(2L, "Tiago Martins", "tiagomartins@tiago.com.br");

		Evento evento1 = new Evento(1L, "Kart animal", "Vamos realizar um evento...", usuario1);
		Evento evento2 = new Evento(2L, "Kart Pinhais", "Nessa sexta-feira teremos...", usuario1);
		Evento evento3 = new Evento(3L, "Kart São José", "Nesse domingo iniciaremos um novo...", usuario2);

		Postagem postagem1 = new Postagem(1L, "Descrição da postagem 1", LocalDate.now(), usuario1);
		Postagem postagem2 = new Postagem(2L, "Descrição da postagem 2", LocalDate.now(), usuario2);
		Postagem postagem3 = new Postagem(3L, "Descrição da postagem 3", LocalDate.now(), usuario1);

		Comentario comentario1 = new Comentario(1L, "Descrição do comentário 1", LocalDate.now(), postagem1, usuario1);
		Comentario comentario2 = new Comentario(2L, "Descrição do comentário 2", LocalDate.now(), postagem2, usuario2);
		Comentario comentario3 = new Comentario(3L, "Descrição do comentário 3", LocalDate.now(), postagem3, usuario1);

		usuario1.getEventos().addAll(Arrays.asList(evento1, evento2));
		usuario2.getEventos().addAll(Arrays.asList(evento3));

		usuario1.getPostagens().addAll(Arrays.asList(postagem1, postagem3));
		usuario2.getPostagens().addAll(Arrays.asList(postagem2));

		usuario1.getComentarios().addAll(Arrays.asList(comentario1, comentario2));
		usuario2.getComentarios().addAll(Arrays.asList(comentario3));

		usuarioRepository.save(usuario1);
		usuarioRepository.save(usuario2);

		eventoRepository.save(evento1);
		eventoRepository.save(evento2);
		eventoRepository.save(evento3);

		postagemRepository.save(postagem1);
		postagemRepository.save(postagem2);
		postagemRepository.save(postagem3);

		comentarioRepository.save(comentario1);
		comentarioRepository.save(comentario2);
		comentarioRepository.save(comentario3);

	}

}
