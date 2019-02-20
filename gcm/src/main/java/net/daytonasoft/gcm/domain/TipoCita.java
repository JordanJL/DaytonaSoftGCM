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
@Table(name="GCM_TIPO_CITA_TB_NX")
public class TipoCita {
	@Id
	@SequenceGenerator(name="GCM_TCI_SQ_NX", sequenceName="GCM_TCI_SQ_NX")
	@GeneratedValue(generator="GCM_TCI_SQ")
	@Column(name="TCI_ID")
	private int id;
	@Column(name="TCI_EMP_EMPRESA")
	private String empresa;
	@Column(name="TCI_DESCRIPCION")
	private String descripcion;
	@Column(name="TCI_HORAS")
	private int horas;
	@Column(name="TCI_MINUTOS")
	private int minutos;
	@Column(name="TCI_ESTADO")
	private int estado;
	@Column(name="TCI_SECUENCIA")
	private int secuencia;
	@Column(name="TCI_CREADO_POR")
	private String creadoPor;
	@Column(name="TCI_MODIFICADO_POR")
	private String modificadoPor;
	@Column(name="TCI_FECHA_CREACION")
	private Date fechaCreacion;
	@Column(name="TCI_FECHA_MODIFICACION")
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
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
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
	public String getModificadoPor() {
		return modificadoPor;
	}
	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	

}
