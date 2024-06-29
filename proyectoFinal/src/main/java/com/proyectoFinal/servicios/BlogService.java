package com.proyectoFinal.servicios;

import java.util.List;

import com.proyectoFinal.modelo.entidades.Blog;

public interface BlogService {
	//promesa de los metodos del servicio
		public List<Blog> findAll();
		public Blog findById(Long id);
		public void deleteById(Long id);
		public Blog save(Blog Blog);
}
