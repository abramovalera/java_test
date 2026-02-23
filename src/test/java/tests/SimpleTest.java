package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@DisplayName("Тест для примера сайт -> the-internet.herokuapp.com/")
public class SimpleTest extends TestBase {


    @Test
    @DisplayName("Простой тест с шагами")
    void simplePageTest() {

        step("Пользователь открывает главную страницу", () -> {
            open("/");
        });

        step("Пользователь проверяет основные элементы страницы", () -> {
            $("h1").shouldBe(visible);
            $("a[href='/login']").shouldBe(visible);
        });

        step("Пользователь видит корректный контент страницы", () -> {
            $("h1").shouldHave(text("Welcome to the-internet"));
            $("body").shouldHave(text("Available Examples"));
        });
    }

//    @Test
//    @DisplayName("Broken test")
//    void brokenPageTest() {
//
//        step("Пользователь открывает главную страницу", () -> {
//            open("/");
//        });
//
//        step("Пользователь проверяет основные элементы страницы", () -> {
//            $("h1").shouldBe(visible);
//            $("a[href='/login']").shouldBe(visible);
//        });
//
//        step("Пользователь видит неверный заголовок (ожидаемое падение)", () -> {
//            $("h1").shouldHave(text("This text should fail"));
//        });
//    }
}
