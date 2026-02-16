package ui;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SimpleTest {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @Test
    void simplePageTest() {
        // Открываем страницу
        open("/");
        
        // Проверяем заголовок страницы
        $("h1").shouldBe(visible).shouldHave(text("Welcome to the-internet"));
        
        // Проверяем, что есть ссылка на формы
        $("a[href='/login']").shouldBe(visible);
        
        // Можно проверить, что страница содержит текст
        $("body").shouldHave(text("Available Examples"));
    }
}
