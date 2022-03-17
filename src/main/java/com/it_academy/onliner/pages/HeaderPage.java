package com.it_academy.onliner.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderPage extends BasePage {
    private static SelenideElement CAR_FLEA_MARKET_TITLE = $x("//*[contains(@class, 'b-main-navigation__text') " +
            "and contains(text(), 'Автобарахолка')]");
    private static SelenideElement HOUSES_AND_APARTMENTS_TITLE = $x("//*[contains(@class, 'b-main-navigation__text') " +
            "and contains(text(), 'Дома и квартиры')]");
    private ElementsCollection HEADER_ELEMENTS = $$x("//*[contains(@class, " +
            "'b-main-navigation__dropdown-advert-sign')]");

    public void hoverCarFleaMarketTitle() {
        waitAndHover(CAR_FLEA_MARKET_TITLE);
    }

    private List<String> getElementsFromHeader() {
        List<String> elements = new ArrayList<>();
        HEADER_ELEMENTS.stream().map(SelenideElement::getOwnText).forEach(elements::add);
        return elements;
    }

    public List<String> getListOfPricesUnderCarFleaMarketTitle() {
        return getElementsFromHeader().stream().skip(3).limit(3).toList();
    }

    public List<String> getListOfTownsUnderCarFleaMarketTitle() {
        return getElementsFromHeader().stream().skip(6).limit(6).toList();
    }

    public List<String> getListOfTypesOfCarsUnderFleaMarketTitle() {
        return getElementsFromHeader().stream().skip(12).limit(12).toList();
    }

    public void hoverHousesAndApartmentsTitle() {
        waitAndHover(HOUSES_AND_APARTMENTS_TITLE);
    }

    public List<String> getListOfTownsUnderHousesAndApartmentsTitle() {
        return getElementsFromHeader().stream().skip(36).limit(6).toList();
    }

    public List<String> getListOfRoomsUnderHouseAndApartmentsTitle() {
        return getElementsFromHeader().stream().skip(42).limit(4).toList();
    }

    public List<String> getPriceRateUnderHouseAndApartmentsTitle() {
        return getElementsFromHeader().stream().skip(46).limit(3).toList();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
