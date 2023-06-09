package com.cyber.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.cyber.auth")
public class AuthCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthCenterApplication.class, args);
    }
}
