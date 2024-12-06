package pe.joedayz.atletas;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import jakarta.validation.constraints.Size;

/**
 * @author josediaz
 **/
@Component
public class Athlete {

  private String firstName;
  @NotNull(message = "This is a required field")
  @Size(min=1, message="This is a required field.")
  //@NotEmpty(message = "This is required field")
  private String lastName;
  private String country;
  private String handedness;
  private String[] grandSlams;

  @DateTimeFormat(pattern = "dd-MM-yyyy")
  @Past
  private Date lastWon;

  @NotNull(message = "This is a required field")
  @Min(value=1, message="Value must be greater than or equal to 1.")
  @Max(value = 100, message = "Value must be less than or equal to 100.")
  private Integer rank;

  public Athlete() {
  }


  public Date getLastWon() {
    return lastWon;
  }

  public void setLastWon(Date lastWon) {
    this.lastWon = lastWon;
  }

  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
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

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
