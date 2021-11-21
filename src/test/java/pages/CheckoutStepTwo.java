package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwo {
	
	WebDriver  driver = null;
	
	public CheckoutStepTwo(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickOnFinishButton() {
		
		driver.findElement(By.id("finish")).click();
	}

}
