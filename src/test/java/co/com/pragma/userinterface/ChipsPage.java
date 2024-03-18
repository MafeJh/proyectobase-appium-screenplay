package co.com.pragma.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ChipsPage {



    public static final Target BUTTON_ACTION_CHIP = Target.the("Action chip button")
            .located(AppiumBy.accessibilityId("ActionChip"));

    public static final Target NOTIFICATION_ACTION_CHIP = Target.the("Action chip notification")
            .located(AppiumBy.accessibilityId("ActionChip Message Acttion!"));


    public static final Target CARD_DATEPICKER = Target.the("DatePicker screeen card")
            .located(AppiumBy.accessibilityId("DatePicker screeen"));
}
