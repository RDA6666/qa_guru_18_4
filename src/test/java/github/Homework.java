package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class Homework extends TestBase {

    @Test
       void theHoverTest() {
        // На главной странице GitHub выберите: Меню -> Solutions -> Enterprize (с помощью команды hover для Solutions)
        open(baseUrl);
        $(byTagAndText("button", "Solutions")).hover();

    }
}