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
@Table(name="GNL_PAIS_TB_NX")
public class Pais {
	@Id
	@Column(name = "PAI_PAIS")
	private String pais;
	@Column(name="PAI_NOMBRE")
	private String nombre;
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
