package com.mobile.automation;

import org.testng.annotations.Test;

public class VodQATest extends DefaultTest {

    @Test
    public void testLogin() {
        final LoginActivityAction login = new LoginActivityAction(this.androidDevice);
        login.addInputValue("UserName", "admin")
                .addInputValue("Password", "admin")
                .perform();
    }
}
