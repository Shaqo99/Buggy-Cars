package westpac.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import westpac.model.pages.HomePage;

public class LoginTests extends BaseTests{
    
    public static String username = "BarryJ";
    public static String password = "Hellooooo1!";
    public static String incorrectPassword = "Hellooooo1!";
    public static String gender = "Male";
    public static String age = "41"; 
    public static String address = "123 Test Street"; 
    public static String phone = "12345678"; 
    public static String hobby = "Reading Comics"; 

    @Test
    void successfulLoginTest() {
        var loginName = open(HomePage.class)
            .setUsername(username)
            .setPassword(password)
            .clickLoginButton();
        assertEquals("Hi, " + username, loginName.getLoginName());
    }

    @Test
    void unsuccessfulLoginTest(){
        var loginMsg = open(HomePage.class)
            .setUsername(username)
            .setPassword(incorrectPassword)
            .clickLoginButton();
        assertEquals("Invalid username/password", loginMsg.getLoginError());
    }

    @Test
    void LogoutUserTest(){
        successfulLoginTest();
        var logout = open(HomePage.class)
           .clickLogoutButton();
        assertTrue(logout.getLoginUsernameField(), "Logout button is not displayed" );
    }

    @Test
    void editProfileTest(){
        successfulLoginTest();
        var editProfile = open(HomePage.class)
            .clickProfileMenu()
            .setGender(gender)
            .setAge(age)
            .setAddress(address)
            .setPhone(phone)
            .setHobby(hobby)
            .clickSave();
        assertEquals("The profile has been saved successful", editProfile.getSaveMessage());
 
    }
    
}
