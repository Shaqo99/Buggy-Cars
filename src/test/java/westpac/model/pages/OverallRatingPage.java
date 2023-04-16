package westpac.model.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import westpac.model.components.ui.Table;

public class OverallRatingPage extends BasePage<OverallRatingPage> {
    
    public OverallRatingPage(WebDriver driver) {
        super(driver);
    }

    private Table getTable() {
        var cars =  new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(d -> d.findElement(By.className("cars")));

        var carsTable = new Table(cars);
        return carsTable;
    }

    public OverallRatingPage clickNextButton(WebDriver driver){
        driver.findElement(By.linkText("»")).click();
        return this;
    }
    public String getMake(String model){
        var makeCell = getTable().getCell("Model", model, "Make");
        var makeCellValueAsString = makeCell.getText();
        return makeCellValueAsString;
    }
    
}
