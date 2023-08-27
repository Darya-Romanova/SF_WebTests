package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class App {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","C:\\Users\\DR\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://skillfactory.ru/");
    }
}