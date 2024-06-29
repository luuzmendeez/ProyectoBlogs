package com.proyectoFinal.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.modelo.entidades.Playlist;
import com.proyectoFinal.modelo.repositorios.PlaylistRepository;

@Service
public class PlaylistServiceImpl implements PlaylistService{
@Autowired
PlaylistRepository repository;

@Override
@Transactional(readOnly = true)
public List<Playlist> findAll() {
	// TODO Auto-generated method stub
	return (List<Playlist>) repository.findAll();
}

@Override
@Transactional(readOnly = true)
public Playlist findById(Long id) {
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
public Playlist save(Playlist playlist) {
	// TODO Auto-generated method stub
	return repository.save(playlist);
}

}
