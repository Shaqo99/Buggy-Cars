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

    public OverallRatingPage clickNextButton(){
        driver.findElement(By.className("btn")).click();
        return this;
    }
    public String getMake(String model){
        var makeCell = getTable().getCell("Model", model, "Make");
        // if (makeCell.isDisplayed()){
        //     String makeCellValueAsString = makeCell.getText();
        //     return makeCellValueAsString;
        // }
        // else {
        //     driver.findElement(By.linkText("»")).click();
        // }
        // return null;
        
        //var makeCellValueAsString = makeCell.findElement(By.tagName("input")).getAttribute("value");
        var makeCellValueAsString = makeCell.getText();
        return makeCellValueAsString;
    }
    
}
