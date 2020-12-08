import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class Pasific_QA_team extends BaseTest {

    @Test
//Задача 14
//
//Необходимо сделать PR, чтобы он прошел все тесты, был одобрен и попал в главную ветку. Код для PR возьмите
//из предыдущего ДЗ (Tasks#13). Имя класса для вашего теста должно совпадать с именем вашей группы,
//а имя теста с вашим именем и фамилией.
    public void nataliTverdohlib_Task14() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement button = browser.findElement(By.xpath("//span[contains(text(), 'Pull request')]"));
        button.click();

        Thread.sleep(2000);

        Assert.assertEquals(browser.getCurrentUrl(), "https://github.com/SergeiDemyanenko/PlatformaticaQA/pulls");

        Thread.sleep(3000);
    }

    //Task E
//https://docs.google.com/document/d/1Gl1IDGFr6UnYAnyLfwmGqtl0NV9DHbOBmjsPep7I4K8/edit
//Необходимо найти XPath запросы для элементов выделенных на странице
// https://github.com/SergeiDemyanenko/PlatformaticaQA
    @Test
    public void taskE_1() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement name = browser.findElement(By.xpath("//*[@data-tab-item='i0code-tab']"));

        Assert.assertEquals(name.getText(), "Code");

        Thread.sleep(3000);
    }

    @Test
    public void taskE_2() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement name = browser.findElement(By.xpath("//*[@data-tab-item='i1issues-tab']"));

        Assert.assertEquals(name.getText(), "Issues");

        Thread.sleep(3000);
    }

    @Test
    public void taskE_3() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement name = browser.findElement(By.xpath("//*[@data-tab-item='i2pull-requests-tab']"));

        Assert.assertEquals(name.getText(), "Pull requests");

        Thread.sleep(3000);
    }

}

