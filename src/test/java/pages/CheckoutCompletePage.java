package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class CheckoutCompletePage {
	
	WebDriver driver = null;
	
	public CheckoutCompletePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void verifyTextMessageForYourOrder() {
		
		WebElement textMessage = driver.findElement(By.className("complete-header"));
		String expectedMessage = "THANK YOU FOR YOUR ORDER";
		Assertions.assertEquals(expectedMessage, textMessage.getText());
		System.out.println("*** Your order has been made successfully ***");
		System.out.println();
		System.out.println("***Test Passed***");
	}
	

}
