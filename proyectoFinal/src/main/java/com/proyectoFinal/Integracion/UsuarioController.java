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

import com.proyectoFinal.modelo.entidades.Usuario;
import com.proyectoFinal.servicios.UsuarioService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/apiUsuario")
public class UsuarioController {
@Autowired
UsuarioService service;

@GetMapping("/usuarios")
@ResponseStatus(HttpStatus.OK)
public List<Usuario> mostrarUsuario(){
	return service.findAll();
}

@GetMapping("/usuarios/{id}")
@ResponseStatus(HttpStatus.OK)
public Usuario mostrarUsuario(@PathVariable long id){
	return service.findById(id);
}

@PostMapping("/usuarios")
@ResponseStatus(HttpStatus.CREATED)
public Usuario crearUsuario(@RequestBody Usuario usuario){
	return service.save(usuario);
}

@DeleteMapping("/usuarios/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void eliminarUsuario(@PathVariable long id){
	service.deleteById(id);
}

@PutMapping("/usuarios/{id}")
@ResponseStatus(HttpStatus.CREATED)
public Usuario actualizarUsuario(@RequestBody Usuario usuario, @PathVariable long id){
	Usuario c = service.findById(id);
	c.setNombreUsuario(usuario.getNombreUsuario());
	c.setCorreo(usuario.getCorreo());
	c.setEdad(usuario.getEdad());
	c.setNombreUsuario(usuario.getNombreUsuario());
	c.setPassword(usuario.getPassword());
	return service.save(c);
}
}
