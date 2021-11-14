package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class addToCardandCheckout {
	
	WebDriver driver = null;
	
	@BeforeAll
	public void setupApp() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@Test
	@Order(1)
	public void logiInToApp() {
		
		System.out.println("***Test Starts***");
		System.out.println();
		WebElement passWord = driver.findElement(By.id("password"));  			/*find locator of password field*/
		WebElement userName = driver.findElement(By.id("user-name")); 			/*find locator of user name field*/
		WebElement logInButton = driver.findElement(By.name("login-button")); 	/*find locator of log in button*/
		userName.sendKeys("standard_user");                           			/*enter user name */
		passWord.sendKeys("secret_sauce"); 							 			/*enter password */
		logInButton.click();										  			/* click on log in button*/
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
			if (expectedTitle.equals(actualTitle)) {						/*check that you are successfully loggedIn*/
				System.out.println("*** Successfully Log In ***");
				System.out.println();
			}
			else {
				System.out.println("log In failed");
				System.out.println();
			}
	}
	
	@Test
	@Order(2)
	public void addThirdProductToCart() {
		
		WebElement thirdProduct = driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt"));	/*find locator of third product*/
		thirdProduct.click();
		System.out.println("*** Third product added successfully ***");
		System.out.println();
	}
	
	@Test
	@Order(3)
	public void clickCheckout() {
		
		WebElement cartLink = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));	/*find locator of checkout button*/
		cartLink.click();
		
		/* Assert that page YOUR CART has been lunched */
		
		WebElement yourCart = driver.findElement(By.className("title"));
		String cartTitle = "YOUR CART";
		Assertions.assertEquals(cartTitle, yourCart.getText());
		WebElement checkOut = driver.findElement(By.id("checkout"));	/* find locator of checkout button */
		checkOut.click();
		
		/* Assert that page "CHECKOUT" has been lunched */ 
		
		String verifyCheckout = "CHECKOUT: YOUR INFORMATION";
		WebElement checkoutPage = driver.findElement(By.className("title"));
		Assertions.assertEquals(verifyCheckout, checkoutPage.getText());
		
		
	}
	@Test
	@Order(4)
	public void typePersonalInfo() {
		
		WebElement firstName = driver.findElement(By.name("firstName"));	/*find locator of first name*/
		firstName.sendKeys("Sakis");										/*text first name*/
		WebElement lastName = driver.findElement(By.name("lastName"));		/*find locator of last name*/
		lastName.sendKeys("Katsioulis");									/*text last name*/
		WebElement postalCode = driver.findElement(By.name("postalCode"));	/*find locator of postal code*/
		postalCode.sendKeys("15233");
		WebElement continueButton = driver.findElement(By.name("continue")); /*find locator of 'continue' button*/
		continueButton.click();
		
		/* Assert that page finish has been lunched */ 
		
		System.out.println("*** Checkout has been made successfully ***");
		System.out.println();
	}
	@Test
	@Order(5)
	public void verifyTextMessage() {
		
		WebElement finishButton = driver.findElement(By.id("finish"));
		finishButton.click();
		
		/* Assert that message "THANK YOU FOR ORDER" is displayed */
		
		WebElement textMessage = driver.findElement(By.className("complete-header"));
		String expectedMessage = "THANK YOU FOR YOUR ORDER";
		Assertions.assertEquals(expectedMessage, textMessage.getText());
		
    }
	@AfterAll
	public void closeDriver() {
		
	driver.close();		/* close browser */
	System.out.println("***Test Passed***");
	
	}
	
}
	
