package FrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkPratice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.switchTo().frame("callout");
	
	driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
	driver.findElement(By.name("q")).sendKeys("selenium testing jobs for freshers"+Keys.ENTER);
	
	Thread.sleep(2000);
	driver.quit();
	
	
	
	
}
}
