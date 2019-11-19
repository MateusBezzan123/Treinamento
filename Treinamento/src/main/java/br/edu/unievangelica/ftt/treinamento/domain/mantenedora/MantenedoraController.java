package br.edu.unievangelica.ftt.treinamento.domain.mantenedora;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unievangelica.ftt.treinamento.core.controller.AbstractController;

@RestController
@RequestMapping("/api/mantenedora")
public class MantenedoraController extends AbstractController<Mantenedora> {

}
