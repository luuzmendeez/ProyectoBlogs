package com.proyectoFinal.servicios;

import java.util.List;

import com.proyectoFinal.modelo.entidades.Videojuego;


public interface VideojuegoService {
	//promesa de los metodos del servicio
		public List<Videojuego> findAll();
		public Videojuego findById(Long id);
		public void deleteById(Long id);
		public Videojuego save(Videojuego videojuego);
}
