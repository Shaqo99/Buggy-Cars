package westpac.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import westpac.model.pages.HomePage;

public class OverallRatingTests extends BaseTests{

    @Test
    void searchForCarMake() {
        var dumb = open(HomePage.class)
            .clickOverallRatingPage();
            
        assertEquals("Alfa Romeo", dumb.getMake("Rally 037"));
    
    }    

}