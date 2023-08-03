package dragAndDropTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy="eager";
    }

    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //SelenideElement a = $("#column-a");
        //SelenideElement b = $("#column-b");
        //actions().clickAndHold(a).moveToElement(b).release().perform();

        SelenideElement a = $("#column-a").shouldHave(text("a"));
        SelenideElement b = $("#column-b").shouldHave(text("b"));

        a.dragAndDropTo(b);

        $("#column-a").shouldHave(text("b"));
        $("#column-b").shouldHave(text("a"));


        sleep(3000);
    }
    }