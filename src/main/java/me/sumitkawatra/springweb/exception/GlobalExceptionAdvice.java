package me.sumitkawatra.springweb.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionAdvice {

	
	  @ExceptionHandler({Exception.class})
	  public ModelAndView myError(HttpServletRequest req, Exception ex) {
		    ModelAndView mav = new ModelAndView();
		    mav.addObject("exception", ex);
		    mav.addObject("url", req.getRequestURL());
		    mav.setViewName("GlobalError");
		    return mav;
	  }
	
}
