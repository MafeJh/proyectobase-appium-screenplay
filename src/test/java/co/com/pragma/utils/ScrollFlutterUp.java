package co.com.pragma.utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.Dimension;

public class ScrollFlutterUp implements Interaction {
    @Override
    @Step("Realiza scroll corto hacia arriba")
    public <T extends Actor> void performAs(T actor) {
        TouchAction action = new TouchAction(ThucydidesWebDriverSupport.getProxiedDriver());
        Dimension dimension = ThucydidesWebDriverSupport.getProxiedDriver().manage().window().getSize();
        int startX = dimension.width / 2;
        int startY = (int) (dimension.height * 0.5);
        int endY = (int) (dimension.height * 0.6);

        action.longPress(PointOption.point(startX, startY))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public static ScrollFlutterUp toUp() {
        return Tasks.instrumented(ScrollFlutterUp.class);
    }
}
