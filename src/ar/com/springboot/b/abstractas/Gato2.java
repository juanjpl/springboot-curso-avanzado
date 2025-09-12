package ar.com.springboot.b.abstractas;

import lombok.*;



//@AllArgsConstructor

@Getter
@Setter

public class Gato2 extends AnimalAbstracto {

	private String ruido;
	
	public Gato2(String nombre, String ruido) {
		super(nombre);
		
		this.ruido=ruido;
	}

	
	@Override
	public String toString() {
		return "Gato [ruido=" + ruido + "]";
	}
	
	
	
	

}
