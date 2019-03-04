package net.daytonasoft.gcm.domain;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Column;
import javax.persistence.Table;


@Entity
@Table(name="GNL_ESTADO_CIVIL_TB_NX")
public class EstadoCivil {
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDesripcion() {
		return desripcion;
	}
	public void setDesripcion(String desripcion) {
		this.desripcion = desripcion;
	}
	@Id
	@Column(name = "GEC_TIPO")
	private String tipo;
	@Column(name="GEC_DESCRIPCION")
	private String desripcion;
	
}
