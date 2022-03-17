package com.it_academy.onliner_tester.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class ScreenshotHook {
    @After
    public void takeScreenshot(Scenario scenario) {
        /** if (scenario.isFailed()) {
         try {
         File screenshot = Screenshots.takeScreenShotAsFile();
         assert screenshot != null;
         InputStream targetStream = new FileInputStream(screenshot);
         Allure.addAttachment("Screenshot on fail", "image/png", targetStream, "png");
         } catch (Exception ex) {
         System.out.println(ex.getMessage());
         }
         }
         */
    }
}