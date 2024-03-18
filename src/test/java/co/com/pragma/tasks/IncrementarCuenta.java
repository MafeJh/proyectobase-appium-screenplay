package co.com.pragma.tasks;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.userinterface.ContadorPage.BOTON_CONTADOR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class IncrementarCuenta { // Define la clase IncrementarCuenta

    public static Performable numVeces(int times) { // Define el método estático numVeces que devuelve un objeto Performable con un parámetro times de tipo int
        return Interaction.where("Click en el contador", // Retorna un log o etiqueta para ubicarnos facil en la ejecución de la prueba
                actor -> { // Define un lambda que toma un actor como parámetro y ejecuta acciones sobre él
                   actor.attemptsTo(WaitUntil.the(BOTON_CONTADOR, isEnabled()).forNoMoreThan(5).seconds()); // Espera hasta que el elemento BOTON_CONTADOR esté habilitado durante un máximo de 5 segundos
                    for (int i = 0; i < times; i++) { // Bucle for que se ejecuta el número de veces especificado por times
                        actor.attemptsTo(Click.on(BOTON_CONTADOR)); // El actor realiza clic en el BOTON_CONTADOR
                    }
                }
        );
    }
}

