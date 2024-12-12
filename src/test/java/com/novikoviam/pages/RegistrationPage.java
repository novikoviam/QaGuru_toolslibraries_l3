package com.novikoviam.pages;

import com.codeborne.selenide.SelenideElement;
import com.novikoviam.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            calendarInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            userHobbies = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            userAddress = $("#currentAddress"),
            stateCityWrapper = $("#stateCity-wrapper"),
            setState = $("#state"),
            setCity = $("#city");
    /*
    submit = $("#submit"),
    modalContentElement = $(".modal-content"),
    exampleModalSizes = $("#example-modal-sizes-title-lg");*/


    CalendarComponent calendarComponent = new CalendarComponent();

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationPage setCurrentAddress(String value) {
        userAddress.setValue(value);

        return this;

    }

    public RegistrationPage setHobbiesWrapper(String value) {
        userHobbies.$("#hobbiesWrapper").$(byText("Sports")).click();

        return this;
    }

    public RegistrationPage setPicture() {
        uploadPicture.$("#uploadPicture").uploadFromClasspath("img/1.png");

        return this;
    }

    public RegistrationPage setSubject(String value){
        subjectsInput.$("#subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));

        return this;
    }

    public RegistrationPage setState(String state) {
        stateCityWrapper.$(byText("NCR")).click();
        setState.$("#state").setValue(state).pressEnter();

        return this;
    }

    public RegistrationPage setCity(String city) {
        stateCityWrapper.$(byText("Delhi")).click();
        setCity.$("#city").setValue(city);

        return this;
    }
}