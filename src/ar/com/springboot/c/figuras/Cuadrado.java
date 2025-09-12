package ar.com.springboot.c.figuras;



import ar.com.springboot.d.interfaces.IColoreable;
import ar.com.springboot.d.interfaces.IDibujable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cuadrado extends Figura implements  IColoreable , IDibujable {

	private double valorLado;
	
	
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return  valorLado*valorLado;
	}
	
	
	public double perimetro() {
		// TODO Auto-generated method stub
		return  this.cantidadLados*valorLado;
	}


	public void setValorLado(int i) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String colorear() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String metodo(String a, String b) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
