package ar.com.springboot.a.inicio;


public class MainExceptionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor =2;
		
		/*
		if(valor ==5) {
			System.out.println("Está todo ok.");
		}else {
			throw new RuntimeException("El numero está mal.");
		}
		
		*/
		
		try {
			
			if(valor ==5) {
				System.out.println("Está todo ok.");
			}else {
				throw new NotFoundException("Esta exception es personalizada: El numero ingresado es incorrecto");
			}
			
		} catch (NotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getStatus());
		}
		
		
		
		System.out.println("Hola");
	}

}
