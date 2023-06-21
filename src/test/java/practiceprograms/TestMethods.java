package practiceprograms;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMethods extends BaseClass {

    @BeforeClass
    public void login() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }

    @Test
    public void actions() {
        System.out.println("====Test actions() started =====");

        Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
        dropdown.selectByValue("az");

        System.out.println("====Test actions() finished =====");

    }
    @Test
    public void addToCart() {
        System.out.println("====Test addToCart() started =====");

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("continue-shopping")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
//        Thread.sleep(5000);
        driver.findElement(By.id("checkout")).click();
//        Thread.sleep(5000);

        System.out.println("====Test addToCart() finished =====");


    }
}


