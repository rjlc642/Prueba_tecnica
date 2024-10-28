package serenity.demo.menu.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import serenity.utilities.util_global;

import static serenity.demo.login.pageObject.pagO_login.*;
import static serenity.demo.menu.pageObject.pagO_menu.span_Recruitment;

public class task_seleccionMenu extends util_global {
    public static Performable seleccionarRecruitment(){
        return Task.where("seleccionar opción menu Recruitment",
                  util_global.clickEn(span_Recruitment)

        );
    }
}
