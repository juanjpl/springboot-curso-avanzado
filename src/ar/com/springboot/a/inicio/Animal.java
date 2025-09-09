package ar.com.springboot.a.inicio;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor

public class Animal {

	protected String nombre;
	
		
	public void mensaje() {
		System.out.println("Soy un animal!");
	}
	
}
