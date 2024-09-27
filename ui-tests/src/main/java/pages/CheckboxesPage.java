package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;


public class CheckboxesPage {

    private final SelenideElement checkbox1 = $$("//input[@type='checkbox'][1]").get(0);
    private final SelenideElement checkbox2 = $$("//input[@type='checkbox'][2]").get(1);

    public void checkFirstCheckbox() {
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }
    }

    public void uncheckSecondCheckbox() {
        if (checkbox2.isSelected()) {
            checkbox2.click();
        }
    }

    public boolean isFirstCheckboxChecked() {
        return checkbox1.isSelected();
    }

    public boolean isSecondCheckboxChecked() {
        return checkbox2.isSelected();
    }
}

