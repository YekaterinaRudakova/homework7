package com.it_academy.onliner.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public abstract class BasePage {
    public void waitAndHover(SelenideElement element) {
        element.shouldBe(Condition.enabled).hover();
    }
}
