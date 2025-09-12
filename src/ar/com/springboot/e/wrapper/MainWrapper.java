package ar.com.springboot.e.wrapper;

import java.util.ArrayList;

import ar.com.springboot.b.abstractas.AnimalAbstracto;

public class MainWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valorPrimitivo = 123;
		Integer valor1 = Integer.valueOf(valorPrimitivo);
		Integer valor2 = 11111111;
		Integer valor3 = Integer.valueOf(1235);
		
		String palabra = "1234";
		valor3 = Integer.parseInt(palabra);
		
		System.out.println(valor3);
		
		palabra = Integer.toString(valor3);
		
		System.out.println(Integer.valueOf(valorPrimitivo));
		
		
		Integer valor4 = 1234;
		
		System.out.println(valor4.compareTo(12345));
		System.out.println(valor4.compareTo(122));
		
		System.out.println(valor4.equals("1234"));
		
		Long a = valor4.longValue();
		System.out.println(a instanceof Long);
		
		
		
		ArrayList<AnimalAbstracto> arrayAnimales = new ArrayList<>();
		

	}

}
