package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static WebDriver getDriver() throws IOException {
        Properties props = new Properties();
        InputStream file = new FileInputStream("src/test/resources/global.properties");
        props.load(file);
        String url = props.getProperty("url");
        System.setProperty("webdriver.chrome.driver", "/Users/admin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8000/landing.html");
        return driver;
    }
}
