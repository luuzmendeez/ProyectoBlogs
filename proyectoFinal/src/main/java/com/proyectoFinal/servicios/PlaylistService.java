package com.proyectoFinal.servicios;

import java.util.List;

import com.proyectoFinal.modelo.entidades.Playlist;


public interface PlaylistService {
	//promesa de los metodos del servicio
		public List<Playlist> findAll();
		public Playlist findById(Long id);
		public void deleteById(Long id);
		public Playlist save(Playlist playlist);
}
