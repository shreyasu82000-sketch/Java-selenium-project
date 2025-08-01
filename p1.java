package project;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) throws InterruptedException {
		/*sets the path for chromedriver.exe*/
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				/* opens chrome browser */
				WebDriver driver = new ChromeDriver();
				 /*maximizes the window*/
				driver.manage().window().maximize();
				/* fetches the webpage and waits util the page is loaded */
				driver.get("https:/www.flipkart.com");
				WebElement searchBox=driver.findElement(By.name("q"));
				searchBox.sendKeys("Apple iPhone 15 Pro Max");
				searchBox.submit();
				
				Set<String> mainPage = driver.getWindowHandles();
				System.out.println("Main page="+ mainPage);
				
				driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 Pro Max (Blue Titanium, 256 GB)']")).click();
				
				Set<String> allPages=driver.getWindowHandles();
				for(String page : allPages) {
					if(!page.equals(mainPage)) {
						driver.switchTo().window(page);
						break;
					}
				}
				System.out.println(driver.getCurrentUrl());
				List<WebElement> products= driver.findElements(By.className("_21Ahn-"));
				System.out.println(products.size());
				for(WebElement product: products) {
					System.out.println(product.getText());
				}
				driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
			}
	}


