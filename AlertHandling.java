package seleniumDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
	static WebDriver driver;
	@Test(priority=1)
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@Test(priority=2)
	public static void openApplicationUrl() {
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		//driver.manage().window().maximize();
	
		

	}
	@Test(priority=3)
	
	public void handleAlert() throws InterruptedException {
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(5000);
		Alert alert= driver.switchTo().alert();
		System.out.println("First alert: "+alert.getText());
		
		alert.accept();
		System.out.println("secend alert: "+alert.getText());
		
		alert.accept();
		
		System.out.println("page Title: "+driver.getTitle());
	}
	
}
