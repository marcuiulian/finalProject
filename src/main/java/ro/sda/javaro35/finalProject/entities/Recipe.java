package ro.sda.javaro35.finalProject.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;
import static lombok.AccessLevel.PRIVATE;

@Entity(name = "recipe")
@Data
@FieldDefaults(level = PRIVATE)
@NoArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue(strategy = AUTO)
    Long id;
    String title;
    String description;
    String preparationInstructions;
    @ManyToMany(fetch = LAZY)
    List<Ingredient> ingredients;
    boolean approvedState;

}
