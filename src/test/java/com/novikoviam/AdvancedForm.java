package com.novikoviam;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class AdvancedForm {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "2400x1980";

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
    }



    @Test
    void automationpractice() {
        open("/automation-practice-form");
        $("#firstName").setValue("Vladimir");
        $("#lastName").setValue("Novikov");
        $("#userEmail").setValue("ya@ya.com");
        $("#gender-userNumber-1").click();
        $("#userNumber").setValue("8999222111");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("September");
        $(".react-datepicker__year-select").selectOption("1999");
        $(".react-datepicker__day--009:not(.react-datepicker__day--outside-month)").click();




    }
        }



}
