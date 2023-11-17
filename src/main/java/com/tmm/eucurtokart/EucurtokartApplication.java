package com.tmm.eucurtokart;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tmm.eucurtokart.entities.Comentario;
import com.tmm.eucurtokart.entities.Evento;
import com.tmm.eucurtokart.entities.FotoEvento;
import com.tmm.eucurtokart.entities.FotoPostagem;
import com.tmm.eucurtokart.entities.ParticipanteEvento;
import com.tmm.eucurtokart.entities.Postagem;
import com.tmm.eucurtokart.entities.Usuario;
import com.tmm.eucurtokart.entities.UsuarioSeguidor;
import com.tmm.eucurtokart.repositories.ComentarioRepository;
import com.tmm.eucurtokart.repositories.EventoRepository;
import com.tmm.eucurtokart.repositories.FotoEventoRepository;
import com.tmm.eucurtokart.repositories.FotoPostagemRepository;
import com.tmm.eucurtokart.repositories.ParticipanteEventoRepository;
import com.tmm.eucurtokart.repositories.PostagemRepository;
import com.tmm.eucurtokart.repositories.UsuarioRepository;
import com.tmm.eucurtokart.repositories.UsuarioSeguidorRepository;

@SpringBootApplication
public class EucurtokartApplication {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private EventoRepository eventoRepository;

	@Autowired
	private PostagemRepository postagemRepository;

	@Autowired
	private ComentarioRepository comentarioRepository;

	@Autowired
	private FotoPostagemRepository fotoPostagemRepository;

	@Autowired
	private UsuarioSeguidorRepository usuarioSeguidorRepository;

	@Autowired
	private FotoEventoRepository fotoEventoRepository;

	@Autowired
	private ParticipanteEventoRepository participanteEventoRepository;

	public static void main(String[] args) {
		SpringApplication.run(EucurtokartApplication.class, args);
		System.out.println("Projeto Eucurtokart");
	}

	/*
	 * @Override
	 * public void run(String... args) throws Exception {
	 * Usuario usuario1 = new Usuario(null, "Tiago", "tiago@tiago.com.br");
	 * Usuario usuario2 = new Usuario(null, "Tiago Martins",
	 * "tiagomartins@tiago.com.br");
	 * Usuario usuario3 = new Usuario(null, "TMM", "tmm@tmm.com.br");
	 * 
	 * Evento evento1 = new Evento(null, "Kart animal",
	 * "Vamos realizar um evento...", usuario1);
	 * Evento evento2 = new Evento(null, "Kart Pinhais",
	 * "Nessa sexta-feira teremos...", usuario1);
	 * Evento evento3 = new Evento(null, "Kart São José",
	 * "Nesse domingo iniciaremos um novo...", usuario2);
	 * 
	 * Postagem postagem1 = new Postagem(null, "Descrição da postagem 1",
	 * LocalDate.now(), true, usuario1);
	 * Postagem postagem2 = new Postagem(null, "Descrição da postagem 2",
	 * LocalDate.now(), true, usuario2);
	 * Postagem postagem3 = new Postagem(null, "Descrição da postagem 3",
	 * LocalDate.now(), true, usuario1);
	 * 
	 * Comentario comentario1 = new Comentario(null, "Descrição do comentário 1",
	 * LocalDate.now(), true, postagem1,
	 * usuario1);
	 * Comentario comentario2 = new Comentario(null, "Descrição do comentário 2",
	 * LocalDate.now(), true, postagem2,
	 * usuario2);
	 * Comentario comentario3 = new Comentario(null, "Descrição do comentário 3",
	 * LocalDate.now(), true, postagem3,
	 * usuario1);
	 * 
	 * FotoPostagem fotoPostagem1 = new FotoPostagem(null, "foto.jpg", true,
	 * LocalDate.now(), postagem1);
	 * FotoPostagem fotoPostagem2 = new FotoPostagem(null, "foto.png", true,
	 * LocalDate.now(), postagem2);
	 * FotoPostagem fotoPostagem3 = new FotoPostagem(null, "foto.svg", true,
	 * LocalDate.now(), postagem3);
	 * 
	 * UsuarioSeguidor usuarioSeguidor1 = new UsuarioSeguidor(null, true,
	 * LocalDate.now(), usuario1);
	 * UsuarioSeguidor usuarioSeguidor2 = new UsuarioSeguidor(null, true,
	 * LocalDate.now(), usuario1);
	 * UsuarioSeguidor usuarioSeguidor3 = new UsuarioSeguidor(null, true,
	 * LocalDate.now(), usuario3);
	 * 
	 * FotoEvento fotoEvento1 = new FotoEvento(null, evento1, "foto1.png",
	 * LocalDate.now(), true);
	 * FotoEvento fotoEvento2 = new FotoEvento(null, evento1, "foto2.png",
	 * LocalDate.now(), true);
	 * FotoEvento fotoEvento3 = new FotoEvento(null, evento2, "foto1.png",
	 * LocalDate.now(), true);
	 * 
	 * ParticipanteEvento participanteEvento1 = new ParticipanteEvento(null,
	 * evento1, usuario1, true, LocalDate.now(),
	 * LocalDate.now(), true, "Primeiro Lugar", LocalDate.now());
	 * ParticipanteEvento participanteEvento2 = new ParticipanteEvento(null,
	 * evento1, usuario2, true, LocalDate.now(),
	 * LocalDate.now(), true, "Segundo Lugar", LocalDate.now());
	 * ParticipanteEvento participanteEvento3 = new ParticipanteEvento(null,
	 * evento1, usuario3, true, LocalDate.now(),
	 * LocalDate.now(), true, "Terceiro Lugar", LocalDate.now());
	 * 
	 * usuario1.getEventos().addAll(Arrays.asList(evento1, evento2));
	 * usuario2.getEventos().addAll(Arrays.asList(evento3));
	 * 
	 * usuario1.getPostagens().addAll(Arrays.asList(postagem1, postagem3));
	 * usuario2.getPostagens().addAll(Arrays.asList(postagem2));
	 * 
	 * usuario1.getComentarios().addAll(Arrays.asList(comentario1, comentario2));
	 * usuario2.getComentarios().addAll(Arrays.asList(comentario3));
	 * 
	 * usuario1.getUsuariosSeguidores().addAll(Arrays.asList(usuarioSeguidor1,
	 * usuarioSeguidor2));
	 * usuario3.getUsuariosSeguidores().addAll(Arrays.asList(usuarioSeguidor3));
	 * 
	 * postagem1.getFotosPostagem().addAll(Arrays.asList(fotoPostagem1));
	 * postagem2.getFotosPostagem().addAll(Arrays.asList(fotoPostagem2));
	 * postagem3.getFotosPostagem().addAll(Arrays.asList(fotoPostagem3));
	 * 
	 * evento1.getFotosEvento().addAll(Arrays.asList(fotoEvento1, fotoEvento2));
	 * evento2.getFotosEvento().addAll(Arrays.asList(fotoEvento3));
	 * 
	 * evento1.getParticipantesEvento()
	 * .addAll(Arrays.asList(participanteEvento1, participanteEvento2,
	 * participanteEvento3));
	 * 
	 * usuarioRepository.save(usuario1);
	 * usuarioRepository.save(usuario2);
	 * 
	 * eventoRepository.save(evento1);
	 * eventoRepository.save(evento2);
	 * eventoRepository.save(evento3);
	 * 
	 * postagemRepository.save(postagem1);
	 * postagemRepository.save(postagem2);
	 * postagemRepository.save(postagem3);
	 * 
	 * comentarioRepository.save(comentario1);
	 * comentarioRepository.save(comentario2);
	 * comentarioRepository.save(comentario3);
	 * 
	 * fotoPostagemRepository.save(fotoPostagem1);
	 * fotoPostagemRepository.save(fotoPostagem2);
	 * fotoPostagemRepository.save(fotoPostagem3);
	 * 
	 * usuarioSeguidorRepository.save(usuarioSeguidor1);
	 * usuarioSeguidorRepository.save(usuarioSeguidor2);
	 * usuarioSeguidorRepository.save(usuarioSeguidor3);
	 * 
	 * fotoEventoRepository.save(fotoEvento1);
	 * fotoEventoRepository.save(fotoEvento2);
	 * fotoEventoRepository.save(fotoEvento3);
	 * 
	 * participanteEventoRepository.save(participanteEvento1);
	 * participanteEventoRepository.save(participanteEvento2);
	 * participanteEventoRepository.save(participanteEvento3);
	 * 
	 * }
	 */
}
