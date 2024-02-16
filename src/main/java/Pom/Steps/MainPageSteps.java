package Pom.Steps;

import Pom.Pages.MainPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.testng.Assert;
import io.restassured.response.Response;

public class MainPageSteps {
    MainPage mainPage = new MainPage();
    Response response;

    @Step("Get First Trending Location's Name")
    public String getFirstTrendingLocationName(){
        return mainPage.firstTrendingLocationName.getText();
    }

    @Step("Click On The First Trending Location")
    public MainPageSteps clickOnFirstTrendingLocation(){
        mainPage.firstTrendingLocation.click();
        return this;
    }


}
