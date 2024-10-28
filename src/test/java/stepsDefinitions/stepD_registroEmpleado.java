package stepsDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.By;
import serenity.demo.candidatos.task.task_nuevoCandidato;
import serenity.demo.login.task.task_login;
import serenity.demo.menu.task.task_seleccionMenu;
import serenity.utilities.task.task_sleep;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static serenity.demo.candidatos.pageObject.pagO_menu.inp_doc;

public class stepD_registroEmpleado {


    @Given("^Iniciar Test")
    public void IniciarTest() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Ronald");
        theActorInTheSpotlight().attemptsTo(Open.url("https://opensource-demo.orangehrmlive.com"));
    }
    @And("^login (.*) (.*)")
    public void login(String usuario,String claves) {
        theActorInTheSpotlight().attemptsTo(task_login.iniciarSesionEmpleado(usuario,claves));


    }
    @And("^seleccionar Recruitment")
    public void seleccionarRecruitment() {
        theActorInTheSpotlight().attemptsTo(task_seleccionMenu.seleccionarRecruitment());
      //  theActorInTheSpotlight().attemptsTo(task_sleep.porSegundos(5));

    }
    @When("^agregar Candidato (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)")
    public void agregarCandidato(String nombre,String segundoNombre,String apellido,String correo,String contactNumber,String notas,String aplicacionFecha,String vacanci) {
        theActorInTheSpotlight().attemptsTo(task_nuevoCandidato.task_nuevoCandidato(nombre,segundoNombre,apellido,correo,contactNumber,notas,aplicacionFecha,vacanci) );
           theActorInTheSpotlight().attemptsTo(task_sleep.porSegundos(5));

    }


}
