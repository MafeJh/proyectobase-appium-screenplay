package co.com.pragma.interactions;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.userinterface.PrincipalPage.CARD_BUTTONS_DEMO;
import static co.com.pragma.userinterface.PrincipalPage.CARD_DATEPICKER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToButtons {
    public static Performable demo() {
        return Task.where("Ingresa a la app material y luego a la sección especificada",

                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CARD_BUTTONS_DEMO));
    }
}
