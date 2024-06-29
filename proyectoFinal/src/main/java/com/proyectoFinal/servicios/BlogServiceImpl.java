package com.proyectoFinal.servicios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoFinal.modelo.entidades.Blog;
import com.proyectoFinal.modelo.repositorios.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService{
@Autowired
BlogRepository repository;

@Override
@Transactional(readOnly = true)
public List<Blog> findAll() {
	// TODO Auto-generated method stub
	return (List<Blog>) repository.findAll();
}

@Override
@Transactional(readOnly = true)
public Blog findById(Long id) {
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
public Blog save(Blog Blog) {
	// TODO Auto-generated method stub
	return repository.save(Blog);
}


}
