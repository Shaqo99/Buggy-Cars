package westpac.tests;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import westpac.model.pages.HomePage;

public class RegisterTests extends BaseTests{

    @Test
        void registerUser() {
            var errorMsg = open(HomePage.class)
                .clickRegisterMenu()
                .setLogin("Greg")
                .setFirstName("Greg")
                .setLastName("Greggy")
                .setPassword("hello")
                .setConfirmPassword("hello")
                .clickRegister();
            assertEquals("InvalidParameter: 1 validation error(s) found. - minimum field size of 6, SignUpInput.Password.", errorMsg.getErrorMessage());

                // try{
                //     Thread.sleep(4000);
                //    }catch(InterruptedException e){
                //    }
            
        }
        
    
}
