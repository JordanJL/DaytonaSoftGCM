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
	private int getTipoCita() {
		return tipoCita;
	}
	private void setTipoCita(int tipoCita) {
		this.tipoCita = tipoCita;
	}
	private String getEmpresa() {
		return empresa;
	}
	private void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	private String getArticulo() {
		return articulo;
	}
	private void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}

}
