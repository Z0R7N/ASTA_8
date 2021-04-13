package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {
    public void clickLink(String text){
        $(By.xpath("//h2[text()='" + text + "']/..")).click();
    }
}
