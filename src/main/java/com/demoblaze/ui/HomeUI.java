package com.demoblaze.ui;
/*
 * @(#) HomeUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class HomeUI {

    public static final Target LNK_SIGNIN=Target.the("Link SIGN IN")
            .located(By.id("signin2"));
}
