package pe.joedayz.atletas;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author josediaz
 **/
public class Head2HeadConstraintValidator implements ConstraintValidator<HeadToHead, String> {

  @Override
  public void initialize(HeadToHead constraintAnnotation) {
  }

  @Override
  public boolean isValid(String headToHeadScore, ConstraintValidatorContext context) {
    boolean isValid = headToHeadScore.matches("[0-9]{1,2}-[0-9]{1,2}");
    return isValid;
  }
}
