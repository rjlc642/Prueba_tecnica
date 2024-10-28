package serenity.demo.candidatos.task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import serenity.utilities.util_global;

import java.nio.file.Path;

import static serenity.demo.candidatos.pageObject.pagO_menu.*;

public class task_nuevoCandidato extends util_global {
    public static Performable task_nuevoCandidato(String nombre,String segundoNombre,String apellido,String correo,String contactnumber,String notas,String aplicacionFecha,String vacanci){
        return Task.where("agregar nuevo candidato",
                  util_global.clickEn(btn_agregarcandidato),

                util_global.escribir(nombre,inp_primernombre),
                task_vacanci(vacanci),
                util_global.escribir(apellido,inp_apellido),
                util_global.escribir(segundoNombre,inp_segundonombre),
                util_global.escribir(correo,inp_correoe),
                util_global.escribir(contactnumber,inp_contactnumber),
                util_global.escribir(notas,inp_notas),
                util_global.clickEn(Check_consentimiento),
                Upload.theFile(Path.of(submitprueba)).to(BTN_UPLOAD),
                util_global.clickEn(btn_Save),
                util_global.esperar(header_resultado)

        );


    }
    public static Performable task_vacanci(String vacanci){
        Target list_vacanciOption = null;
        switch (vacanci) {
            case "Junior_Account_Assistant":
                list_vacanciOption= Target.the("opción lista vacvanci 'Junior Account Assistant'").located(By.xpath("//*[text()='Junior Account Assistant']"));
                break;
            case "Payroll_Administrator":
                list_vacanciOption= Target.the("opción lista vacvanci 'Payroll Administrator'").located(By.xpath("//*[text()='Payroll Administrator']"));

                // secuencia de sentencias.
                break;
            case "Sales_Representative" :
                list_vacanciOption= Target.the("opción lista vacvanci 'Junior Account Assistant'").located(By.xpath("//*[text()='Sales Representative']"));
                break;
            case "Senior_QA_Lead" :
                list_vacanciOption= Target.the("opción lista vacvanci 'Senior QA Lead'").located(By.xpath("//*[text()='Senior QA Lead']"));
                break;

        }
        return Task.where("seleccionar vacanti",
                util_global.clickEn(list_vacanci),
                util_global.clickEn(list_vacanciOption)
        );
    }
}
