package com.demoblaze.ui;
/*
 * @(#) RegisterUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class RegisterUI {
    public static final Target TXT_EMAIL= Target.the( "text input email" )
            .located( By.id("sign-username") );

    public static final Target TXT_PASSWORD= Target.the( "text input password" )
            .located( By.id("sign-password") );

    public static final Target BTN_SIGN_UP= Target.the( "btn Sign up" )
            .located( By.xpath("//button[text()='Sign up']"));
}
