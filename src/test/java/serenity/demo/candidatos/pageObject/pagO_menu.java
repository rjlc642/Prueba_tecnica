package serenity.demo.candidatos.pageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class pagO_menu {
    public  static final Target btn_agregarcandidato = Target.the("boton agregar candidato").located(By.xpath("//*[@class='orangehrm-paper-container']/div/button"));
    public  static final Target inp_primernombre= Target.the("nombre").located(By.xpath("//input[@name='firstName']"));
    public  static final Target inp_apellido= Target.the("nombre").located(By.xpath("//input[@name='lastName']"));
    public  static final Target inp_segundonombre= Target.the("nombre").located(By.xpath("//input[@name='middleName']"));
    public  static final Target inp_correoe= Target.the("correo").located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));
    public  static final Target inp_contactnumber= Target.the("numero de contacto").located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input"));
    public  static final Target inp_notas= Target.the("notas").located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea"));
    //fecha
    public  static final Target inp_aplicacionfecha= Target.the("fecha de aplicacion").located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/input"));
    public  static final Target inp_abrirfecha= Target.the("fecha de aplicacion").located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/i"));
    public  static final Target inp_doc= Target.the("fecha de aplicacion").located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div/i"));
    public static final Target BTN_UPLOAD= Target.the("Elemento para cargar el elemento").located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/input"));
    public static final Target list_vacanci = Target.the("lista vacante").located(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']//*[@class='oxd-select-text oxd-select-text--active']"));
    public static final Target Check_consentimiento = Target.the("check consentimiento").located(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
 //   public static final String submitprueba= System.getProperty("user.dir") + "./src/test/resources/data/Prueba.txt";
    public static final String submitprueba= System.getProperty("user.dir") + "./src/test/resources/data/demo.pdf";

    public  static final Target btn_Save = Target.the("opción menu Recruitment").located(By.xpath("//*[text()=' Save ']"));
    public  static final Target header_resultado = Target.the("resumen de diligenciamiento empleado").located(By.xpath("//*[text()='Application Stage']"));

}
