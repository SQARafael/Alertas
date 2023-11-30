package com.demoblaze.interactions;
/*
 * @(#) SwichAlert.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;


/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class SwichAlert implements Interaction {
    private WebDriver driver;

    public SwichAlert(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
        }catch (NoAlertPresentException e){
            throw new RuntimeException();
        }


    }

    public static SwichAlert onAlert(WebDriver driver){
        return new SwichAlert(driver);
    }
}
