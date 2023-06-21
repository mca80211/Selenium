package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void setupBrowser(){
        System.out.println("====Browser session started =====");

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.saucedemo.com/");

        System.out.println("====Application started =====");

    }

    @AfterClass
    public void cleanUp(){
//        driver.close();
        driver.quit();
        System.out.println("====Browser session ended =====");
    }


}
