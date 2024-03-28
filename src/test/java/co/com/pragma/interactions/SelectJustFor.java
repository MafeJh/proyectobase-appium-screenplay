package co.com.pragma.interactions;

import co.com.pragma.utils.ScrollFlutterUp;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.userinterface.DataPickerPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectJustFor {
    public static Performable day() {
        return Interaction.where("Selecciona un solo día en el calendario de la opción de fecha",

                WaitUntil.the(SELECTOR_DATE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SELECTOR_DATE),
                Click.on(SELECTOR_YEAR_CALENDAR),
                ScrollFlutterUp.toUp(),
                Click.on(SELECTOR_YEAR_2017),
                Click.on(DAY_OF_2017),
                Click.on(OK_CALENDAR));

    }
}
