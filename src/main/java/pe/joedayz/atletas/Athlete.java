package pe.joedayz.atletas;

import org.springframework.stereotype.Component;

/**
 * @author josediaz
 **/
@Component
public class Athlete {

  private String lastName;
  private String country;
  private String handedness;
  private String[] grandSlams;

  public Athlete() {
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getHandedness() {
    return handedness;
  }

  public void setHandedness(String handedness) {
    this.handedness = handedness;
  }

  public String[] getGrandSlams() {
    return grandSlams;
  }

  public void setGrandSlams(String[] grandSlams) {
    this.grandSlams = grandSlams;
  }
}
