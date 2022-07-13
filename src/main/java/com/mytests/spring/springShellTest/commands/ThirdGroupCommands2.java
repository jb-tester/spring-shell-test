package com.mytests.spring.springShellTest.commands;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

/**
 * *
 * <p>Created by irina on 6/10/2022.</p>
 * <p>Project: spring-shell-test</p>
 * *
 */
@ShellComponent()
@ShellCommandGroup("third")
public class ThirdGroupCommands2 {




    @ShellMethod("substract.")
   // @ShellMethodAvailability({"bar"}) - not available
    public int substract(int a, int b) {
        return a - b;
    }

}
