package ar.com.springboot.a.inicio;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String status ="404";
	
	public NotFoundException(String message) {
		super(message);
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}
	
	
}
