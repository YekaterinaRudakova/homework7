Feature:
  As a user
  I want to know the description of goods under the sections of the header.

  Scenario:The Car flea market section should contain prices, towns, types of cars
    When The user hover a mouse over the section Car flea market
    Then The popup contains prices under the title Car flea market
    And The popup contains towns under the title Car flea market
      | Минск   |
      | Гомель  |
      | Могилев |
      | Витебск |
      | Гродно  |
      | Брест   |
    And The popup contains types of cars under the title Car flea market
      | Audi   |
      | BMW  |
      | Citroen |
      | Ford |
      | Mazda  |
      | Mercedes-Benz   |
      | Nissan  |
      | Opel |
      | Peugeot |
      | Renault |
      | Toyota |
      | Volkswagen  |

    Scenario: The Houses and apartments should contain towns, rooms, price rang
      When The user hover a mouse over the section Houses and apartments
      Then The popup contains towns under the title Houses and apartments
      And The popup contains rooms under the title Houses and apartments
      |1-комнатные|
      |2-комнатные|
      |3-комнатные|
      |4+-комнатные|
      And The popup contains price rang under the title Houses and apartments








