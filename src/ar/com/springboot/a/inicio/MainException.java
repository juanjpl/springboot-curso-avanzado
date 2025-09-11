package ar.com.springboot.a.inicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar = new ArrayList<>();
		
		ar.add("Hola");
		
		//System.out.println(ar.get(10));
		
		
		//Checkeadas
		
		System.out.println("------------------- Antes del Error");
		try {
			FileInputStream fileInputStrem  = new FileInputStream("prueba.txt");
			
			System.out.println("------------------- Despuesdel Error");
			
		} catch (FileNotFoundException excArchivoNoEncontrado) {
			// TODO Auto-generated catch 

			System.out.println("-------------------  en el catch");
			excArchivoNoEncontrado.printStackTrace(System.out);
			
			//System.out.println(excArchivoNoEncontrado.getMessage());
		}
		
		System.out.println("------------------- despues del error ");
		
	}

}
