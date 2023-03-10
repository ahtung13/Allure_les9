package com.denisantonov.allure;


import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LabelsTest {

    @Test
    @Feature("Issue в репозитории ")
    @Story("Создание Issue в репозитории")
    @Owner("eroshenkoam")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Testing",  url = "https://testing.github.com")
    @DisplayName("Cоздание Issue для авторизованного пользователя")
    public void testStaticLabels() {

    }

    @Test
    public void testDynamicLabels() {
        Allure.getLifecycle().updateTestCase(
                t -> t.setName("Cоздание Issue для авторизованного пользователя")
        );
        Allure.feature("Issue в репозитории ");
        Allure.story("Создание Issue в репозитории");
        Allure.label("Owner", "eroshenkoam" );
        Allure.label("Severity", SeverityLevel.CRITICAL.value());
        Allure.link("Testing", "https://testing.github.com");
    }
}
