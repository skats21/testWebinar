package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LogInPage;
import pages.CheckoutCompletePage;
import pages.CheckoutStepOne;
import pages.CheckoutStepTwo;
import pages.InventoryPage;
import pages.MyCartPage;

public class addToCartandCheckout {
	
	public static WebDriver driver = null;
	
	@Test
	public void addThirdProductandCheckout() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		LogInPage logInToeShop = new LogInPage(driver);
		InventoryPage addThirdProductToCart = new InventoryPage(driver);
		MyCartPage clickCheckout = new MyCartPage(driver);
		CheckoutStepOne checkoutStepOnePage = new CheckoutStepOne(driver);
		CheckoutStepTwo checkoutStepTwoPage = new CheckoutStepTwo(driver);
		CheckoutCompletePage checkYouOrderFinished = new CheckoutCompletePage(driver);
		
		logInToeShop.typeUserName();
		logInToeShop.typePassWord();
		logInToeShop.clickLoginButton();
		logInToeShop.verifyLogIn();
		addThirdProductToCart.addThirdProduct();
		addThirdProductToCart.clickCartLink();
		clickCheckout.verifyMyCartPage();
		clickCheckout.clickCheckoutButton();
		checkoutStepOnePage.verifyChekoutStepOnePage();
		checkoutStepOnePage.typePersonalInfo();
		checkoutStepOnePage.clickContinueButton();
		checkoutStepTwoPage.clickOnFinishButton();
		checkYouOrderFinished.verifyTextMessageForYourOrder();
		driver.close();
		driver.quit();
		
	}

}
