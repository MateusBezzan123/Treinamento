package br.edu.unievangelica.ftt.treinamento.core.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomFieldError {

	private String field;
	private String message;
	private String codeError;

	public CustomFieldError() {

	}

	public CustomFieldError(String field, String message, String codeError) {
		this.field = field;
		this.message = message;
		this.codeError = codeError;
	}

	public String getCodeError() {
		String codeError = null;

		switch (this.codeError) {
			case "NotNull":
			case "NotBlank":
			case "NotEmpty":
				codeError = "required";
				break;
		}

		return codeError;
	}
}
