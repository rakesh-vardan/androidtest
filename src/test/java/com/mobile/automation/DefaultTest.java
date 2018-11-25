package com.mobile.automation;

import com.github.wasiqb.coteafs.appium.android.AndroidDevice;
import com.github.wasiqb.coteafs.appium.service.AppiumServer;
import org.testng.annotations.*;

public class DefaultTest {

    protected AndroidDevice androidDevice;
    private AppiumServer androidServer;

    @BeforeMethod
    public void setupMethod() {
        this.androidDevice.startRecording();
    }

    @Parameters({"server", "device"})
    @BeforeTest
    public void setupTest(final String server, final String device) {
        this.androidServer = new AppiumServer(server);
        this.androidServer.start();

        this.androidDevice = new AndroidDevice(this.androidServer, device);
        this.androidDevice.start();
    }

    @AfterMethod
    public void teardownMethod() {
        this.androidDevice.stopRecording();
    }

    @AfterTest
    public void tearDownTest() {
        this.androidDevice.stop();
        this.androidServer.stop();
    }
}
