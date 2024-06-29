package com.proyectoFinal.servicios;

import java.util.List;

import com.proyectoFinal.modelo.entidades.Usuario;


public interface UsuarioService {
	//promesa de los metodos del servicio
		public List<Usuario> findAll();
		public Usuario findById(Long id);
		public void deleteById(Long id);
		public Usuario save(Usuario usuario);
}
