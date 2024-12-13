package pe.joedayz.atletas;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 @author josediaz   
 **/
@Constraint(validatedBy = Head2HeadConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HeadToHead {

  public String message() default "Value must have digits in ##-## format.";

  public Class<?>[] groups() default {};

  public Class<? extends Payload>[] payload() default {};
}
