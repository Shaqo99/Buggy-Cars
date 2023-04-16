package westpac.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import westpac.model.pages.HomePage;

public class PopularMakeTests extends BaseTests{

    public static String popularMake = "Alfa Romeo";
    @Test
    void validatePopularMake() {
        var popMake = open(HomePage.class)
            .clickPopularMakePage();
        assertEquals(popularMake, popMake.getCurrentPopularMake());
            
    }
}
