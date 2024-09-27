package tests;

import org.junit.jupiter.api.Test;
import pages.CheckboxesPage;

public class CheckboxesTest extends BaseTest{

    CheckboxesPage checkboxesPage = new CheckboxesPage();

    @Test
    public void testCheckboxes() {

        checkboxesPage.checkFirstCheckbox();
        checkboxesPage.uncheckSecondCheckbox();

        System.out.println("Checkbox 1 checked: " + checkboxesPage.isFirstCheckboxChecked());
        System.out.println("Checkbox 2 checked: " + checkboxesPage.isSecondCheckboxChecked());
    }

}
