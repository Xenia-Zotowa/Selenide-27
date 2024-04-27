import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContribotorToSelenide {

    @Test
    void andreiSolntsevShouldBeTheFirstContributor(){
        //открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        //подвести мышку к первому автору из блока contributors
        $("div.BorderGrid.about-margin").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$$("ul li").first().hover();
        //проверка: во всплыващем окне есть текст Andrei Solntsev
        $$(".Popover").findBy(Condition.visible).shouldHave(text("Andrei Solntsev"));


    }
}
