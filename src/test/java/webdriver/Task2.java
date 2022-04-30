package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        driver.get("https://google.com");
        WebElement el = driver.findElement(By.name("q"));
        el.sendKeys("Погода Минск");
        el.submit();
        el = driver.findElement(By.xpath("//div[@class='wob_dfc']/div[2]"));
        el.click();
        String s = el.findElement(By.xpath("//*[name()='text'][contains(@aria-label, '12:00')]")).getAttribute("aria-label");
        System.out.println(s);
    }
}
