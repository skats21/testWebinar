package testing;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstActivity {
	
	public static void main(String[] args) {
		
	
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
