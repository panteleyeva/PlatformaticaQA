import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.List;
import java.util.Set;

public class GroupSfbaGrizzlies_Test extends BaseTest {

    @Test
    public void klavdiaGoldshteyn() throws InterruptedException {
       WebDriver browser = getDriver();
       browser.get("https://en.wikipedia.org/wiki/Roger_Federer");
       WebElement title = browser.findElement(By.xpath("//h1[@id='firstHeading']"));

       Assert.assertEquals(title.getText(), "Roger Federer");

       Thread.sleep(3000);
   }


    @Test
    public void gayaneMfirst() throws InterruptedException {
        WebDriver browser = getDriver();
        browser.get("https://www.elvisthemusic.com/");
        WebElement link = browser.findElement(By.xpath("//a[contains(@href,'/news/')]"));
        link.click();
        Thread.sleep(2000);

        Assert.assertEquals(browser.getCurrentUrl(),"https://www.elvisthemusic.com/news/");

        Thread.sleep(3000);

    }

    @Ignore
    @Test
    public void gayaneMsecond() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("https://www.amazon.com/");
        WebElement input = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        input.sendKeys("umbrella");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']/input[@type='submit']"));
        submit.click();
        Thread.sleep(2000);
        WebElement text = driver.findElement(By.xpath("//div//span[3][contains(text(), 'brel')]"));

        Assert.assertEquals(text.getText(),"\"umbrella\"");

        Thread.sleep(3000);

    }
    @Test

    public void lanaRogova() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://vpl.bibliocommons.com/v2/");
        WebElement text = browser.findElement(By.xpath("//a[@id='biblionav_account_trigger']"));
        Thread.sleep(2000);
        Assert.assertEquals(text.getText(), "Log In / My VPL\n" +
                "User Log In / My VPL.");
    }

    @Test
    public void vasylynaSh() {
        WebDriver browser = getDriver();
        browser.get("https://www.kmart.com/");
        new WebDriverWait(browser,10).until(ExpectedConditions.elementToBeClickable(By.linkText("Contact Us")));
        WebElement element = browser.findElement(By.linkText("Contact Us"));
        Assert.assertTrue(element.isDisplayed(), "Cannot find element");

        element.click();
        String title = "Kmart Help";
        Set<String> allTabs = browser.getWindowHandles();
        for (String tab: allTabs)
        {
            browser.switchTo().window(tab);
            if (title.equals(browser.getTitle()))
                break;
        }
        Assert.assertEquals(1, browser.findElements(By.tagName("input")).size());

        List<WebElement> list = browser.findElements(By.id("noElement"));
        Assert.assertEquals(list.size(), 0);
    }
}
