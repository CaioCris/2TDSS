package br.com.fiap.jpa.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_PAGAMENTO")
@SequenceGenerator(name = "pagamento", sequenceName = "SQ_T_PAGAMENTO", allocationSize = 1)
public class Pagamento implements Serializable{
	
	@Id
	@Column(name = "cd_pagamento")
	@GeneratedValue(generator = "pagamento", strategy = GenerationType.SEQUENCE)
	private long codigo;
	
	@Column(name="ds_pagamento", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dataPagamento;
	
	@Column(name="vl_pagamento", nullable=false)
	private Double valor;
	
	@Column(name="ds_forma_pagamento", nullable=false)
	private String formaPagamento;

	public Pagamento() {
		super();
	}

	public Pagamento(Calendar dataPagamento, Double valor, String formaPagamento) {
		super();
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
}
