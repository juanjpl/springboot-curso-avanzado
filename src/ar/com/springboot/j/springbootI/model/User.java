package ar.com.springboot.j.springbootI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String nombre;
	private String apellido;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String nombre2) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre2;
	}

	public User(String nombre2, String apellido2) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre2;
		this.apellido = apellido2;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public  void setNombre(String nombre2) {
		// TODO Auto-generated method stub
		this.nombre = nombre2;
	}
	
	public  void setApellido(String apellido2) {
		// TODO Auto-generated method stub
		this.apellido = apellido2;
	}
}
