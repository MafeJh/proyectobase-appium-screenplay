package co.com.pragma.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.userinterface.ChipsPage.BUTTON_ACTION_CHIP;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickOnThe {

    public static Performable ActionChipButton() {
        return Task.where("Ingresa a la app material y luego a la sección especificada",

                WaitUntil.the(BUTTON_ACTION_CHIP, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BUTTON_ACTION_CHIP));

    }
}
