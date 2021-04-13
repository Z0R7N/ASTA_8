package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.PaymentPage;

public class PaymentPageDef {
    PaymentPage paymentPage = new PaymentPage();

    @Then("Choose card")
    public void chooseCard() {
        paymentPage.chooseComboBox("task8_form_cardType", UserConfig.CARDTYPE);
    }

    @Then("Enter name and family")
    public void enterNameAndFamily() {
        paymentPage.enterText("task8_form_name", UserConfig.NAME + " " + UserConfig.FAMILY);
    }

    @Then("Enter card number")
    public void enterCardNumber() {
        paymentPage.enterText("task8_form_cardNumber", UserConfig.CARD_NUMBER);
    }

    @Then("Enter CVV number")
    public void enterCVVNumber() {
        paymentPage.enterText("task8_form_cardCvv", UserConfig.CVV_NUMBER);
    }

    @Then("Choose month {string}")
    public void chooseMonth(String arg0) {
        paymentPage.chooseComboBox("task8_form_cardInfo_month", arg0);
    }

    @Then("Choose year {string}")
    public void chooseYear(String arg0) {
        paymentPage.chooseComboBox("task8_form_cardInfo_year", arg0);
    }
}
