import curcul.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTest {
    @Test
    public void webTestLocal () {
        // запуск gradlew clean test --tests WebTest -Dlaunch=local

        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(config.baseURL()).isEqualTo("https://github.com");
        assertThat(config.browser()).isEqualTo("CHROME");
        assertThat(config.browserVersion()).isEqualTo("100");
    }

    @Test
    public void webTestRemote () {
        // запуск gradlew clean test --tests WebTest -Dlaunch=remote

        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(config.baseURL()).isEqualTo("https://github.com");
        assertThat(config.browser()).isEqualTo("CHROME");
        assertThat(config.browserVersion()).isEqualTo("100");
        assertThat(config.remoteURL()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");


    }
}
