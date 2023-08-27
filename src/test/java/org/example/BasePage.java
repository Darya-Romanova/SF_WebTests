package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    private WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private static final String CONTACTS = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/ul/li[4]/a";
    private static final String FREE_EVENTS = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/ul/li[2]/a";
    private static final String CAREER_CENTER = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/ul/li[3]/a";
    private static final String MEDIA = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/ul/li[5]/a";
    private static final String CORPORATE_EDUCATION = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/ul/li[6]/a";
    private static final String COURSES = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[2]/div[1]/div/ul/li[8]/a/span";
    private static final String PARTNERSHIP = "//*[@id=\"rec625525165\"]/div/div/div[14]/div/a[3]";
    private static final String STORY = "//*[@id=\"swiper-wrapper-73a10f59102e5ff8c\"]/div[1]/div/div[2]/a/span";
    public static final String TESTING_COURSE = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[2]/div[1]/div/ul/li[4]/a/span";
    private static final String GO_TO_MEDIA = "//*[@id=\"rec623700900\"]/div/div/div/section/div/a/span";
    private static final String SUBSCRIPTION = ".t-input-group_em:nth-child(1) .t-input";
    private static final String LOOK_ALL_MATERIALS = "//*[@id=\"rec623700702\"]/div/div/div/section/div/a/span";
    private static final String ERROR_MESSAGE = "t-input-error";
    private static final String SEARCH_CONTACTS = "//*[@id=\"rec618804078\"]/div/div/div[6]/h1";
    private static final String SEARCH_MEDIA = "//*[@id=\"header\"]/div[1]/p";
    private static final String SEARCH_FREE_EVENTS = "//*[@id=\"rec614382303\"]/div/div/div[3]/h1/text()[1]";
    private static final String SEARCH_CAREER_CENTER = "//*[@id=\"rec350865380\"]/div/div/div[3]/h1";
    private static final String SEARCH_CORPORATE_EDUCATION = "//*[@id=\"rec425993788\"]/div/div/div[3]/h1/span";
    private static final String SEARCH_COURSES = "//*[@id=\"rec609355207\"]/div/div/div[3]/h1";
    private static final String SEARCH_PARTNERSHIP = "//*[@id=\"rec368990860\"]/div/div/div[3]/div";
    private static final String NAME_FIELD = "name";
    private static final String EMAIL_FIELD = "email";
    private static final String PHONE_NUMBER_FIELD = "tildaspec-phone-part[]";
    private static final String SUBMIT = "#form562643444 .t-submit";
    private static final String SUBMIT2 = "#form473301432 .t-submit";
    private static final String SUBMIT3 = "#form472342157 .t-submit";
    private static final String SUBMIT_SUBSCRIPTION = ".tn-form__submit:nth-child(6) > .t-submit";
    private static final String FREE = "БЕСПЛАТНО";
    private static final String START_FREE = "#rec487651778 .t-card__col:nth-child(2) .t-card__btn";
    private static final String INPUT_TEXT = "input_1658683104957";
    private static final String BUTTON_ASK = "t650__inner-col";
    private static final String CHOOSE_COURSE = ".tn-elem__5664443331679411548099 > .tn-atom";
    private static final String BTN_GET_CONSULTATION = "#rec496233010 > div > div > div.t396__elem.tn-elem.tn-elem__4962330101650132492207 > a";
    private static final String NAME_FIELD2 = "#form496233011 #input_1495810359387";
    private static final String CLICK_EMAIL = "#form496233011 #input_1495810354468";

    public void clickContacts() {
        webDriver.findElement(By.xpath(CONTACTS)).click();
    }

    public String getContacts() {
        return webDriver.findElement(By.xpath(SEARCH_CONTACTS)).getText();
    }

    public void clickFree_events() {
        webDriver.findElement(By.xpath(FREE_EVENTS)).click();
    }

    public String getFreeEvents() {
        return webDriver.findElement(By.xpath(SEARCH_FREE_EVENTS)).getText();
    }

    public void clickCareerCenter() {
        webDriver.findElement(By.xpath(CAREER_CENTER)).click();
    }

    public String getCareerCenter() {
        return webDriver.findElement(By.xpath(SEARCH_CAREER_CENTER)).getText();
    }

    public void clickMedia() {
        webDriver.findElement(By.xpath(MEDIA)).click();
    }

    public String getMedia() {
        return webDriver.findElement(By.xpath(SEARCH_MEDIA)).getText();
    }

    public void clickEducation() {
        webDriver.findElement(By.xpath(CORPORATE_EDUCATION)).click();
    }

    public String getCorporateEducation() {
        return webDriver.findElement(By.xpath(SEARCH_CORPORATE_EDUCATION)).getText();
    }

    public void clickCourses() {
        webDriver.findElement(By.xpath(COURSES)).click();
    }

    public String getCourses() {
        return webDriver.findElement(By.xpath(SEARCH_COURSES)).getText();
    }

    public void clickPartnership() {
        webDriver.findElement(By.xpath(PARTNERSHIP)).click();
    }

    public String getPartnership() {
        return webDriver.findElement(By.xpath(SEARCH_PARTNERSHIP)).getText();
    }

    public void readStory() {
        webDriver.findElement(By.xpath(STORY)).click();
    }

    public void CourseTesting() {
        webDriver.findElement(By.xpath(TESTING_COURSE)).click();
    }

    public void Go_to_media() {
        webDriver.findElement(By.xpath(GO_TO_MEDIA)).click();
    }

    public void Subscription() {
        webDriver.findElement(By.cssSelector(SUBSCRIPTION)).click();
    }

    public void SendSubscription() {
        webDriver.findElement(By.cssSelector(SUBSCRIPTION)).sendKeys("ivanovii@gmail.com");
    }

    public void SendIncorrectEmailSubscription() {
        webDriver.findElement(By.cssSelector(SUBSCRIPTION)).sendKeys("123456");
    }

    public void Look_all_materials() {
        webDriver.findElement(By.xpath(LOOK_ALL_MATERIALS)).click();
    }

    public String getErrorMessage() {
        return webDriver.findElement(By.className(ERROR_MESSAGE)).getText();
    }

    public void ClickName() {
        webDriver.findElement(By.name(NAME_FIELD)).click();

    }

    public void SendName() {
        webDriver.findElement(By.name(NAME_FIELD)).sendKeys("Иванов Иван");
    }

    public void SendSpaceName() {
        webDriver.findElement(By.name(NAME_FIELD)).sendKeys("");
    }

    public void ClickEmail() {
        webDriver.findElement(By.name(EMAIL_FIELD)).click();
    }

    public void SendEmail() {
        webDriver.findElement(By.name(EMAIL_FIELD)).sendKeys("ivanovii@gmail.com");
    }

    public void SendIncorrectEmail() {
        webDriver.findElement(By.name(EMAIL_FIELD)).sendKeys("ivanovii@gmail");
    }

    public void ClickPhoneNumber() {
        webDriver.findElement(By.name(PHONE_NUMBER_FIELD)).click();
    }

    public void SendPhoneNumber() {
        webDriver.findElement(By.name(PHONE_NUMBER_FIELD)).sendKeys("(999) 999-99-99");
    }

    public void SendPhoneIncorrectNumber() {
        webDriver.findElement(By.name(PHONE_NUMBER_FIELD)).sendKeys("(000) 000-00-00");
    }

    public void Submit() {
        webDriver.findElement(By.cssSelector(SUBMIT)).click();
    }

    public void Submit2() {
        webDriver.findElement(By.cssSelector(SUBMIT2)).click();
    }

    public void Submit3() {
        webDriver.findElement(By.cssSelector(SUBMIT3)).click();
    }

    public void SubmitSubscription() {
        webDriver.findElement(By.cssSelector(SUBMIT_SUBSCRIPTION)).click();
    }

    public void ClickFree() {
        webDriver.findElement(By.linkText(FREE)).click();
    }

    public void ClickBtnStartFree() {
        webDriver.findElement(By.cssSelector(START_FREE)).click();
    }

    public void ClickInputText() {
        webDriver.findElement(By.id(INPUT_TEXT)).click();
    }

    public void SendText() {
        webDriver.findElement(By.id(INPUT_TEXT)).sendKeys("Test");
    }

    public void ClickBtnAsk() {
        webDriver.findElement(By.className(BUTTON_ASK)).click();
    }

    public void ClickCourse() {
        webDriver.findElement(By.cssSelector(CHOOSE_COURSE)).click();
    }

    public void ClickGetConsultation() {
        webDriver.findElement(By.cssSelector(BTN_GET_CONSULTATION)).click();
    }

    public void ClickNAme2() {
        webDriver.findElement(By.cssSelector(NAME_FIELD2)).click();
    }

    public void InputName() {
        webDriver.findElement(By.cssSelector(NAME_FIELD2)).sendKeys("Иванов Иван");
    }

    public void ClickEmail2() {
        webDriver.findElement(By.cssSelector(CLICK_EMAIL)).click();
    }

    public void InputEmail() {
        webDriver.findElement(By.cssSelector(CLICK_EMAIL)).sendKeys("ivanovii@gmail.com");
    }

    public void SendNumber() {
        webDriver.findElement(By.cssSelector("#form496233011 .t-input > .t-input")).click();
        webDriver.findElement(By.cssSelector("#form496233011 .t-input > .t-input")).sendKeys("(999) 999-99-99");
    }

    public void SendRequest() {
        webDriver.findElement(By.cssSelector(".t-form__submit:nth-child(9) > .t-submit")).click();

    }

    public void SendName1() {
        webDriver.findElement(By.id("input_1495810359387")).click();
        webDriver.findElement(By.id("input_1495810359387")).sendKeys("Иванов Иван");

    }

    public void SendEmail1() {
        webDriver.findElement(By.id("input_1495810354468")).click();
        webDriver.findElement(By.id("input_1495810354468")).sendKeys("ivanovii@gmail.com");
    }

    public void SendNumber1() {
        webDriver.findElement(By.name("tildaspec-phone-part[]")).click();
        webDriver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(999) 999-99-99");
    }

    public void ClickSubmit1() {
        webDriver.findElement(By.className("t-submit")).click();
    }
}
