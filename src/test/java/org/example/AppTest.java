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

public class AppTest {
    private static WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    private BasePage BasePage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to("https://skillfactory.ru/");
        vars = new HashMap<String, Object>();
        BasePage = new BasePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }

    @Test
    public void Test1_contacts() {
        BasePage.clickContacts();
        Assert.assertEquals("Контактная информация", BasePage.getContacts());
    }

    @Test
    public void Test2_Free_events() {
        BasePage.clickFree_events();
        Assert.assertEquals("Бесплатные мероприятия и материалы", BasePage.getFreeEvents());
    }

    @Test
    public void Test3_career_center() {
        BasePage.clickCareerCenter();
        Assert.assertEquals("Центр карьеры", BasePage.getCareerCenter());
    }

    @Test
    public void Test4_media() {
        BasePage.clickMedia();
        Assert.assertEquals("Честные истории о карьере в IT", BasePage.getMedia());
    }

    @Test
    public void Test5_corporativnoye_obuchenye() {
        BasePage.clickEducation();
        Assert.assertEquals("Развивайте бизнес", BasePage.getCorporateEducation());
    }

    @Test
    public void Test6_courses() {
        BasePage.clickCourses();
        Assert.assertEquals("Онлайн-курсы по IT профессиям", BasePage.getCourses());
    }

    @Test
    public void Test7_sign_up_for_a_course() {

        BasePage.Course_Testing();
        {
            WebElement element = driver.findElement(By.cssSelector(".tn-elem__5608766611679951555527 > .tn-atom"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".tn-elem__5608766611679951555532 > .tn-atom")).click();
        vars.put("win6219", waitForWindow(2000));
        driver.switchTo().window(vars.get("win6219").toString());
        driver.findElement(By.linkText("Записаться на курс")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        BasePage.SendName1();
        BasePage.SendEmail1();
        BasePage.SendNumber1();
        BasePage.ClickSubmit1();
    }

    @Test
    public void Test8_send_contact() {
        BasePage.ClickName();
        BasePage.SendName();
        BasePage.ClickEmail();
        BasePage.SendEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneNumber();
        BasePage.Submit();
    }

    @Test
    public void Test9_get_consulation() {

        vars.put("window_handles", driver.getWindowHandles());
        BasePage.ClickCourse();
        vars.put("win8852", waitForWindow(2000));
        driver.switchTo().window(vars.get("win8852").toString());
        BasePage.ClickGetConsultation();
        BasePage.ClickNAme2();
        BasePage.InputName();
        BasePage.ClickEmail2();
        BasePage.InputEmail();
        BasePage.SendNumber();
        BasePage.SendRequest();

    }

    @Test
    public void Test10_read_the_history() {
        BasePage.readHistory();
    }

    @Test
    public void Test11_Ask() {
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
    public void Test12_go_to_media() {
        BasePage.Go_to_media();
    }

    @Test
    public void Test13_subscription() {
        BasePage.Subscription();
        BasePage.SendSubscription();
        BasePage.SubmitSubscription();
    }

    @Test
    public void Test14_Free_registration() {

        BasePage.ClickFree();
        vars.put("window_handles", driver.getWindowHandles());
        BasePage.ClickBtnStratFree();
        vars.put("win9864", waitForWindow(2000));
        driver.switchTo().window(vars.get("win9864").toString());
        BasePage.ClickEmail();
        BasePage.SendEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneNumber();
        BasePage.Submit2();
    }

    @Test
    public void Test15_look_all_materials() {
        BasePage.Look_all_materials();
    }

    @Test
    public void Test16_negative_send_contacts() {
        String Current_message = "Укажите, пожалуйста, корректный email";
        BasePage.ClickName();
        BasePage.SendName();
        BasePage.ClickEmail();
        BasePage.SendIncorrectEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneNumber();
        BasePage.Submit();
        Assert.assertEquals(Current_message, driver.findElement(By.xpath("//*[@id=\"form562643444\"]/div[2]/div[2]/div/div")).getText());
    }

    @Test
    public void Test17_negative_subscription_Email() {
        String Current_Message = "Укажите, пожалуйста, корректный email";
        BasePage.Subscription();
        BasePage.SendIncorrectEmailSubscription();
        BasePage.SubmitSubscription();
        Assert.assertEquals(Current_Message, driver.findElement(By.xpath("//*[@id=\"form572934623\"]/div[2]/div[1]/div/div")).getText());
    }

    @Test
    public void Test18_negative_SendContacts_IncorrectPhoneNumber() {
        String Current_Message = "Укажите, пожалуйста, корректный номер телефона";
        BasePage.ClickName();
        BasePage.SendName();
        BasePage.ClickEmail();
        BasePage.SendEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneIncorrectNumber();
        BasePage.Submit();
        Assert.assertEquals(Current_Message, driver.findElement(By.xpath("//*[@id=\"form562643444\"]/div[2]/div[3]/div/div[2]")).getText());

    }

    @Test
    public void Test19_Send_Contacts_SpaceField() {
        BasePage.ClickName();
        BasePage.SendSpaceName();
        BasePage.ClickEmail();
        BasePage.SendEmail();
        BasePage.ClickPhoneNumber();
        BasePage.SendPhoneNumber();
        BasePage.Submit();
        Assert.assertEquals("Обязательное поле", driver.findElement(By.xpath("//*[@id=\"form562643444\"]/div[2]/div[1]/div/div")).getText());
    }

}
