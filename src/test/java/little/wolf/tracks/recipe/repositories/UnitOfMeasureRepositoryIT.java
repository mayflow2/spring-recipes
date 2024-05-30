package little.wolf.tracks.recipe.repositories;

import little.wolf.tracks.recipe.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository uomRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    @DirtiesContext
    public void findByUom() {
        Optional<UnitOfMeasure> uomOptional = uomRepository.findByUom("Teaspoon");
        assertEquals("Teaspoon", uomOptional.get().getUom());
    }

    @Test
    public void findByUomCup() {
        Optional<UnitOfMeasure> uomOptional = uomRepository.findByUom("Cup");
        assertEquals("Cup", uomOptional.get().getUom());
    }
}