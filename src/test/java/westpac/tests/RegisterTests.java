package westpac.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import westpac.model.pages.HomePage;



public class RegisterTests extends BaseTests{

    public static String username = "ILoveWestpac";
    public static String firstName = "West";
    public static String lastName = "Pac";
    public static String password = "Hellooooo1!";

    
    @Test
    void registerNewUserTest() {
        var user = open(HomePage.class)
            .clickRegisterMenu()
            .setLogin(username)
            .setFirstName(firstName)
            .setLastName(lastName)
            .setPassword(password)
            .setConfirmPassword(password)
            .clickRegister();
        assertEquals("Registration is successful", user.getSuccessMessage());    
    }

    @Test
    void registerUserExistingTest() {
        var user = open(HomePage.class)
            .clickRegisterMenu()
            .setLogin(username)
            .setFirstName(firstName)
            .setLastName(lastName)
            .setPassword(password)
            .setConfirmPassword(password)
            .clickRegister();
        assertEquals("UsernameExistsException: User already exists", user.getErrorMessage());    
    }

    
        
    
}
