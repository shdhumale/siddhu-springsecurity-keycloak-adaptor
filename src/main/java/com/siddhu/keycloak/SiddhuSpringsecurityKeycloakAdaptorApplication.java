package com.siddhu.keycloak;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SiddhuSpringsecurityKeycloakAdaptorApplication {
	
	 /**
     * Use properties in application.yml instead of keycloak.json
     */
    @Bean
    public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }

	public static void main(String[] args) {
		SpringApplication.run(SiddhuSpringsecurityKeycloakAdaptorApplication.class, args);
	}

}