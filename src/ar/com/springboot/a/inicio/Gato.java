package ar.com.springboot.a.inicio;

import lombok.*;



//@AllArgsConstructor

@Getter
@Setter

public class Gato extends Animal {

	private String ruido;
	
	public Gato(String nombre, String ruido) {
		super(nombre);
		
		this.ruido=ruido;
	}

	
	@Override
	public String toString() {
		return "Gato [ruido=" + ruido + "]";
	}
	
	
	
	

}
