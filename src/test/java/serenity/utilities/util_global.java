package serenity.utilities;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class util_global {

    public static Performable escribir(String texto, Target elemento) {
        esperar(elemento);
        return Enter.theValue(texto).into(elemento);
    }


    public static Performable clickEn(Target elemento) {
        esperar(elemento);
        return Click.on(elemento);
    }
    public static Performable esperar(Target elementos) {
        return Wait.until(
                WebElementQuestion.the(elementos), WebElementStateMatchers.isPresent()
        ).forNoMoreThan(30).seconds();
    }

}
