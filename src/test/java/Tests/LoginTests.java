package Tests;

import Utils.ReadData;
import org.testng.annotations.Test;

public class LoginTests extends base{

    @Test
    public void clickLoginButton() throws InterruptedException {
        //takesScreenshots.takesSnapShot(driver,"landing page");
        homePage.clickLoginButton();
    }

    @Test(priority = 1)
    public void enterUsernameTests(){
        loginPage.enterUsername(ReadData.username);
    }

    @Test(priority = 2)
    public void enterPassword(){
        loginPage.enterPassword(ReadData.password);
        //takesScreenshots.takesSnapShot(driver,"login page");
    }

    @Test(priority = 3)
    public void clickLoginSubmitButton() throws InterruptedException {
        loginPage.clickLoginSubmitButton();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 4)
    public void verifyLoginSuccess() throws InterruptedException {
        landingPage.verifyLoginSuccess();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 5)
    public void clickLearnBtn() throws InterruptedException {
        landingPage.clickLearnBtn();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 6)
    public void clickLearningMaterialBtn() throws InterruptedException {
        landingPage.clickLearningMaterialBtn();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 7)
    public void clickWebAutomationBtn() throws InterruptedException {
        learningMaterial.clickWebAutomationBtn();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 8)
    public void deviceTypeSelect() throws InterruptedException {
        inventoryForm.deviceType();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 9)
    public void selectBrand() throws InterruptedException {
        inventoryForm.selectBrand();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 10)
    public void storage1228Gb() throws InterruptedException {
        inventoryForm.storage128GB();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

//    @Test(priority = 11)
//    public void getUnitPrice1() throws InterruptedException {
//        inventoryForm.getUnitPrice1();
//        Thread.sleep(2000);
//        //takesScreenshots.takesSnapShot(driver,"dashboard page");
//    }

    @Test(priority = 11)
    public void selectColor() throws InterruptedException {
        inventoryForm.selectColor();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 12)
    public void enterQuantity() throws InterruptedException {
        inventoryForm.enterQuantity(2);
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 13)
    public void scrollTop() throws InterruptedException {
        inventoryForm.scrollToTop();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 14)
    public void enterAddress() throws InterruptedException {
        inventoryForm.enterAddress("123 Test Street");
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 15)
    public void nextBtn() throws InterruptedException {
        inventoryForm.nextBtn();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 16)
    public void enterShippingMethod() throws InterruptedException {
        inventoryForm.enterShippingMethod();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 17)
    public void enterWarranty() throws InterruptedException {
        inventoryForm.enterWarranty();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 18)
    public void enterDiscountCode() throws InterruptedException {
        inventoryForm.enterDiscountCode("SAVE10");
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 19)
    public void scrollTop2() throws InterruptedException {
        inventoryForm.scrollToTop2();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 20)
    public void clickApplyBtn() throws InterruptedException {
        inventoryForm.clickApplyBtn();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 21)
    public void scrollTop3() throws InterruptedException {
        inventoryForm.scrollToTop3();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 22)
    public void clickConfirmPurchase() throws InterruptedException {
        inventoryForm.confirmPurchaseBtn();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 23)
    public void clickViewInvoice() throws InterruptedException {
        inventoryForm.clickViewInvoice();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 24)
    public void clickViewInvoice2() throws InterruptedException {
        inventoryForm.clickViewInvoice2();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }

    @Test(priority = 25)
    public void scrollTop4() throws InterruptedException {
        inventoryForm.scrollToTop3();
        Thread.sleep(2000);
        //takesScreenshots.takesSnapShot(driver,"dashboard page");
    }
}
