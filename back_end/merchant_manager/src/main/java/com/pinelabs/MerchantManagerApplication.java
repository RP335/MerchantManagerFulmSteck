package com.pinelabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }, scanBasePackages = {"com.pinelabs"})
//@SpringBootApplication
//@ComponentScan(basePackages = {"com.pinelabs.repository",
//"com.pinelabs.controller",
//"com.pinelabs.service",
//"com.pinelabs.dto",
//"com.pinelabs.model"})
@EnableAutoConfiguration
//@ComponentScan({"com.pinelabs.repository", "com.pinelabs.controller", "com.pinelabs.service", "com.pinelabs.dto"})

public class MerchantManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerchantManagerApplication.class, args);
    }
}
