package com.mytests.spring.springShellTest.commands;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * *
 * <p>Created by irina on 4/28/2022.</p>
 * <p>Project: spring-shell-test</p>
 * *
 */
@ShellComponent
@ShellCommandGroup("first group")
public class FirstGroupCommands {

  private boolean helloFlag;

  @ShellMethod(value = "mycommand")
  public String mycommand(){
    return "I'm the only allowed command";
  }
  //@ShellMethod() //- check the "Command description cannot be null or empty" error: #value is mandatory
  @ShellMethod(value = "hello command.", key = "sayHi")
  public String firstCommand(){
    this.helloFlag = true;
    return "hello!";
  }

  @ShellMethod(value = "bye-bye command.", key = "sayBye")
  public String secondCommand(){
    return "have a nice day!";
  }

  // should not be shown as not used since it is referenced implicitly due to the conventional name
  public Availability secondCommandAvailability() {
    return helloFlag
            ? Availability.available()
            : Availability.unavailable("say hi first");
  }
}
