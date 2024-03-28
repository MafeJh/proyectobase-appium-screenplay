package co.com.pragma.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.userinterface.DataPickerPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCalendar {
    public static Performable rangeOfDays() {
        return Interaction.where("Selecciona un solo día en el calendario de la opción de fecha",

                WaitUntil.the(FIRST_DATE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(FIRST_DATE),
                Click.on(SECOND_DATE),
                Click.on(SAVE));

    }
}
