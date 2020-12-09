import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GroupOfBugKillersTest extends BaseTest {

    @Test
    public void simpleTest() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement name = browser.findElement(By.xpath("//strong/a"));

        Assert.assertEquals(name.getText(), "PlatformaticaQA");
    }

    @Test
    public void secondTest() {

        WebDriver driver = getDriver();
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");

        WebElement button = driver.findElement(By.xpath("//details[contains(@data-action, 'get-repo')]"));
        button.click();

        WebElement input = driver.findElement(By.xpath("(//div[@class='input-group']/input)[1]"));
        Assert.assertEquals(input.getAttribute("value"), "https://github.com/SergeiDemyanenko/PlatformaticaQA.git");
    }

    @Test
    public void lenaHW13Test() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://coderoad.ru/48259191/%D0%92-Selenium-%D0%BA%D0%B0%D0%BA-%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%B8%D1%82%D1%8C-%D1%87%D1%82%D0%BE-%D0%BF%D1%80%D0%B8-%D0%BD%D0%B0%D0%B6%D0%B0%D1%82%D0%B8%D0%B8-%D0%BD%D0%B0-%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82-%D0%BC%D1%8B-%D1%84%D0%B0%D0%BA%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8-%D0%BF%D0%B5%D1%80%D0%B5%D1%88%D0%BB%D0%B8-%D0%BD%D0%B0");
        WebElement name = browser.findElement(By.xpath("//a[contains(text(),'О нас')]"));
        Assert.assertEquals(name.getText(), "О нас");
        name.click();

        Assert.assertEquals(browser.getCurrentUrl(),"https://coderoad.ru/about.html");
    }

    @Test
    public void newTest() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");

        WebElement button = driver.findElement(By.id("branch-select-menu"));
        button.click();
        Thread.sleep(2000);

        WebElement link = driver.findElement(By.xpath("//footer/a[contains(text(), 'branches')]"));
        link.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/SergeiDemyanenko/PlatformaticaQA/branches");
    }
}
