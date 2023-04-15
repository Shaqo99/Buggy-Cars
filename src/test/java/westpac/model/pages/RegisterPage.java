package westpac.model.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage<RegisterPage> {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage setLogin(String login) {
        driver.findElement(By.id("username")).sendKeys(login);
        return this;
    }

    public RegisterPage setFirstName(String firstName) {
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        return this;
    }

    public RegisterPage setLastName(String lastName) {
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        return this;
    }

    public RegisterPage setPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    public RegisterPage setConfirmPassword(String confirmPassword) {
        driver.findElement(By.id("confirmPassword")).sendKeys(confirmPassword);
        return this;
    }

    public RegisterPage clickRegister() {
        driver.findElement(By.className("btn-default")).click();
        return this;
    }

    public String getErrorMessage() {
        return new WebDriverWait(driver, Duration.ofSeconds(3))
            .until(d -> d.findElement(By.className("result")))
            .getText();
    }

    public String getSuccessMessage(){
        return new WebDriverWait(driver, Duration.ofSeconds(3))
            .until(d -> d.findElement(By.className("alert-success")))
            .getText();
    }







}
