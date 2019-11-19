package br.edu.unievangelica.ftt.treinamento.core.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

	/* BAD REQUEST - 400 */
	@ExceptionHandler({ BadRequestException.class })
	public ResponseEntity<?> handlerBadRequestException(BadRequestException e) {

		List<CustomFieldError> fieldErrors = new ArrayList<>();

		e.getErrors().getFieldErrors().forEach(
				error -> fieldErrors.add(new CustomFieldError(error.getField(), 
						error.getDefaultMessage(), 
						error.getCode())));

		return new ResponseEntity<>(fieldErrors, HttpStatus.BAD_REQUEST);
	}

	/* NOT FOUND - 404 */
	@ExceptionHandler({ NotFoundException.class })
	public ResponseEntity<?> handlerNotFoundException(NotFoundException e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
