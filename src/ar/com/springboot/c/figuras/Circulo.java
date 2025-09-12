package ar.com.springboot.c.figuras;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circulo extends Figura {

	

	private double radio;
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return  Math.PI*radio*radio;
	}

	public void setRadio(int i) {
		// TODO Auto-generated method stub
		
	}

	
	

}
