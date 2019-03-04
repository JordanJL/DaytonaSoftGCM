package net.daytonasoft.gcm.domain;

import javax.persistence.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GCM_TIPO_CITA_SERVICIO_TB_NX")
public class ServicioTipoCita { 
	/**
	 * 
	 */
	@Id
	@SequenceGenerator(name="GCM_SER_SQ_NX", sequenceName="GCM_SER_SQ_NX")
	@GeneratedValue(generator="GCM_SER_SQ_NX")
	@Column(name="SER_ID")
	private int id;

	@Column(name="SER_TCI_ID")
	private int tipoCita;

	@Column(name="SER_ATO_EMP_EMPRESA")
	private String empresa;

	@Column(name="SER_ATO_ARTICULO")
	private String articulo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipoCita() {
		return tipoCita;
	}

	public void setTipoCita(int tipoCita) {
		this.tipoCita = tipoCita;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	

}
