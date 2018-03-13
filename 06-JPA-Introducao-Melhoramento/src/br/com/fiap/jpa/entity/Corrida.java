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
@Table(name = "T_CORRIDA")
@SequenceGenerator(name = "corrida", sequenceName = "SQ_T_CORRIDA", allocationSize = 1)
public class Corrida implements Serializable{
	
	@Id
	@Column(name = "cd_corrida")
	@GeneratedValue(generator = "corrida", strategy = GenerationType.SEQUENCE)
	private long codigo;

	@Column(name = "ds_origem", length = 150)
	private String origem;
	
	@Column(name = "ds_destino", length = 150)
	private String destino;

	@Column(name = "dt_corrida")
	@Temporal(TemporalType.DATE)
	private Calendar corrida;
	
	@Column(name = "vl_corrida", nullable=false)
	private Double valorCorrida;

	public Corrida() {
		super();
	}

	public Corrida(String origem, String destino, Calendar corrida, Double valorCorrida) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.corrida = corrida;
		this.valorCorrida = valorCorrida;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getCorrida() {
		return corrida;
	}

	public void setCorrida(Calendar corrida) {
		this.corrida = corrida;
	}

	public Double getValorCorrida() {
		return valorCorrida;
	}

	public void setValorCorrida(Double valorCorrida) {
		this.valorCorrida = valorCorrida;
	}
}
