package westpac.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import westpac.model.pages.HomePage;

public class RegisterTests extends BaseTests{

    @Test
    void registerNewUser() {
        var user = open(HomePage.class)
            .clickRegisterMenu()
            .setLogin("Vax")
            .setFirstName("Vax")
            .setLastName("Vaxo")
            .setPassword("Hellooooo1!")
            .setConfirmPassword("Hellooooo1!")
            .clickRegister();
        assertEquals("Registration is successful", user.getSuccessMessage());    
    }

    @Test
    void registerExistingUser() {
        var user = open(HomePage.class)
            .clickRegisterMenu()
            .setLogin("Vax")
            .setFirstName("Vax")
            .setLastName("Vaxo")
            .setPassword("Hellooooo1!")
            .setConfirmPassword("Hellooooo1!")
            .clickRegister();
        assertEquals("UsernameExistsException: User already exists", user.getErrorMessage());    
    }
        
    
}
