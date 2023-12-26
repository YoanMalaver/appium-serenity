package stepsDefinitions;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.example.task.SumaEnteros;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class Hooks {

    public static AppiumDriver appiumDriver;

     public static void main(String[] args) throws MalformedURLException {
         openApp();
    }
    public static void  openApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:deviceName", "vivoY53s");
        cap.setCapability("appium:udid", "343363503GS"); // cambias el numero
        cap.setCapability("platformName", "Android");
        cap.setCapability("appium:platformVersion", "13");
        cap.setCapability("appium:appPackage", "com.vivo.calculator");
        cap.setCapability("appium:appActivity", "com.vivo.calculator.Calculator");
        appiumDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
        AppDriver.setDriver(appiumDriver);
        System.out.println("AndroidDriver is set");

        System.out.println("Application Started");
    }



}
