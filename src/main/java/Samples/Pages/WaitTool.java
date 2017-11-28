package Samples.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTool {

    ChromeDriver driver = new ChromeDriver();

    public boolean isJQueryOnThisPage() {
        return ((JavascriptExecutor) driver).executeScript("return (window.jQuery)") != null;
    }
    public void waitForJQueryEnds() {
        while ((Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active!=0")) {
            //empty body or you can do something while waiting
        }
    }


}
