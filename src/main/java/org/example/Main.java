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
       String baseUrl="https://demo.guru99.com/test/radio.html";
       driver.get(baseUrl);
        WebElement radio1= driver.findElement(By.id("vfb-7-1"));
       radio1.click();

        WebElement radio2= driver.findElement(By.id("vfb-7-2"));
        radio2.click();

        WebElement radio3= driver.findElement(By.id("vfb-7-3"));
        radio3.click();
//       driver.quit();
    }
}