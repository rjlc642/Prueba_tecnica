package serenity.demo.login.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import serenity.utilities.util_global;

import static serenity.demo.login.pageObject.pagO_login.*;

public class task_login extends util_global {
    public static Performable iniciarSesionEmpleado(String usuario, String clave){
        return Task.where("iniciarSesion",
                  util_global.clickEn(inp_usuario),
                util_global.escribir(usuario, inp_usuario),
                util_global.clickEn(inp_clave),
                util_global.escribir(clave, inp_clave),
                util_global.clickEn(btn_Login)
        );
    }
}
