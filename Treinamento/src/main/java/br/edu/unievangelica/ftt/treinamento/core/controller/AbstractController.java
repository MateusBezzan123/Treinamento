package br.edu.unievangelica.ftt.treinamento.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.unievangelica.ftt.treinamento.core.service.IService;

@CrossOrigin("*")
public abstract class AbstractController<T> extends ResponseAbstractController implements IController<T> {

	@Autowired
	private IService<T> service;
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		return jsonResponse(service.findAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable long id){
		return jsonResponse(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> save(@Validated @RequestBody T object, Errors errors){
		return jsonResponse(service.save(object, errors));
	}
	
	@PutMapping
	public ResponseEntity<?> update(@Validated @RequestBody T object, Errors errors){
		return jsonResponse(service.save(object, errors));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteById(@PathVariable long id){
		service.deleteById(id);
		return jsonResponse();
	}

}
