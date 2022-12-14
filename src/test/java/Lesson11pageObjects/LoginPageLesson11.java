package Lesson11pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageLesson11 extends BasePageLesson11 {
    public LoginPageLesson11(WebDriver driver) {
        super(driver);
    }
    private WebElement getEmailField(){
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        return driver.findElement(emailBy);
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("button"));
    }
    private WebElement getErrorFrame(){
        By errorBy = By.className("error");
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
        return driver.findElement(errorBy);
    }
    public MainPageLesson11 loginToAppLesson11(String username, String password){
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPageLesson11(driver);
    }

    public void open(String url) {
        driver.get(url);
    }

    public boolean isErrorFrame() {
        try {
            return getErrorFrame().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }
}