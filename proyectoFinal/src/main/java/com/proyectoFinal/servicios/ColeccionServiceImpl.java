package com.proyectoFinal.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.modelo.entidades.Coleccion;
import com.proyectoFinal.modelo.repositorios.ColeccionRepository;

@Service
public class ColeccionServiceImpl implements ColeccionService{
@Autowired
ColeccionRepository repository;

@Override
@Transactional(readOnly = true)
public List<Coleccion> findAll() {
	// TODO Auto-generated method stub
	return (List<Coleccion>) repository.findAll();
}

@Override
@Transactional(readOnly = true)
public Coleccion findById(Long id) {
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
public Coleccion save(Coleccion coleccion) {
	// TODO Auto-generated method stub
	return repository.save(coleccion);
}
}
