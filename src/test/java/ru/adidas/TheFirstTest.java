package ru.adidas;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TheFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void theFirstTest() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("https://www.adidas.ru/");
        driver.findElement(By.cssSelector("[href=\"/account-login\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));

        driver.findElement(By.id("login-email")).sendKeys("denis.borodin.97@mail.ru");
        driver.findElement(By.id("login-password")).sendKeys("denis3097");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.quit();
        driver = null;
    }
}