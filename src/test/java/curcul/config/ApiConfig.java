package curcul.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:api.properties"
})

public interface ApiConfig extends Config {
    @Key("base.url")
    @DefaultValue("")
    String baseURL();
    @Key("token")
    @DefaultValue("")
    String token();
}
