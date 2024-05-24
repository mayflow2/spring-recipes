package little.wolf.tracks.recipe.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void setId() throws Exception {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void setDescription() {
    }

    @Test
    public void setRecipes() {
    }
}