package ar.com.springboot.a.inicio;

import lombok.*;

//@NoArgsConstructor

@AllArgsConstructor

public class Animal {

	protected String nombre;
	
		
	public Animal(String nombre2) {
		// TODO Auto-generated constructor stub
	}


	public void mensaje() {
		System.out.println("Soy un animal!");
	}
	
}
