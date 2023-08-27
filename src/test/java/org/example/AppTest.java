package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.example.BasePage.TESTING_COURSE;

public class AppTest {
    private static WebDriver webDriver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    private BasePage BasePage;

    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        webDriver.navigate().to("https://skillfactory.ru/");
        vars = new HashMap<String, Object>();
        BasePage = new BasePage(webDriver);
    }

    @After
    public void tearDown() {webDriver.quit();
    }

    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = webDriver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }

    @Test
    public void Test1_Contacts() {
        BasePage.clickContacts();
        Assert.assertEquals("Контактная информация", BasePage.getContacts());
    }

    @Test
    public void Test2_Free_events() {
        BasePage.clickFree_events();
        Assert.assertEquals("Бесплатные курсы", BasePage.getFreeEvents());
    }

    @Test
    public void Test3_Career_center() {
        BasePage.clickCareerCenter();
        Assert.assertEquals("Центр карьеры", BasePage.getCareerCenter());
    }

    @Test
    public void Test4_Media() {
        BasePage.clickMedia();
        Assert.assertEquals("Честные истории о карьере в IT", BasePage.getMedia());
    }

    @Test
    public void Test5_Corporate_education() {
        BasePage.clickEducation();
        Assert.assertEquals("Развивайте бизнес", BasePage.getCorporateEducation());
    }

    @Test
    public void Test6_Courses() {
        BasePage.clickCourses();
        Assert.assertEquals("Онлайн-курсы по IT профессиям", BasePage.getCourses());
    }

    @Test
    public void Test7_Partnership() {
        BasePage.clickPartnership();
        Assert.assertEquals("станьте партнером SkillFactory", BasePage.getPartnership());
    }

    @Test
    public void Test8_Sign_up_for_a_course() {

        BasePage.CourseTesting();
        {
            WebElement element = webDriver.findElement(By.xpath(TESTING_COURSE));
            Actions builder = new Actions(webDriver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = webDriver.findElement(By.tagName("body"));
            Actions builder = new Actions(webDriver);
            builder.moveToElement(element, 0, 0).perform();
        }
        vars.put("window_handles", webDriver.getWindowHandles());
        webDriver.findElement(By.cssSelector(".tn-elem__5608766611679951555532 > .tn-atom")).click();
        vars.put("win6219", waitForWindow(2000));
        webDriver.switchTo().window(vars.get("win6219").toString());
        webDriver.findElement(By.linkText("Записаться на курс")).click();
        {
            WebElement element = webDriver.findElement(By.tagName("body"));
            Actions builder = new Actions(webDriver);
            builder.moveToElement(element, 0, 0).perform();
        }
        BasePage.SendName1();
        BasePage.SendEmail1();
        BasePage.SendNumber1();
        BasePage.ClickSubmit1();
    }

    @Test
    public void Test9_Send_contacts() {
        BasePage.ClickName();
        BasePage.SendName();
        BasePage.ClickEmail();
        BasePage.SendEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneNumber();
        BasePage.Submit();
    }

    @Test
    public void Test10_Get_consultation() {

        vars.put("window_handles", webDriver.getWindowHandles());
        BasePage.ClickCourse();
        vars.put("win8852", waitForWindow(2000));
        webDriver.switchTo().window(vars.get("win8852").toString());
        BasePage.ClickGetConsultation();
        BasePage.ClickNAme2();
        BasePage.InputName();
        BasePage.ClickEmail2();
        BasePage.InputEmail();
        BasePage.SendNumber();
        BasePage.SendRequest();

    }

    @Test
    public void Test11_Read_student_story() {
        BasePage.readStory();
    }

    @Test
    public void Test12_Ask() {
        BasePage.clickContacts();
        BasePage.ClickBtnAsk();
        BasePage.SendName();
        BasePage.ClickEmail();
        BasePage.SendEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneNumber();
        BasePage.ClickInputText();
        BasePage.SendText();
        BasePage.Submit3();
    }

    @Test
    public void Test13_Go_to_media() {
        BasePage.Go_to_media();
    }

    @Test
    public void Test14_Subscription() {
        BasePage.Subscription();
        BasePage.SendSubscription();
        BasePage.SubmitSubscription();
    }

    @Test
    public void Test15_Free_registration() {

        BasePage.ClickFree();
        vars.put("window_handles", webDriver.getWindowHandles());
        BasePage.ClickBtnStartFree();
        vars.put("win9864", waitForWindow(2000));
        webDriver.switchTo().window(vars.get("win9864").toString());
        BasePage.ClickEmail();
        BasePage.SendEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneNumber();
        BasePage.Submit2();
    }

    @Test
    public void Test16_Look_all_materials() {
        BasePage.Look_all_materials();
    }

    @Test
    public void Test17_Send_contacts_Negative_Email() {
        String Current_message = "Укажите, пожалуйста, корректный email";
        BasePage.ClickName();
        BasePage.SendName();
        BasePage.ClickEmail();
        BasePage.SendIncorrectEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneNumber();
        BasePage.Submit();
        Assert.assertEquals(Current_message, webDriver.findElement(By.xpath("//*[@id=\"form562643444\"]/div[2]/div[2]/div/div")).getText());
    }

    @Test
    public void Test18_Subscription_Negative_Email() {
        String Current_Message = "Укажите, пожалуйста, корректный email";
        BasePage.Subscription();
        BasePage.SendIncorrectEmailSubscription();
        BasePage.SubmitSubscription();
        Assert.assertEquals(Current_Message, webDriver.findElement(By.xpath("//*[@id=\"form572934623\"]/div[2]/div[1]/div/div")).getText());
    }

    @Test
    public void Test19_Send_contacts_Negative_PhoneNumber() {
        String Current_Message = "Укажите, пожалуйста, корректный номер телефона";
        BasePage.ClickName();
        BasePage.SendName();
        BasePage.ClickEmail();
        BasePage.SendEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneIncorrectNumber();
        BasePage.Submit();
        Assert.assertEquals(Current_Message, webDriver.findElement(By.xpath("//*[@id=\"form562643444\"]/div[2]/div[3]/div/div[2]")).getText());

    }

    @Test
    public void Test20_Send_contacts_Negative_Empty() {
        BasePage.ClickName();
        BasePage.SendSpaceName();
        BasePage.ClickEmail();
        BasePage.SendEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneNumber();
        BasePage.Submit();
        Assert.assertEquals("Обязательное поле", webDriver.findElement(By.xpath("//*[@id=\"form562643444\"]/div[2]/div[1]/div/div")).getText());
    }
}
