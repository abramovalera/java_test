package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import tests.config.Browser;
import tests.config.WebConfig;

public class TestBase {
    private static WebConfig webConfig;

    @BeforeEach
    void addListener() {
        SelenideLogger.removeListener("AllureSelenide");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @BeforeAll
    static void preCondition() {
        System.setProperty("env", System.getProperty("env", "local"));
        webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        Configuration.baseUrl = webConfig.getBaseUrl();
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.browserVersion = webConfig.getBrowserVersion();
        Configuration.remote = webConfig.isRemote() ? webConfig.getRemoteURL() : null;

        configureBrowser();
    }

    private static void configureBrowser() {
        Browser browser = Browser.from(webConfig.getBrowser());

        switch (browser) {
            case CHROME:
                Configuration.browser = "chrome";
                break;
            case FIREFOX:
                Configuration.browser = "firefox";
                break;
        }
    }
}
