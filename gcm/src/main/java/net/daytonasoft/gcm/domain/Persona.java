package net.daytonasoft.gcm.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

@Entity
@Table(name="GNL_PERSONA_TR_NX"
    ,schema="MBACLOUDDESA"
    , uniqueConstraints = @UniqueConstraint(columnNames="DOCUMENTO_NIT") 
)
public class Persona {
	
	private int persona1;
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
    private Integer perVersion;
    
   public Persona() {
   }

	
   public Persona(int persona, String perAfiliadoDiamante, int perEstudiante, int perProfesor, String perEmpEmpresa, Integer perVersion) {
       this.persona = persona;
       this.perAfiliadoDiamante = perAfiliadoDiamante;
       this.perEstudiante = perEstudiante;
       this.perProfesor = perProfesor;
       this.perEmpEmpresa = perEmpEmpresa;
       this.perVersion = perVersion;
   }
   public Persona(int persona, String nombre, String apellidos, int tipoDocumento, String documento, String razonSocial, Date fechaNacimiento, String sexo, String pfeProfesion, String nacionalidad, int proveedor, int cliente, int banco, int empleado, int servicios, int otro, String expOtro, String paiPais, String ciuCiudad, String zonZona, String email, String direccion, String correspondencia, String telefono1, String telefono2, String fax, String apartado, String regimenIva, String granContribuyente, String autoretenedor, String actActividad, String observaciones, String representanteLegal, String cedulaRepresentante, String contacto1, String cargoContacto1, String relacionContacto1, String contacto2, String cargoContacto2, String relacionContacto2, String contacto3, String cargoContacto3, String relacionContacto3, String creadoPor, Date fechaCreacion, String modificadoPor, Date fechaModificacion, String citaRegistral, String estadoCivil, String crTomo, String crFolio, String crAsiento, String digitoVerificacion, String documentoNit, String domFiscal, String telefono3, String perAfiliadoDiamante, int perEstudiante, int perProfesor, String perGrdGradoAcademico, String perApellidoSolteraCasada, Long perProProvincia, String perClaseSecEconomico, String provincia, String distrito, String canton, String perEmpEmpresa, Long perConsecutivo, String crTomo2, String crFolio2, String crAsiento2, String perTcuCuenta, Integer perVersion) {
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
      this.perProfesor = perProfesor;
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
      this.perVersion = perVersion;
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

   
   @Column(name="TIPO_DOCUMENTO", precision=1, scale=0)
   public int getTipoDocumento() {
       return this.tipoDocumento;
   }
   
   public void setTipoDocumento(int tipoDocumento) {
       this.tipoDocumento = tipoDocumento;
   }

   
   @Column(name="DOCUMENTO", length=20)
   public String getDocumento() {
       return this.documento;
   }
   
   public void setDocumento(String documento) {
       this.documento = documento;
   }

   
   @Column(name="RAZON_SOCIAL", length=150)
   public String getRazonSocial() {
       return this.razonSocial;
   }
   
   public void setRazonSocial(String razonSocial) {
       this.razonSocial = razonSocial;
   }

   @Temporal(TemporalType.DATE)
   @Column(name="FECHA_NACIMIENTO", length=7)
   public Date getFechaNacimiento() {
       return this.fechaNacimiento;
   }
   
   public void setFechaNacimiento(Date fechaNacimiento) {
       this.fechaNacimiento = fechaNacimiento;
   }

   
   @Column(name="SEXO", length=1)
   public String getSexo() {
       return this.sexo;
   }
   
   public void setSexo(String sexo) {
       this.sexo = sexo;
   }

   
   @Column(name="PFE_PROFESION", length=20)
   public String getPfeProfesion() {
       return this.pfeProfesion;
   }
   
   public void setPfeProfesion(String pfeProfesion) {
       this.pfeProfesion = pfeProfesion;
   }

   
   @Column(name="NACIONALIDAD", length=30)
   public String getNacionalidad() {
       return this.nacionalidad;
   }
   
   public void setNacionalidad(String nacionalidad) {
       this.nacionalidad = nacionalidad;
   }

   
   @Column(name="PROVEEDOR", precision=1, scale=0)
   public int getProveedor() {
       return this.proveedor;
   }
   
   public void setProveedor(int proveedor) {
       this.proveedor = proveedor;
   }

   
   @Column(name="CLIENTE", precision=1, scale=0)
   public int getCliente() {
       return this.cliente;
   }
   
   public void setCliente(int cliente) {
       this.cliente = cliente;
   }

   
   @Column(name="BANCO", precision=1, scale=0)
   public int getBanco() {
       return this.banco;
   }
   
   public void setBanco(int banco) {
       this.banco = banco;
   }

   
   @Column(name="EMPLEADO", precision=1, scale=0)
   public int getEmpleado() {
       return this.empleado;
   }
   
   public void setEmpleado(int empleado) {
       this.empleado = empleado;
   }

   
   @Column(name="SERVICIOS", precision=1, scale=0)
   public int getServicios() {
       return this.servicios;
   }
   
   public void setServicios(int servicios) {
       this.servicios = servicios;
   }

   
   @Column(name="OTRO", precision=1, scale=0)
   public int getOtro() {
       return this.otro;
   }
   
   public void setOtro(int otro) {
       this.otro = otro;
   }

   
   @Column(name="EXP_OTRO", length=20)
   public String getExpOtro() {
       return this.expOtro;
   }
   
   public void setExpOtro(String expOtro) {
       this.expOtro = expOtro;
   }

   
   @Column(name="PAI_PAIS", length=6)
   public String getPaiPais() {
       return this.paiPais;
   }
   
   public void setPaiPais(String paiPais) {
       this.paiPais = paiPais;
   }

   
   @Column(name="CIU_CIUDAD", length=6)
   public String getCiuCiudad() {
       return this.ciuCiudad;
   }
   
   public void setCiuCiudad(String ciuCiudad) {
       this.ciuCiudad = ciuCiudad;
   }

   
   @Column(name="ZON_ZONA", length=6)
   public String getZonZona() {
       return this.zonZona;
   }
   
   public void setZonZona(String zonZona) {
       this.zonZona = zonZona;
   }

   
   @Column(name="EMAIL", length=60)
   public String getEmail() {
       return this.email;
   }
   
   public void setEmail(String email) {
       this.email = email;
   }

   
   @Column(name="DIRECCION", length=200)
   public String getDireccion() {
       return this.direccion;
   }
   
   public void setDireccion(String direccion) {
       this.direccion = direccion;
   }

   
   @Column(name="CORRESPONDENCIA", length=100)
   public String getCorrespondencia() {
       return this.correspondencia;
   }
   
   public void setCorrespondencia(String correspondencia) {
       this.correspondencia = correspondencia;
   }

   
   @Column(name="TELEFONO1", length=20)
   public String getTelefono1() {
       return this.telefono1;
   }
   
   public void setTelefono1(String telefono1) {
       this.telefono1 = telefono1;
   }

   
   @Column(name="TELEFONO2", length=20)
   public String getTelefono2() {
       return this.telefono2;
   }
   
   public void setTelefono2(String telefono2) {
       this.telefono2 = telefono2;
   }

   
   @Column(name="FAX", length=20)
   public String getFax() {
       return this.fax;
   }
   
   public void setFax(String fax) {
       this.fax = fax;
   }

   
   @Column(name="APARTADO", length=20)
   public String getApartado() {
       return this.apartado;
   }
   
   public void setApartado(String apartado) {
       this.apartado = apartado;
   }

   
   @Column(name="REGIMEN_IVA", length=1)
   public String getRegimenIva() {
       return this.regimenIva;
   }
   
   public void setRegimenIva(String regimenIva) {
       this.regimenIva = regimenIva;
   }

   
   @Column(name="GRAN_CONTRIBUYENTE", length=1)
   public String getGranContribuyente() {
       return this.granContribuyente;
   }
   
   public void setGranContribuyente(String granContribuyente) {
       this.granContribuyente = granContribuyente;
   }

   
   @Column(name="AUTORETENEDOR", length=1)
   public String getAutoretenedor() {
       return this.autoretenedor;
   }
   
   public void setAutoretenedor(String autoretenedor) {
       this.autoretenedor = autoretenedor;
   }

   
   @Column(name="ACT_ACTIVIDAD", length=6)
   public String getActActividad() {
       return this.actActividad;
   }
   
   public void setActActividad(String actActividad) {
       this.actActividad = actActividad;
   }

   
   @Column(name="OBSERVACIONES", length=100)
   public String getObservaciones() {
       return this.observaciones;
   }
   
   public void setObservaciones(String observaciones) {
       this.observaciones = observaciones;
   }

   
   @Column(name="REPRESENTANTE_LEGAL", length=30)
   public String getRepresentanteLegal() {
       return this.representanteLegal;
   }
   
   public void setRepresentanteLegal(String representanteLegal) {
       this.representanteLegal = representanteLegal;
   }

   
   @Column(name="CEDULA_REPRESENTANTE", length=20)
   public String getCedulaRepresentante() {
       return this.cedulaRepresentante;
   }
   
   public void setCedulaRepresentante(String cedulaRepresentante) {
       this.cedulaRepresentante = cedulaRepresentante;
   }

   
   @Column(name="CONTACTO1", length=30)
   public String getContacto1() {
       return this.contacto1;
   }
   
   public void setContacto1(String contacto1) {
       this.contacto1 = contacto1;
   }

   
   @Column(name="CARGO_CONTACTO1", length=30)
   public String getCargoContacto1() {
       return this.cargoContacto1;
   }
   
   public void setCargoContacto1(String cargoContacto1) {
       this.cargoContacto1 = cargoContacto1;
   }

   
   @Column(name="RELACION_CONTACTO1", length=50)
   public String getRelacionContacto1() {
       return this.relacionContacto1;
   }
   
   public void setRelacionContacto1(String relacionContacto1) {
       this.relacionContacto1 = relacionContacto1;
   }

   
   @Column(name="CONTACTO2", length=30)
   public String getContacto2() {
       return this.contacto2;
   }
   
   public void setContacto2(String contacto2) {
       this.contacto2 = contacto2;
   }

   
   @Column(name="CARGO_CONTACTO2", length=30)
   public String getCargoContacto2() {
       return this.cargoContacto2;
   }
   
   public void setCargoContacto2(String cargoContacto2) {
       this.cargoContacto2 = cargoContacto2;
   }

   
   @Column(name="RELACION_CONTACTO2", length=50)
   public String getRelacionContacto2() {
       return this.relacionContacto2;
   }
   
   public void setRelacionContacto2(String relacionContacto2) {
       this.relacionContacto2 = relacionContacto2;
   }

   
   @Column(name="CONTACTO3", length=30)
   public String getContacto3() {
       return this.contacto3;
   }
   
   public void setContacto3(String contacto3) {
       this.contacto3 = contacto3;
   }

   
   @Column(name="CARGO_CONTACTO3", length=30)
   public String getCargoContacto3() {
       return this.cargoContacto3;
   }
   
   public void setCargoContacto3(String cargoContacto3) {
       this.cargoContacto3 = cargoContacto3;
   }

   
   @Column(name="RELACION_CONTACTO3", length=50)
   public String getRelacionContacto3() {
       return this.relacionContacto3;
   }
   
   public void setRelacionContacto3(String relacionContacto3) {
       this.relacionContacto3 = relacionContacto3;
   }

   
   @Column(name="CREADO_POR", length=30)
   public String getCreadoPor() {
       return this.creadoPor;
   }
   
   public void setCreadoPor(String creadoPor) {
       this.creadoPor = creadoPor;
   }

   @Temporal(TemporalType.DATE)
   @Column(name="FECHA_CREACION", length=7)
   public Date getFechaCreacion() {
       return this.fechaCreacion;
   }
   
   public void setFechaCreacion(Date fechaCreacion) {
       this.fechaCreacion = fechaCreacion;
   }

   
   @Column(name="MODIFICADO_POR", length=30)
   public String getModificadoPor() {
       return this.modificadoPor;
   }
   
   public void setModificadoPor(String modificadoPor) {
       this.modificadoPor = modificadoPor;
   }

   @Temporal(TemporalType.DATE)
   @Column(name="FECHA_MODIFICACION", length=7)
   public Date getFechaModificacion() {
       return this.fechaModificacion;
   }
   
   public void setFechaModificacion(Date fechaModificacion) {
       this.fechaModificacion = fechaModificacion;
   }

   
   @Column(name="CITA_REGISTRAL", length=600)
   public String getCitaRegistral() {
       return this.citaRegistral;
   }
   
   public void setCitaRegistral(String citaRegistral) {
       this.citaRegistral = citaRegistral;
   }

   
   @Column(name="ESTADO_CIVIL", length=3)
   public String getEstadoCivil() {
       return this.estadoCivil;
   }
   
   public void setEstadoCivil(String estadoCivil) {
       this.estadoCivil = estadoCivil;
   }

   
   @Column(name="CR_TOMO", length=20)
   public String getCrTomo() {
       return this.crTomo;
   }
   
   public void setCrTomo(String crTomo) {
       this.crTomo = crTomo;
   }

   
   @Column(name="CR_FOLIO", length=20)
   public String getCrFolio() {
       return this.crFolio;
   }
   
   public void setCrFolio(String crFolio) {
       this.crFolio = crFolio;
   }

   
   @Column(name="CR_ASIENTO", length=20)
   public String getCrAsiento() {
       return this.crAsiento;
   }
   
   public void setCrAsiento(String crAsiento) {
       this.crAsiento = crAsiento;
   }

   
   @Column(name="DIGITO_VERIFICACION", length=1)
   public String getDigitoVerificacion() {
       return this.digitoVerificacion;
   }
   
   public void setDigitoVerificacion(String digitoVerificacion) {
       this.digitoVerificacion = digitoVerificacion;
   }

   
   @Column(name="DOCUMENTO_NIT", unique=true, length=20)
   public String getDocumentoNit() {
       return this.documentoNit;
   }
   
   public void setDocumentoNit(String documentoNit) {
       this.documentoNit = documentoNit;
   }

   
   @Column(name="DOM_FISCAL", length=100)
   public String getDomFiscal() {
       return this.domFiscal;
   }
   
   public void setDomFiscal(String domFiscal) {
       this.domFiscal = domFiscal;
   }

   
   @Column(name="TELEFONO3", length=20)
   public String getTelefono3() {
       return this.telefono3;
   }
   
   public void setTelefono3(String telefono3) {
       this.telefono3 = telefono3;
   }

   
   @Column(name="PER_AFILIADO_DIAMANTE", nullable=false, length=1)
   public String getPerAfiliadoDiamante() {
       return this.perAfiliadoDiamante;
   }
   
   public void setPerAfiliadoDiamante(String perAfiliadoDiamante) {
       this.perAfiliadoDiamante = perAfiliadoDiamante;
   }
   
 @Column(name="PER_ESTUDIANTE", precision=1, scale=0)
   public int getPerEstudiante() {
       return perEstudiante;
   }

   public void setPerEstudiante(int perEstudiante) {
       this.perEstudiante = perEstudiante;
   }
   
    @Column(name="PER_PROFESOR", precision=1, scale=0)
   public int getPerProfesor() {
       return perEstudiante;
   }

   public void setPerProfesor(int perEstudiante) {
       this.perEstudiante = perEstudiante;
   }
   
   @Column(name="PER_GRD_GRADO_ACADEMICO", length=10)
   public String getPerGrdGradoAcademico() {
       return this.perGrdGradoAcademico;
   }
   
   public void setPerGrdGradoAcademico(String perGrdGradoAcademico) {
       this.perGrdGradoAcademico = perGrdGradoAcademico;
   }

   
   @Column(name="PER_APELLIDO_SOLTERA_CASADA", length=100)
   public String getPerApellidoSolteraCasada() {
       return this.perApellidoSolteraCasada;
   }
   
   public void setPerApellidoSolteraCasada(String perApellidoSolteraCasada) {
       this.perApellidoSolteraCasada = perApellidoSolteraCasada;
   }

   
   @Column(name="PER_PRO_PROVINCIA", precision=10, scale=0)
   public Long getPerProProvincia() {
       return this.perProProvincia;
   }
   
   public void setPerProProvincia(Long perProProvincia) {
       this.perProProvincia = perProProvincia;
   }

   
   @Column(name="PER_CLASE_SEC_ECONOMICO", length=60)
   public String getPerClaseSecEconomico() {
       return this.perClaseSecEconomico;
   }
   
   public void setPerClaseSecEconomico(String perClaseSecEconomico) {
       this.perClaseSecEconomico = perClaseSecEconomico;
   }

   
   @Column(name="PROVINCIA", length=30)
   public String getProvincia() {
       return this.provincia;
   }
   
   public void setProvincia(String provincia) {
       this.provincia = provincia;
   }

   
   @Column(name="DISTRITO", length=30)
   public String getDistrito() {
       return this.distrito;
   }
   
   public void setDistrito(String distrito) {
       this.distrito = distrito;
   }

   
   @Column(name="CANTON", length=30)
   public String getCanton() {
       return this.canton;
   }
   
   public void setCanton(String canton) {
       this.canton = canton;
   }

   
   @Column(name="PER_EMP_EMPRESA", nullable=false, length=6)
   public String getPerEmpEmpresa() {
       return this.perEmpEmpresa;
   }
   
   public void setPerEmpEmpresa(String perEmpEmpresa) {
       this.perEmpEmpresa = perEmpEmpresa;
   }

   
   @Column(name="PER_CONSECUTIVO", precision=10, scale=0)
   public Long getPerConsecutivo() {
       return this.perConsecutivo;
   }
   
   public void setPerConsecutivo(Long perConsecutivo) {
       this.perConsecutivo = perConsecutivo;
   }

   
   @Column(name="CR_TOMO_2", length=20)
   public String getCrTomo2() {
       return this.crTomo2;
   }
   
   public void setCrTomo2(String crTomo2) {
       this.crTomo2 = crTomo2;
   }

   
   @Column(name="CR_FOLIO_2", length=20)
   public String getCrFolio2() {
       return this.crFolio2;
   }
   
   public void setCrFolio2(String crFolio2) {
       this.crFolio2 = crFolio2;
   }

   
   @Column(name="CR_ASIENTO_2", length=20)
   public String getCrAsiento2() {
       return this.crAsiento2;
   }
   
   public void setCrAsiento2(String crAsiento2) {
       this.crAsiento2 = crAsiento2;
   }

   
   @Column(name="PER_TCU_CUENTA", length=10)
   public String getPerTcuCuenta() {
       return this.perTcuCuenta;
   }
   
   public void setPerTcuCuenta(String perTcuCuenta) {
       this.perTcuCuenta = perTcuCuenta;
   }
   
 
  @Version
   @Column(name="PER_VERSION")
   public Integer getPerVersion() {
       return perVersion;
   }

   public void setPerVersion(Integer perVersion) {
       this.perVersion = perVersion;
   }
   
   
   

}


