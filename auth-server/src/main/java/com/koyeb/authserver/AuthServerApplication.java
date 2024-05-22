package com.koyeb.authserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AuthServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }

    @Bean
    UserDetailsService inMemoryUserDetailsManager() {
        return new InMemoryUserDetailsManager(
                User.builder()
                        .username("user")
                        // "secret" is the password
                        .password("{bcrypt}$2a$13$gDRvJKxJ1N6Kn83Lx46Btu3CCfYEbYuF8oXu62jwzuKwfkENHwh/S")
                        .roles("USER")
                        .build()
        );
    }
}
