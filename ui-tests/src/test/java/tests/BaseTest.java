package tests;

import configuration.WebDriverManager;
import enums.URLs;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void setUp() {
        WebDriverManager.openBrowser(URLs.URLFORTEST.getUrl());

    }
    @AfterAll
    static void tearDown() {
        WebDriverManager.closeBrowser();
    }
}
