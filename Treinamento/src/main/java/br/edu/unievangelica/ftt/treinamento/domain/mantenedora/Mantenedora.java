package br.edu.unievangelica.ftt.treinamento.domain.mantenedora;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.edu.unievangelica.ftt.treinamento.core.entity.AbstractEntity;
import br.edu.unievangelica.ftt.treinamento.domain.endereco.Endereco;
import br.edu.unievangelica.ftt.treinamento.domain.instituicao.Instituicao;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mantenedora")
@Getter @Setter
public class Mantenedora extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Instituicao> getInstituicoes() {
		return instituicoes;
	}

	public void setInstituicoes(List<Instituicao> instituicoes) {
		this.instituicoes = instituicoes;
	}

	@NotEmpty @NotBlank
	@Size(min = 3, max = 80)
	@Column(name = "nome", length = 80, nullable = false, unique = true)
	private String nome;
	
	@NotEmpty
	@Column(name = "razao_social", length = 80, nullable = false)
	private String razaoSocial;
	
	@NotEmpty
	@Column(name = "cnpj", length = 18, nullable = false, unique = true)
	private String cnpj;
	
	@Valid
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
	@JsonIgnore
	@OneToMany(mappedBy = "mantenedora")
	private List<Instituicao> instituicoes;
	
}
