package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public void openURL(){
        open("https://buggy-testingcup.pgs-soft.com/");
    }
}