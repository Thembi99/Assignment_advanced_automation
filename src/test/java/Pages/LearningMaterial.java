package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearningMaterial {

    WebDriver driver;

    public LearningMaterial(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"tab-btn-web\"]")
    WebElement webAutomationclk;

    public void clickWebAutomationBtn() {
        webAutomationclk.click();
    }

}
