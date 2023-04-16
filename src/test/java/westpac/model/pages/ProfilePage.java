package westpac.model.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage<ProfilePage>{
    
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public ProfilePage setGender(String gender) {
        driver.findElement(By.id("gender")).sendKeys(gender);
        return this;
    }

    public ProfilePage setAge(String age) {
        driver.findElement(By.id("age")).sendKeys(age);
        return this;
    }

    public ProfilePage setAddress(String address) {
        driver.findElement(By.id("address")).sendKeys(address);
        return this;
    }

    public ProfilePage setPhone(String phone) {
        driver.findElement(By.id("phone")).sendKeys(phone);
        return this;
    }

    public ProfilePage setHobby(String hobby) {
        WebElement selectElement = driver.findElement(By.id("hobby"));
        Select select = new Select(selectElement);
        select.selectByVisibleText(hobby);
        return this;
    }

    public ProfilePage clickSave() {
        driver.findElement(By.className("btn-default")).click();
        return this;
    }

    public String getSaveMessage() {
        return new WebDriverWait(driver, Duration.ofSeconds(3))
            .until(d -> d.findElement(By.className("alert-success")))
            .getText();
    }

}
