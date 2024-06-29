package com.proyectoFinal.servicios;

import java.util.List;

import com.proyectoFinal.modelo.entidades.Cancion;

public interface CancionService {
	//promesa de los metodos del servicio
		public List<Cancion> findAll();
		public Cancion findById(Long id);
		public void deleteById(Long id);
		public Cancion save(Cancion cancion);
}
