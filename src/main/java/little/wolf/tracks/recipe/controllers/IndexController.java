package little.wolf.tracks.recipe.controllers;

import little.wolf.tracks.recipe.domain.Category;
import little.wolf.tracks.recipe.domain.UnitOfMeasure;
import little.wolf.tracks.recipe.repositories.CategoryRepository;
import little.wolf.tracks.recipe.repositories.UnitOfMeasureRepository;
import little.wolf.tracks.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index page");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
