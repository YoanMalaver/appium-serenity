package org.example.ui;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class CalculatorUi {

    public static final Locator NUMBER_ONE_LOCATED = locator()
            .withAndroidId("com.vivo.calculator:id/digit_1")
            .withIosAccesibilityId("1");

    public static final Target NUMBER_ONE = Target.the("")
            .located(theElementBy(NUMBER_ONE_LOCATED));
    public static final Locator NUMBER_TWO_LOCATED = locator()
            .withAndroidId("com.vivo.calculator:id/digit_2")
            .withIosAccesibilityId("1");

    public static final Target NUMBER_TWO = Target.the("")
            .located(theElementBy(NUMBER_TWO_LOCATED));
}
