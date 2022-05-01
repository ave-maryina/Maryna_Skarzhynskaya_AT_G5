package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.sql.Driver;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Task3 {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.booking.com/");
        WebElement searchField = driver.findElement(By.name("ss"));
        searchField.sendKeys("Париж");
        driver.findElement(By.xpath("//span[text()='Париж']")).click();
        driver.findElement(By.xpath("//*[@data-date='2022-05-03']")).click();
        driver.findElement(By.xpath("//*[@data-date='2022-05-10']")).click();
        driver.findElement(By.xpath("//span[@class='xp__guests__count']")).click();
        WebElement adults = driver.findElement(By.xpath("//span[@id='group_adults_desc']/preceding-sibling::button[1]"));
        adults.click();
        adults.click();
        driver.findElement(By.xpath("//span[@id='no_rooms_desc']/preceding-sibling::button[1]")).click();
        driver.findElement(By.xpath("//button[@class='sb-searchbox__button ']")).click();
        driver.findElement(By.xpath("//input[@name='pri=5']/parent::div//span")).click();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(5)).
                ignoring(NoSuchElementException.class).until(ExpectedConditions.invisibilityOfElementLocated
                        (By.xpath("//div[@data-testid='overlay-spinner']")));
        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@data-id='price']")).click();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(5)).
                ignoring(NoSuchElementException.class).until(ExpectedConditions.invisibilityOfElementLocated
                        (By.xpath("//div[@data-testid='overlay-spinner']")));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
