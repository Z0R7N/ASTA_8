package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {
    public void clickLink(String text){
        $(By.xpath("//h2[text()='" + text + "']/..")).click();
    }

    public void checkContent(String text){
        $(By.xpath("//*[text()[contains(.,'" + text + "')]]")).shouldBe(Condition.visible);
    }

    public void clickButton(String text){
        $(By.xpath("//button[text()='" + text + "']")).click();
    }
}
