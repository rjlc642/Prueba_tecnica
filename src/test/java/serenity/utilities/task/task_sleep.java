package serenity.utilities.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class task_sleep implements Task {
    public static int segundos;
    public task_sleep(int segundos){this.segundos =segundos;}
    public static task_sleep porSegundos(int segundos){return new task_sleep(segundos);}
    @Override
    public <T extends Actor>void performAs(T actor){
        try{
            Thread.sleep(segundos*1000);
        }catch (InterruptedException fallo){
            fallo.printStackTrace();
        }
    }
}
