package com.mobile.automation;

import com.github.wasiqb.coteafs.appium.android.AndroidActivity;
import com.github.wasiqb.coteafs.appium.android.AndroidDevice;
import com.github.wasiqb.coteafs.appium.config.enums.AutomationType;
import com.github.wasiqb.coteafs.appium.config.enums.WaitStrategy;
import com.github.wasiqb.coteafs.appium.device.DeviceElement;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginActivity extends AndroidActivity {

    public LoginActivity(final AndroidDevice device) {
        super(device);
    }

    @Override
    protected DeviceElement prepare() {
        final DeviceElement main = DeviceElement.create("Main")
                .waitStrategy(WaitStrategy.VISIBLE)
                .forAndroid(By.id("android:id/content"));
        DeviceElement.create("Back")
                .parent(main)
                .forAndroid(By.xpath("//android.widget.TextView[@text=\"Back\"]"))
                .forAndroid(AutomationType.UIAUTOMATOR2, MobileBy.AndroidUIAutomator("new UiSelector ().text (\"Back\");"));
        DeviceElement.create("UserName")
                .forAndroid(MobileBy.AccessibilityId("username"))
                .parent(main);
        DeviceElement.create("Password")
                .forAndroid(MobileBy.AccessibilityId("password"))
                .parent(main);
        DeviceElement.create("Login")
                .forAndroid(MobileBy.AccessibilityId("login"))
                .parent(main);
        return main;
    }
}
