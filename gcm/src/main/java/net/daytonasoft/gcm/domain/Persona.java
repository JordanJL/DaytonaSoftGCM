package net.daytonasoft.gcm.domain;

import javax.persistence.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GNL_PERSONA_TR_NX")

public class Persona {
	@SequenceGenerator(name="GNL_PERSONA_SQ_NX", sequenceName="GNL_PERSONA_SQ_NX", allocationSize=1)
	@Id @GeneratedValue(generator="GNL_PERSONA_SQ_NX")
	private int persona;
    private String nombre;
    private String apellidos;
    private int tipoDocumento;
    private String documento;
    private String razonSocial;
    private Date fechaNacimiento;
    private String sexo;
    private String pfeProfesion;
    private String nacionalidad;
    private int proveedor;
    private int cliente;
    private int banco;
    private int empleado;
    private int servicios;
    private int otro;
    private String expOtro;
    private String paiPais;
    private String ciuCiudad;
    private String zonZona;
    private String email;
    private String direccion;
    private String correspondencia;
    private String telefono1;
    private String telefono2;
    private String fax;
    private String apartado;
    private String regimenIva;
    private String granContribuyente;
    private String autoretenedor;
    private String actActividad;
    private String observaciones;
    private String representanteLegal;
    private String cedulaRepresentante;
    private String contacto1;
    private String cargoContacto1;
    private String relacionContacto1;
    private String contacto2;
    private String cargoContacto2;
    private String relacionContacto2;
    private String contacto3;
    private String cargoContacto3;
    private String relacionContacto3;
    private String creadoPor;
    private Date fechaCreacion;
    private String modificadoPor;
    private Date fechaModificacion;
    private String citaRegistral;
    private String estadoCivil;
    private String crTomo;
    private String crFolio;
    private String crAsiento;
    private String digitoVerificacion;
    private String documentoNit;
    private String domFiscal;
    private String telefono3;
    private String perAfiliadoDiamante;
    private int perEstudiante;
    private int perProfesor;
    private String perGrdGradoAcademico;
    private String perApellidoSolteraCasada;
    private Long perProProvincia;
    private String perClaseSecEconomico;
    private String provincia;
    private String distrito;
    private String canton;
    private String perEmpEmpresa;
    private Long perConsecutivo;
    private String crTomo2;
    private String crFolio2;
    private String crAsiento2;
    private String perTcuCuenta;
    private String paciente; 
    private String medico;
    
   public Persona() {
   }

	
   public Persona(int persona, String perAfiliadoDiamante, int perEstudiante, int perProfesor, String perEmpEmpresa) {
       this.persona = persona;
       this.perAfiliadoDiamante = perAfiliadoDiamante;
       this.perEstudiante = perEstudiante;
       this.setPerProfesor(perProfesor);
       this.perEmpEmpresa = perEmpEmpresa;
   }
   public Persona(int persona, String nombre, String apellidos, int tipoDocumento, String documento, String razonSocial, Date fechaNacimiento, String sexo, String pfeProfesion, String nacionalidad, int proveedor, int cliente, int banco, int empleado, int servicios, int otro, String expOtro, String paiPais, String ciuCiudad, String zonZona, String email, String direccion, String correspondencia, String telefono1, String telefono2, String fax, String apartado, String regimenIva, String granContribuyente, String autoretenedor, String actActividad, String observaciones, String representanteLegal, String cedulaRepresentante, String contacto1, String cargoContacto1, String relacionContacto1, String contacto2, String cargoContacto2, String relacionContacto2, String contacto3, String cargoContacto3, String relacionContacto3, String creadoPor, Date fechaCreacion, String modificadoPor, Date fechaModificacion, String citaRegistral, String estadoCivil, String crTomo, String crFolio, String crAsiento, String digitoVerificacion, String documentoNit, String domFiscal, String telefono3, String perAfiliadoDiamante, int perEstudiante, int perProfesor, String perGrdGradoAcademico, String perApellidoSolteraCasada, Long perProProvincia, String perClaseSecEconomico, String provincia, String distrito, String canton, String perEmpEmpresa, Long perConsecutivo, String crTomo2, String crFolio2, String crAsiento2, String perTcuCuenta) {
      this.persona = persona;
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.tipoDocumento = tipoDocumento;
      this.documento = documento;
      this.razonSocial = razonSocial;
      this.fechaNacimiento = fechaNacimiento;
      this.sexo = sexo;
      this.pfeProfesion = pfeProfesion;
      this.nacionalidad = nacionalidad;
      this.proveedor = proveedor;
      this.cliente = cliente;
      this.banco = banco;
      this.empleado = empleado;
      this.servicios = servicios;
      this.otro = otro;
      this.expOtro = expOtro;
      this.paiPais = paiPais;
      this.ciuCiudad = ciuCiudad;
      this.zonZona = zonZona;
      this.email = email;
      this.direccion = direccion;
      this.correspondencia = correspondencia;
      this.telefono1 = telefono1;
      this.telefono2 = telefono2;
      this.fax = fax;
      this.apartado = apartado;
      this.regimenIva = regimenIva;
      this.granContribuyente = granContribuyente;
      this.autoretenedor = autoretenedor;
      this.actActividad = actActividad;
      this.observaciones = observaciones;
      this.representanteLegal = representanteLegal;
      this.cedulaRepresentante = cedulaRepresentante;
      this.contacto1 = contacto1;
      this.cargoContacto1 = cargoContacto1;
      this.relacionContacto1 = relacionContacto1;
      this.contacto2 = contacto2;
      this.cargoContacto2 = cargoContacto2;
      this.relacionContacto2 = relacionContacto2;
      this.contacto3 = contacto3;
      this.cargoContacto3 = cargoContacto3;
      this.relacionContacto3 = relacionContacto3;
      this.creadoPor = creadoPor;
      this.fechaCreacion = fechaCreacion;
      this.modificadoPor = modificadoPor;
      this.fechaModificacion = fechaModificacion;
      this.citaRegistral = citaRegistral;
      this.estadoCivil = estadoCivil;
      this.crTomo = crTomo;
      this.crFolio = crFolio;
      this.crAsiento = crAsiento;
      this.digitoVerificacion = digitoVerificacion;
      this.documentoNit = documentoNit;
      this.domFiscal = domFiscal;
      this.telefono3 = telefono3;
      this.perAfiliadoDiamante = perAfiliadoDiamante;
      this.perEstudiante = perEstudiante;
      this.setPerProfesor(perProfesor);
      this.perGrdGradoAcademico = perGrdGradoAcademico;
      this.perApellidoSolteraCasada = perApellidoSolteraCasada;
      this.perProProvincia = perProProvincia;
      this.perClaseSecEconomico = perClaseSecEconomico;
      this.provincia = provincia;
      this.distrito = distrito;
      this.canton = canton;
      this.perEmpEmpresa = perEmpEmpresa;
      this.perConsecutivo = perConsecutivo;
      this.crTomo2 = crTomo2;
      this.crFolio2 = crFolio2;
      this.crAsiento2 = crAsiento2;
      this.perTcuCuenta = perTcuCuenta; 
   }
   
   @Id 
   @Column(name="PERSONA", unique=true, nullable=false, precision=8, scale=0)
   public int getPersona() {
       return this.persona;
   }
   
   public void setPersona(int persona) {
       this.persona = persona;
   }

   
   @Column(name="NOMBRE", length=30)
   public String getNombre() {
       return this.nombre;
   }
   
   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   
   @Column(name="APELLIDOS", length=30)
   public String getApellidos() {
       return this.apellidos;
   }
   
   public void setApellidos(String apellidos) {
       this.apellidos = apellidos;
   }

   
   @Column(name="TIPO_DOCUMENTO")
   public int getTipoDocumento() {
       return this.tipoDocumento;
   }
   
   public void setTipoDocumento(int tipoDocumento) {
       this.tipoDocumento = tipoDocumento;
   }

   
   @Column(name="DOCUMENTO")
   public String getDocumento() {
       return this.documento;
   }
   
   public void setDocumento(String documento) {
       this.documento = documento;
   }

   
   @Column(name="RAZON_SOCIAL")
   public String getRazonSocial() {
       return this.razonSocial;
   }
   
   public void setRazonSocial(String razonSocial) {
       this.razonSocial = razonSocial;
   }

   @Column(name="FECHA_NACIMIENTO")
   public Date getFechaNacimiento() {
       return this.fechaNacimiento;
   }
   
   public void setFechaNacimiento(Date fechaNacimiento) {
       this.fechaNacimiento = fechaNacimiento;
   }

   
   @Column(name="SEXO")
   public String getSexo() {
       return this.sexo;
   }
   
   public void setSexo(String sexo) {
       this.sexo = sexo;
   }

   
   @Column(name="PFE_PROFESION")
   public String getPfeProfesion() {
       return this.pfeProfesion;
   }
   
   public void setPfeProfesion(String pfeProfesion) {
       this.pfeProfesion = pfeProfesion;
   }

   
   @Column(name="NACIONALIDAD")
   public String getNacionalidad() {
       return this.nacionalidad;
   }
   
   public void setNacionalidad(String nacionalidad) {
       this.nacionalidad = nacionalidad;
   }

   
   @Column(name="PROVEEDOR")
   public int getProveedor() {
       return this.proveedor;
   }
   
   public void setProveedor(int proveedor) {
       this.proveedor = proveedor;
   }

   
   @Column(name="CLIENTE")
   public int getCliente() {
       return this.cliente;
   }
   
   public void setCliente(int cliente) {
       this.cliente = cliente;
   }

   
   @Column(name="BANCO")
   public int getBanco() {
       return this.banco;
   }
   
   public void setBanco(int banco) {
       this.banco = banco;
   }

   
   @Column(name="EMPLEADO")
   public int getEmpleado() {
       return this.empleado;
   }
   
   public void setEmpleado(int empleado) {
       this.empleado = empleado;
   }

   
   @Column(name="SERVICIOS")
   public int getServicios() {
       return this.servicios;
   }
   
   public void setServicios(int servicios) {
       this.servicios = servicios;
   }

   
   @Column(name="OTRO")
   public int getOtro() {
       return this.otro;
   }
   
   public void setOtro(int otro) {
       this.otro = otro;
   }

   
   @Column(name="EXP_OTRO")
   public String getExpOtro() {
       return this.expOtro;
   }
   
   public void setExpOtro(String expOtro) {
       this.expOtro = expOtro;
   }

   
   @Column(name="PAI_PAIS")
   public String getPaiPais() {
       return this.paiPais;
   }
   
   public void setPaiPais(String paiPais) {
       this.paiPais = paiPais;
   }

   
   @Column(name="CIU_CIUDAD")
   public String getCiuCiudad() {
       return this.ciuCiudad;
   }
   
   public void setCiuCiudad(String ciuCiudad) {
       this.ciuCiudad = ciuCiudad;
   }

   
   @Column(name="ZON_ZONA")
   public String getZonZona() {
       return this.zonZona;
   }
   
   public void setZonZona(String zonZona) {
       this.zonZona = zonZona;
   }

   
   @Column(name="EMAIL")
   public String getEmail() {
       return this.email;
   }
   
   public void setEmail(String email) {
       this.email = email;
   }

   
   @Column(name="DIRECCION")
   public String getDireccion() {
       return this.direccion;
   }
   
   public void setDireccion(String direccion) {
       this.direccion = direccion;
   }

   
   @Column(name="CORRESPONDENCIA")
   public String getCorrespondencia() {
       return this.correspondencia;
   }
   
   public void setCorrespondencia(String correspondencia) {
       this.correspondencia = correspondencia;
   }

   
   @Column(name="TELEFONO1")
   public String getTelefono1() {
       return this.telefono1;
   }
   
   public void setTelefono1(String telefono1) {
       this.telefono1 = telefono1;
   }

   
   @Column(name="TELEFONO2")
   public String getTelefono2() {
       return this.telefono2;
   }
   
   public void setTelefono2(String telefono2) {
       this.telefono2 = telefono2;
   }

   
   @Column(name="FAX")
   public String getFax() {
       return this.fax;
   }
   
   public void setFax(String fax) {
       this.fax = fax;
   }

   
   @Column(name="APARTADO")
   public String getApartado() {
       return this.apartado;
   }
   
   public void setApartado(String apartado) {
       this.apartado = apartado;
   }

   
   @Column(name="REGIMEN_IVA")
   public String getRegimenIva() {
       return this.regimenIva;
   }
   
   public void setRegimenIva(String regimenIva) {
       this.regimenIva = regimenIva;
   }

   
   @Column(name="GRAN_CONTRIBUYENTE")
   public String getGranContribuyente() {
       return this.granContribuyente;
   }
   
   public void setGranContribuyente(String granContribuyente) {
       this.granContribuyente = granContribuyente;
   }

   
   @Column(name="AUTORETENEDOR")
   public String getAutoretenedor() {
       return this.autoretenedor;
   }
   
   public void setAutoretenedor(String autoretenedor) {
       this.autoretenedor = autoretenedor;
   }

   
   @Column(name="ACT_ACTIVIDAD")
   public String getActActividad() {
       return this.actActividad;
   }
   
   public void setActActividad(String actActividad) {
       this.actActividad = actActividad;
   }

   
   @Column(name="OBSERVACIONES")
   public String getObservaciones() {
       return this.observaciones;
   }
   
   public void setObservaciones(String observaciones) {
       this.observaciones = observaciones;
   }

   
   @Column(name="REPRESENTANTE_LEGAL")
   public String getRepresentanteLegal() {
       return this.representanteLegal;
   }
   
   public void setRepresentanteLegal(String representanteLegal) {
       this.representanteLegal = representanteLegal;
   }

   
   @Column(name="CEDULA_REPRESENTANTE")
   public String getCedulaRepresentante() {
       return this.cedulaRepresentante;
   }
   
   public void setCedulaRepresentante(String cedulaRepresentante) {
       this.cedulaRepresentante = cedulaRepresentante;
   }

   
   @Column(name="CONTACTO1")
   public String getContacto1() {
       return this.contacto1;
   }
   
   public void setContacto1(String contacto1) {
       this.contacto1 = contacto1;
   }

   
   @Column(name="CARGO_CONTACTO1")
   public String getCargoContacto1() {
       return this.cargoContacto1;
   }
   
   public void setCargoContacto1(String cargoContacto1) {
       this.cargoContacto1 = cargoContacto1;
   }

   
   @Column(name="RELACION_CONTACTO1")
   public String getRelacionContacto1() {
       return this.relacionContacto1;
   }
   
   public void setRelacionContacto1(String relacionContacto1) {
       this.relacionContacto1 = relacionContacto1;
   }

   
   @Column(name="CONTACTO2")
   public String getContacto2() {
       return this.contacto2;
   }
   
   public void setContacto2(String contacto2) {
       this.contacto2 = contacto2;
   }

   
   @Column(name="CARGO_CONTACTO2")
   public String getCargoContacto2() {
       return this.cargoContacto2;
   }
   
   public void setCargoContacto2(String cargoContacto2) {
       this.cargoContacto2 = cargoContacto2;
   }

   
   @Column(name="RELACION_CONTACTO2")
   public String getRelacionContacto2() {
       return this.relacionContacto2;
   }
   
   public void setRelacionContacto2(String relacionContacto2) {
       this.relacionContacto2 = relacionContacto2;
   }

   
   @Column(name="CONTACTO3")
   public String getContacto3() {
       return this.contacto3;
   }
   
   public void setContacto3(String contacto3) {
       this.contacto3 = contacto3;
   }

   
   @Column(name="CARGO_CONTACTO3")
   public String getCargoContacto3() {
       return this.cargoContacto3;
   }
   
   public void setCargoContacto3(String cargoContacto3) {
       this.cargoContacto3 = cargoContacto3;
   }

   
   @Column(name="RELACION_CONTACTO3")
   public String getRelacionContacto3() {
       return this.relacionContacto3;
   }
   
   public void setRelacionContacto3(String relacionContacto3) {
       this.relacionContacto3 = relacionContacto3;
   }

   
   @Column(name="CREADO_POR")
   public String getCreadoPor() {
       return this.creadoPor;
   }
   
   public void setCreadoPor(String creadoPor) {
       this.creadoPor = creadoPor;
   }

  
   @Column(name="FECHA_CREACION")
   public Date getFechaCreacion() {
       return this.fechaCreacion;
   }
   
   public void setFechaCreacion(Date fechaCreacion) {
       this.fechaCreacion = fechaCreacion;
   }

   
   @Column(name="MODIFICADO_POR")
   public String getModificadoPor() {
       return this.modificadoPor;
   }
   
   public void setModificadoPor(String modificadoPor) {
       this.modificadoPor = modificadoPor;
   }

   
   @Column(name="FECHA_MODIFICACION")
   public Date getFechaModificacion() {
       return this.fechaModificacion;
   }
   
   public void setFechaModificacion(Date fechaModificacion) {
       this.fechaModificacion = fechaModificacion;
   }

   
   @Column(name="CITA_REGISTRAL")
   public String getCitaRegistral() {
       return this.citaRegistral;
   }
   
   public void setCitaRegistral(String citaRegistral) {
       this.citaRegistral = citaRegistral;
   }

   
   @Column(name="ESTADO_CIVIL")
   public String getEstadoCivil() {
       return this.estadoCivil;
   }
   
   public void setEstadoCivil(String estadoCivil) {
       this.estadoCivil = estadoCivil;
   }

   
   @Column(name="CR_TOMO")
   public String getCrTomo() {
       return this.crTomo;
   }
   
   public void setCrTomo(String crTomo) {
       this.crTomo = crTomo;
   }

   
   @Column(name="CR_FOLIO")
   public String getCrFolio() {
       return this.crFolio;
   }
   
   public void setCrFolio(String crFolio) {
       this.crFolio = crFolio;
   }

   
   @Column(name="CR_ASIENTO")
   public String getCrAsiento() {
       return this.crAsiento;
   }
   
   public void setCrAsiento(String crAsiento) {
       this.crAsiento = crAsiento;
   }

   
   @Column(name="DIGITO_VERIFICACION")
   public String getDigitoVerificacion() {
       return this.digitoVerificacion;
   }
   
   public void setDigitoVerificacion(String digitoVerificacion) {
       this.digitoVerificacion = digitoVerificacion;
   }

   
   @Column(name="DOCUMENTO_NIT")
   public String getDocumentoNit() {
       return this.documentoNit;
   }
   
   public void setDocumentoNit(String documentoNit) {
       this.documentoNit = documentoNit;
   }

   
   @Column(name="DOM_FISCAL")
   public String getDomFiscal() {
       return this.domFiscal;
   }
   
   public void setDomFiscal(String domFiscal) {
       this.domFiscal = domFiscal;
   }

   
   @Column(name="TELEFONO3")
   public String getTelefono3() {
       return this.telefono3;
   }
   
   public void setTelefono3(String telefono3) {
       this.telefono3 = telefono3;
   }

   
   @Column(name="PER_AFILIADO_DIAMANTE")
   public String getPerAfiliadoDiamante() {
       return this.perAfiliadoDiamante;
   }
   
   public void setPerAfiliadoDiamante(String perAfiliadoDiamante) {
       this.perAfiliadoDiamante = perAfiliadoDiamante;
   }
   
 @Column(name="PER_ESTUDIANTE")
   public int getPerEstudiante() {
       return perEstudiante;
   }

   public void setPerEstudiante(int perEstudiante) {
       this.perEstudiante = perEstudiante;
   }
   
    @Column(name="PER_PROFESOR")
   public int getPerProfesor() {
       return perEstudiante;
   }

   public void setPerProfesor(int perEstudiante) {
       this.perEstudiante = perEstudiante;
   }
   
   @Column(name="PER_GRD_GRADO_ACADEMICO")
   public String getPerGrdGradoAcademico() {
       return this.perGrdGradoAcademico;
   }
   
   public void setPerGrdGradoAcademico(String perGrdGradoAcademico) {
       this.perGrdGradoAcademico = perGrdGradoAcademico;
   }

   
   @Column(name="PER_APELLIDO_SOLTERA_CASADA")
   public String getPerApellidoSolteraCasada() {
       return this.perApellidoSolteraCasada;
   }
   
   public void setPerApellidoSolteraCasada(String perApellidoSolteraCasada) {
       this.perApellidoSolteraCasada = perApellidoSolteraCasada;
   }

   
   @Column(name="PER_PRO_PROVINCIA")
   public Long getPerProProvincia() {
       return this.perProProvincia;
   }
   
   public void setPerProProvincia(Long perProProvincia) {
       this.perProProvincia = perProProvincia;
   }

   
   @Column(name="PER_CLASE_SEC_ECONOMICO")
   public String getPerClaseSecEconomico() {
       return this.perClaseSecEconomico;
   }
   
   public void setPerClaseSecEconomico(String perClaseSecEconomico) {
       this.perClaseSecEconomico = perClaseSecEconomico;
   }

   
   @Column(name="PROVINCIA")
   public String getProvincia() {
       return this.provincia;
   }
   
   public void setProvincia(String provincia) {
       this.provincia = provincia;
   }

   
   @Column(name="DISTRITO")
   public String getDistrito() {
       return this.distrito;
   }
   
   public void setDistrito(String distrito) {
       this.distrito = distrito;
   }

   
   @Column(name="CANTON")
   public String getCanton() {
       return this.canton;
   }
   
   public void setCanton(String canton) {
       this.canton = canton;
   }

   
   @Column(name="PER_EMP_EMPRESA")
   public String getPerEmpEmpresa() {
       return this.perEmpEmpresa;
   }
   
   public void setPerEmpEmpresa(String perEmpEmpresa) {
       this.perEmpEmpresa = perEmpEmpresa;
   }

   
   @Column(name="PER_CONSECUTIVO")
   public Long getPerConsecutivo() {
       return this.perConsecutivo;
   }
   
   public void setPerConsecutivo(Long perConsecutivo) {
       this.perConsecutivo = perConsecutivo;
   }

   
   @Column(name="CR_TOMO_2")
   public String getCrTomo2() {
       return this.crTomo2;
   }
   
   public void setCrTomo2(String crTomo2) {
       this.crTomo2 = crTomo2;
   }

   
   @Column(name="CR_FOLIO_2")
   public String getCrFolio2() {
       return this.crFolio2;
   }
   
   public void setCrFolio2(String crFolio2) {
       this.crFolio2 = crFolio2;
   }

   
   @Column(name="CR_ASIENTO_2")
   public String getCrAsiento2() {
       return this.crAsiento2;
   }
   
   public void setCrAsiento2(String crAsiento2) {
       this.crAsiento2 = crAsiento2;
   }

   
   @Column(name="PER_TCU_CUENTA")
   public String getPerTcuCuenta() {
       return this.perTcuCuenta;
   }
   
   public void setPerTcuCuenta(String perTcuCuenta) {
       this.perTcuCuenta = perTcuCuenta;
   }


	@Column(name="PER_PACIENTE")
private String getPaciente() {
	return paciente;
}


private void setPaciente(String paciente) {
	this.paciente = paciente;
}


@Column(name="PER_MEDICO")
private String getMedico() {
	return medico;
}


private void setMedico(String medico) {
	this.medico = medico;
}
   
   

}


