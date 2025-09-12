package ar.com.springboot.c.figuras;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public abstract class Figura {
	
	protected int cantidadLados;
	
	public abstract double calcularArea();

}
