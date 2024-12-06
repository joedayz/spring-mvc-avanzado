package pe.joedayz.atletas;

import org.springframework.stereotype.Component;

/**
 * @author josediaz
 **/
@Component
public class Athlete {

  private String lastName;

  public Athlete() {
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
