package com.nhnacademy.resident.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
        http.headers().defaultsDisabled();
        http.headers().frameOptions().sameOrigin();
        http.authorizeHttpRequests()
                .anyRequest().permitAll();
        return http.build();
    }

}
