package com.example.alura.screenmatchspring;

import com.example.alura.screenmatchspring.principal.Principal;
import com.example.alura.screenmatchspring.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchspringApplication implements CommandLineRunner {

	@Autowired
	private SerieRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchspringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
