package co.edu.udea.exception;

/**
 * Clase para el manejo de excepciones.
 * @author: Viviana Londo�o
 * @version: 1.0
 */

public class MyException extends Exception {

	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
