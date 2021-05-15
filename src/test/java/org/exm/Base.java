package org.exm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {

    private static WebDriver driver;
    private static Properties prop;

    public static void init() throws IOException {
        System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");
        driver = new ChromeDriver();

        prop = new Properties();
        FileInputStream file = new FileInputStream("./src/test/java/org/exm/global.properties");
        prop.load(file);
    }

    public static Properties getProperties() {
        return prop;
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
