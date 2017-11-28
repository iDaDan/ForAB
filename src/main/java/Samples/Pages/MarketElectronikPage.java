package Samples.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarketElectronikPage {

    ChromeDriver driver;

    By smartpLoc = By.linkText("Мобильные телефоны");
    By HeadPhLoc = By.linkText("Наушники и Bluetooth-гарнитуры");

    public MarketElectronikPage(ChromeDriver driver)
    {
        this.driver = driver;
    }

    public void openSmartp()
    {
        driver.findElement(smartpLoc).click();
    }

    public void openHeadPh() { driver.findElement(HeadPhLoc).click(); }
}
