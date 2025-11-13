package Intenship;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

    public class cts_res {
	WebDriver driver;
	
  @Test
  public void setup() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://restaurant.clicktosearch.in");
		
  }
  
  @Test (priority=1)
	public void Cts_login() throws InterruptedException {
		driver.findElement(By.id("mat-input-0")).sendKeys("9738353529");
		driver.findElement(By.id("mat-input-1")).sendKeys("admin@92");
		driver.findElement(By.xpath("//button[contains(text(),login)]")).click();
}  
  @Test (priority=2)
	public void product_details() throws InterruptedException {
		driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
		driver.findElement(By.id("mat-expansion-panel-header-1")).click();
}
  
  @Test (priority=3)
	public void Manage_Products() throws InterruptedException { 
		driver.findElement(By.className("mat-list-item-content")).click();
		driver.findElement(By.id("mat-expansion-panel-header-1")).click();
}
  
  @Test(priority = 4)
	public void ManageProducts() throws InterruptedException {
	    driver.findElement(By.id("mat-input-4")).sendKeys("Hall");
	    driver.findElement(By.id("mat-input-5")).sendKeys("Fruit Juice");
	    driver.findElement(By.id("mat-select-2")).sendKeys("Veg");
	    driver.findElement(By.id("mat-input-6")).sendKeys("Kitchen");
	    driver.findElement(By.id("mat-input-8")).sendKeys("MJ");
	    driver.findElement(By.id("mat-input-9")).sendKeys("120");
	    driver.findElement(By.id("mat-select-4")).sendKeys("JuiceCounter");
	    Actions actions  = new Actions(driver);
	    actions.scrollByAmount(0, 500).perform();
	    driver.findElement(By.xpath("//input[@type='file']"))
	          .sendKeys( "C:\\Users\\Shreyas U\\Downloads\\download (1).jpeg");
	    driver.findElement(By.xpath("//span[text()='Add']")).click();
	    actions.scrollByAmount(0, -1500).perform();
}
  
  @Test(priority = 5)
  public void kot() throws InterruptedException {
	    driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
		driver.findElement(By.id("mat-expansion-panel-header-2")).click();
}
  
  @Test (priority=6)
	public void Manage_kot() throws InterruptedException { 
	  driver.findElement(By.xpath("//div[text()=' Manage KOT ']")).click();
  }
  
  @Test (priority=7)
	public void Manage_kot1() throws InterruptedException, AWTException { 
	  driver.findElement(By.xpath("(//h1[text()='A12'])[1]")).click();
	  driver.findElement(By.xpath("(//img[@class='productimagealign'])[4]")).click();
	  driver.findElement(By.xpath("(//img[@class='cursorpointer'])[1]")).click();
	  driver.findElement(By.xpath("//img[@class='imagealign cursorpointer']")).click();
	  driver.findElement(By.xpath("//span[text()='Add']")).click();
	  driver.findElement(By.id("mat-input-14")).sendKeys("8105184992");
	  driver.findElement(By.id("mat-input-15")).sendKeys("Manju.k");
	  driver.findElement(By.xpath("//span[text()='Print KOT']")).click();
	  Thread.sleep(4000);
	  Robot robot = new Robot();
      robot.keyPress(KeyEvent.VK_ESCAPE);
      robot.keyRelease(KeyEvent.VK_ESCAPE);
      driver.findElement(By.xpath("(//mat-icon[text()='arrow_back'])[2]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//h1[text()='A12']")).click();
      Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Print Bill']")).click();
	  Thread.sleep(4000);
      robot.keyPress(KeyEvent.VK_ESCAPE);
      robot.keyRelease(KeyEvent.VK_ESCAPE);
      Thread.sleep(4000);
      driver.findElement(By.xpath("(//mat-icon[text()='arrow_back'])[2]")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//h1[text()='A12']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Settle']")).click();
	  Thread.sleep(2000);
}
  
  @Test (priority=8)
  public void Manage_online()  throws InterruptedException, AWTException {
	  driver.findElement(By.xpath("//span [text()='Online']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Reprint KOT']")).click();
	  Thread.sleep(4000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ESCAPE);
      robot.keyRelease(KeyEvent.VK_ESCAPE);
      driver.findElement(By.xpath("(//mat-icon[text()='arrow_back'])[2]")).click();

    }
  
  @Test (priority=9)
  public void Manage_offer()  throws InterruptedException {
	  driver.findElement(By.xpath("//span [text()=' Offers']")).click();
    }
  
  @Test (priority=10)
	public void DashBoard() throws InterruptedException { 
	  Actions actions  = new Actions(driver);
	    actions.scrollByAmount(0, -500).perform();
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.id("mat-expansion-panel-header-2")).click();
	  driver.findElement(By.xpath("//div[text()=' DashBoard ']")).click();
	  Thread.sleep(2000);
}
  
  @Test (priority=11)
	public void DashBoard1() throws InterruptedException  {
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("[aria-label='Previous month']")).click();
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("[aria-label='Next month']")).click();
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
	  driver.findElement(By.xpath("//div [@class='mat-select-arrow-wrapper ng-tns-c135-111']")).click();
	  driver.findElement(By.xpath("//span[text()='ALL']")).click();
    }
  
  @Test (priority=12)
	public void master() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.id("mat-expansion-panel-header-3")).click();
	  Thread.sleep(2000);
    }
  
  @Test (priority=13)
	public void ManageDiscount() throws InterruptedException { 
	  driver.findElement(By.xpath("//div[text()=' Manage Discount ']")).click();
  }
  
  @Test (priority=14)
	public void ManageDiscount1() throws InterruptedException { 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[29]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("mat-input-40")).sendKeys("Manju");
	  Thread.sleep(2000);
	  driver.findElement(By.id("mat-input-41")).sendKeys("Ro");
	  Thread.sleep(2000);
	  driver.findElement(By.id("mat-input-42")).sendKeys("10");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("mat-input-40")).sendKeys(".k");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
    }
  
  @Test (priority=15)
	public void managecashback() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Manage Cashback ']")).click();
    }  
  
  @Test (priority=16)
 	public void managecashback1() throws InterruptedException { 
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-46")).sendKeys("5");
 	  driver.findElement(By.id("mat-input-47")).sendKeys("150");
      driver.findElement(By.id("mat-input-48")).sendKeys("10");
      Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("mat-input-48")).sendKeys("11");
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
    }    
  
  @Test (priority=17)
 	public void managecustomer() throws InterruptedException { 
 	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
 	  driver.findElement(By.xpath("//div[text()=' Manage Customer ']")).click();
    }
  
  @Test (priority=18)
	public void managecustomer1() throws InterruptedException { 
	  driver.findElement(By.id("mat-input-50")).sendKeys("Manji.k");
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-51")).sendKeys("9128734560");
	  Thread.sleep(2000);
	  driver.findElement(By.id("mat-input-52")).sendKeys("saraswthipuram mysore");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
	  driver.findElement(By.id("mat-input-54")).sendKeys("kkk");
	  Thread.sleep(2000);
  }
  
  @Test (priority=19)
	public void managecategory() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Manage Category ']")).click();
  }
  
  @Test (priority=20)
 	public void  managecategory1() throws InterruptedException { 
 	  driver.findElement(By.id("mat-input-55")).sendKeys("juce");
 	 Thread.sleep(2000);
 	driver.findElement(By.id("mat-input-56")).sendKeys("null");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@type='file']"))
     .sendKeys( "C:\\Users\\Shreyas U\\Downloads\\download (1).jpeg");
	 driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("mat-input-55")).sendKeys("juce1");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("mat-input-57")).sendKeys("Soups");
	  Thread.sleep(2000);
  }  
  
  @Test (priority=21)
 	public void manageexpanse() throws InterruptedException { 
 	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
 	 driver.findElement(By.xpath("//div[text()=' Manage Expense Type ']")).click();
  }
  
  @Test (priority=22)
 	public void Manageexpense1() throws InterruptedException { 
 	  driver.findElement(By.id("mat-input-58")).sendKeys("icecream");
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-59")).sendKeys("D mart");
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-58")).sendKeys("Vanilla");
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-60")).sendKeys("Milk");
 	  Thread.sleep(2000);
     }
  
  @Test (priority=23)
	public void manageoffers() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Manage Offers ']")).click();
    }
  
  @Test (priority=24)
	public void Manageoffers1() throws InterruptedException { 
	  driver.findElement(By.id("mat-input-61")).sendKeys("Chinese");
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-62")).sendKeys("1");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[30]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
 	  driver.findElement(By.id("mat-input-62")).sendKeys("1");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-65")).sendKeys("jucie");
 	  Thread.sleep(2000);
  }
  
  @Test (priority=25)
 	public void managesupplier() throws InterruptedException { 
 	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
 	 driver.findElement(By.xpath("//div[text()=' Manage Supplier ']")).click();
    }
  
  @Test (priority=26)
 	public void managesupplier1() throws InterruptedException { 
 	  driver.findElement(By.id("mat-input-67")).sendKeys("kashi");
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-68")).sendKeys("9182736459");
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-69")).sendKeys("Mysuru");
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[10]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-71")).sendKeys("CTS");
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-72")).sendKeys("109");
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-73")).sendKeys("cts@gmail.com");
 	  Thread.sleep(2000);
 	  Actions actions  = new Actions(driver);
	  actions.scrollByAmount(0, 500).perform();
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
  	  Thread.sleep(2000);
  	  actions.scrollByAmount(0, -500).perform();
  	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
  	  driver.findElement(By.id("mat-input-67")).sendKeys(".k.b");
 	  Thread.sleep(2000);
 	  actions.scrollByAmount(0, 500).perform();
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
 	  Thread.sleep(2000);
 	  actions.scrollByAmount(0, -500).perform();
 	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
  	  Thread.sleep(2000);
  	  driver.findElement(By.id("mat-input-74")).sendKeys("manu");
 	  Thread.sleep(2000);
    }
  
  @Test (priority=27)
	public void managepurchase() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	 driver.findElement(By.xpath("//div[text()=' Manage Purchase Type ']")).click();
  }
  
  @Test (priority=28)
	public void managepurchase1() throws InterruptedException { 
	  driver.findElement(By.id("mat-input-75")).sendKeys("Icream");
 	  Thread.sleep(2000);
 	  driver.findElement(By.id("mat-input-76")).sendKeys("chocklet");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
 	  driver.findElement(By.id("mat-input-76")).sendKeys("2");
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
  	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
  	  Thread.sleep(2000);
  	  driver.findElement(By.id("mat-input-77")).sendKeys("Milk");
	  Thread.sleep(2000);
    }
  
  @Test (priority=29)
	public void manageuom() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  Actions actions  = new Actions(driver);
	  actions.scrollByAmount(0, 300).perform();
	  driver.findElement(By.xpath("//div[text()=' Manage UOM ']")).click();
	  driver.findElement(By.id("mat-expansion-panel-header-3")).click();
  }
  @Test (priority=30)
 	public void manageuom1() throws InterruptedException { 
	  driver.findElement(By.id("mat-input-78")).sendKeys("GK");
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
 	  driver.findElement(By.id("mat-input-79")).sendKeys("1");
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("mat-input-80")).sendKeys("KG");
	  Thread.sleep(2000);
  }
  
  @Test (priority=31)
	public void Report() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.id("mat-expansion-panel-header-4")).click();
	  Thread.sleep(2000);
 }
  
  @Test (priority=32)
	public void sale() throws InterruptedException { 
	  driver.findElement(By.xpath("//div[text()=' Sales  ']")).click();
}
  @Test (priority=33)
	public void salereport() throws InterruptedException, AWTException { 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("//span[text()='Hotel']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//a[text()='Reprint'])[1]")).click();
	  Thread.sleep(3000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ESCAPE);
      robot.keyRelease(KeyEvent.VK_ESCAPE);
      driver.findElement(By.xpath("(//mat-icon[text()='arrow_back'])[2]")).click();
	  Thread.sleep(2000);
  }
  
  @Test (priority=34)
 	public void iteamsale() throws InterruptedException { 
 	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
 	 driver.findElement(By.xpath("//div[text()=' Item Sales  ']")).click();
  }
  
  @Test (priority=35)
	public void iteamsale1() throws InterruptedException { 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
    }
  
  @Test (priority=36)
	public void categorysale() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Category Sales ']")).click();
    }
  
  @Test (priority=37)
	public void categorysale1() throws InterruptedException {
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='ng-untouched ng-pristine ng-valid']")).click();
    }
  
  @Test (priority=38)
	public void Cashback() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Cashback ']")).click();
  }
  
  @Test (priority=39)
	public void Cashbackreport() throws InterruptedException { 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
  }
  
  @Test (priority=40)
 	public void Cashbackutilized() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Cashback Utilized ']")).click();
    }
  

  @Test (priority=41)
 	public void Cashbackutilized1() throws InterruptedException { 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
  }
  
  @Test (priority=42)
	public void Expense()  { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("(//div[text()=' Expense '])[1]")).click();
	  
  }
  
  @Test (priority=43)
 	public void Expense1() throws InterruptedException { 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
    }
  
  @Test (priority=44)
 	public void Payment()  { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Payment ']")).click();
    }
  
  @Test (priority=45)
	public void Payment1() throws InterruptedException { 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
  }
  
  @Test (priority=46)
 	public void cash() { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Cash ']")).click();
    }
  
  @Test (priority=47)
	public void cashreport() throws InterruptedException { 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='ALL']")).click();
    }
  
  @Test (priority=48)
	public void Branchwise() throws InterruptedException { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  Actions actions  = new Actions(driver);
	  actions.scrollByAmount(0, 500).perform();
	  driver.findElement(By.xpath("//div[text()=' Branch Wise Sales ']")).click();
    }
  
  @Test (priority=49)
	public void Branchwisesale() throws InterruptedException { 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='ALL']")).click();
  }
  
  @Test (priority=50)
	public void Transaction()  { 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  Actions actions  = new Actions(driver);
	  actions.scrollByAmount(0, 500).perform();
	  driver.findElement(By.xpath("//div[text()=' Transaction ']")).click();
	  driver.findElement(By.id("mat-expansion-panel-header-4")).click();
    }
  
  @Test (priority=51)
	public void Transactionreport() throws InterruptedException { 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='manu']")).click();
    }
  
  @Test (priority=52)
	public void Expenses() {
	  Actions actions  = new Actions(driver);
	  actions.scrollByAmount(0, -500).perform();
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.id("mat-expansion-panel-header-5")).click();
  }
  
  @Test (priority=53)
	public void Manageexpense() { 
	  driver.findElement(By.xpath("//div[text()=' Manage Expense ']")).click();
  }
  
  @Test (priority=54)
 	public void Manageexpenses() throws InterruptedException{ 
	  
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Milk']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("50");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("D mart");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("2");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]")).click();
	  Thread.sleep(2000);
	  Actions actions  = new Actions(driver);
	  actions.scrollByAmount(0, 500).perform();
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
 	  Thread.sleep(2000);
	  actions.scrollByAmount(0, -500).perform();
 	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
 	  driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("2");
 	 actions.scrollByAmount(0, 500).perform();
 	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
	  Thread.sleep(2000);
	  actions.scrollByAmount(0, -500).perform();
	  driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]")).click();
	  actions.scrollByAmount(0, 500).perform();
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]")).click();
	  Thread.sleep(2000);
	  actions.scrollByAmount(0, -500).perform();
	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
	  Thread.sleep(2000);
    }
  
  @Test (priority=55)
  public void Managepurchase() throws InterruptedException{ 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Manage Purchase ']")).click();
    }
  
  @Test (priority=56)
  public void Managepurchasedetails() throws InterruptedException{ 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div [@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Milk']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='search']")).sendKeys("D Mart");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("1");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='KG']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("20");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("10");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@type='number'])[5]")).sendKeys("123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("yes");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='file']"))
      .sendKeys( "C:\\Users\\Shreyas U\\Downloads\\download (1).jpeg");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();

	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
	  Thread.sleep(2000);
    }
  
  @Test (priority=57)
  public void Managepayment() throws InterruptedException{ 
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Manage Payment ']")).click();
	  driver.findElement(By.id("mat-expansion-panel-header-5")).click();
    }
  
  @Test (priority=58)
  public void Managepayment1() throws InterruptedException{ 
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='search']")).sendKeys("D Mart");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("20");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-global-Yes cursorpointer mat-button mat-button-base']")).click();
	  Thread.sleep(2000);
  }
  
  @Test (priority=59)
	public void Setting() {
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.id("mat-expansion-panel-header-6")).click();
    }
  
  @Test (priority=60)
	public void Branch() {
	  driver.findElement(By.xpath("//div[text()=' Branch ']")).click();
    }
  
  @Test (priority=61)
	public void ManageAccount() {
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("(//mat-accordion[@class='mat-accordion ng-tns-c78-0'])[7]")).click();
    }
  
  @Test (priority=62)
	public void ChangePassword() {
	  driver.findElement(By.xpath("//div[text()=' Change Password ']")).click();
    }
  
  @Test (priority=63)
	public void Logout() {
	  driver.findElement(By.cssSelector("[class*='MenuIcon_Aligned']")).click();
	  driver.findElement(By.xpath("//div[text()=' Logout ']")).click();
    }
    }