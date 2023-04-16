package westpac.model.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopularMakePage extends BasePage<PopularMakePage>{
    
    public PopularMakePage(WebDriver driver) {
        super(driver);
    } 

    public String getCurrentPopularMake() {
        return new WebDriverWait(driver, Duration.ofSeconds(3))
            .until(d -> d.findElement(By.className("card-header")))
            .getText();
    }
    
    
}
