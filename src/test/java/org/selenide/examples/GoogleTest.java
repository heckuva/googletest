package org.selenide.examples;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.System.setProperty;

public class GoogleTest {
    @Test
    public void userCanKeywordWIthGoogle() {
        setProperty("webdriver.chrome.driver", "C:/chromeDriver/chromedriver.exe");
        setProperty("selenide.browser", "Chrome");
        open("http://google.com");
        $(By.name("q")).setValue("selenide browser").pressEnter();

        $$("#.g").shouldHave(CollectionCondition.size(10));
        //$("#rcnt").shouldHave(Condition.text("ЧАВО - Selenide"));
    }
}
