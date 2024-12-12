package com.novikoviam.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestBase {
    @BeforeAll
    static void configure() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "2400x1980";
        Configuration.timeout = 10000;

        //executeJavaScript("$('footer').remove()");
        //executeJavaScript("$('#fixedban').remove()");
    }
}
