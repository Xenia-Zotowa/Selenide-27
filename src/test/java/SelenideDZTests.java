import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class SelenideDZTests {
    @Test
    void andreiSolntsevShouldBeTheFirstContributor() {
        //открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        //Открыть раздел Wiki проекта
        $("#wiki-tab").click();
        //Найти  в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(".filterable-active").shouldHave(text("SoftAssertions"));
        //Проверить что внутри стриницы SoftAssertions есть пример кода для JUnit5
        $$(".Truncate").findBy(Condition.visible).shouldHave(text("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("JUnit5"));


    }


}
