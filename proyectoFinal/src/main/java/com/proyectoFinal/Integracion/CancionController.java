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


import com.proyectoFinal.modelo.entidades.Cancion;
import com.proyectoFinal.servicios.CancionService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/apiCancion")
public class CancionController {
@Autowired
CancionService service;

@GetMapping("/canciones")
@ResponseStatus(HttpStatus.OK)
public List<Cancion> mostrarCanciones(){
	return service.findAll();
}

@GetMapping("/canciones/{id}")
@ResponseStatus(HttpStatus.OK)
public Cancion mostrarCancion(@PathVariable long id){
	return service.findById(id);
}

@PostMapping("/canciones")
@ResponseStatus(HttpStatus.CREATED)
public Cancion crearCancion(@RequestBody Cancion cancion){
	return service.save(cancion);
}

@DeleteMapping("/canciones/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void eliminarCancion(@PathVariable long id){
	service.deleteById(id);
}

@PutMapping("/canciones/{id}")
@ResponseStatus(HttpStatus.CREATED)
public Cancion actualizarCancion(@RequestBody Cancion cancion, @PathVariable long id){
	Cancion c = service.findById(id);
	c.setNombreCancion(cancion.getNombreCancion());
	c.setLinkCancion(cancion.getLinkCancion());
	return service.save(c);
}
}
