package Samples.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarketPage {

    ChromeDriver driver;

    By electrLoc = By.linkText("Электроника");

    public MarketPage(ChromeDriver driver)
    {
        this.driver = driver;
    }

    public void openElectr()
    {
        driver.findElement(electrLoc).click();
    }
}
