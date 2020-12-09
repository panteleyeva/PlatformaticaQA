import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GroupJavaBears_Test extends BaseTest {

    @Test
    public void victoriaRogozhkina() {

        WebDriver driver = getDriver();
        driver.get("https://developer.mozilla.org/en-US/docs/Web/XPath/Functions");

        WebElement link = driver.findElement(By.xpath("//li/a[contains(text(), 'contains()')]"));
        link.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.mozilla.org/en-US/docs/Web/XPath/Functions/contains");
    }
    @Test
    public void Alex_Mack() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://en.wikipedia.org/wiki/Golden_Gate");

        WebElement title = driver.findElement(By.xpath("//span[@id='History']"));
        Assert.assertEquals(title.getText(), "History");
    }

    @Ignore
    @Test
    public void Alex_Mack2() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://dota2.ru/");

        WebElement base = driver.findElement(By.xpath("//header//ul//a[contains(text(), 'База')]"));
        base.click();

        WebElement heroes = driver.findElement(By.xpath("//header//ul//a[contains(text(), 'Герои')]"));
        heroes.click();
        Thread.sleep(2000);

        WebElement riki = driver.findElement(By.xpath("//div//a[contains(@href, '/heroes/riki')]"));
        riki.click();
        Thread.sleep(2000);

        WebElement guides = driver.findElement(By.xpath("//h2//a[contains(text(), 'Гайды по герою')]"));
        guides.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://dota2.ru/guides/riki/");
    }

    @Test
    public void olgaGTest1() {

        WebDriver browser = getDriver();
        browser.get("https://korrespondent.net/");
        WebElement second_nav_link = browser.findElement(By.xpath("//div[@class='header-menu']//ul/li[3]/a"));

        Assert.assertEquals(second_nav_link.getText(), "УКРАИНА");
    }

    @Ignore
    @Test
    public void olgaGTest2() {

        WebDriver browser = getDriver();
        browser.get("https://korrespondent.net/");

        WebElement second_nav_link = browser.findElement(By.xpath("//div[@class='header-menu']//ul/li[3]/a"));
        second_nav_link.click();
        Assert.assertEquals(browser.getCurrentUrl(), "https://korrespondent.net/ukraine/");

        WebElement caption_title = browser.findElement(By.xpath("//h1[@class='caption-title']"));
        Assert.assertEquals(caption_title.getText(), "НОВОСТИ УКРАИНЫ");
    }

    @Test
    public void olgaGTest3() {

        WebDriver browser = getDriver();
        browser.get("https://korrespondent.net/");

        WebElement nav_link = browser.findElement(By.xpath("//div[@class='header-menu']//b"));
        Assert.assertEquals(nav_link.getText(), "ВСЕ РАЗДЕЛЫ");
        nav_link.click();

        WebElement sitemap = browser.findElement(By.xpath("//div[@id='sitemap']"));
        Assert.assertTrue(sitemap.isDisplayed());
    }

    @Ignore
    @Test
    public void IgorTest1() {

        WebDriver browser = getDriver();
        browser.get("https://us.pandora.net/");

        WebElement shop_bag = browser.findElement(By.xpath("//*[@title='View Bag']"));  //Shopping bag button
        shop_bag.click();

        Assert.assertEquals(browser.getCurrentUrl(), "https://us.pandora.net/en/shopping-bag");
    }

    @Ignore
    @Test
    public void IgorTest2() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://www.planetfitness.com/");

        WebElement search = browser.findElement(By.xpath("//button[contains(text(), 'Search')]"));  //Search field
        search.click();
        search.sendKeys("test");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(4000);

        WebElement search_result = browser.findElement(By.xpath("//h2[contains(text(), 'Search Results')]"));
        Assert.assertEquals(search_result.getText(), "SEARCH RESULTS");
    }

}
