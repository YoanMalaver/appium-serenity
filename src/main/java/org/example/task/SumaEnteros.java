package org.example.task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.ui.CalculatorUi.NUMBER_ONE_LOCATED;

public class SumaEnteros implements Task {

    public static SumaEnteros paraUsarLaCalculadora(){
        return instrumented(SumaEnteros.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(NUMBER_ONE_LOCATED.toString(), isVisible()).forNoMoreThan(15).seconds(),
                Click.on()
        );
    }
}
