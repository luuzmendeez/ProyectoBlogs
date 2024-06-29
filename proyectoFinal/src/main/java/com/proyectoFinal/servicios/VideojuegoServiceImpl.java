package com.proyectoFinal.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.modelo.entidades.Videojuego;
import com.proyectoFinal.modelo.repositorios.VideojuegoRepository;

@Service
public class VideojuegoServiceImpl implements VideojuegoService {
@Autowired
VideojuegoRepository repository;

@Override
@Transactional(readOnly = true)
public List<Videojuego> findAll() {
	// TODO Auto-generated method stub
	return (List<Videojuego>) repository.findAll();
}

@Override
@Transactional(readOnly = true)
public Videojuego findById(Long id) {
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
public Videojuego save(Videojuego videojuego) {
	// TODO Auto-generated method stub
	return repository.save(videojuego);
}

}
