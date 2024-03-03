package entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "TB_USUARIO")
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int idUsuario;
private String nombre;
private String apellidos;
private String dni;
private String sexo;
private String password;
private String email;
private long telefono;
private LocalDate fechaNacimiento;
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
public int getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
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
@Override
public String toString() {
	return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", sexo=" + sexo + ", idUsuario="
			+ idUsuario + ", password=" + password + ", email=" + email + ", telefono=" + telefono
			+ ", fechaNacimiento=" + fechaNacimiento + "]";
}
public Usuario(String nombre, String apellidos, String dni, String sexo, int idUsuario, String password, String email,
		long telefono, LocalDate fechaNacimiento) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dni = dni;
	this.sexo = sexo;
	this.idUsuario = idUsuario;
	this.password = password;
	this.email = email;
	this.telefono = telefono;
	this.fechaNacimiento = fechaNacimiento;
}
public Usuario() {
	super();
}


}
