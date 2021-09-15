package ua.hillel.pageObjectsSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DynamicControlsPage {
    private final SelenideElement checkbox = $("input[type ='checkbox']");
    private final SelenideElement removeCheckboxButton = $("#checkbox-example > button");
    private final SelenideElement inputButton = $("#input-example > button");
    private final SelenideElement inputText = $("input[type=text]");

    public void setCheckbox() {
        checkbox.should(Condition.appear).shouldBe(Condition.visible).click();
    }

    public void addOrRemoveCheckbox(boolean remove) {
        removeCheckboxButton.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
        if (remove) {
            checkbox.should(Condition.disappear);
        } else {
            checkbox.should(Condition.appear);
        }
    }

    public void enableOrDisabledButton(boolean visible) {
        if (visible) {
            inputButton.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
            inputText.should(Condition.enabled).setValue("text");
        } else {
            inputButton.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
            inputText.should(Condition.disabled);
        }
    }
}