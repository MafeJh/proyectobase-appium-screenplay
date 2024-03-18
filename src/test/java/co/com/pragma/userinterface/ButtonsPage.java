package co.com.pragma.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ButtonsPage {

    public static final Target BUTTON_APPROVE = Target.the("Button Approve")
            .located(AppiumBy.accessibilityId("Approve"));

}
