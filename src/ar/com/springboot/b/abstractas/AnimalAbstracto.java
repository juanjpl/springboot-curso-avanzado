package ar.com.springboot.b.abstractas;

import lombok.*;

//@NoArgsConstructor

@AllArgsConstructor

public abstract class AnimalAbstracto {

	protected String name;
	
	public AnimalAbstracto() {
		
	}

	public AnimalAbstracto(String a) {
		this.name = a;
	}

	public String mensaje() {
		return "Soy un animal!";
	}
	
	//public abstract String nombre();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
