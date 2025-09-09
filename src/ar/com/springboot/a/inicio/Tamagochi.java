package ar.com.springboot.a.inicio;

//simport java.util.ArrayList;

import lombok.*;

// @Data incluye todo desde Object

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor

public class Tamagochi {

	//private ArrayList<String> estado; // String es tambien una clase -- se almacena en la memoria chip
	private static String estado;
	private static int nivel = 0; // numerico primitivo --- Integer es una clase
	private static final String USERNAME= "root";
	// publico o privado
	// privado --- para usar solo internamente

	/*
	 * atributos metodos constructor
	 */

	public Tamagochi(String estado, int nivel) {
		// TODO Auto-generated constructor stub
		this.estado = estado;
		this.nivel = nivel;
	}

	public Tamagochi(String nombre) {
		// TODO Auto-generated constructor stub
		super();
	}

	public static void comer() {
		switch (estado) {
		case "Hambrienta":
			estado = "Contenta";
			System.out.println("La mascota está: "+ estado);
			break;
		case "Contenta":
			nivel+=1;
			break;
		case "Aburrida":
			estado="Contenta";
			break;
			default:
				break;
		}
	}

	public void jugar() {
		
		if(puedeJugar()) {
			switch (estado) {
			case "Contenta":
				nivel+=2;
				break;
			case "Aburrida":
				estado="Contenta";
				break;
				default:
					break;
			}
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Tamagochi [estado=" + estado + ", nivel=" + nivel + "]";
	}

	private boolean puedeJugar() {
		if(estado.equals("hambrienta")) {
			return false;
		}
		
		return true;
	}

	public int getNivel() {
		// TODO Auto-generated method stub
		return nivel;
	}
}
