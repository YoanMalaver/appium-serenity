package stepsDefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.task.SumaEnteros;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SumarSteps {

    @Given("^que (.*) quiere usar la calculadora$")
    public void userUi(String actor) {
        OnStage.theActorCalled(actor).entersTheScene();

    }

}
