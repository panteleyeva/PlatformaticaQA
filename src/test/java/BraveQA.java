import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class BraveQA extends BaseTest {

    @Test
    public void sergeoNevdah() throws InterruptedException {
        WebDriver browser = getDriver();
        browser.get("https://www.wikipedia.org");

        WebElement language = browser.findElement(By.xpath("//a[@id = 'js-link-box-en']/strong"));
        Thread.sleep(2000);
        Assert.assertEquals(language.getText(), "English");
        language.click();

        WebElement simpleSearch = browser.findElement(By.id("searchInput"));
        simpleSearch.sendKeys("New York");
        WebElement searchButton = browser.findElement(By.id("searchButton"));
        searchButton.click();
        Thread.sleep(2000);
    }

    @Test
    public void dmitrySearch() throws InterruptedException {
        WebDriver browser = getDriver();
        browser.get("https://www.wikipedia.org");

        WebElement searchLang = browser.findElement(By.xpath("//select[@name='language']/option[@value='ru']"));
        searchLang.click();

        Thread.sleep(2000);

        Assert.assertEquals(searchLang.isSelected() , true);
        Thread.sleep(2000);

        WebElement input = browser.findElement(By.xpath("//input[@id='searchInput']"));
        input.sendKeys("Обеспечение качества");

        Thread.sleep(2000);

        WebElement btn = browser.findElement(By.xpath("//fieldset/button"));
        btn.click();

        Thread.sleep(2000);

        WebElement hdr = browser.findElement(By.xpath("//h1"));
        Assert.assertEquals(hdr.getText(), "Обеспечение качества");
    }

    @Test
    public void VictoriaRet() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://www.ebay.com/");

        WebElement shop = browser.findElement(By.xpath("//*[@id='gh-shop-a']"));
        Assert.assertTrue(shop.isDisplayed());

        WebElement search = browser.findElement(By.xpath("//*[@class='gh-tb ui-autocomplete-input']"));
        search.sendKeys("dress");
        WebElement searchButton = browser.findElement(By.xpath("//*[@id='gh-btn']"));
        searchButton.click();

        Thread.sleep(3000);

    }

    @Test
    public void Oxana_Wiki() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://www.wikipedia.org");
        WebElement name = browser.findElement(By.xpath("//h1/span"));

        Assert.assertEquals(name.getText(),"Wikipedia");

        Thread.sleep(3000);
    }

    @Test
    public void alisaGrinko() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://www.selenium.dev/");

        WebElement downloadTab = browser.findElement(By.xpath("//a[.='Downloads']"));
        downloadTab.click();

        WebElement linkJavaAPI = browser.findElement(By.xpath("//td[text()='Java']/following-sibling::td/a[text()='API Docs']"));
        linkJavaAPI.click();

        WebElement framesTab = browser.findElement(By.xpath("//a[.='Frames']"));
        Assert.assertEquals(framesTab.getText(), "FRAMES");
    }

    @Test
    public void kateHargreaves() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://www.target.com/");

        browser.findElement(By.xpath("//div[@data-test='storeId-store-name']")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//button[contains(@aria-label, 'Set Lakeland')]")).click();

        Assert.assertEquals(browser.findElement(By.xpath("//div[@data-test='storeId-store-name']")).getText(), "Lakeland South");

        browser.findElement(By.xpath("//*[@id='search']")).sendKeys("Ornament hooks");
        Thread.sleep(1000);

        browser.findElement(By.xpath("//*[@data-test='btnSearch']")).click();

        Thread.sleep(3000);

        Assert.assertEquals(browser.findElement(By.xpath("//*[@data-test='numberOfSearchResults']")).getText(), "339 results");

    }


}


