package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class SoftAssertionsSearch {

    @Test
    void checkIfJnit5IsThere() {
        //  Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
       
        // - Перейдите в раздел Wiki проекта
        //
        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        //
        // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

    }
}
