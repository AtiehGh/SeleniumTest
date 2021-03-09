import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/atiehghazizadeh/Desktop/Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement NewTab = driver.findElement(By.id("new-tab-button"));
        NewTab.click();

        String OriginalWindow = driver.getWindowHandle();

        for(String Handle1: driver.getWindowHandles())
            driver.switchTo().window(Handle1);

        driver.switchTo().window(OriginalWindow);
        driver.quit();
    }
}
