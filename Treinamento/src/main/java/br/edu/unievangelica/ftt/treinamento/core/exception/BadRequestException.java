package br.edu.unievangelica.ftt.treinamento.core.exception;

import org.springframework.validation.Errors;

@SuppressWarnings("serial")
public class BadRequestException extends RuntimeException {
	
	private Errors errors;
	
	public BadRequestException(Errors errors) {
		this.errors = errors;
	}
	
	public Errors getErrors() {
		return this.errors;
	}
}
