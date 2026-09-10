package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"login-email\"]")
    WebElement usernametxt;

    @FindBy(xpath = "//*[@id=\"login-password\"]")
    WebElement passwordtxt;

    @FindBy(xpath = "//*[@id=\"login-submit\"]")
    WebElement loginsubmitBtn;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(usernametxt));
        usernametxt.sendKeys(username);
    }
    public void enterPassword(String password){
        passwordtxt.sendKeys(password);

    }

    public void clickLoginSubmitButton(){
        loginsubmitBtn.click();

    }

}
