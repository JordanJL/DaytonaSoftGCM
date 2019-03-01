package net.daytonasoft.gcm.domain;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GCM_ANTECEDENTE_TB_NX")
public class Antecedente {


	@SequenceGenerator(name="GCM_ANT_SQ_NX", sequenceName="GCM_ALE_SQ_NX", allocationSize=1)
	@Id @GeneratedValue(generator="GCM_ANT_SQ_NX")
	@Column(name="ANT_ID")
	private int id;
	@Column(name="ANT_EMP_EMPRESA")
	private String empresa;
	@Column(name="ANT_DESCRIPCION")
	private String descripcion;
	@Column(name="ANT_ESTADO")
	private int estado;
	@Column(name="ANT_SECUENCIA")
	private int secuencia;
	@Column(name="ANT_CREADO_POR")
	private String creadoPor;
	@Column(name="ANT_FECHA_CREACION")
	private Date fechaCreacion;
	@Column(name="ANT_MODIFICADO_POR")
	private String modificadoPor;
	@Column(name="ANT_FECHA_MODIFICACION")
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
