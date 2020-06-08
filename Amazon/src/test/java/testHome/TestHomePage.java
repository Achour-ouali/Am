package testHome;

import Home.BaseClass;
import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Home.BaseClass.*;

public class TestHomePage extends WebAPI {
    public static HomePage homePage;
    public static BaseClass baseClass;

    public static void init(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        baseClass = PageFactory.initElements(driver,BaseClass.class);
    }



@Test
 public void searchField() throws InterruptedException {
 init();
 baseClass.loginToAmazonAccount();
 baseClass.searchBox.sendKeys("t shirt");
 baseClass.searchButton.click();

 }

}
