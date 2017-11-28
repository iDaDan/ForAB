package Samples.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

    ChromeDriver driver;
    //waitForJQueryEnds obj = new waitForJQueryEnds();

    By FiltSamsBrandLoc = By.xpath("//div[10]/a/span/label[text()='Samsung']");
    By FiltBeatsBrandLoc = By.xpath("//div[2]/a/span/label[text()='Beats']");


    By CostFromFieldLoc = By.id("glf-pricefrom-var");

    By FirstResultHeaderSamsung = By.xpath("//div[1]/div[1]/div[3]/div[2]/a[contains( text(), 'Samsung')]");
    By FirstResultHeaderBeats = By.xpath("//div[1]/div[1]/div[3]/div[2]/a[contains( text(), 'Beats')]");

    //html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[3]/div[2]/a


    By CostToFieldLoc = By.id("glf-priceto-var");

    public String Header;



    public ProductsPage(ChromeDriver driver)
    {
        this.driver = driver;
    }

    public void FilterSamsDisplayed()
    {
        driver.findElement(FiltSamsBrandLoc).isDisplayed();
    }

    public void FilterBeatsDisplayed()
    {
        driver.findElement(FiltBeatsBrandLoc).isDisplayed();
    }

    public void FilteredBySams()
    {
        driver.findElement(FiltSamsBrandLoc).click();
    }

    public void FilteredByBeats()
    {
        driver.findElement(FiltBeatsBrandLoc).click();
    }

    public void CostFromClick()
    {
        driver.findElement(CostFromFieldLoc).click();
    }

    public void GetHeaderSamsung() { driver.findElement(FirstResultHeaderSamsung).getText();
     //System.out.println(FirstHeaderString);
        String Header = driver.findElement(FirstResultHeaderSamsung).getText();

    }
    public void GetHeaderBeats() { driver.findElement(FirstResultHeaderBeats).getText();
        //System.out.println(FirstHeaderString);
        String Header = driver.findElement(FirstResultHeaderBeats).getText();

    }


    public void GoToDescrSamsung() {
     driver.findElement(FirstResultHeaderSamsung).click();
     System.out.println("Click ok");
    }

    public void GoToDescrBeats() {
        driver.findElement(FirstResultHeaderBeats).click();
        System.out.println("Click ok");
    }



    public void CostFromEnterMeaning40kRequest()
    {
        driver.findElement(CostFromFieldLoc).sendKeys("40000" + Keys.ENTER);
        //waitForJQueryEnds obj = new waitForJQueryEnds();
        //obj.waitForJQueryEnds();
    }

    public  void  CostFromEnterMeaning17kRequest() {
        driver.findElement(CostFromFieldLoc).sendKeys("17000" + Keys.ENTER);
        //waitForJQueryEnds obj = new waitForJQueryEnds();
        //obj.waitForJQueryEnds();
    }

    public  void  CostToEnterMeaning25kRequest() {
        driver.findElement(CostToFieldLoc).sendKeys("25000" + Keys.ENTER);
        //waitForJQueryEnds obj = new waitForJQueryEnds();
        //obj.waitForJQueryEnds();
    }

    public void waitForJQueryEnds() {
        while ((Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active!=0")) {
            //empty body or you can do something while waiting
        }
    }

    public void waitClickable1ResultHeaderSamsung() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(FirstResultHeaderSamsung));

    }

    public void waitClickable1ResultHeaderBeats() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(FirstResultHeaderBeats));

    }





}
