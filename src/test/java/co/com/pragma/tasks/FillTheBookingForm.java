package co.com.pragma.tasks;

import co.com.pragma.interactions.SelectCalendar;
import co.com.pragma.interactions.SelectClockFor;
import co.com.pragma.interactions.SelectJustFor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class FillTheBookingForm {
    public static Performable booking() {
        return Task.where("Selecciona el año, mes y día",
                SelectJustFor.day(),
                SelectClockFor.hour(),
                SelectCalendar.rangeOfDays());

    }
}
