package com.tmm.eucurtokart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tmm.eucurtokart.entities.Usuario;
import com.tmm.eucurtokart.repositories.UsuarioRepository;

@SpringBootApplication
public class EucurtokartApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(EucurtokartApplication.class, args);
		System.out.println("Projeto Eucurtokart");
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario1 = new Usuario(1L, "Tiago", "tiago@tiago.com.br");
		Usuario usuario2 = new Usuario(2L, "Tiago Martins", "tiagomartins@tiago.com.br");

		usuarioRepository.save(usuario1);
		usuarioRepository.save(usuario2);
	}

}
