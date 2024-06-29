package com.proyectoFinal.servicios;

import java.util.List;

import com.proyectoFinal.modelo.entidades.Coleccion;

public interface ColeccionService {
	//promesa de los metodos del servicio
		public List<Coleccion> findAll();
		public Coleccion findById(Long id);
		public void deleteById(Long id);
		public Coleccion save(Coleccion coleccion);
}
