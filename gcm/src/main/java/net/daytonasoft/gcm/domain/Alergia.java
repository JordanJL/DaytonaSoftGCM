package net.daytonasoft.gcm.domain;

import javax.persistence.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GCM_TIPO_ALERGIA")
public class Alergia implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1893259686827603867L;
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

}
