package little.wolf.tracks.recipe.services;

import little.wolf.tracks.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
