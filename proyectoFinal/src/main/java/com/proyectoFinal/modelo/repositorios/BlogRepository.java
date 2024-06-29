package com.proyectoFinal.modelo.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.proyectoFinal.modelo.entidades.Blog;

public interface BlogRepository extends CrudRepository<Blog, Long> {

}
