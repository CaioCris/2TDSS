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
@Table(name = "T_MOTORISTA")
@SequenceGenerator(name = "motorista", sequenceName = "SQ_T_MOTORISTA", allocationSize = 1)
public class Motorista implements Serializable{
	
	@Id
	@Column(name = "nr_carteira")
	@GeneratedValue(generator = "motorista", strategy = GenerationType.SEQUENCE)
	private long numero;

	@Column(name = "nm_motorista", nullable = false, length = 150)
	private String nome;

	@Column(name = "dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;

	@Column(name = "fl_carteira")
	private char[] foto;
	
	@Column(name = "ds_genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	public Motorista() {
		super();
	}

	public Motorista(String nome, Calendar nascimento, char[] foto, Genero genero) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.foto = foto;
		this.genero = genero;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
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

	public char[] getFoto() {
		return foto;
	}

	public void setFoto(char[] foto) {
		this.foto = foto;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
}