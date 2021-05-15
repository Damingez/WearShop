package cucumberOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    private static WebDriver driver;

    public static void init(){
        System.setProperty("webdriver.chrome.driver","./utilities/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
