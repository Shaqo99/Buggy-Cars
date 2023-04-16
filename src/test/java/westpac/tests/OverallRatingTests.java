package westpac.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import westpac.model.pages.HomePage;

public class OverallRatingTests extends BaseTests{

    public static String carModel = "Diablo";
    public static String carMakeString = "Lamborghini";


    @Test
    void searchForCarMake() {
        var carMake = open(HomePage.class)
            .clickOverallRatingPage();
            
        assertEquals(carMakeString, carMake.getMake(carModel));
    
    }    

}