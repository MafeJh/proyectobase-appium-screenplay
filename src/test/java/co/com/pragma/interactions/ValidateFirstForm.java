package co.com.pragma.interactions;

import co.com.pragma.utils.ScrollFlutterLargoDownto;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.userinterface.ChipsPage.BUTTON_ACTION_CHIP;
import static co.com.pragma.userinterface.InputsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateFirstForm {
    public static Performable validateOne() {
        return Task.where("Ingresa a la app material y luego a la sección especificada",

                WaitUntil.the(FIRST_VALIDAR_BUTTON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(FIRST_VALIDAR_BUTTON));

    }

    public static Performable validateTwo() {
        return Task.where("Ingresa a la app material y luego a la sección especificada",
                WaitUntil.the(SECOND_VALIDAR_BUTTON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SECOND_VALIDAR_BUTTON));

    }


    public static Performable validateName() {
        return Task.where("Ingresa a la app material y luego a la sección especificada",
                WaitUntil.the(SECOND_VALIDAR_BUTTON_NAME, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SECOND_VALIDAR_BUTTON_NAME));

    }
}
