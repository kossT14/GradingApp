package com.register.GradingApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class GradingApp extends SpringBootServletInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(GradingApp.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GradingApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(GradingApp.class, args);
        LOGGER.info("Grading App started!");
    }
}
