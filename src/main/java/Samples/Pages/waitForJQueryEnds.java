package Samples.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class waitForJQueryEnds  {

    ChromeDriver driver;



    public void waitForJQueryEnds() {
        while ((Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active!=0")) {
            //empty body or you can do something while waiting
            return;
        }
    }

    public void waitClickableSearchHeader() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[3]/div[2]/a")));
        System.out.println("Waiting ok");
    }
}
