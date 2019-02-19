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
@Table(name="GCM_TIPO_ALERGIA_TB_NX")
public class Alergia {
	/**
	 * 
	 */
	@Id
	@SequenceGenerator(name="ALE_SQ", sequenceName="GCM_ALE_SQ_NX")
	@GeneratedValue(generator="ALE_SQ")
	@Column(name="ALE_ID")
	private int id;
	@Column(name="ALE_EMP_EMPRESA")
	private String empresa;
	@Column(name="ALE_DESCRIPCION")
	private String descripcion;
	@Column(name="ALE_ESTADO")
	private int estado;
	@Column(name="ALE_SECUENCIA")
	private int secuencia;
	@Column(name="ALE_CREADO_POR")
	private String creadoPor;
	@Column(name="ALE_FECHA_CREACION")
	private Date fechaCreacion;
	@Column(name="ALE_MODIFICADO_POR")
	private String modificadoPor;
	@Column(name="ALE_FECHA_MODIFICACION")
	private Date fechaModificacion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(int secuencia) {
		this.secuencia = secuencia;
	}
	public String getCreadoPor() {
		return creadoPor;
	}
	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getModificadoPor() {
		return modificadoPor;
	}
	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
