package com.mytests.spring.springShellTest;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.shell.jline.PromptProvider;

@SpringBootApplication
public class SpringShellTestApplication {
    /*@Bean
    public PromptProvider promptProvider() {
        return () -> new AttributedString("shell test:>", AttributedStyle.DEFAULT.background(AttributedStyle.MAGENTA));
    }*/
    public static void main(String[] args) {
        SpringApplication.run(SpringShellTestApplication.class, args);
    }

}
