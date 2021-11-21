package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

	WebDriver driver = null;
	
	public LogInPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void typeUserName() {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");		
	}
	
	public void typePassWord() {
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
		
	}
	
	public void clickLoginButton() {
		
		driver.findElement(By.name("login-button")).click();; 
		
	}
	
	public void verifyLogIn() {
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
}
