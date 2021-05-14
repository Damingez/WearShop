package cucumberOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver","./utilities/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

}
