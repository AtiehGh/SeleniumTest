import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import javax.xml.ws.WebEndpoint;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/atiehghazizadeh/Desktop/Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        WebElement name = driver.findElement(By.name("q"));
        name.click();
        name.sendKeys("Iman Norouzi Metro");
        WebElement button = driver.findElement(By.name("btnK"));
        button.click();

        driver.quit();
    }
}
