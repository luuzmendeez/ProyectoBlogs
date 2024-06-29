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


import com.proyectoFinal.modelo.entidades.Nota;
import com.proyectoFinal.servicios.NotaService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/apiNota")
public class NotaController {
@Autowired
NotaService service;

@GetMapping("/notas")
@ResponseStatus(HttpStatus.OK)
public List<Nota> mostrarNota(){
	return service.findAll();
}

@GetMapping("/notas/{id}")
@ResponseStatus(HttpStatus.OK)
public Nota mostrarNota(@PathVariable long id){
	return service.findById(id);
}

@PostMapping("/notas")
@ResponseStatus(HttpStatus.CREATED)
public Nota crearNota (@RequestBody Nota nota){
	return service.save(nota);
}

@DeleteMapping("/notas/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void eliminarCategoria(@PathVariable long id){
	service.deleteById(id);
}

@PutMapping("/notas/{id}")
@ResponseStatus(HttpStatus.CREATED)
public Nota actualizarNota(@RequestBody Nota nota, @PathVariable long id){
	Nota c = service.findById(id);
	c.setNombreNota(nota.getNombreNota());
	c.setDescripcionNota(nota.getDescripcionNota());
	return service.save(c);
}
}
