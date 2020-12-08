import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Kristina324TestHW13 { @Test
public void simpleTest() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "c:/Project/WEBDRIVER/chromedriver.exe");

    WebDriver browser = new ChromeDriver();
    browser.get("https://www.thesaurus.com/");

    WebElement name = browser.findElement(By.xpath("//a[contains(@id,'thesaurus-nav-tab')]"));

    Assert.assertEquals(name.getText(), "THESAURUS.COM");

    Thread.sleep(3000);
    browser.close();
}
}
