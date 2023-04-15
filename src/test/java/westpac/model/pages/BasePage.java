package westpac.model.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage<T> {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage<T> setUsername(String username) {
        driver.findElement(By.name("login")).sendKeys(username);
        return this;
    }

    public BasePage<T> setPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public BasePage<T> clickLoginButton() {
        driver.findElement(By.className("btn-success")).click();
        return this;
    }

    public String getLoginName() {
        return new WebDriverWait(driver, Duration.ofSeconds(3))
            .until(d -> d.findElement(By.className("disabled")))
            .getText();
    }

    public String getLoginError() {
        return driver.findElement(By.className("label-warning")).getText();
    }

    public RegisterPage clickRegisterMenu() {
        driver.findElement(By.linkText("Register")).click();
        return new RegisterPage(driver);
    }
    


}


