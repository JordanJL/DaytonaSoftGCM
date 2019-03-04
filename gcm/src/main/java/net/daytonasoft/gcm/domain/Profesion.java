package net.daytonasoft.gcm.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="GNL_PROFESION_TB_NX")
public class Profesion {
	
	@Id
	@Column(name = "PFE_PROFESION")
	private String profesion;
	@Column(name="PFE_DESCRIPCION")
	private String desripcion;
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getDesripcion() {
		return desripcion;
	}
	public void setDesripcion(String desripcion) {
		this.desripcion = desripcion;
	}
	
}
