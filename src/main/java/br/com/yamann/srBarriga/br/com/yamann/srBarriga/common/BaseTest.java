package br.com.yamann.srBarriga.br.com.yamann.srBarriga.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {
 protected WebDriver driver;
 protected WebDriver wait;

    public WebDriver inicializaWebDriver(){

        System.setProperty("webdriver.chrome.driver","chromedriver");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        driver.manage().window().fullscreen();
        wait = new WebDriverWait(driver,15);

        return driver = new ChromeDriver(options);

    }
    public void fechaWb(){



    }
}
