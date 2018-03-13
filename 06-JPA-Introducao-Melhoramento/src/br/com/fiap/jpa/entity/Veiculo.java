package br.com.fiap.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_VEICULO")
@SequenceGenerator(name = "veiculo", sequenceName = "SQ_T_VEICULO", allocationSize = 1)
public class Veiculo implements Serializable {

	@Id
	@Column(name = "cd_veiculo")
	@GeneratedValue(generator = "veiculo", strategy = GenerationType.SEQUENCE)
	private long codigo;

	@Column(name = "ds_placa", nullable = false, length = 9)
	private String placa;

	@Column(name = "ds_cor", nullable = false, length = 20)
	private String cor;

	@Column(name = "nr_ano")
	private String ano;

	public Veiculo() {
		super();
	}

	public Veiculo(String placa, String cor, String ano) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

}
