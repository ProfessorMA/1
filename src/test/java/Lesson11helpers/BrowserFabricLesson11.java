package Lesson11helpers;

import Lesson11Enum.BrowserTypeLesson11;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class BrowserFabricLesson11 {
    public static WebDriver getDriver(BrowserTypeLesson11 browserType){
        switch (browserType) {
            case FIREFOX -> {
                return getFirefoxDriver();
            }
//            case OPERA -> {
//                return getOperaDriver();
//            }
            case EDGE -> {
                return getEdgeDriver();
            }
            default -> {
                return getChromeDriver();
            }
        }
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }

    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

//    private static WebDriver getOperaDriver() {
//        WebDriverManager.operadriver().setup();
//        return new OperaDriver();
//    }

    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(options);
    }
}