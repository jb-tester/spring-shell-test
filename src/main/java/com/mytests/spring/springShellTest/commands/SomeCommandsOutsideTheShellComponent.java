package com.mytests.spring.springShellTest.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 4/29/2022.</p>
 * <p>Project: spring-shell-test</p>
 * *
 */
@Component
public class SomeCommandsOutsideTheShellComponent
{


    // this command is not available really - the commands should be registered only
    // inside @ShellComponent-annotated classes
    @ShellMethod(value = "some command", group = "first group")
    public String tryMe(){
        return "it works!";
    }
}
