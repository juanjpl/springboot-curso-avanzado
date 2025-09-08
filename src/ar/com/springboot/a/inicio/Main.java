package ar.com.springboot.a.inicio;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Tamagochi> mascotas = new ArrayList<>();
		mascotas.add(new Tamagochi("Hambrienta",0));
		mascotas.add(new Tamagochi("Contenta",0));
		mascotas.add(new Tamagochi("Aburrida",0));
		
		for(Tamagochi osito: mascotas) {
			osito.jugar();
		}
		
		
		mascotas.forEach(osito-> osito.jugar());
		
		for( int i=0; i<mascotas.size();i++) {
			mascotas.get(i).jugar();
		}
		
		mascotas.stream().peek(osito->osito.jugar());
		
	}

}
