package Samples.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProductDescPage {

    ChromeDriver driver;
    public String DHeader1;
    public String Header1;

    public ProductDescPage(ChromeDriver driver)
    {
        this.driver = driver;
    }

    By FiltSamsBrandLoc = By.xpath("//div[10]/a/span/label[text()='Samsung']");

    By CostFromFieldLoc = By.id("glf-pricefrom-var");

    By FirstResultHeader = By.xpath("//div[1]/div[1]/div[3]/div[2]/a[contains( text(), 'Samsung')]");
    //html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[3]/div[2]/a
    //html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[3]/div[2]/a
    //html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div[1]/div[3]/div[2]/a

    By DescriptionHeaderSams = By.xpath("//div[4]//div/div[1]/div[1]/h1");
    //html/body/div[1]/div[4]/div[2]/div[2]/div/div[1]/div[1]/h1
    By DescriptionHeaderBeats = By.xpath("//div[4]//div/div[1]/div[1]/h1");

    public void GetDescriptionHeaderSams() {driver.findElement(DescriptionHeaderSams).getText();
        String DHeader1 = driver.findElement(DescriptionHeaderSams).getText();
    }

    public void GetDescriptionHeaderBeats() {driver.findElement(DescriptionHeaderBeats).getText();
        String DHeader1 = driver.findElement(DescriptionHeaderSams).getText();
    }

}
