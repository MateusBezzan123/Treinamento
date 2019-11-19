package br.edu.unievangelica.ftt.treinamento.domain.pais;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.edu.unievangelica.ftt.treinamento.core.entity.AbstractEntity;
import br.edu.unievangelica.ftt.treinamento.domain.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pais")
@Getter @Setter
public class Pais extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotEmpty @NotBlank
	@Column(name = "nome", length = 80, nullable = false)
	private String nome;
	
	@JsonIgnore
	@OneToMany(mappedBy = "pais")
	private List<Endereco> enderecos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
}
