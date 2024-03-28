package co.com.pragma.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InputsPage {

    public static final Target CARD_INPUTS = Target.the("The card for get into the Inputs Screen page")
            .located(AppiumBy.accessibilityId("Inputs Screen "));
    public static final Target INPUT_NAMES1 = Target.the("Names for first part of the form")
            .located(new By.ByXPath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
    public static final Target INPUT_NAMES = Target.the("Names for first part of the form")
            .located(new By.ByXPath("//android.widget.ScrollView/android.widget.EditText[2]"));


    public static final Target LABEL = Target.the("Label for first part of the form")
            .located(new By.ByXPath("//android.widget.ScrollView/android.widget.EditText[2]"));

    public static final Target FIRST_VALIDAR_BUTTON = Target.the("Validar button for first part of the form")
            .located(new By.ByXPath("(//android.widget.Button[@content-desc=\"validar\"])[1]"));

    public static final Target VALIDATE_MESSAGE_FIRST = Target.the("The message when the input is valid")
            .located(AppiumBy.accessibilityId("Input is valid"));


    public static final Target CLICK_NOMBRE = Target.the("Names for first part of the form")
            .located(new By.ByXPath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]"));

    public static final Target INPUT_NOMBRE = Target.the("Nombre for first part of the form")
            .located(new By.ByXPath("//android.widget.ScrollView/android.widget.EditText[3]"));

    public static final Target AFUERA = Target.the("Click por fuera")
            .located(AppiumBy.accessibilityId("TextField Widget"));
    public static final Target CLICK_CELULAR= Target.the("Cel for first part of the form")
            .located(new By.ByXPath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[4]"));
    public static final Target AFUERA2 = Target.the("Click por fuera")
            .located(AppiumBy.accessibilityId("Show Case Material "));
    public static final Target INPUT_CELULAR = Target.the("Cel for first part of the form")
            .located(new By.ByXPath("//android.widget.ScrollView/android.widget.EditText[4]"));

    public static final Target CLICK_CONTRASENA = Target.the("Contraseña for first part of the form")
            .located(new By.ByXPath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[5]"));


    public static final Target INPUT_CONSTRASENA = Target.the("Contraseña for first part of the form")
            .located(new By.ByXPath("//android.widget.ScrollView/android.widget.EditText[4]"));

    public static final Target SECOND_VALIDAR_BUTTON = Target.the("Contraseña for second part of the form")
            .located(new By.ByXPath("(//android.widget.Button[@content-desc=\"validar\"])[2]"));

    public static final Target VALIDATE_MESSAGE_CORRECT_SECOND = Target.the("El formulario es válido")
            .located(AppiumBy.accessibilityId("Form is valid"));

    public static final Target VALIDATE_MESSAGE_SECOND = Target.the("The message when the input is incompleted")
            .located(AppiumBy.accessibilityId("Numero incompleto"));

    public static final Target SECOND_VALIDAR_BUTTON_NAME = Target.the("The name field is necessary")
            .located(AppiumBy.accessibilityId("El campo es necesario"));

    public static final Target VALIDATE_MESSAGE_SECOND_FOR_NAME = Target.the("The message when the input is incompleted")
            .located(AppiumBy.accessibilityId("El campo es necesario"));



}
