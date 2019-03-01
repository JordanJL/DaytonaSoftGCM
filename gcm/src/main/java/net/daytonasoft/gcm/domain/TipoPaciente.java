package net.daytonasoft.gcm.domain;

import javax.persistence.Entity;
 
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GCM_TIPO_PACIENTE_TB_NX")
public class TipoPaciente {
	/**
	 * 
	 */
	
	@SequenceGenerator(name="GCM_TPA_SQ_NX", sequenceName="GCM_TPA_SQ_NX", allocationSize=1)
	@Id @GeneratedValue(generator="GCM_TPA_SQ_NX")
	@Column(name="TPA_ID")
	private int id;
	@Column(name="TPA_EMP_EMPRESA")
	private String empresa;
	@Column(name="TPA_DESCRIPCION")
	private String descripcion;
	@Column(name="TPA_ESTADO")
	private int estado;
	@Column(name="TPA_SECUENCIA")
	private int secuencia;
	@Column(name="TPA_CREADO_POR")
	private String creadoPor;
	@Column(name="TPA_FECHA_CREACION")
	private Date fechaCreacion;
	@Column(name="TPA_MODIFICADO_POR")
	private String modificadoPor;
	@Column(name="TPA_FECHA_MODIFICACION")
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
