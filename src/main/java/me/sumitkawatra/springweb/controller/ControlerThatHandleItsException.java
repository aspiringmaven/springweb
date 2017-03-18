package me.sumitkawatra.springweb.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import me.sumitkawatra.springweb.exception.DaoException;
import me.sumitkawatra.springweb.exception.DataIntegrityException;

/**
 * 
 * @author sumitkawatra
 * This is POC to test how a controller handle its own exception
 */
@Controller
public class ControlerThatHandleItsException {

	 //POC1
	
	 // For this controller i want to map DataIntegrityException to ttpStatus.CONFLICT 409
	  @ResponseStatus(value=HttpStatus.CONFLICT, reason="Data integrity violation")  // 409
	  @ExceptionHandler(DataIntegrityException.class)
	  public void conflict() {
	    
	  }	
	
	  @RequestMapping("perController1")
	  public void checkConflick() {
		  System.out.println("perController1");
		  throw new DataIntegrityException();
	  }
	  
	  //POC 2
	  
	  //Show below JSP in These Errors note there is no error added in model.
	  @ExceptionHandler({SQLException.class,DaoException.class})
	  public String databseError() {
		  return "DBError";
	  }
	  
	  @RequestMapping("perController2")
	  public void checkDbError() {
		  System.out.println("perController2");
		  throw new DaoException();
	  }
	  
	  //POC3
	  
	  //Show below JSP in These Errors and also render exception data on UI too.
	  @ExceptionHandler({Exception.class})
	  public ModelAndView myError(HttpServletRequest req, Exception ex) {
		    ModelAndView mav = new ModelAndView();
		    mav.addObject("exception", ex);
		    mav.addObject("url", req.getRequestURL());
		    mav.setViewName("MyError");
		    return mav;
	  }
	  
	  
	  @RequestMapping("perController3")
	  public void checkExceptionOnUI() {
		  System.out.println("Hello World test Exception");
		  throw new NullPointerException();
	  }
	  
	  
	  
	  
}
