Feature: Payment by Card

  Scenario: Payment by card
    Then Click link "Zadanie 8"
    Then Choose card
    Then Enter name and family
    Then Enter card number
    Then Enter CVV number
    Then Choose month "March"
    Then Choose year "2028"
    Then Click button "Zapłać"
    Then Check content "Zamówienie opłacone"