package br.com.fiap.jpa.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_PASSAGEIRO")
@SequenceGenerator(name = "passageiro", sequenceName = "SQ_T_PASSAGEIRO", allocationSize = 1)
public class Passageiro implements Serializable{
	
	@Id
	@Column(name = "cd_passageiro")
	@GeneratedValue(generator = "passageiro", strategy = GenerationType.SEQUENCE)
	private long codigo;

	@Column(name = "nm_passageiro", nullable = false, length = 100)
	private String nome;

	@Column(name = "dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;
	
	@Column(name = "ds_genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	public Passageiro() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}