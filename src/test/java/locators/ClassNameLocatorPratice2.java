package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorPratice2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		
		driver.findElement(By.className("hbuyt")).click();
		driver.findElement(By.className("ilhhay")).sendKeys("deadpool-wolverine");
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
