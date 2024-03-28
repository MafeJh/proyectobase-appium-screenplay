package co.com.pragma.interactions;

import co.com.pragma.utils.ScrollFlutterLargoDownto;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.pragma.userinterface.InputsPage.*;

public class FillNameandCellphone {
    public static Performable secondFormCompleted() {
        return Task.where("Ingresa nombre y celular incompleto",
                Click.on(CLICK_NOMBRE),
                SendKeys.of("Mafe").into(INPUT_NOMBRE),
                Click.on(AFUERA),
                Click.on(CLICK_CELULAR),
                SendKeys.of("3197079603").into(INPUT_CELULAR));

    }
    public static Performable secondFormIncomplete() {
        return Task.where("Ingresa nombre y celular incompleto",
                Click.on(CLICK_NOMBRE),
                SendKeys.of("Mafe").into(INPUT_NOMBRE),
                Click.on(AFUERA),
                Click.on(CLICK_CELULAR),
                SendKeys.of("3").into(INPUT_CELULAR));

    }

    public static Performable secondFormWithoutName() {
        return Task.where("Ingresa nombre y celular incompleto",
                Click.on(CLICK_NOMBRE),
                SendKeys.of("").into(INPUT_NOMBRE),
                Click.on(AFUERA),
                Click.on(CLICK_CELULAR),
                SendKeys.of("3197079603").into(INPUT_CELULAR));

    }


    public static Performable secondFormPassword() {
        return Task.where("Ingresa constraseña",
                ScrollFlutterLargoDownto.password(),
                Click.on(AFUERA2),
                Click.on(CLICK_CONTRASENA),
                SendKeys.of("123").into(INPUT_CONSTRASENA),
                Click.on(SECOND_VALIDAR_BUTTON));

    }
}
