package com.mobile.automation;

import com.github.wasiqb.coteafs.appium.android.AndroidActivityActions;
import com.github.wasiqb.coteafs.appium.android.AndroidDevice;

public class LoginActivityAction extends AndroidActivityActions {

    public LoginActivityAction(final AndroidDevice device) {
        super(device);
    }

    @Override
    public void perform() {
        final LoginActivity login = new LoginActivity(getDevice());
        login.onElement("UserName")
                .enterText(value("UserName"));
        login.onElement("Password")
                .enterText(value("Password"));
        login.onDevice()
                .hideKeyboard();
        login.onElement("Login")
                .tap();
    }
}
