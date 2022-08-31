package com.horacioss.automationtest.glue;

import com.horacioss.automationtest.tasks.LoginInTheStore;
import com.horacioss.automationtest.userinterface.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginDemoBlazeGlue {


    @Given("{actor} is in the DemoBlaze home page")
    public void mikeIsInTheDemoBlazeHomePage(Actor actor) {
        givenThat(actor).attemptsTo(
                Open.browserOn().the(HomePage.class)
        );
    }

    @When("input his username: {string} and his password: {string}")
    public void inputHisUsernameUsernameAndHisPasswordPassword(String username, String password) {
        when(theActorInTheSpotlight()).attemptsTo(
                LoginInTheStore.withTheCredentials(username, password)
        );
    }

    @Then("he should can see the welcome message: {string} in the navigation bar")
    public void hiShouldCanSeeTheWelcomeMessageWelcomeMessageInTheNavigationBar(String welcomeMessage) {
        then(theActorInTheSpotlight()).attemptsTo(
                Ensure.that(HomePage.USER_NAME_LABEL).text().containsIgnoringCase(welcomeMessage)
        );
    }
}
