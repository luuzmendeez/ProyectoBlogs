package com.proyectoFinal.servicios;

import java.util.List;

import com.proyectoFinal.modelo.entidades.Nota;


public interface NotaService {
	//promesa de los metodos del servicio
		public List<Nota> findAll();
		public Nota findById(Long id);
		public void deleteById(Long id);
		public Nota save(Nota nota);
}
