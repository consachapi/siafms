package pe.gob.cusco.siafms.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureSiafmsService {

    @Bean
    @ConfigurationProperties(prefix = "siafms.service")
    public ConfigSiafms configSiafms() {
        return new ConfigSiafms();
    }

}
