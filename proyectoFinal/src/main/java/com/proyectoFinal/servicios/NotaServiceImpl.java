package com.proyectoFinal.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.modelo.entidades.Nota;
import com.proyectoFinal.modelo.repositorios.NotaRepository;

@Service
public class NotaServiceImpl implements NotaService {
@Autowired
NotaRepository repository;

@Override
@Transactional(readOnly = true)
public List<Nota> findAll() {
	// TODO Auto-generated method stub
	return (List<Nota>) repository.findAll();
}

@Override
@Transactional(readOnly = true)
public Nota findById(Long id) {
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
public Nota save(Nota nota) {
	// TODO Auto-generated method stub
	return repository.save(nota);
}
}
