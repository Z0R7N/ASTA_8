package steps;

import io.cucumber.java.en.Then;
import pages.BasePage;

public class BasePageDef {
    BasePage basePage = new BasePage();

    @Then("Click link {string}")
    public void clickLink(String arg0) {
        basePage.clickLink(arg0);
    }

    @Then("Click button {string}")
    public void clickButton(String arg0) {
        basePage.clickButton(arg0);
    }

    @Then("Check content {string}")
    public void checkContent(String arg0) {
        basePage.checkContent(arg0);
    }
}
