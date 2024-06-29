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

import com.proyectoFinal.modelo.entidades.Coleccion;
import com.proyectoFinal.servicios.ColeccionService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/apiColeccion")
public class ColeccionController {
@Autowired
ColeccionService service;

@GetMapping("/colecciones")
@ResponseStatus(HttpStatus.OK)
public List<Coleccion> mostrarColeccion(){
	return service.findAll();
}

@GetMapping("/colecciones/{id}")
@ResponseStatus(HttpStatus.OK)
public Coleccion mostrarColeccion(@PathVariable long id){
	return service.findById(id);
}

@PostMapping("/colecciones")
@ResponseStatus(HttpStatus.CREATED)
public Coleccion crearColeccion(@RequestBody Coleccion coleccion){
	return service.save(coleccion);
}

@DeleteMapping("/colecciones/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void eliminarColeccion(@PathVariable long id){
	service.deleteById(id);
}

@PutMapping("/colecciones/{id}")
@ResponseStatus(HttpStatus.CREATED)
public Coleccion actualizarColeccion(@RequestBody Coleccion coleccion, @PathVariable long id){
	Coleccion c = service.findById(id);
	c.setNombreColeccion(coleccion.getNombreColeccion());
	c.setDescripcionColeccion(coleccion.getDescripcionColeccion());
	c.setImagenColeccion(coleccion.getImagenColeccion());
	return service.save(c);
}
}
