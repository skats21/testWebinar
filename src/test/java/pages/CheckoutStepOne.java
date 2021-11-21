package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutStepOne {
	
	WebDriver driver = null;
	
	public CheckoutStepOne(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void verifyChekoutStepOnePage() {
		
		String verifyCheckout = "CHECKOUT: YOUR INFORMATION";
		WebElement checkoutPage = driver.findElement(By.className("title"));
		Assertions.assertEquals(verifyCheckout, checkoutPage.getText());
	
	}
	
	public void typePersonalInfo() {
		
		driver.findElement(By.name("firstName")).sendKeys("Sakis");
		driver.findElement(By.name("lastName")).sendKeys("Katsioulis");
		driver.findElement(By.name("postalCode")).sendKeys("15233");
		
	}
	
	public void clickContinueButton() {
		
		driver.findElement(By.name("continue")).click();
		
		
	}

}
