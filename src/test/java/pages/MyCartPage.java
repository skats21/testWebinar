package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCartPage {
	
	WebDriver  driver = null;
	
	public MyCartPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void verifyMyCartPage() {
		
		WebElement yourCart = driver.findElement(By.className("title"));
		String cartTitle = "YOUR CART";
		Assertions.assertEquals(cartTitle, yourCart.getText());
		System.out.println("*** Third product added successfully ***");
		System.out.println();
	}
	
	public void clickCheckoutButton() {
		
		driver.findElement(By.id("checkout")).click();
			
	}
}
