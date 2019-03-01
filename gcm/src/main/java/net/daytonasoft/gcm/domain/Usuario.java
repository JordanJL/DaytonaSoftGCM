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
@Table(name="GNL_USUARIOS_TB_NX")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
			name="loginaction",
			procedureName="GNL_VAL_PW_PR_NX",
			parameters = {
					@StoredProcedureParameter(mode = ParameterMode.IN, type= String.class, name= "username_p"),
					@StoredProcedureParameter(mode = ParameterMode.IN, type= String.class, name= "clave_p"),
					@StoredProcedureParameter(mode = ParameterMode.OUT, type= Integer.class, name= "id_p")
			}
			)
})
public class Usuario {
	@Id
	@Column(name = "USERID")
	private int id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
