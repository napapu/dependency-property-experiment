package org.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:file-with-config.properties")
//@ConditionalOnProperty(value = "load.beans", havingValue = "true") // <-- Having the property on this line doesn't work as intended. The bean is not loaded.
public class ConditionalBeansConfig {

    @Bean
    @ConditionalOnProperty(value = "load.beans", havingValue = "true") // <-- This works as intended.
    public String conditionalBean() {
        System.out.println("Bean only loaded when @ConditionalOnProperty is marked at the method level, not on the config class.");
        return "";
    }
}
