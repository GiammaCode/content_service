package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Film;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Actor
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-16T13:57:59.465281663Z[GMT]")


public class Actor   {
  @JsonProperty("id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer id = null;

  @JsonProperty("name")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String name = null;

  @JsonProperty("surname")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String surname = null;

  @JsonProperty("dateOfBirth")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private LocalDate dateOfBirth = null;

  @JsonProperty("films")
  @Valid
  private List<Film> films = null;

  public Actor id(Integer id) { 

    this.id = id;
    return this;
  }

  /**
   * Actor's ID
   * @return id
   **/
  
  @Schema(example = "100", description = "Actor's ID")
  
  public Integer getId() {  
    return id;
  }



  public void setId(Integer id) { 
    this.id = id;
  }

  public Actor name(String name) { 

    this.name = name;
    return this;
  }

  /**
   * Actor's first name
   * @return name
   **/
  
  @Schema(example = "Al", description = "Actor's first name")
  
  public String getName() {  
    return name;
  }



  public void setName(String name) { 
    this.name = name;
  }

  public Actor surname(String surname) { 

    this.surname = surname;
    return this;
  }

  /**
   * Actor's surname
   * @return surname
   **/
  
  @Schema(example = "Pacino", description = "Actor's surname")
  
  public String getSurname() {  
    return surname;
  }



  public void setSurname(String surname) { 
    this.surname = surname;
  }

  public Actor dateOfBirth(LocalDate dateOfBirth) { 

    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Actor's birthdate
   * @return dateOfBirth
   **/
  
  @Schema(example = "Thu Apr 25 00:00:00 GMT 1940", description = "Actor's birthdate")
  
@Valid
  public LocalDate getDateOfBirth() {  
    return dateOfBirth;
  }



  public void setDateOfBirth(LocalDate dateOfBirth) { 
    this.dateOfBirth = dateOfBirth;
  }

  public Actor films(List<Film> films) { 

    this.films = films;
    return this;
  }

  public Actor addFilmsItem(Film filmsItem) {
    if (this.films == null) {
      this.films = new ArrayList<Film>();
    }
    this.films.add(filmsItem);
    return this;
  }

  /**
   * List of films the actor has performed in
   * @return films
   **/
  
  @Schema(description = "List of films the actor has performed in")
  @Valid
  public List<Film> getFilms() {  
    return films;
  }



  public void setFilms(List<Film> films) { 
    this.films = films;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actor actor = (Actor) o;
    return Objects.equals(this.id, actor.id) &&
        Objects.equals(this.name, actor.name) &&
        Objects.equals(this.surname, actor.surname) &&
        Objects.equals(this.dateOfBirth, actor.dateOfBirth) &&
        Objects.equals(this.films, actor.films);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname, dateOfBirth, films);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    films: ").append(toIndentedString(films)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
