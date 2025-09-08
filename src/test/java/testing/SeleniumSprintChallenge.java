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
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }

    @Test
    public void formsAndElement() {
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
        driver.findElement(By.id("userName")).sendKeys("Kallu Money");
        driver.findElement(By.id("userEmail")).sendKeys("Kallu@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("123 street");
        driver.findElement(By.id("permanentAddress")).sendKeys("Tukum");
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
        driver.findElement(By.xpath("//label[text()='Impressive']")).click();

        WebElement displayMsg = driver.findElement(By.className("text-success"));
        Assert.assertEquals(displayMsg.getText(), "Impressive", "Radio button message verification failed!");
    }

    @Test
    public void handlingDynamicWidgets() {
        driver.findElement(By.xpath("//h5[text()='Widgets']")).click();
        driver.findElement(By.xpath("//span[text()='Select Menu']")).click();
        driver.findElement(By.id("selectOne")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Dr.')]")).click();

        WebElement oldSelect = driver.findElement(By.id("oldSelectMenu"));
        oldSelect.sendKeys("Blue");  
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
