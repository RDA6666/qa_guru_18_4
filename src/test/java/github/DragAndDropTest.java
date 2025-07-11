package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @Test
    public void dragAndDropTest () {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //$("#column-a").dragAndDrop(to("#column-b"));
        //$("#column-a").shouldHave(text("B"));
        //$("#column-b").shouldHave(text("A"));

        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();
        $("#column-a").shouldHave((text("B")));
        $("#column-b").shouldHave((text("A")));

    }
}
