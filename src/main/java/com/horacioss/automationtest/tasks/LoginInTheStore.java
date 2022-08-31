package com.horacioss.automationtest.tasks;

import com.horacioss.automationtest.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginInTheStore implements Task {

    private final String username;
    private final String password;

    public LoginInTheStore(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginInTheStore withTheCredentials(String username, String password) {
        return Tasks.instrumented(LoginInTheStore.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LOGIN_BUTTON),
                Clear.field(HomePage.USERNAME_INPUT),
                Enter.theValue(username).into(HomePage.USERNAME_INPUT),
                Clear.field(HomePage.PASSWORD_INPUT),
                Enter.theValue(password).into(HomePage.PASSWORD_INPUT),
                Click.on(HomePage.SUBMIT_BUTTON)
        );
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
