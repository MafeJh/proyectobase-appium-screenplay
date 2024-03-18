package co.com.pragma.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ObtenerTextoSegunCampoFlutter implements Question<String> { // Define la clase ObtenerTextoSegunCampoFlutter y la hace implementar la interfaz Question<String>

    private Target campo; // Declara una variable de instancia llamada campo de tipo Target

    public ObtenerTextoSegunCampoFlutter(Target campo) { // Define un constructor que toma un parámetro campo de tipo Target
        this.campo = campo;// Asigna el valor del parámetro campo a la variable de instancia campo
    }

    @Override
    @Step("verifica el mensaje de error en el campo")
    public String answeredBy(Actor actor) { // Define el método answeredBy que toma un parámetro actor de tipo Actor y devuelve un String
        String elTexto = ""; // Declara una variable local llamada elTexto de tipo String e inicializa su valor como una cadena vacía
        //actor.attemptsTo(WaitUntil.the(campo, isVisible()).forNoMoreThan(5).seconds()); // El actor espera hasta que el campo especificado sea visible durante un máximo de 5 segundos
        elTexto = campo.resolveFor(actor).getAttribute("content-desc"); // Obtiene el atributo "content-desc" del campo y lo asigna a la variable elTexto
        return elTexto; // Retorna el valor de elTexto
    }
    public static ObtenerTextoSegunCampoFlutter presentaElMensaje(Target campo) { // Define un método estático llamado presentaElMensaje que toma un parámetro campo de tipo Target y devuelve un objeto de tipo ObtenerTextoSegunCampoFlutter
        return new ObtenerTextoSegunCampoFlutter(campo); // Retorna una nueva instancia de ObtenerTextoSegunCampoFlutter con el campo especificado
    }

}
