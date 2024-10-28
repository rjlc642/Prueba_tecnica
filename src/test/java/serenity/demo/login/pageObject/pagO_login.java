package serenity.demo.login.pageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class pagO_login {
    public  static final Target inp_usuario = Target.the("usuario").located(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
    public  static final Target inp_clave = Target.the("clave").located(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
    public  static final Target btn_Login = Target.the("boton login").located(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

}
