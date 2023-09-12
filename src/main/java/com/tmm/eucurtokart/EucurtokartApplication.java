package com.tmm.eucurtokart;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tmm.eucurtokart.entities.Evento;
import com.tmm.eucurtokart.entities.Usuario;
import com.tmm.eucurtokart.repositories.EventoRepository;
import com.tmm.eucurtokart.repositories.UsuarioRepository;

@SpringBootApplication
public class EucurtokartApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private EventoRepository eventoRepository;

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

		usuario1.getEventos().addAll(Arrays.asList(evento1, evento2));
		usuario2.getEventos().addAll(Arrays.asList(evento3));

		usuarioRepository.save(usuario1);
		usuarioRepository.save(usuario2);

		eventoRepository.save(evento1);
		eventoRepository.save(evento2);
		eventoRepository.save(evento3);
	}

}
