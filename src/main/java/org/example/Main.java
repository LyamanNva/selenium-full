package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String baseUrl="https://www.google.com";
        driver.get(baseUrl);
        String expectedData="Google";
        String actualData=driver.getTitle();
        if (expectedData.equals(actualData)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        driver.quit();
    }
}