package westpac.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import westpac.model.pages.HomePage;

public class LoginTests extends BaseTests{
    
    @Test
        void loginUser() {
            var loginName = open(HomePage.class)
            .setUsername("unichem")
            .setPassword("Hellooooo1!")
            .clickLoginButton();
        assertEquals("Hi, bug", loginName.getLoginName());
        }






        
}
