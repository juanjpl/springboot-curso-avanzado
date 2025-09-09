package ar.com.springboot.a.inicio;

import lombok.*;


//@AllArgsConstructor

@Getter
@Setter

public class Perro extends Animal{

	private String ruido;
	
	
	/*
	 * Lombok NO PERMITE GENERAR LOS CONSTRUCTORES SI USAMOS @ALLARGSCONSTRUCTOR
	 */
	public Perro(String nombre, String ruido) {
		super(nombre);
		this.ruido = ruido;
		
	}


	@Override
	public String toString() {
		return "Perro [ruido=" + ruido + "]";
	}
	
	

	
}
