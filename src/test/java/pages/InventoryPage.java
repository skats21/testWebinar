package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class InventoryPage {
	
	WebDriver driver = null;
	
	public InventoryPage(WebDriver driver) {
		
		this.driver = driver;
		
		}
	
	public  void addThirdProduct() {
		
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		
		}
	
	public  void clickCartLink() {
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		
		}
}