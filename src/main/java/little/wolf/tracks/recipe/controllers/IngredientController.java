package little.wolf.tracks.recipe.controllers;

import little.wolf.tracks.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class IngredientController {
    private final RecipeService recipeService;

    public IngredientController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    @RequestMapping ("/recipe/{recipeId}/ingredients")
    public String listIngredients(@PathVariable long recipeId, Model model) {
        log.debug("Getting ingredient list for recipe id: " + recipeId);
        model.addAttribute("recipe", recipeService.findById(recipeId));
        return "recipe/ingredient/list";
    }
}
