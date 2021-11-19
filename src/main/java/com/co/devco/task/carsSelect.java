package com.co.devco.task;

import com.co.devco.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.devco.userinterfaces.carsUI.SELECT;

public class carsSelect implements Task {
    public static carsSelect select(){
        return Tasks.instrumented(carsSelect.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(SELECT));
        actor.attemptsTo(SwitchToNewWindow.change());

    }
}
