package ar.com.springboot.c.figuras;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
    	
    	Cuadrado cu = new Cuadrado();
    	cu.setValorLado(2);
    	Circulo ci = new Circulo();
    	ci.setRadio(2);
    	
    	System.out.println(cu.calcularArea());
    	System.out.println(cu.perimetro());
    	System.out.println(ci.calcularArea());
    }
}
