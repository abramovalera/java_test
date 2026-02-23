package tests.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${env}.properties"
})
public interface WebConfig extends Config {


    @Key("baseUrl")
    @DefaultValue("https://the-internet.herokuapp.com")
    String getBaseUrl();

    @Key("browser")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("")
    String getBrowserVersion();

    /* true -> использовать Selenoid, false -> локальный браузер */
    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    /* URL удаленного Selenide */
    @Key("remoteUrl")
    @DefaultValue("")
    String getRemoteURL();
}
