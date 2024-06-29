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

import com.proyectoFinal.modelo.entidades.Blog;
import com.proyectoFinal.servicios.BlogService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/apiBlog")
public class BlogController {
@Autowired
BlogService service;

@GetMapping("/blogs")
@ResponseStatus(HttpStatus.OK)
public List<Blog> mostrarBlogs(){
	return service.findAll();
}

@GetMapping("/blogs/{id}")
@ResponseStatus(HttpStatus.OK)
public Blog mostrarBlog(@PathVariable long id){
	return service.findById(id);
}

@PostMapping("/blogs")
@ResponseStatus(HttpStatus.CREATED)
public Blog crearBlog(@RequestBody Blog categoria){
	return service.save(categoria);
}

@DeleteMapping("/blogs/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void eliminarBlog(@PathVariable long id){
	service.deleteById(id);
}

@PutMapping("/categorias/{id}")
@ResponseStatus(HttpStatus.CREATED)
public Blog actualizarBlog(@RequestBody Blog blog, @PathVariable long id){
	Blog c = service.findById(id);
	c.setNombreBlog(blog.getNombreBlog());
	c.setDescripcionBlog(blog.getDescripcionBlog());
	return service.save(c);
}
}
