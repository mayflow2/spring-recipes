package little.wolf.tracks.recipe.repositories;

import little.wolf.tracks.recipe.domain.Category;
import little.wolf.tracks.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
