package co.com.pragma.stepdefinitions;


import co.com.pragma.questions.ObtenerTextoSegunCampoFlutter;
import co.com.pragma.utils.ScrollFlutterUp;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.userinterface.ButtonsPage.BUTTON_APPROVE;
import static co.com.pragma.userinterface.ChipsPage.BUTTON_ACTION_CHIP;
import static co.com.pragma.userinterface.ChipsPage.NOTIFICATION_ACTION_CHIP;
import static co.com.pragma.userinterface.DataPickerPage.*;
import static co.com.pragma.userinterface.PrincipalPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;


public class MaterialFlutterAppStepDefinitions {

    @Dado("el usuario {word} ingresa a la opcion Buttons Demo")
    public void elUsuarioIngresaALaOpcionButtonsDemo(String actor) {
        theActorCalled(actor).attemptsTo(
                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CARD_BUTTONS_DEMO));
    }

    @Cuando("el usuario da click en el boton Approve")
    public void elUsuarioDaClickEnElBotonApprove() {
        theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_APPROVE));
    }

    @Entonces("el usuario deberia seguir viendo el boton habilitado")
    public void elUsuarioDeberiaSeguirViendoElBotonHabilitado() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(BUTTON_APPROVE).isDisplayed());
    }


    @Dado("el usuario {word} ingresa a la opcion Chips Widget")
    public void elUsuarioMafeIngresaALaOpcionChipsWidget(String actor) {
        theActorCalled(actor).attemptsTo(
                WaitUntil.the(CARD_CHIPS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CARD_CHIPS_DEMO));
    }

    @Cuando("el usuario da click en el boton ActionChip")
    public void elUsuarioDaClickEnElBotonActionChip() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(BUTTON_ACTION_CHIP, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BUTTON_ACTION_CHIP)
        );
    }

    @Entonces("el usuario debe ver la notificacion {string}")
    public void elUsuarioDebeVerLaNotificacion(String message) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(BUTTON_ACTION_CHIP)
        );
        theActorInTheSpotlight().should(
                seeThat("La cuenta actual", ObtenerTextoSegunCampoFlutter.presentaElMensaje(NOTIFICATION_ACTION_CHIP), equalTo(message)));
    }





    //-----------------------------------------------------DATA PICKER----------------------------------------------------------------------




    @Dado("el usuario {word} ingresa a la opcion DatePickerscreen")
    public void elUsuarioMafeIngresaALaOpcionDatePickerscreen(String actor) {
        theActorCalled(actor).attemptsTo(
                WaitUntil.the(CARD_DATEPICKER, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CARD_DATEPICKER));
    }

    @Cuando("el usuario selecciona la fecha 26 nov 2017")
    public void elUsuarioSeleccionaLaFechaNov() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SELECTOR_DATE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SELECTOR_DATE),//click en el selector para escribir fecha
                Click.on(SELECTOR_YEAR_CALENDAR), // click en el selector dentro del calendario que despliega los años
                ScrollFlutterUp.toUp(),
                Click.on(SELECTOR_YEAR_2017), // click en el año 1998
                Click.on(DAY_OF_2017), // 26 de marzo
                Click.on(OK_CALENDAR)

        );
    }

    @Cuando("el usuario selecciona las 12pm")
    public void elUsuarioSeleccionaLas12pm() {
        System.out.println("hora");
        System.out.println(SELECTOR_HOUR);
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SELECTOR_HOUR, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SELECTOR_HOUR),//click en el selector para escribir fecha
                Click.on(SELECTOR_KEYBOARD),
                Click.on(TYPE_HOUR),
                Enter.theValue("12").into(TYPE_HOUR),
                Click.on(TYPE_MINUTES),
                Enter.theValue("00").into(TYPE_MINUTES),
                Click.on(AM),
                Click.on(OK)
        );
    }

    @Cuando("el usuario escoge un rango entre marzo 26 al 28 y guarda")
    public void elUsuarioEscogeUnRangoEntreFebreroAlYGuarda() {
        System.out.println("rango");
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(FIRST_DATE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(FIRST_DATE),
                Click.on(SECOND_DATE),
                Click.on(SAVE)
        );
    }

    @Entonces("el usuario ve la pantalla de material desing")
    public void elUsuarioVeLaPantallaDeMaterialDesing() {
        System.out.println("Valida mensaje de la página prioncipal");
        theActorInTheSpotlight().should(
                seeThat("La página principal de la app", ObtenerTextoSegunCampoFlutter.presentaElMensaje(MESSAGE_FROM_MAIN_PAGE), equalTo("Show Case Material 2 vs 3 ")));
    }

}
