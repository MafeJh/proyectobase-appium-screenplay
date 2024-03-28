package co.com.pragma.tasks;

import co.com.pragma.interactions.FillNameandCellphone;
import co.com.pragma.interactions.SelectCalendar;
import co.com.pragma.interactions.SelectClockFor;
import co.com.pragma.interactions.SelectJustFor;
import co.com.pragma.utils.ScrollFlutterLargo;
import co.com.pragma.utils.ScrollFlutterLargoDownto;
import co.com.pragma.utils.ScrollFlutterUp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.pragma.userinterface.InputsPage.*;

public class FillThe {
    public static Performable firstForm() {
        return Task.where("Ingresa Names y Label",
                Click.on(INPUT_NAMES1),
                SendKeys.of("Mafe").into(INPUT_NAMES),
                Click.on(LABEL),
                SendKeys.of("Label").into(LABEL));

    }

    public static Performable secondForm() {
        return Task.where("Ingresa Nombre, celular y contraseña correctos",
                FillNameandCellphone.secondFormCompleted(),
                FillNameandCellphone.secondFormPassword());

    }

    public static Performable secondFormIncomplete() {
        return Task.where("Ingresa celular incompleto",
                FillNameandCellphone.secondFormIncomplete(),
                FillNameandCellphone.secondFormPassword());

    }

    public static Performable secondFormWithoutName() {
        return Task.where("Ingresa celular incompleto",
                FillNameandCellphone.secondFormWithoutName(),
                FillNameandCellphone.secondFormPassword());

    }
}
