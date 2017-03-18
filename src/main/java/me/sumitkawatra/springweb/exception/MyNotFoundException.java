package me.sumitkawatra.springweb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Nahi milta hia Bhai logo")
public class MyNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6716052903432211750L;

	public MyNotFoundException() {
	}

	public MyNotFoundException(String message) {
		super(message);
	}

	public MyNotFoundException(Throwable cause) {
		super(cause);
	}

	public MyNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
