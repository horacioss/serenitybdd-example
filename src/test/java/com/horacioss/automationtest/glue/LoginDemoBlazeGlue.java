package com.horacioss.automationtest.glue;

import com.horacioss.automationtest.userinterface.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

public class LoginDemoBlazeGlue {


    @Given("{actor} is in the DemoBlaze home page")
    public void mikeIsInTheDemoBlazeHomePage(Actor actor) {
        givenThat(actor).attemptsTo(
                Open.browserOn().the(HomePage.class)
        );
        try {
            Thread.sleep(3000L);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("input his username: {string} and his password: {string}")
    public void inputHisUsernameUsernameAndHisPasswordPassword(String username, String password) {
    }

    @Then("he should can see the welcome message: {string} in the navigation bar")
    public void hiShouldCanSeeTheWelcomeMessageWelcomeMessageInTheNavigationBar(String welcomeMessage) {
    }
}
