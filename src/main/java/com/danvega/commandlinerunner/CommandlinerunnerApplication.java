package com.danvega.commandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandlinerunnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandlinerunnerApplication.class, args);

        //For Git Branche
        System.out.println("Welcome Message!");
    }

}
