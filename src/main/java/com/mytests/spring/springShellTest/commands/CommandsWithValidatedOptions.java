package com.mytests.spring.springShellTest.commands;

import com.mytests.spring.springShellTest.utils.Zipcode;
import org.hibernate.validator.constraints.Length;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * *
 * <p>Created by irina on 5/2/2022.</p>
 * <p>Project: spring-shell-test</p>
 * *
 */
@ShellComponent()
@ShellCommandGroup("with validation")
public class CommandsWithValidatedOptions {

    @ShellMethod("Set user name.")
    public String setUserName(@Pattern(regexp = "[a-z]+", message = "{my.username.pattern.message} {regexp}") @ShellOption("-n") String name) {
        return "User name successfully set to " + name;
    }

    @ShellMethod("Set phone number.")
    public String setPhone(@Pattern(regexp = "\\d+", message = "phone should match {regexp}")
                           @Length(min = 7, max = 10, message = "should be from {min} to {max} digits")
                           @ShellOption("-n") String number) {
        return "Phone number successfully set to " + number;
    }

    @ShellMethod("Set password.")
    public String setPassword(@Size(min = 8, max = 40, message = "{my.password.size.message} ") @ShellOption("-p") String password) {
        return "Password successfully set to " + password;
    }

    @ShellMethod("set zipcode.")
    public String setZipcode(@Zipcode(country = "Czech Repiblic") @ShellOption("-z") String zipcode) {
        return "Zipcode successfully set to " + zipcode;
    }
}
