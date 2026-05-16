package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");
       driver.navigate().to("https://www.facebook.com");
       driver.navigate().back();
       driver.navigate().forward();
        driver.quit();
    }
}