package Clases;

import Clases.Persona;

public class Empleado extends Persona{
	
	int idEmpleado;
	int sueldo;
	String turno;
	String sector;

	public Empleado(String nombre, String apellido, String email, int dni, int idEmpleado, int sueldo, String turno, String sector) {
		super(nombre, apellido, email, dni);
		this.idEmpleado = idEmpleado;
		this.sueldo = sueldo;
		this.turno = turno;
		this.sector = sector;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public int getSueldo() {
		return sueldo;
	}


	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	@Override
	public String toString() {
		return super.toString() + ", ID=" + idEmpleado + ", sueldo=" + sueldo + ", turno=" + turno + ", sector=" + sector;
	}

	
	


}
