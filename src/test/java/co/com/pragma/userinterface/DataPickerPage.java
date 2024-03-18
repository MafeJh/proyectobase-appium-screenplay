package co.com.pragma.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPickerPage {
    public static final Target SELECTOR_DATE = Target.the("Select the date - Open the calendar")
            .located(new By.ByXPath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]"));

    public static final Target SELECTOR_YEAR_CALENDAR = Target.the("Displays the list of years")
            .located(AppiumBy.accessibilityId("Select year"));

    public static final Target SELECTOR_YEAR_2017 = Target.the("Select the 2017 year")
            .located(AppiumBy.accessibilityId("2017"));

    public static final Target DAY_OF_2017 = Target.the("15, Wednesday, March 15, 2017")
            .located(AppiumBy.accessibilityId("15, Wednesday, March 15, 2017"));

    public static final Target OK_CALENDAR = Target.the("OK to close the calendar")
            .located(AppiumBy.accessibilityId("OK"));

    public static final Target SELECTOR_HOUR = Target.the("Select the hour")
            .located(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]"));

    public static final Target SELECTOR_KEYBOARD = Target.the("Select the KEYBOARD")
            .located(AppiumBy.xpath("//android.view.View[@content-desc=\"SELECT TIME\"]/android.widget.Button[1]"));


    public static final Target TYPE_HOUR = Target.the("Displays the HOUR")
            .located(AppiumBy.xpath("//android.widget.EditText[1]"));

    public static final Target TYPE_MINUTES = Target.the("Displays the minutes")
            .located(AppiumBy.xpath("//android.widget.EditText[2]"));

    public static final Target AM = Target.the("AM")
            .located(AppiumBy.accessibilityId("AM"));
    public static final Target OK = Target.the("OK")
            .located(AppiumBy.accessibilityId("OK"));

//    public static final Target FIRST_DATE = Target.the("Book the first day")
//            .located(AppiumBy.accessibilityId("Start date 26, Tuesday, March 26, 2024"));

    public static final Target FIRST_DATE= Target.the("Book the first day")
            .located(AppiumBy.xpath("//android.view.View[@content-desc=\"26, Tuesday, March 26, 2024\"]"));

    public static final Target SECOND_DATE = Target.the("Book the last day")
            .located(AppiumBy.xpath("//android.view.View[@content-desc=\"28, Thursday, March 28, 2024\"]"));

    public static final Target SAVE = Target.the("Save the information")
            .located(AppiumBy.accessibilityId("SAVE"));

    public static final Target MESSAGE_FROM_MAIN_PAGE = Target.the("Text from the main page")
            .located(AppiumBy.accessibilityId("Show Case Material 2 vs 3 "));
}
