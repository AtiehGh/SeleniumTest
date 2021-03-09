import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement name = driver.findElement(By.name("q"));
        name.click();
        name.sendKeys("Meaghan Lewis");

        WebElement button = driver.findElement(By.id("btnK"));
        button.click();

        driver.quit();
    }
}


