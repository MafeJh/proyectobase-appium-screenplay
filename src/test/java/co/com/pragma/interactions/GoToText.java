package co.com.pragma.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.userinterface.InputsPage.CARD_INPUTS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToText {
    public static Performable fieldWidget() {
        return Task.where("Ingresa a la app material y luego a la sección especificada",

                WaitUntil.the(CARD_INPUTS, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CARD_INPUTS));

    }
}
