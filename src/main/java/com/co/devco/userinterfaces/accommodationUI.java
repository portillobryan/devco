package com.co.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class accommodationUI {

    public static Target UBICATION_INPUT = Target.the("Ubication Input").located(By.id("ss"));

    public static Target UBICATIONSELECT_INPUT = Target.the("Ubication Select Input").locatedBy("//*[contains(@data-label,'{0}')]");

    public static Target DATE_INPUT = Target.the("Date Input").locatedBy("//*[contains(@data-date,'{0}')]");

    public static Target SEARCH_BUTTON = Target.the("Search Button").locatedBy("//*[@id='frm']/div[1]/div[4]/div[2]/button");

    public static Target SELECT_ACCOMMODATION = Target.the("Select Acommodation").locatedBy("//h3//*[contains(@href,'{0}')]");

    public static Target SCROLL_INPUT = Target.the("Scroll Input").located(By.id("availability_target"));

    public static Target SELECT_ROOM = Target.the("Select Room").locatedBy("//*[@id='hprt-table']/tbody/tr[1]/td[5]/div[1]/select");

    public static Target ROOM = Target.the("Room").locatedBy("//*[@id='hprt-table']/tbody/tr[1]/td[5]/div[1]/select/option[@value='{0}']");

    public static Target BOOKING_BUTTON = Target.the("Booking Button").locatedBy("//*[@id='hprt-form']/div[10]/div[2]/div[2]/div[6]");

    public static Target CHECKBOX_PUBLICIDAD = Target.the("Checkbox").located(By.id("rlu_persistent_dismissal"));

    public static Target CLOSE_PUBLICIDAD = Target.the("Close").locatedBy("//*[@id='retain-leaving-users__modal']/div/div/footer/div/div[1]/button");

    public static Target NAME_INPUT = Target.the("Name input").located(By.id("firstname"));

    public static Target LASTNAME_INPUT = Target.the("Lastnmae input").located(By.id("lastname"));

    public static Target EMAIL_INPUT = Target.the("Email input").located(By.id("email"));

    public static Target CONFIRMEMAIL_INPUT = Target.the("Confirm Email").located(By.id("email_confirm"));

    public static Target MESSAGE = Target.the("Message").locatedBy("//*[contains(text(),'Breakfast included in the price')]");
}
