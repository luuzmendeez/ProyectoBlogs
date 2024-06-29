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

import com.proyectoFinal.modelo.entidades.Videojuego;
import com.proyectoFinal.servicios.VideojuegoService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/apiVideojuego")
public class VideojuegoController {
@Autowired
VideojuegoService service;

@GetMapping("/videojuegos")
@ResponseStatus(HttpStatus.OK)
public List<Videojuego> mostrarVideojuego(){
	return service.findAll();
}

@GetMapping("/videojuegos/{id}")
@ResponseStatus(HttpStatus.OK)
public Videojuego mostrarVideojuego(@PathVariable long id){
	return service.findById(id);
}

@PostMapping("/videojuegos")
@ResponseStatus(HttpStatus.CREATED)
public Videojuego crearVideojuego(@RequestBody Videojuego videojuego){
	return service.save(videojuego);
}

@DeleteMapping("/videojuegos/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void eliminarVideojuego(@PathVariable long id){
	service.deleteById(id);
}

@PutMapping("/videojuegos/{id}")
@ResponseStatus(HttpStatus.CREATED)
public Videojuego actualizarVideojuego(@RequestBody Videojuego videojuego, @PathVariable long id){
	Videojuego c = service.findById(id);
	c.setNombreVideojuego(videojuego.getNombreVideojuego());
	c.setDescripcionVideojuego(videojuego.getDescripcionVideojuego());
	c.setImagenVideojuego(videojuego.getImagenVideojuego());
	return service.save(c);
}
}
