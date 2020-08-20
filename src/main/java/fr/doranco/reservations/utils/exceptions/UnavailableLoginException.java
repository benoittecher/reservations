package fr.doranco.reservations.utils.exceptions;

public class UnavailableLoginException extends Exception {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnavailableLoginException() {
	    super();
	  }

	  public UnavailableLoginException(String s) {
	    super(s);
	  }
	}