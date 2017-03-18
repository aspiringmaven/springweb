/**
 * 
 */
package me.sumitkawatra.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author sumitkawatra
 *
 */
public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
	
	private String hobbies; 
	
	public void initialize(IsValidHobby isValidHobby) {
		System.out.println("Hobbies"+isValidHobby.hobbies());
		setHobbies(isValidHobby.hobbies());
	}

	public boolean isValid(String hobby, ConstraintValidatorContext constraintValidatorContext) {
		
		return (null != hobby) && hobby.matches(getHobbies());
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

}
