package com.proyectoFinal.modelo.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.proyectoFinal.modelo.entidades.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
