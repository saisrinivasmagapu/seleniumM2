package Saddlepoint;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogout {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://authdev.saddlepointtech.com/login");
		driver.findElement(By.id("first_field")).sendKeys("user4@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("second_field")).sendKeys("Saddle@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("btn btn-primary btn-lg btn-theme")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("a3XW6-cnt")).click();
		driver.findElement(By.className("module-label z-label")).click();
	}

}
