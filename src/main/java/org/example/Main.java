package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       String baseUrl="https://demo.guru99.com/test/login.html";
       driver.get(baseUrl);
       WebElement email=driver.findElement(By.id("email"));
       WebElement password=driver.findElement(By.id("passwd"));
       email.sendKeys("leman@gmail.com");
       password.sendKeys("13");
       WebElement button=driver.findElement(By.id("SubmitLogin"));
       button.click();
       driver.quit();
    }
}