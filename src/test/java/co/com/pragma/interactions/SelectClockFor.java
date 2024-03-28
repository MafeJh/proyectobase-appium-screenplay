package co.com.pragma.interactions;

import co.com.pragma.utils.ScrollFlutterUp;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.userinterface.DataPickerPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectClockFor {
    public static Performable hour() {
        return Interaction.where("Selecciona un solo día en el calendario de la opción de fecha",

                WaitUntil.the(SELECTOR_HOUR, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SELECTOR_HOUR),//click en el selector para escribir fecha
                Click.on(SELECTOR_KEYBOARD),
                Click.on(TYPE_HOUR),
                Enter.theValue("12").into(TYPE_HOUR),
                Click.on(TYPE_MINUTES),
                Enter.theValue("00").into(TYPE_MINUTES),
                Click.on(AM),
                Click.on(OK));

    }
}
