package me.sumitkawatra.springweb.exception;

public class DataIntegrityException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 795006586104437923L;

	public DataIntegrityException() {

	}

	public DataIntegrityException(String message) {
		super(message);

	}

	public DataIntegrityException(Throwable cause) {
		super(cause);

	}

	public DataIntegrityException(String message, Throwable cause) {
		super(message, cause);

	}

	public DataIntegrityException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
