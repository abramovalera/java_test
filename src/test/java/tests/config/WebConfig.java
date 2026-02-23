package tests.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${env}.properties"
})
public interface WebConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://the-internet.herokuapp.com")
    String getBaseUrl();

    /* Имя браузера: chrome, firefox, yandex. */
    @Key("browser")
    String getBrowser();

    /* Версия браузера. */
    @Key("browserVersion")
    @DefaultValue("")
    String getBrowserVersion();

    /* true -> использовать RemoteWebDriver (Selenoid), false -> локальный браузер. */
    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    /* URL удаленного Selenium endpoint, например: http://localhost:4444/wd/hub. */
    @Key("remoteUrl")
    @DefaultValue("")
    String getRemoteURL();
}
