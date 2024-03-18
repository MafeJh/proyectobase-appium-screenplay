package co.com.pragma.tasks.example;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;


public class Checkout{

    public static Performable checkout() {
        return Task.where(
//                Click.on(BTN_OPEN_SHOP_CART),
//                Click.on(BTN_CHECKOUT),
//                Enter.theValue("KEdyn").into(TXT_NAME),
//                Enter.theValue("Molina").into(TXT_LAST_NAME),
//                SendKeys.of("050005").into(TXT_POST_CODE),
//                Click.on(BTN_CONTINUE),
//                Click.on(BTN_FINISH)
        );
    }
}
