package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PaymentPage {
    public void chooseComboBox(String marker, String text){
        $(By.id(marker)).selectOption(text);
    }

    public void enterText(String marker, String text){
        $(By.id(marker)).setValue(text);
    }

    public void clickButton(String text){
        $(By.xpath("//button[text()='" + text + "']")).click();
    }
}
