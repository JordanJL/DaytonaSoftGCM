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
	@Column(name="DRF_DRF_ID")
	private int referencia;
	@Column(name="DRF_CREADO_POR")
	private String creadoPor;
	@Column(name="DRF_FECHA_CREACION")
	private Date fechaCreacion;
	@Column(name="DRF_MODIFICADO_POR")
	private String modificadoPor;
	@Column(name="DRF_FECHA_MODIFICACION")
	private Date fechaModificacion;
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getDescripcion() {
		return descripcion;
	}
	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	private int getTipoDocumento() {
		return tipoDocumento;
	}
	private void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	private String getDocumento() {
		return documento;
	}
	private void setDocumento(String documento) {
		this.documento = documento;
	}
	private String getMovil() {
		return movil;
	}
	private void setMovil(String movil) {
		this.movil = movil;
	}

}
