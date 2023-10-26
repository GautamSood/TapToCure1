package com.fil.taptocure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class TapToCureApplication {
    public static void main(String[] args) {
        SpringApplication.run(TapToCureApplication.class, args);
    }

}
