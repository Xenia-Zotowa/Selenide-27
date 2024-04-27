

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideGitTests {

    @Test
    void shouldFindSelenideRepositoryAtTheTop(){
        //открыть главную страницу
        open("https://github.com/");
        // ввести в поле поиска selenide и нажать enter
        $(".search-input-container").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        //кликнуть на первый репозиторий из списка найденных
        $$("[data-testid=results-list] div").first().$("a").click();
        //проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));


    }
}
