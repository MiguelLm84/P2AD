package modelo.vo;

import javax.xml.bind.annotation.*;

@XmlType(propOrder= {"dni","nombre","apellido1","apellido2","telefono"})
public class AlumnoVO {
	
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int telefono;
	
	public AlumnoVO() {
		
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
