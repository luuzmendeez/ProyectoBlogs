package com.proyectoFinal.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.modelo.entidades.Cancion;
import com.proyectoFinal.modelo.repositorios.CancionRepository;

@Service
public class CancionServiceImpl implements CancionService{
@Autowired
CancionRepository repository;

@Override
@Transactional(readOnly = true)
public List<Cancion> findAll() {
	// TODO Auto-generated method stub
	return (List<Cancion>) repository.findAll();
}

@Override
@Transactional(readOnly = true)
public Cancion findById(Long id) {
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
public Cancion save(Cancion cancion) {
	// TODO Auto-generated method stub
	return repository.save(cancion);
}
}
