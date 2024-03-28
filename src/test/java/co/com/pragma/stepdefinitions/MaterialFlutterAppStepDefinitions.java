package co.com.pragma.stepdefinitions;


import co.com.pragma.interactions.*;
import co.com.pragma.questions.ObtenerTextoSegunCampoFlutter;
import co.com.pragma.tasks.FillThe;
import co.com.pragma.tasks.FillTheBookingForm;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.pragma.userinterface.ButtonsPage.BUTTON_APPROVE;
import static co.com.pragma.userinterface.ChipsPage.NOTIFICATION_ACTION_CHIP;
import static co.com.pragma.userinterface.DataPickerPage.MESSAGE_FROM_MAIN_PAGE;
import static co.com.pragma.userinterface.InputsPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class MaterialFlutterAppStepDefinitions {

    @Dado("el usuario {word} ingresa a la opcion Buttons Demo")
    public void elUsuarioIngresaALaOpcionButtonsDemo(String actor) {
        theActorCalled(actor).attemptsTo(
                GoToButtons.demo());
    }

    @Cuando("el usuario da click en el boton Approve")
    public void elUsuarioDaClickEnElBotonApprove() {
        theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_APPROVE));
    }

    @Entonces("el usuario deberia seguir viendo el boton habilitado")
    public void elUsuarioDeberiaSeguirViendoElBotonHabilitado() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(BUTTON_APPROVE).isDisplayed());
    }

    //-----------------------------------------------------Chips Widget----------------------------------------------------------------------

    @Dado("el usuario {word} ingresa a la opcion Chips Widget")
    public void elUsuarioMafeIngresaALaOpcionChipsWidget(String actor) {
        theActorCalled(actor).attemptsTo(
                GoToChips.widget());
    }

    @Cuando("el usuario da click en el boton ActionChip")
    public void elUsuarioDaClickEnElBotonActionChip() {
        theActorInTheSpotlight().attemptsTo(
                ClickOnThe.ActionChipButton());
    }

    @Entonces("el usuario debe ver la notificacion {string}")
    public void elUsuarioDebeVerLaNotificacion(String message) {
        theActorInTheSpotlight().attemptsTo(
                ClickOnThe.ActionChipButton());
        theActorInTheSpotlight().attemptsTo(
                ClickOnThe.ActionChipButton());
        theActorInTheSpotlight().should(
                seeThat("La cuenta actual", ObtenerTextoSegunCampoFlutter.presentaElMensaje(NOTIFICATION_ACTION_CHIP), equalTo(message)));
    }


    //-----------------------------------------------------DATA PICKER----------------------------------------------------------------------


    @Dado("el usuario {word} ingresa a la opcion DatePickerscreen")
    public void elUsuarioMafeIngresaALaOpcionDatePickerscreen(String actor) {
        theActorCalled(actor).attemptsTo(
                GoTo.datePicker());
    }

    @Cuando("el usuario selecciona la fecha 26 nov 2017")
    public void elUsuarioSeleccionaLaFechaNov() {
        theActorInTheSpotlight().attemptsTo(
                FillTheBookingForm.booking());
    }

    @Entonces("el usuario ve la pantalla de material desing {string}")
    public void el_usuario_ve_la_pantalla_de_material_desing(String message) {
        theActorInTheSpotlight().should(
                seeThat("La página principal de la app", ObtenerTextoSegunCampoFlutter.presentaElMensaje(MESSAGE_FROM_MAIN_PAGE), equalTo(message)));
    }


    //-----------------------------------------------------Text field 1----------------------------------------------------------------------


    @Dado("el usuario {word} ingresa a la opcion TextFieldWidget")
    public void elUsuarioMafeIngresaALaOpcionTextFieldWidget(String actor) {
        theActorCalled(actor).attemptsTo(
                GoToText.fieldWidget());
    }
    @Cuando("el usuario llena los dos campos")
    public void elUsuarioLlenaLosDosCampos() {

        theActorInTheSpotlight().attemptsTo(
                FillThe.firstForm());
    }


    @Entonces("el usuario valida la informacion y es correcta mostrando un chulo verde {string}")
    public void elUsuarioValidaLaInformacionYEsCorrectaMostrandoUnChuloVerde(String message) {
        theActorInTheSpotlight().attemptsTo(
                ValidateFirstForm.validateOne());
        theActorInTheSpotlight().attemptsTo(
                ValidateFirstForm.validateOne());
        theActorInTheSpotlight().attemptsTo(
                ValidateFirstForm.validateOne());
        theActorInTheSpotlight().attemptsTo(
                ValidateFirstForm.validateOne());
        theActorInTheSpotlight().should(
                seeThat("Input is valid", ObtenerTextoSegunCampoFlutter.presentaElMensaje(VALIDATE_MESSAGE_FIRST), equalTo(message)));

    }

    //-----------------------------------------------------Text field 2----------------------------------------------------------------------

    @Cuando("el usuario llena todos los campos con nombre {string} celular {string} y contrasena {string}")
    public void elUsuarioLlenaTodosLosCamposConNombreCelularYContrasena(String string, String string2, String string3) {
        theActorInTheSpotlight().attemptsTo(
                FillThe.secondForm());
    }
    @Entonces("el usuario valida la informacion y es correcta con la alerta {string}")
    public void elUsuarioValidaLaInformacionYEsCorrectaConLa(String message) {
        theActorInTheSpotlight().attemptsTo(
                ValidateFirstForm.validateTwo());
        theActorInTheSpotlight().should(
                seeThat("Form is valid", ObtenerTextoSegunCampoFlutter.presentaElMensaje(VALIDATE_MESSAGE_CORRECT_SECOND), equalTo(message)));
    }

    //-----------------------------------------------------Text field 3----------------------------------------------------------------------

    @Cuando("el usuario llena el campo celular {string}")
    public void elUsuarioLlenaElCampoCelular(String string) {

        theActorInTheSpotlight().attemptsTo(
                FillThe.secondFormIncomplete());
    }
    @Entonces("el usuario valida la informacion y sale el mensaje {string}")
    public void elUsuarioValidaLaInformacionYSaleElMensaje(String message) {

        theActorInTheSpotlight().attemptsTo(
                ValidateFirstForm.validateTwo());
        theActorInTheSpotlight().should(
                seeThat("Number incompleted", ObtenerTextoSegunCampoFlutter.presentaElMensaje(VALIDATE_MESSAGE_SECOND), equalTo(message)));
    }

    //-----------------------------------------------------Text field 4----------------------------------------------------------------------

    @Cuando("el usuario deja vacio el campo Nombre")
    public void elUsuarioDejaVacioElCampoNombre() {
        theActorInTheSpotlight().attemptsTo(
                FillThe.secondFormWithoutName());
        theActorInTheSpotlight().attemptsTo(
                ValidateFirstForm.validateName());
    }
    @Entonces("el usuario valida la informacion del nombre y sale el mensaje {string}")
    public void elUsuarioValidaLaInformacionDelNombreYSaleElMensaje(String message) {
        theActorInTheSpotlight().should(
                seeThat("El campo es necesario", ObtenerTextoSegunCampoFlutter.presentaElMensaje(VALIDATE_MESSAGE_SECOND_FOR_NAME), equalTo(message)));
    }


}
