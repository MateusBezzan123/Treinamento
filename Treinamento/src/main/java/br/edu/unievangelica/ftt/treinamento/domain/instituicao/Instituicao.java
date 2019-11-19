package br.edu.unievangelica.ftt.treinamento.domain.instituicao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.unievangelica.ftt.treinamento.core.entity.AbstractEntity;
import br.edu.unievangelica.ftt.treinamento.domain.endereco.Endereco;
import br.edu.unievangelica.ftt.treinamento.domain.mantenedora.Mantenedora;

@Entity
@Table(name = "instituicao")
public class Instituicao extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "nome", length = 80, nullable = false, unique = true)
	private String nome;
	
	@Column(name = "razaoSocial", length = 80, nullable = false)
	private String razaoSocial;
	
	@Column(name = "cnpj", length = 18, nullable = false, unique = true)
	private String cnpj;
	
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

	public Mantenedora getMantenedora() {
		return mantenedora;
	}

	public void setMantenedora(Mantenedora mantenedora) {
		this.mantenedora = mantenedora;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@ManyToOne
	@JoinColumn(name = "mantenedora_id", referencedColumnName = "id")
	private Mantenedora mantenedora;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
}
