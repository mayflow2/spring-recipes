package little.wolf.tracks.recipe.services;

import little.wolf.tracks.recipe.commands.RecipeCommand;
import little.wolf.tracks.recipe.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
