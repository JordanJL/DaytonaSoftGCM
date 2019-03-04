package net.daytonasoft.gcm.domain;

import javax.persistence.Entity;
 
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GCM_CONSULTORIO_TB_NX")
public class Consultorio {
	/**
	 * 
	 */
	@SequenceGenerator(name="GCM_CST_SQ_NX", sequenceName="GCM_CST_SQ_NX", allocationSize=1)
	@Id @GeneratedValue(generator="GCM_CST_SQ_NX")
	@Column(name="CST_CONSULTORIO")
	private int id;
	@Column(name="CST_DESCRIPCION")
	private String descripcion;
	@Column(name="CST_ESTADO")
	private int estado;
	@Column(name="CST_EMP_EMPRESA")
	private String empresa;
	@Column(name="CST_LCN_LOCALIZACION")
	private String localizacion;
	@Column(name="CST_CREADO_POR")
	private String creadoPor;
	@Column(name="CST_FECHA_CREACION")
	private Date fechaCreacion;
	@Column(name="CST_MODIFICADO_POR")
	private String modificadoPor;
	@Column(name="CST_FECHA_MODIFICACION")
	private Date fechaModificacion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
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
