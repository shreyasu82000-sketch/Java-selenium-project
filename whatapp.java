package project;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class whatapp {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException { 
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://web.whatsapp.com/");
	Thread.sleep(25000);
	driver.findElement(By.cssSelector("button[aria-label*='Status']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@role='listitem'][2]")).click();
	Thread.sleep(2000);
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f,new File("D:\\CTS\\screenshort\\whatsappstatus.jpg"));
	driver.findElement(By.xpath("(//div[@class='x78zum5'])[2]")).click();
	driver.findElement(By.xpath("//div[@title='Profile details']")).click();
	driver.findElement(By.xpath("//div[@class='x1evy7pa x1anpbxc']")).click();
	
	// Extract name and phone number from contact info section
	String name = driver.findElement(By.xpath("//span[@title]")).getText();
	String phoneNumber = driver.findElement(By.xpath("//div[contains(text(), '+')]")).getText();

	System.out.println("Name: " + name);
	System.out.println("Phone Number: " + phoneNumber);

	// Write to Excel
	String excelPath = "D:\\CTS\\WhatsApp.xlsx";
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook workbook = new XSSFWorkbook(fis);
	Sheet sheet = workbook.getSheetAt(0);
	int lastRow = sheet.getLastRowNum();
	Row newRow = sheet.createRow(lastRow + 1);
	newRow.createCell(0).setCellValue(name);
	// Write data to separate columns
	newRow.createCell(0).setCellValue(name); // Column A: Name
	newRow.createCell(1).setCellValue(phoneNumber); // Column B: Mobile No
	newRow.createCell(2).setCellValue("Status captured at: " + java.time.LocalDateTime.now()); // Column C: StatusUploadedDate
	newRow.createCell(3).setCellValue(java.time.LocalDate.now().toString()); // Column D: ScriptExecutionDate
	newRow.createCell(4).setCellValue("Image"); // Column E: Type
	newRow.createCell(5).setCellValue("D:\\CTS\\screenshot\\whatsappstatus.jpg"); // Column F: Path
	fis.close();

	FileOutputStream fos = new FileOutputStream(excelPath);
	workbook.write(fos);
	fos.close();
	workbook.close();

	System.out.println("Data saved successfully in Excel!");
	driver.quit();
	
}
}

