package entities;

import java.time.LocalDate;

public enum UsuarioEnum {
	USUARIO1( "NOM", "apellidos"," DNI"," sexo"," password"," email", 2123L ,LocalDate.now(), "user");
	
	private String idUsuario;
	private String nombre;
	private String apellidos;
	private String dni;
	private String sexo;
	private String password;
	private String email;
	private long telefono;
	private LocalDate fechaNacimiento;
	private String user;
	
	private UsuarioEnum(String nombre, String apellidos, String dni, String sexo, String password, String email,
			long telefono, LocalDate fechaNacimiento, String user) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sexo = sexo;
		this.password = password;
		this.email = email;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.user = user;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
