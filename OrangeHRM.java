package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
  @BeforeTest
  public void Setpu() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://opensource-demo.orangehrmlive.com");
  }
  
  @Test (priority=1)
	public void Hrm()  {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  @Test (priority=2)
 	public void employ() throws InterruptedException {
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
	  driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	  driver.findElement(By.name("firstName")).sendKeys("Manju");
	  driver.findElement(By.name("lastName")).sendKeys("k");
	  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Shreyas U\\Downloads\\images.jpg");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
}
  
  @Test (priority=2)
	public void leave() throws InterruptedException {
	  driver.findElement(By.xpath("//span[text()='Leave']")).click();
	  driver.findElement(By.xpath("//div[text()='Select']")).click();
	  driver.findElement(By.xpath("//a[text()='Assign Leave ']")).click();
}

}