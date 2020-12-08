import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class SimpleTest extends BaseTest {

    @Test
    public void simpleTest() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement name = browser.findElement(By.xpath("//strong/a"));

        Assert.assertEquals(name.getText(), "PlatformaticaQA");

        Thread.sleep(3000);
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

    @Test
    //Задача 13
    //
    //Необходимо написать любой тест, для любой страницы (лучше не использовать google и подобные ресурсы), в тесте должно быть:
    //переход по адресу
    //поиск элемента
    //валидация данных полученная от элемента
    //
    //Тест может быть более сложным, смотрите по своим силам, тест должен запускаться через TestNG.
    public void task13() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement button = browser.findElement(By.xpath("//span[contains(text(), 'Pull request')]"));
        button.click();

        Thread.sleep(2000);

        Assert.assertEquals(browser.getCurrentUrl(), "https://github.com/SergeiDemyanenko/PlatformaticaQA/pulls");

        Thread.sleep(3000);
    }
}