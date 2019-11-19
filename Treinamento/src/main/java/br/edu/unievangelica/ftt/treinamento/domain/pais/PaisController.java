package br.edu.unievangelica.ftt.treinamento.domain.pais;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unievangelica.ftt.treinamento.core.controller.AbstractController;

@RestController
@RequestMapping("/api/pais")
public class PaisController extends AbstractController<Pais> {

}
