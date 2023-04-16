package westpac.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import westpac.model.pages.HomePage;

public class OverallRatingTests extends BaseTests{

    public static String carModel = "Giulietta";
    public static String carMakeString = "Alfa Romeo";


    @Test
    void searchForCarMakeTest() {
        var carMake = open(HomePage.class)
            .clickOverallRatingPage();
            
        assertEquals(carMakeString, carMake.getMake(carModel));
    
    }    

}