package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class InventoryForm {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"storage-128GB\"]")
    WebElement storage128clk;

    @FindBy(id = "unit-price-label")
    WebElement unitPrice1;

    @FindBy(id = "quantity")
    WebElement enterQuantity;

    @FindBy(id = "address")
    WebElement addressInput;

    @FindBy(xpath = "//*[@id=\"inventory-next-btn\"]")
    WebElement nextBtn;

    @FindBy(id = "shipping-express")
    WebElement inputShipping;

    @FindBy(id = "warranty-1yr")
    WebElement inputWarranty;

    @FindBy(id = "discount-feedback")
    WebElement discFeedback;

    @FindBy(id = "discount-code")
    WebElement discountCode;

    @FindBy(xpath = "//*[@id=\"apply-discount-btn\"]")
    WebElement applyDiscBtn;

    @FindBy(xpath = "//*[@id=\"purchase-device-btn\"]")
    WebElement confirmPurchaseBtn;

    @FindBy(xpath = "//*[@id=\"view-history-btn\"]")
    WebElement viewInvoiceBtn;

    @FindBy(css = "button[id^='view-invoice-']")
    WebElement viewInvoiceBtn2;

    @FindBy(id = "unit-price-value")
    WebElement unitPriceValue;

    @FindBy(id = "subtotal-value")
    WebElement SubTotalPriceValue;


    public InventoryForm(WebDriver driver) {
        this.driver = driver;
    }

    public void deviceType() {
        WebElement deviceTypeDropdown =
                driver.findElement(By.id("deviceType"));

        Select deviceType = new Select(deviceTypeDropdown);

        deviceType.selectByVisibleText("Phone");
    }

    public void selectBrand() {
        WebElement brandDropdown =
                driver.findElement(By.id("brand"));

        Select deviceType = new Select(brandDropdown);

        deviceType.selectByVisibleText("Apple");
    }

    public void storage128GB() throws InterruptedException {

        storage128clk.click();
        Thread.sleep(2000);
    }

    public void validateUnitPrice(String expectedPrice) {

        String actualPrice = unitPriceValue.getText().trim();

        Assert.assertEquals(
                actualPrice,
                expectedPrice,
                "Unit price does not match."
        );
    }

    public void selectColor() {
        WebElement selectColorDropdown =
                driver.findElement(By.id("color"));

        Select deviceType = new Select(selectColorDropdown);

        deviceType.selectByVisibleText("Blue");
    }

    public void enterQuantity(int quantity) {
        enterQuantity.clear();
        enterQuantity.sendKeys(String.valueOf(quantity));
    }

    public void scrollToTop() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500);");
        Thread.sleep(2000);
    }

    public void validateSubTotal(String expectedSubTotal) {

        String actualPrice = SubTotalPriceValue.getText().trim();

        Assert.assertEquals(
                actualPrice,
                expectedSubTotal,
                "Sub Total does not match."
        );
    }

    public void enterAddress(String address) {
        addressInput.clear();
        addressInput.sendKeys(address);
    }

    public void nextBtn() throws InterruptedException {

        nextBtn.click();
        Thread.sleep(2000);
    }

    public void enterShippingMethod() throws InterruptedException {

        inputShipping.click();
        Thread.sleep(2000);
    }

    public void enterWarranty() throws InterruptedException {

        inputWarranty.click();
        Thread.sleep(2000);
    }

    public void enterDiscountCode(String code) {
        discountCode.clear();
        discountCode.sendKeys(code);
    }

    public void scrollToTop2() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500);");
        Thread.sleep(2000);
    }


    public void clickApplyBtn() throws InterruptedException {

        applyDiscBtn.click();
        Thread.sleep(2000);
    }

    public void verifyDiscountFeedback(String expectedText) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.textToBePresentInElement(
                discFeedback,
                expectedText
        ));

        Assert.assertEquals(
                discFeedback.getText().trim(),
                expectedText,
                "Discount feedback text does not match."
        );
    }

    public void scrollToTop3() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500);");
        Thread.sleep(2000);
    }

    public void confirmPurchaseBtn() throws InterruptedException {

        confirmPurchaseBtn.click();
        Thread.sleep(2000);
    }

    public void clickViewInvoice() throws InterruptedException {

        viewInvoiceBtn.click();
        Thread.sleep(2000);
    }

    public void clickViewInvoice2() throws InterruptedException {

        viewInvoiceBtn2.click();
        Thread.sleep(2000);
    }

    public void scrollToTop4() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 250);");
        Thread.sleep(2000);
    }
}
