package com.horacioss.automationtest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Login Button").locatedBy("#login2");
    public static final Target USERNAME_INPUT = Target.the("Username Input").locatedBy("#loginusername");
    public static final Target PASSWORD_INPUT = Target.the("Password Input").locatedBy("#loginpassword");
    public static final Target SUBMIT_BUTTON = Target.the("Submit Login Button").locatedBy("#logInModal > div > div > div.modal-footer > button.btn.btn-primary");
    public static final Target USER_NAME_LABEL = Target.the("The user name Button").locatedBy("#nameofuser");
}
