package configuration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;


public class WebDriverManager {

    static {
        Configuration.browser = "chrome";
        Configuration.browserPosition = "0x0";
        Configuration.browserVersion = "129.0";
        Configuration.timeout = 20 * 1000;
        Configuration.pageLoadTimeout = 30 * 1000;
        Configuration.browserSize = "1900x1080";

    }
    public static void openBrowser(String url) {
        Selenide.open(url);
    }

    public static void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
