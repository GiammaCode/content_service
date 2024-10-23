package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Film
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-16T13:57:59.465281663Z[GMT]")

@Document(collection = "films")  // Collezione MongoDB chiamata "films"
public class Film   {
  @JsonProperty("id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer id = null;

  @JsonProperty("title")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String title = null;

  @JsonProperty("Actors")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String actors = null;

  @JsonProperty("release_year")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer releaseYear = null;

  @JsonProperty("genre")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String genre = null;

  @JsonProperty("rating")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private BigDecimal rating = null;


  public Film id(Integer id) { 

    this.id = id;
    return this;
  }

  /**
   * Film's ID
   * @return id
   **/
  
  @Schema(example = "1", description = "Film's ID")
  
  public Integer getId() {  
    return id;
  }



  public void setId(Integer id) { 
    this.id = id;
  }

  public Film title(String title) { 

    this.title = title;
    return this;
  }

  /**
   * Film's title
   * @return title
   **/
  
  @Schema(example = "Il Padrino", description = "Film's title")
  
  public String getTitle() {  
    return title;
  }



  public void setTitle(String title) { 
    this.title = title;
  }

  public Film actors(String actors) { 

    this.actors = actors;
    return this;
  }

  /**
   * actors in the films
   * @return actors
   **/
  
  @Schema(example = "Al Pacino, James Caan", description = "actors in the films")
  
  public String getActors() {  
    return actors;
  }



  public void setActors(String actors) { 
    this.actors = actors;
  }

  public Film releaseYear(Integer releaseYear) { 

    this.releaseYear = releaseYear;
    return this;
  }

  /**
   * year of release
   * @return releaseYear
   **/
  
  @Schema(example = "1972", description = "year of release")
  
  public Integer getReleaseYear() {  
    return releaseYear;
  }



  public void setReleaseYear(Integer releaseYear) { 
    this.releaseYear = releaseYear;
  }

  public Film genre(String genre) { 

    this.genre = genre;
    return this;
  }

  /**
   * type of film
   * @return genre
   **/
  
  @Schema(example = "Drammatico", description = "type of film")
  
  public String getGenre() {  
    return genre;
  }



  public void setGenre(String genre) { 
    this.genre = genre;
  }

  public Film rating(BigDecimal rating) { 

    this.rating = rating;
    return this;
  }

  /**
   * film's rating (from 1 to 10)
   * @return rating
   **/
  
  @Schema(example = "9.2", description = "film's rating (from 1 to 10)")
  
@Valid
  public BigDecimal getRating() {  
    return rating;
  }



  public void setRating(BigDecimal rating) { 
    this.rating = rating;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Film film = (Film) o;
    return Objects.equals(this.id, film.id) &&
        Objects.equals(this.title, film.title) &&
        Objects.equals(this.actors, film.actors) &&
        Objects.equals(this.releaseYear, film.releaseYear) &&
        Objects.equals(this.genre, film.genre) &&
        Objects.equals(this.rating, film.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, actors, releaseYear, genre, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Film {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
    sb.append("    releaseYear: ").append(toIndentedString(releaseYear)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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
