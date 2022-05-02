package com.mytests.spring.springShellTest.commands;

import org.jline.reader.LineReader;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * *
 * <p>Created by irina on 4/29/2022.</p>
 * <p>Project: spring-shell-test</p>
 * *
 */
@ShellComponent
public class DifferentGroupsCommands {

    String enteredName;

    @ShellMethod(value = "Set user name.", group = "first group")
    public void setName(@ShellOption(value = {"-N", "--name"}, defaultValue = "Vasya") String name){
        if (name == null) {
            System.out.println("hello Vasya");
            this.enteredName = "Vasya";
        } else
        {this.enteredName = name;}
    }

    @ShellMethod(value = "Add two ints.", group = "math operations group.")
    public int add(int a, int b) {
        return a + b;
    }

}
