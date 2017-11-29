package Samples;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import Samples.Pages.*;
import Samples.Pages.waitForJQueryEnds;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.fail;




public class SampleTest {

    ChromeDriver driver = new ChromeDriver();

    /*Здесь Тестовое задание
    Разумно было бы завернуть значения цен, которые мы вводим, брендов и типов электроники в еще один уровень абстракции,
    а саму реализацию - в цикл,
    но как это реализовать я пока не представляю, поэтому протестировал доступным мне способом.
    Автор: Даниил Храмцов.
*/





    @BeforeMethod
    public void start() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://yandex.ru/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }



    @Test
    public void SearchYandex() throws InterruptedException {


        SearchPage SearchPage = new SearchPage(driver);
        MarketPage MarketPage = new MarketPage(driver);
        MarketElectronikPage MarketElectronikPage = new MarketElectronikPage(driver);
        ProductsPage ProductsPage = new ProductsPage(driver);
        waitForJQueryEnds wait = new waitForJQueryEnds();
        ProductDescPage ProductDescPage = new ProductDescPage(driver);


        SearchPage.openMarket(); //кликаем "маркет"

        MarketPage.openElectr(); //кликаем "Электроника"

        MarketElectronikPage.openSmartp(); //кликаем Мобильные телефоны"

        ProductsPage.FilterSamsDisplayed();
        ProductsPage.FilteredBySams(); //выбрали Samsung
        ProductsPage.CostFromClick();

        ProductsPage.CostFromEnterMeaning40kRequest();

        ProductsPage.waitForJQueryEnds();
        System.out.println("WaitJQueryOnPhonesPage ok");

        ProductsPage.GetHeaderSamsung();
        System.out.println("GetHeaderSamsung ok");

        ProductsPage.waitClickable1ResultHeaderSamsung();
        ProductsPage.waitForJQueryEnds();
        System.out.println("waitClickable1ResultHeaderSamsung ok");

        ProductsPage.GoToDescrSamsung();
        System.out.println("GoToDescrSamsung ok");

        ProductDescPage.GetDescriptionHeaderSams();
        System.out.println("GetDescriptionHeader ok");

        String Header = ProductsPage.Header;
        String DHeader1 = ProductDescPage.DHeader1;

        Assert.assertEquals(Header,DHeader1);
        //SmartpsOperations.AssertHeaders();
        System.out.println("AssertHeaders ok");






    }

    @Test
    public void SearchYandexBeats() throws InterruptedException {


        SearchPage SearchPage = new SearchPage(driver);
        MarketPage MarketPage = new MarketPage(driver);
        MarketElectronikPage MarketElectronikPage = new MarketElectronikPage(driver);
        ProductsPage ProductsPage = new ProductsPage(driver);
        ProductDescPage ProductDescPage = new ProductDescPage(driver);


        SearchPage.openMarket(); //кликаем "маркет"

        MarketPage.openElectr(); //кликаем "Электроника"

        MarketElectronikPage.openHeadPh(); //кликаем "Наушники и гарнитуры"

        ProductsPage.FilterBeatsDisplayed();
        ProductsPage.FilteredByBeats(); //выбрали Beats
        ProductsPage.CostFromClick();
        ProductsPage.CostFromEnterMeaning17kRequest();
        ProductsPage.CostToEnterMeaning25kRequest();

        ProductsPage.waitForJQueryEnds();
        System.out.println("WaitJQueryOnPhonesPage ok");
        Thread.sleep(1000);

        ProductsPage.GetHeaderBeats();
        System.out.println("GetHeaderBeats ok");

        ProductsPage.waitClickable1ResultHeaderBeats();
        ProductsPage.waitForJQueryEnds();
        System.out.println("waitClickable1ResultHeaderBeats ok");

        ProductsPage.GoToDescrBeats();
        System.out.println("GoToDescrBeats ok");

        ProductDescPage.GetDescriptionHeaderBeats();
        System.out.println("GetDescriptionHeader ok");

        String Header = ProductsPage.Header;
        String DHeader1 = ProductDescPage.DHeader1;

        Assert.assertEquals(Header,DHeader1);
        //SmartpsOperations.AssertHeaders();
        System.out.println("AssertHeaders ok");


    }






    @AfterMethod
    public void end() {
        driver.close();
    }
}

