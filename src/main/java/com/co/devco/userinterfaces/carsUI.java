package com.co.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class carsUI {

    public static Target CARS_SECTION = Target.the("Cars Section").locatedBy("//a[@data-decider-header='bookinggo']");

    public static Target LOCATION_INPUT = Target.the("Location input").located(By.id("ss_origin"));

    public static Target SELECT_VALUE = Target.the("Select Value Input").locatedBy("//li[@data-value='{0}']");

    public static Target DATE_INPUT = Target.the("Date input").locatedBy("//*[@id='frm']/div[2]/div[3]/div/div[2]/div/div/div/div[1]/div/button");

    public static Target DATE = Target.the("date").locatedBy("//*[@data-offset='{0}']//span[text()='{1}']");

    public static Target SELECT = Target.the("Select").locatedBy("/html/body/div[2]/div[2]/div/div[2]/div[5]/div[1]/section/div/div[1]/div[3]/div/button");

    public static Target SEARCH_BUTTON = Target.the("Search button").locatedBy("//*[@id='frm']/div[2]/div[4]/div[2]/button");

}
