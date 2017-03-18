package me.sumitkawatra.springweb.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.sumitkawatra.springweb.model.AppUser;
import me.sumitkawatra.validator.EmailValidator;

@Controller
public class AppUserController {
	
	@Autowired
	private EmailValidator emailValidator;
	
	 @InitBinder//Before Binding Stuff so WebDataBinder
	 protected void initBinder(final WebDataBinder binder) {
		 System.out.println("Init Binder Call!! BeanBack");
		 binder.addValidators(emailValidator);
	 }
	
	@RequestMapping(method=RequestMethod.POST, value="AppUser")
	public String processAppUser( @ModelAttribute("newAppUser") @Valid AppUser appUser,BindingResult errors) {
		
		if(errors.hasErrors()) {
			System.out.println("Error Found in binding "+errors);
			return "AppUserForm";
		} else {
			System.out.println("validation Pass!");
		}
		
		System.out.println("Got the save call"+appUser);
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="AppUser")
	public String appUserForm(Model model) {
		AppUser appUser = new AppUser();
		appUser.setDomain(new LinkedHashMap<String, String>());
		model.addAttribute("newAppUser", new AppUser());
		return "AppUserForm";
	}
	
	@ModelAttribute//Reference Data To Controller So Model Map
	public void referenceData(ModelMap model) {
		System.out.println("Model Attribute : Ref Data!");
		Map<String,String> country = new LinkedHashMap<String,String>();
		country.put("US", "United Stated");
		country.put("CHINA", "China");
		country.put("SG", "Singapore");
		country.put("MY", "Malaysia");
		model.addAttribute("countries", country);

		Map<String,String> javaSkill = new LinkedHashMap<String,String>();
		javaSkill.put("Hibernate", "Hibernate");
		javaSkill.put("Spring", "Spring");
		javaSkill.put("Apache Wicket", "Apache Wicket");
		javaSkill.put("Struts", "Struts");
		model.addAttribute("skills", javaSkill);

		
	}
	
	@ModelAttribute("domains") //Reference data different style
	public Map<String,String> countryRefData(){
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		map.put("BFSI", "Bankind ana Finance");
		map.put("PUB", "Publshing");
		map.put("MKT", "Marketing");
		
		return map;
	}

	public EmailValidator getEmailValidator() {
		return emailValidator;
	}

	public void setEmailValidator(EmailValidator emailValidator) {
		this.emailValidator = emailValidator;
	}

}
