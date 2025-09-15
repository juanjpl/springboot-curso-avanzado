package ar.com.springboot.g.lambdas;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> palabras  = new ArrayList<>();
		
		Integer numero = 5;
		
		palabras.forEach((e) -> System.out.println(e)) ;
		palabras.forEach(System.out::println) ;
		
		//elemento->Math.sqrt(elemento);
		//palabras.forEach(Math::sqrt);
		
		
		
		
	}

}
