import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GroupSfbaGrizzlies extends BaseTest {

    @Test
    public void klavdiaGoldshteyn() throws InterruptedException {
        WebDriver browser = getDriver();
        browser.get("https://en.wikipedia.org/wiki/Roger_Federer");
        WebElement title = browser.findElement(By.xpath("//h1[@id='firstHeading']"));

        Assert.assertEquals(title.getText(), "Roger Federer");

        Thread.sleep(3000);
    }

    @Test
    public void lisaJohns() throws InterruptedException {
        WebDriver browser = getDriver();
        browser.get("https://www.rideboreal.com/");

        WebElement title = browser.findElement(By.xpath("//div/h1[text()='HOME AT BOREAL']"));

        Assert.assertEquals(title.getText(), "HOME AT BOREAL");
        Thread.sleep(3000);

        browser.findElement(By.xpath("//div[@class='alert-content animated fadeInUp']"));
        Thread.sleep(3000);

        browser.findElement(By.xpath("//nav[contains(@img, ng-scope)]"));
        Thread.sleep(3000);

        browser.findElement(By.xpath("//a[@class='u-txt-uppercase ng-scope btn']")).click();
        Thread.sleep(3000);

        browser.findElement(By.xpath("//a[@class='u-txt-uppercase campwoodward-link ng-scope btn']")).click();
        Thread.sleep(3000);

        browser.findElement(By.xpath("//button[@class='feed']")).click();
        Thread.sleep(3000);

        browser.findElement(By.xpath("//a[@class='register']")).click();
        Thread.sleep(3000);

        browser.findElement(By.xpath("//a[text()='Log In']")).click();
        Thread.sleep(3000);

        browser.findElement(By.xpath("//a[@class='promotion-button valign']"));
        Thread.sleep(3000);

       // browser.findElement(By.xpath("//button/a[text()='Buy Lift Tickets']"));
       // Thread.sleep(3000);









    }
}