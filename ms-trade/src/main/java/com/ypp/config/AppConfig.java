package com.ypp.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by nannan on 2017/6/9.
 */
@Configuration
public class AppConfig {
    @Bean
    @Primary
    Retryer retryer() {
        return Retryer.NEVER_RETRY;
    }
}
