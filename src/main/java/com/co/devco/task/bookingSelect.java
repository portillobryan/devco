package com.co.devco.task;

import com.co.devco.interactions.SwitchToNewWindow;
import com.co.devco.interactions.WaitFor;
import com.co.devco.models.accommodationsModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.devco.userinterfaces.accommodationUI.*;

public class bookingSelect implements Task {
    accommodationsModel listaccommodationsModel;

    public bookingSelect(accommodationsModel listaccommodationsModel) {
        this.listaccommodationsModel = listaccommodationsModel;
    }

    public static bookingSelect select(accommodationsModel listaccommodationsModel){
        return Tasks.instrumented(bookingSelect.class, listaccommodationsModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(SELECT_ACCOMMODATION.of(listaccommodationsModel.getHotel())));
        actor.attemptsTo(SwitchToNewWindow.change());
        actor.attemptsTo(Scroll.to(SCROLL_INPUT));
        actor.attemptsTo(Click.on(SELECT_ROOM));
        actor.attemptsTo(Click.on(ROOM.of(listaccommodationsModel.getRoom())));
        actor.attemptsTo(WaitFor.seconds(1));
        actor.attemptsTo(Click.on(BOOKING_BUTTON));
        actor.attemptsTo(WaitFor.seconds(2));
        if(CHECKBOX_PUBLICIDAD.resolveFor(actor).isVisible()){
            actor.attemptsTo(Click.on(CHECKBOX_PUBLICIDAD));
            actor.attemptsTo(Click.on(CLOSE_PUBLICIDAD));
        }
        actor.attemptsTo(Scroll.to(NAME_INPUT));
        actor.attemptsTo(Enter.theValue(listaccommodationsModel.getName()).into(NAME_INPUT));
        actor.attemptsTo(Enter.theValue(listaccommodationsModel.getLastname()).into(LASTNAME_INPUT));
        actor.attemptsTo(Enter.theValue(listaccommodationsModel.getEmail()).into(EMAIL_INPUT));
        actor.attemptsTo(Enter.theValue(listaccommodationsModel.getEmail()).into(CONFIRMEMAIL_INPUT));
        actor.attemptsTo(WaitFor.seconds(3));

    }
}
