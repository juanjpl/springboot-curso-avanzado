package ar.com.springboot.f.generics;

public class MyGenerico<T> {

	private T campoGenerico;
	private Integer campoEntero;
	
	
	public MyGenerico(T campoGenerico, Integer campoEnterio) {
		this.campoGenerico = campoGenerico;
		this.campoEntero = campoEntero;
	}
	
	public T getCampoGenerico() {
		return  campoGenerico;
	}
	
	public void setCampoGenerico(T campoGenerico) {
		this.campoGenerico = campoGenerico;
	}
}
