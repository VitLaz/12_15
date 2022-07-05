import curcul.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTest {
    @Test
    public void apiTestClasspath() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(config.baseURL()).isEqualTo("https://github.com");
        assertThat(config.token()).isEqualTo("123456");
    }


}
