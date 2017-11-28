package Samples.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPage {

    ChromeDriver driver;

    By marketLoc = By.linkText("Маркет");

    public SearchPage(ChromeDriver driver)
    {
        this.driver = driver;

    }

    public void openMarket()
    {
        driver.findElement(marketLoc).click();
    }


}
