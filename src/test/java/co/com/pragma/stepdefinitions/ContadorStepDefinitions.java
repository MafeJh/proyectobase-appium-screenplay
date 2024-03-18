package co.com.pragma.stepdefinitions;

import co.com.pragma.questions.ObtenerTextoSegunCampoFlutter;
import co.com.pragma.tasks.IncrementarCuenta;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.userinterface.ContadorPage.VALOR_CONTADOR;
import static co.com.pragma.userinterface.PrincipalPage.CARD_BUTTONS_DEMO;
import static co.com.pragma.userinterface.PrincipalPage.CARD_CONTADOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;


public class ContadorStepDefinitions { // Define la clase ContadorStepDefinitions
    @Before // Anotación que indica que el método debajo de ella se ejecutará antes de cada escenario de prueba
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    } // Define el método prepareStage
    // Configura el escenario de prueba

    @Dado("el usuario {word} esta en App Contador") // Anotación que identifica el método como un paso de Given con un parámetro
    public void elUsuarioEstaEnAppContador(String actor) { // Define el método elUsuarioEstaEnAppContador con un parámetro actor de tipo String
       theActorCalled(actor).attemptsTo( // Llama al actor especificado y realiza una serie de acciones
                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(), // Espera hasta que el elemento CARD_BUTTONS_DEMO sea visible durante un máximo de 5 segundos
                Click.on(CARD_CONTADOR)// Realiza clic en el elemento CARD_CONTADOR
        );
    }

    @Cuando("el usuario incrementa la cuenta {int} veces") // Anotación que identifica el método como un paso de When con un parámetro de tipo int
    public void elUsuarioIncrementaLaCuentaVez(int times) { // Define el método elUsuarioIncrementaLaCuentaVez con un parámetro times de tipo int
        theActorInTheSpotlight().attemptsTo(IncrementarCuenta.numVeces(times)); // El actor realiza la tarea de incrementar la cuenta el número de veces especificado
    }

    @Entonces("el usuario deberia ver la cuenta en {int}") // Anotación que identifica el método como un paso de Then con un parámetro de tipo int
    public void elUsuarioDeberiaVerLaCuentaEn(int times) { // Define el método elUsuarioDeberiaVerLaCuentaEn con un parámetro times de tipo int
        theActorInTheSpotlight().should( // El actor en primer plano debería realizar la siguiente validación
                seeThat("La cuenta actual", ObtenerTextoSegunCampoFlutter.presentaElMensaje(VALOR_CONTADOR),equalTo(Integer.toString(times))) // Verifica que el texto obtenido según el campo Flutter coincida con el número de veces especificado
        );
    }
}
