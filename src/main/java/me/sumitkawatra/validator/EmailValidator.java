/**
 * Custom Validator
 */
package me.sumitkawatra.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import me.sumitkawatra.springweb.model.AppUser;

@Component
public class EmailValidator implements Validator {

	public boolean supports(Class<?> cls) {
		return AppUser.class.isAssignableFrom(cls);
	}

	public void validate(Object Object, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.email", "Email is ------ required.");
	}
}
