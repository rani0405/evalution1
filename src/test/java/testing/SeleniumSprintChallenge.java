package testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumSprintChallenge {
	@BeforeMethod
	public void setUp() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}
	@Test
	public void formsAndElement() {
		driver.findElement(By.xpath("//span[text()='Elements']")).click();
		driver.findElement(By.xpath("span[text()='Test Box']")).click();
		driver.findElement(By.id("userName")).sendkeys("Kallu Money");
		driver.findElement(By.id("userEmail")).sendkeys("Kallu@gmail.com");
		driver.findElement(By.id("currentAddress")).sendkeys("123 street");
		driver.findElement(By.id("permanentAddress")).sendkeys("Tukum");
		driver.findElement(By.id("submit")).click();
		
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		driver.findElement(By.xpath("//label[text()='Impressive']")).click();
		
		WebElement displayMsg=driver.findElement(By.className(""));
		Assert.assertEquals(displayMsg.getText(),"Impressive"," displayed failed!");
	}
	@Test
	public void handlingDynamicWidgets() {
		driver.findElement(By.xpath("//h5[text()='Widgets']")).click();
		driver.findElement(By.xpath(""))
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	}
