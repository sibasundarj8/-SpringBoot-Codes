package com.sibasundar.prod_ready_features.prod_ready_features.config;

import com.sibasundar.prod_ready_features.prod_ready_features.auth.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "getAuditorAware")
public class JpaConfig {

    @Bean
    public AuditorAwareImpl getAuditorAware() {
        return new AuditorAwareImpl();
    }

}