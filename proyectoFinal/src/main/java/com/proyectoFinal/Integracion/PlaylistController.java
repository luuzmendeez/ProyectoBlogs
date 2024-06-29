package com.proyectoFinal.Integracion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.proyectoFinal.modelo.entidades.Playlist;
import com.proyectoFinal.servicios.PlaylistService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/apiPlaylist")
public class PlaylistController {
@Autowired
PlaylistService service;

@GetMapping("/playlists")
@ResponseStatus(HttpStatus.OK)
public List<Playlist> mostrarPlaylist(){
	return service.findAll();
}

@GetMapping("/playlists/{id}")
@ResponseStatus(HttpStatus.OK)
public Playlist mostrarPlaylist(@PathVariable long id){
	return service.findById(id);
}

@PostMapping("/playlists")
@ResponseStatus(HttpStatus.CREATED)
public Playlist crearPlaylist(@RequestBody Playlist playlist){
	return service.save(playlist);
}

@DeleteMapping("/playlists/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void eliminarPlaylist(@PathVariable long id){
	service.deleteById(id);
}

@PutMapping("/playlists/{id}")
@ResponseStatus(HttpStatus.CREATED)
public Playlist actualizarPlaylist(@RequestBody Playlist playlist, @PathVariable long id){
	Playlist c = service.findById(id);
	c.setNombrePlaylist(playlist.getNombrePlaylist());
	return service.save(c);
}
}
