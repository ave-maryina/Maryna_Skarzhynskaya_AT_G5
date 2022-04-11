package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        //System.setProperties("webdriver.chrome.driver", "C:\maven\bin");
        driver.get("https://selenium.dev");
        driver.close();
    }
}
