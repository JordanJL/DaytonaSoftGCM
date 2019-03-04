package net.daytonasoft.gcm.domain;

import javax.persistence.Entity;
 
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.SequenceGenerator;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="GCM_CITA_TB_NX")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
			name="citaaction",
			procedureName="GCM_CITA_PR_NX",
			parameters = {
					@StoredProcedureParameter(mode = ParameterMode.IN, type= String.class, name= "empresa_p"),
					@StoredProcedureParameter(mode = ParameterMode.IN, type= Integer.class, name= "paciente_p"),
					@StoredProcedureParameter(mode = ParameterMode.IN, type= Integer.class, name= "medico_p"),
					@StoredProcedureParameter(mode = ParameterMode.IN, type= Integer.class, name= "consultorio_p"),
					@StoredProcedureParameter(mode = ParameterMode.IN, type= Date.class, name= "fecha_inicio_p"),
					@StoredProcedureParameter(mode = ParameterMode.IN, type= Date.class, name= "fecha_fin_p"),
					@StoredProcedureParameter(mode = ParameterMode.OUT, type= Integer.class, name= "cita_p")
			}
			)
})
public class Cita {
	/**
	 * 
	 */
	
	@SequenceGenerator(name="GCM_MCI_SQ_NX", sequenceName="GCM_MCI_SQ_NX", allocationSize=1)
	@Id @GeneratedValue(generator="GCM_MCI_SQ_NX")
	@Column(name="MCI_ID")
	private int id;
	@Column(name="MCI_CST_CONSULTORIO")
	private int consultorio;
	@Column(name="MCI_PERSONA_MEDICO")
	private int medico;
	@Column(name="MCI_PERSONA_PACIENTE")
	private int paciente; 
	@Column(name="MCI_TCI_ID")
	private int tipoCita;
	@Column(name="MCI_HORA_INICIO")
	private Date inicio;
	@Column(name="MCI_HORA_FIN")
	private Date fin;
	@Column(name="MCI_ESTADO")
	private int estado;
	@Column(name="MCI_NOTIFICADO")
	private int notificado;
	@Column(name="MCI_DRF_ID")
	private int referencia;
	@Column(name="MCI_COMENTARIOS")
	private String comentarios;
	@Column(name="MCI_NOTIFICACION_SMS")
	private int sms;
	@Column(name="MCI_NOTIFICACION_CORREO")
	private int correo;
	@Column(name="MCI_FREC_TODO")
	private int todo;
	@Column(name="MCI_FREC_QUINCENA")
	private int quincena;
	@Column(name="MCI_FREC_MENSUAL")
	private int mensual;
	@Column(name="MCI_FREC_SEMANAL")
	private int semanal;
	@Column(name="MCI_FREC_SIN_NOT")
	private int sin;
	@Column(name="MCI_EMP_EMPRESA")
	private String empresa;
	@Column(name="MCI_CREADO_POR")
	private String creadoPor;
	@Column(name="MCI_FECHA_CREACION")
	private Date fechaCreacion;
	@Column(name="MCI_MODIFICADO_POR")
	private String modificadoPor;
	@Column(name="MCI_FECHA_MODIFICACION")
	private Date fechaModificacion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(int consultorio) {
		this.consultorio = consultorio;
	}
	public int getMedico() {
		return medico;
	}
	public void setMedico(int medico) {
		this.medico = medico;
	}
	public int getPaciente() {
		return paciente;
	}
	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}
	public int getTipoCita() {
		return tipoCita;
	}
	public void setTipoCita(int tipoCita) {
		this.tipoCita = tipoCita;
	}

	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getNotificado() {
		return notificado;
	}
	public void setNotificado(int notificado) {
		this.notificado = notificado;
	}
	public int getReferencia() {
		return referencia;
	}
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public int getSms() {
		return sms;
	}
	public void setSms(int sms) {
		this.sms = sms;
	}
	public int getCorreo() {
		return correo;
	}
	public void setCorreo(int correo) {
		this.correo = correo;
	}
	public int getTodo() {
		return todo;
	}
	public void setTodo(int todo) {
		this.todo = todo;
	}
	public int getQuincena() {
		return quincena;
	}
	public void setQuincena(int quincena) {
		this.quincena = quincena;
	}
	public int getMensual() {
		return mensual;
	}
	public void setMensual(int mensual) {
		this.mensual = mensual;
	}
	public int getSemanal() {
		return semanal;
	}
	public void setSemanal(int semanal) {
		this.semanal = semanal;
	}
	public int getSin() {
		return sin;
	}
	public void setSin(int sin) {
		this.sin = sin;
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
