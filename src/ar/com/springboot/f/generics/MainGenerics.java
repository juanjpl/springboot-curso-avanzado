package ar.com.springboot.f.generics;

import java.util.ArrayList;
import java.util.HashMap;

import ar.com.springboot.b.abstractas.AnimalAbstracto;

public class MainGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<AnimalAbstracto> a = new ArrayList<>();
		
		HashMap<Long, String> q = new HashMap<>();
		
		MyGenerico<String> g = new MyGenerico<String>("Hola! Soy un campo genérico", 10);

	}

}
