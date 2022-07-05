package curcul.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${launch}.properties"
})

public interface WebConfig extends Config {
    @Key("base.url")
    String baseURL();

    @Key("browser")
    String browser();

    @Key("browser.version")
    String browserVersion();

    @Key("remote.url")
    String remoteURL();
}
