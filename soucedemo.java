package project;

import java.awt.event.KeyEvent;
import java.time.Duration;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class soucedemo {
	public static void main(String[] args) throws InterruptedException {
		/*sets the path for chromedriver.exe*/
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				/* opens chrome browser */
				WebDriver driver = new ChromeDriver();
				 /*maximizes the window*/
				driver.manage().window().maximize();
				/* fetches the webpage and waits util the page is loaded */
				driver.get("https://www.saucedemo.com/");
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				
				driver.findElement(By.name("login-button")).click();
				Thread.sleep(3000);
			
				
				driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
				
				driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[text()='shopping-cart-badge']")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.className("shopping_cart_badge")).click();
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cart_item")));
				System.out.println("Cart page is loaded.");

				String productName = driver.findElement(By.className("inventory_item_name")).getText();
				System.out.println("Product in cart: " + productName);
		        System.out.println("Cart page is loaded.");
		      
				

	}

}
