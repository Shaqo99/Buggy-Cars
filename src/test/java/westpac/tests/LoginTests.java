package westpac.tests;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import westpac.model.pages.HomePage;

public class LoginTests extends BaseTests{
    
    @Test
    void successfulLogin() {
        var loginName = open(HomePage.class)
            .setUsername("Max")
            .setPassword("Hellooooo1!")
            .clickLoginButton();
        assertEquals("Hi, Max", loginName.getLoginName());
    }

    @Test
    void unsuccessfulLogin(){
        var loginMsg = open(HomePage.class)
            .setUsername("unichem")
            .setPassword("Helloooo")
            .clickLoginButton();
        assertEquals("Invalid username/password", loginMsg.getLoginError());
    }

    @Test
    void editProfile(){
        successfulLogin();
        var editProfile = open(HomePage.class)
            .clickProfileMenu()
            .setGender("Male")
            .setAge("41")
            .setAddress("123 Test Street")
            .setPhone("12345678")
            .setHobby("Reading Comics")
            .clickSave();
        assertEquals("The profile has been saved successful", editProfile.getSaveMessage());
 
    }
    
}
