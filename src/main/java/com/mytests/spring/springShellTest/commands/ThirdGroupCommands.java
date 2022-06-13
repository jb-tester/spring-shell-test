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
public class ThirdGroupCommands {


    public boolean thirdFlag = false;

    @ShellMethod("abc")
    @ShellMethodAvailability("commandsAvailability1")
    public String abc_command() {
        return "abc";
    }

    @ShellMethod("bcd")
    public String bcd_command() {
        return "bcd";
    }

    public Availability commandsAvailability1() {
        return thirdFlag
                ? Availability.available()
                : Availability.unavailable("not available");
    }

    @ShellMethodAvailability("bcd_command")
    public Availability commandsAvailability2() {
        return thirdFlag
                ? Availability.available()
                : Availability.unavailable("not available");
    }

    @ShellMethod("sum")
    //@ShellMethodAvailability({"foo", "bar"}) // report error
    //@ShellMethodAvailability({"foo"}) // takes precedence over sumAvailability
    public int sum(int a, int b) {
        return a + b;
    }

    public Availability foo() {
        return Availability.available();
    }
    public Availability bar() {
        return Availability.available();
    }
    public Availability sumAvailability() {
        return Availability.unavailable("hehe");
    }
}
