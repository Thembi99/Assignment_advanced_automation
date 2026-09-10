package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.latest.page.Page;
import org.openqa.selenium.support.PageFactory;

public class base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.launchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/#overview");

    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    //public TakesScreenshots takesScreenshots = new TakesScreenshots();
    public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    public LearningMaterial learningMaterial = PageFactory.initElements(driver,LearningMaterial.class);
    public InventoryForm inventoryForm = PageFactory.initElements(driver,InventoryForm.class);

    ReadData readData;

    {
        try {
            readData = new ReadData();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
