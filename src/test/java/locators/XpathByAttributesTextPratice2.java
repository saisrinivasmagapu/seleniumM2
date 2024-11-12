package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributesTextPratice2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		driver.findElement(By.xpath("//img@alt='restaurants curated for biryani')")).click();
		
		driver.findElement(By.xpath("div[text()='Pure veg']")).click();
		
	}

}
