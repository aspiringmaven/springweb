/**
 * 
 */
package me.sumitkawatra.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy=HobbyValidator.class)
public @interface IsValidHobby {
	
	String message() default "Please enter a valid  Hobby!";
	String hobbies() default "CODING|FOOTBALL";
	
	Class<?> [] groups() default{};
	Class<? extends Payload>[] payload() default{};
}
