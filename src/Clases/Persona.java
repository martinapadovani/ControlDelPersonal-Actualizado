package Clases;

public class Persona {
	
	
	String nombre;
	String apellido;
	String email;
	int dni;
	
	public Persona(String nombre, String apellido, String email, int dni) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", DNI=" + dni;
	}
	
	

}

