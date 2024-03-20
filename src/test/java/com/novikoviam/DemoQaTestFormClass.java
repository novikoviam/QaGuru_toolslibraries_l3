package com.novikoviam;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static com.codeborne.selenide.Selenide.*;


public class DemoQaTestFormClass {

    @BeforeAll
    static void configure(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "2400x1980";

    }

    @Test
    void fillFormTest(){
        open("/text-box");
        $("#userName").setValue("Vladimir Novikov");
        $("#userEmail").setValue("nvv@ya.com");
        $("#currentAddress").setValue("Current address");
        $("#permanentAddress").setValue("Address number 2");
        $("#submit").click();

        $("#output #name").shouldHave(Condition.text("Vladimir Novikov"));
        $("#output #email").shouldHave(Condition.text("nvv@ya.com"));
        $("#output #currentAddress").shouldHave(Condition.text("Current address"));
        $("#output #permanentAddress").shouldHave(Condition.text("Address number 2"));
    }

}
