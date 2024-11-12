package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPratice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement HomeAndLivingTab = driver.findElement(By.xpath("a[text()='home-&-living' and @class='desktop-main']"));
		Actions action = new Actions(driver);
		action.moveToElement(HomeAndLivingTab).perform();
		
		driver.findElement(By.xpath("//a[text()='Clocks']")).click();
		String header = driver.findElement(By.cssSelector("h1.title-title")).getText();
		if(header.equalsIgnoreCase("clocks"))
			System.out.println("pass");
		else
			System.out.println("Fail");
		
		driver.quit();

}
}
	
