package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

;

public class ProductPage {
	public WebDriver driver;
	

	public ProductPage(WebDriver driver) {
		this.driver = driver;

	}
	
	By addtoCart =By.xpath("//a[normalize-space()='Add to cart']");
	By mainTitleBar = By.className("main-title");
	
	public WebElement addToCart() {
		return driver.findElement(addtoCart);
		
	}
	public WebElement getMainTitleBar() {
		return driver.findElement(mainTitleBar);
		
	}
	public void search(String string) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(string);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		Thread.sleep(5000);
		
	}
	public void launch() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		
	}
	public void clickon(String name) throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")).click();
		
	}
	
	public void AddtoCart() throws InterruptedException {
	
			String currentWindow = driver.getWindowHandle();
			Set<String>  allWindows = driver.getWindowHandles();
			for(String window : allWindows) {
				if(!window.equals(currentWindow)) {
					
					driver.switchTo().window(window);
					
				}
				
			Thread.sleep(4000);
		
	driver.findElement(By.xpath("//*[@id=\"isCartBtn_btn\"]")).click();
	Thread.sleep(6000);	

		}
	}
	
	
}
