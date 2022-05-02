package com.mytests.spring.springShellTest.commands;

import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * *
 * <p>Created by irina on 4/29/2022.</p>
 * <p>Project: spring-shell-test</p>
 * *
 */
public class SomeCommands {

    @ShellMethod(value = "some command", group = "first group")
    public String tryMe(){
        return "it works!";
    }
}
