package net.daytonasoft.gcm.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="GCM_REFERENCIA_TB_NX")
public class Referencia {

	@SequenceGenerator(name="GCM_DRF_SQ_NX", sequenceName="GCM_DRF_SQ_NX", allocationSize=1)
	@Id @GeneratedValue(generator="GCM_DRF_SQ_NX")
	@Column(name="DRF_ID")
	private int id;
	@Column(name="DRF_DESCRIPCION")
	private String descripcion;
	@Column(name="DRF_TIPO_DOCUMENTO")
	private int tipoDocumento;
	@Column(name="DRF_DOCUMENTO")
	private String documento;
	@Column(name="DRF_MOVIL")
	private String movil;
	@Column(name="DRF_TELEFONO")
	private String telefono;
	@Column(name="DRF_LUGAR_CONSULTA")
	private String lugarConsulta;
	@Column(name="DRF_RECEPCIONISTA")
	private String recepcionista;
	@Column(name="DRF_FECHA_NACIMIENTO")
	private Date fechaNacimiento;
	@Column(name="DRF_OBSERVACIONES")
	private String observaciones;
	@Column(name="DRF_CORREO_ELECTRONICO")
	private String correoElectronico;
	@Column(name="DRF_SECUENCIA")
	private int secuencia;
	@Column(name="DRF_ESTADO")
	private int estado;
	@Column(name="DRF_EMP_EMPRESA")
	private String empresa;
	@Column(name="DRF_DRF_ID", nullable=true)
	private int referencia;
	@Column(name="DRF_CREADO_POR")
	private String creadoPor;
	@Column(name="DRF_FECHA_CREACION")
	private Date fechaCreacion;
	@Column(name="DRF_MODIFICADO_POR")
	private String modificadoPor;
	@Column(name="DRF_FECHA_MODIFICACION")
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
	public int getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getLugarConsulta() {
		return lugarConsulta;
	}
	public void setLugarConsulta(String lugarConsulta) {
		this.lugarConsulta = lugarConsulta;
	}
	public String getRecepcionista() {
		return recepcionista;
	}
	public void setRecepcionista(String recepcionista) {
		this.recepcionista = recepcionista;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public int getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(int secuencia) {
		this.secuencia = secuencia;
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
	public int getReferencia() {
		return referencia;
	}
	public void setReferencia(int referencia) {
		this.referencia = referencia;
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
