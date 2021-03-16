package utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {

    public static WebDriver getDriver(String browser){
        WebDriver driver;
        switch (browser){
            case"chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case"firefox":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "ie":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return  driver;
           return  driver;
    }
    
}

