package com.mytests.spring.springShellTest.commands;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

/**
 * *
 * <p>Created by irina on 4/29/2022.</p>
 * <p>Project: spring-shell-test</p>
 * *
 */
@ShellComponent("second")
public class SecondGroupCommands {

    private boolean foobarFlag = false;

    @ShellMethod(value = "enable foo and bar.", key = "add-foobar")
    private void enableFooBar(){
        foobarFlag = true;
    }

    @ShellMethod("foo")
    @ShellMethodAvailability("availabilityCheck") // check navigation to 'availabilityCheck' method
    private String foo(){
        return "foo";
    }

    @ShellMethod(value = "bar", key = "bar")
    @ShellMethodAvailability("availabilityCheck") // check navigation to 'availabilityCheck' method
    private String barMethod(){
        return "bar";
    }

    // should not be shown as not used since it is referenced in @ShellMethodAvailability annotations
    public Availability availabilityCheck() {
        return foobarFlag
                ? Availability.available()
                : Availability.unavailable("you are not connected");
    }

    @ShellMethod("boo")
    private String boo(){
        return "boo";
    }

    @ShellMethod(value = "buzz", key = "buzz")
    private String buzzMethod(){
        return "buzz";
    }

    @ShellMethodAvailability(value = {"boo","buzz"}) // check navigation
    //@ShellMethodAvailability(value = {"boo","buzzMethod"}) // buzzMethod here should not be navigable
    public Availability checkDay() {
        int day = Calendar.getInstance().get(DAY_OF_WEEK);
        return ((day != SUNDAY) && (day != SATURDAY))
                ? Availability.available()
                : Availability.unavailable("we don't work on weekend");
    }
}
