package ar.com.springboot.h.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainStreams {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		ArrayList<String> palabras  = new ArrayList<>();
		
	palabras.add("Hola");
	palabras.add("Chau");
	palabras.add("Argentina");
	palabras.add("España");
	
	
	palabras.stream().forEach(System.out::println);
	
	*/
	
	ArrayList<String> colores  = new ArrayList<>();
	
	colores.add("Amarillo");
	colores.add("Azul");
	colores.add("Verde");
	colores.add("Rojo");
	
	colores.stream().forEach(System.out::println);
	
	//Aplico el lowercase solo en este momento, sin modificar definitivamente el array
	colores.stream().map(color -> color.toLowerCase()).forEach(System.out::println);
	colores.stream().map(color -> color.toUpperCase()).forEach(System.out::println);
	
	
	colores.stream().forEach(System.out::println);
	
	
	List<String> coloresMayusculas = colores.stream().map(color -> color.toUpperCase()).collect(Collectors.toList());
	coloresMayusculas.stream().forEach(System.out::println);
	
		
	List<Integer> numbers = new ArrayList<>();
	Integer[] numbersArray = {1,2,3,4,5,6,7,8,9};
	
	numbers = Arrays.asList(numbersArray);
	
	numbers.stream().filter(num -> num>=5).forEach(System.out::println);
	
	
	Integer resultado2 = numbers.stream().mapToInt(num -> num*2).sum();
	System.out.println("Resultado: "+ resultado2);
	

		
	}
}
