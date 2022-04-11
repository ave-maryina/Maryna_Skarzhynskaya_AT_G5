package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumTest1 {
    static WebDriver driver;

    static {
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        driver.get("https://onliner.by");
        WebElement el = driver.findElement(By.className("onliner_logo"));
        el.click();
        driver.close();
    }
}
