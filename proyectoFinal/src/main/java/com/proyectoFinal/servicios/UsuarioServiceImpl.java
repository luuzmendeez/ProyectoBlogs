package com.proyectoFinal.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.modelo.entidades.Usuario;
import com.proyectoFinal.modelo.repositorios.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
@Autowired
UsuarioRepository repository;

@Override
@Transactional(readOnly = true)
public List<Usuario> findAll() {
	// TODO Auto-generated method stub
	return (List<Usuario>) repository.findAll();
}

@Override
@Transactional(readOnly = true)
public Usuario findById(Long id) {
	// TODO Auto-generated method stub
	return repository.findById(id).orElse(null);
}

@Override
@Transactional
public void deleteById(Long id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}

@Override
@Transactional
public Usuario save(Usuario usuario) {
	// TODO Auto-generated method stub
	return repository.save(usuario);
}
}
