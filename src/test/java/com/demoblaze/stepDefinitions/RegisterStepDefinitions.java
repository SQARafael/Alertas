package com.demoblaze.stepDefinitions;
/*
 * @(#) RegisterStepDefinitions.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.demoblaze.tasks.HomeTask;
import com.demoblaze.tasks.RegisterTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class RegisterStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Before
    public void setStage(){
        WebDriverManager.chromedriver().setup();

        setTheStage( new OnlineCast());
    }

    @Given("that the user opens the demo page and opens the registration option")
    public void thatTheUserOpensTheDemoPageAndOpensTheRegistrationOption() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://www.demoblaze.com/index.html"),
                HomeTask.on()
        );

    }
    @When("the user enters the registration data appropriately")
    public void theUserEntersTheRegistrationDataAppropriately() {
        theActorCalled("Usuario").wasAbleTo(
                RegisterTask.on(navegador)

        );

    }
    @Then("You will be able to see a successful registration message")
    public void youWillBeAbleToSeeASuccessfulRegistrationMessage() {

    }
}
