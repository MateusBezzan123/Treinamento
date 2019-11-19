package br.edu.unievangelica.ftt.treinamento.domain.curso;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/curso")
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public List<Curso> findAll(){
		return cursoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Curso> findById(@PathVariable long id) {
		return cursoRepository.findById(id);
	}
	
	@PostMapping
	public Curso save(@RequestBody Curso curso){
		return cursoRepository.save(curso);
	}
	
	@PutMapping
	public Curso update(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable long id) {
		cursoRepository.deleteById(id);
	}
	
	
	
	
	
}
