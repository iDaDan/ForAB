package Samples.Pages;

import Samples.SampleTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import Samples.Pages.waitForJQueryEnds;


public class HeadPhonesPage {

    ChromeDriver driver;
    //waitForJQueryEnds obj = new waitForJQueryEnds();

    By FiltBeatsBrandLoc = By.xpath("//div[2]/a/span/label[text()='Beats']");

    By CostFromFieldLoc = By.id("glf-pricefrom-var");

    By CostToFieldLoc = By.id("glf-priceto-var");

    public HeadPhonesPage (ChromeDriver driver)
    {
        this.driver = driver;
    }

    public void FilterBeatsDisplayed()
    {
        driver.findElement(FiltBeatsBrandLoc).isDisplayed();
    }

    public void FilteredByBeats()
    {
        driver.findElement(FiltBeatsBrandLoc).click();
    }

    public void CostFromClick()
    {
        driver.findElement(CostFromFieldLoc).click();
    }

    public void Enter17kAmountFrom () {  driver.findElement(CostFromFieldLoc).sendKeys("17 000" + Keys.ENTER); }

    public void Enter25kAmountTo () { driver.findElement(CostToFieldLoc).sendKeys("25 000" + Keys.ENTER); }
    //ожидание загрузки jQuery нужно здесь;



    public void CostFromEnterMeaning40kRequest()
    {
        driver.findElement(CostFromFieldLoc).sendKeys("40000" + Keys.ENTER);
        //waitForJQueryEnds obj = new waitForJQueryEnds();
        //obj.waitForJQueryEnds();
    }
    public void waitForJQueryEnds() {
        while ((Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active!=0")) {
            //empty body or you can do something while waiting
        }
    }



    //div[2]/a/span/label[text()='Beats']

}
