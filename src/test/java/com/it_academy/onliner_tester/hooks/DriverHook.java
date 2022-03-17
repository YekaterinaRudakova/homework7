package com.it_academy.onliner_tester.hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class DriverHook {
    private static String BASE_URL = "https://www.onliner.by/";

    private static void setUp() {
        Configuration.headless = false;
        Configuration.screenshots = false;
        Configuration.timeout = 5000;
        Configuration.browserSize = "1536x960";
    }

    @Before
    public static void init() {
        setUp();
        open(BASE_URL);
    }

    @After
    public static void tearDown() {
        closeWebDriver();
    }
}
