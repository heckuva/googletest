package org.selenide.examples;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import com.codeborne.selenide.commands.Click;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.System.setProperty;

public class AddingToCart {
    @Test
    public void userCanAddThingsToCart() throws InterruptedException {
        setProperty("webdriver.chrome.driver", "C:/chromeDriver/chromedriver.exe");
        setProperty("selenide.browser", "Chrome");
        open("https://infomir2.ru/programmirovanie-na-java-dlya-testirovshhikov/");
        $("a.btn-action-single.item-single__cart.btn-action-single--cart").click();
        $("a.main-header__cart-link").shouldHave(Condition.text("1"));
        $("a.main-header__cart-link").hover().waitUntil(Condition.disappears, 4000);

    }
    }

