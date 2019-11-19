package br.edu.unievangelica.ftt.treinamento.core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface IController<T> {

		ResponseEntity<?> findAll();
		
		ResponseEntity<?> findById(@PathVariable long id);
		
		ResponseEntity<?> save(@RequestBody T object, Errors errors);
		
		ResponseEntity<?> update(@RequestBody T object, Errors errors);
		
		ResponseEntity<?> deleteById(@PathVariable long id);
}
