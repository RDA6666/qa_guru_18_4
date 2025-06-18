package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class Homework extends TestBase {

    @Test
       void theHoverTest() {
        open(baseUrl);
        $(byTagAndText("button","Solutions")).hover();
        $(byTagAndText("a", "Enterprise")).click();
        webdriver().shouldHave(url("https://github.com/enterprise"));
    }
}