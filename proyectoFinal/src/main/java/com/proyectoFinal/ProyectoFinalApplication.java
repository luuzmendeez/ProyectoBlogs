package com.proyectoFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoFinalApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}
@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//el builder te ahoora escribir c1 = new ctaegoria c1.set nombre categoria...
		/*Categoria c = Categoria.builder()
				//.idCategoria(5L) como es autoincrements esto es opcional
				.nombreCategoria("Celulares")
				.descripcionCategoria("Celulares Bonitos")
				.build();
		repository.save(c);*/
		
		System.out.println("Hola estoy funcionando");
		
	}

}
