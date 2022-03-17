package com.it_academy.onliner_tester.steps;

import com.it_academy.onliner.pages.HeaderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class HeaderSteps {
    HeaderPage headerPage = new HeaderPage();

    @When("The user hover a mouse over the section Car flea market")
    public void userHoverCarFleaMarketLink() {
        headerPage.hoverCarFleaMarketTitle();
    }

    @Then("The popup contains prices under the title Car flea market")
    public void popupContainsInformationAboutPrices() {
        System.out.println(headerPage.getListOfPricesUnderCarFleaMarketTitle());
        assertThat(headerPage.getListOfPricesUnderCarFleaMarketTitle().iterator())
                .as("Prices are not presented under the title Car flea market")
                .isNotNull()
                .hasNext();
    }

    @Then("The popup contains towns under the title Car flea market")
    public void popupContainsInformationAboutTowns(List<String> towns) {
        System.out.println(headerPage.getListOfTownsUnderCarFleaMarketTitle());
        assertThat(headerPage.getListOfTownsUnderCarFleaMarketTitle())
                .as("Towns are not the same")
                .hasSameElementsAs(towns);
    }

    @Then("The popup contains types of cars under the title Car flea market")
    public void popupContainsInformationAboutTypesOfCars(List<String> cars) {
        System.out.println(headerPage.getListOfTypesOfCarsUnderFleaMarketTitle());
        assertThat(headerPage.getListOfTypesOfCarsUnderFleaMarketTitle())
                .as("Types of cars are not the same")
                .hasSameElementsAs(cars);
    }

    @When("The user hover a mouse over the section Houses and apartments")
    public void userHoverHousesAndApartmentsLink() {
        headerPage.hoverHousesAndApartmentsTitle();
    }

    @Then("The popup contains towns under the title Houses and apartments")
    public void popupContainsInformationAboutTownsUnderTitleHousesAndApartments() {
        System.out.println(headerPage.getListOfTownsUnderHousesAndApartmentsTitle());
        assertThat(headerPage.getListOfTownsUnderHousesAndApartmentsTitle().iterator())
                .as("Towns are not presented under the title Houses and apartments ")
                .isNotNull()
                .hasNext();
    }

    @Then("The popup contains rooms under the title Houses and apartments")
    public void popupContainsInformationAboutRoomsUnderTitleHousesAndApartments(List<String> rooms) {
        System.out.println(headerPage.getListOfRoomsUnderHouseAndApartmentsTitle());
        assertThat(headerPage.getListOfRoomsUnderHouseAndApartmentsTitle())
                .as("Rooms are not the same")
                .hasSameElementsAs(rooms);
    }

    @Then("The popup contains price rang under the title Houses and apartments")
    public void popupContainsInformationAboutPricesUnderTitleHousesAndApartments() {
        System.out.println(headerPage.getPriceRateUnderHouseAndApartmentsTitle());
        assertThat(headerPage.getPriceRateUnderHouseAndApartmentsTitle())
                .as("Prices do not contain $")
                .allMatch(element -> element.contains("$"));
    }
}
