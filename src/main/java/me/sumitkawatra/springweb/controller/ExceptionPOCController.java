package me.sumitkawatra.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.sumitkawatra.springweb.exception.FooException;
import me.sumitkawatra.springweb.exception.MyNotFoundException;

@Controller
public class ExceptionPOCController {

	
	/**
	 * To test exception mapping with http status code 
	 */
	
	@RequestMapping("perException")
	public void perException() {
		System.out.println("Test Call");
		throw new MyNotFoundException();
	}
	
	@RequestMapping("globalException1")
	public void globalException() {
		System.out.println("Test Call111");
		throw new NullPointerException();
	}

	
	@RequestMapping("globalException2")
	public void globalException2() {
		System.out.println("Test Call222");
		throw new FooException();
	}
	

}
