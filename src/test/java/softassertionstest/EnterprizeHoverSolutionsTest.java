package softassertionstest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class EnterprizeHoverSolutionsTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy="eager";
    }

    @Test
    void HoverTest() {
        open("https://github.com/");
    $(".js-details-container").$(byText("Solutions")).hover();
    $(".header-menu-wrapper").$(byText("Enterprise")).click();
    $(".application-main ").shouldHave(text("Build like the best"));
    }
}