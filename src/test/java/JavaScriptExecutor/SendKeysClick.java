package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysClick {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location=arugments[0]", "https://www.amazon.in/");
		
		System.out.println(js.executeScript("return document.tittle"));
		System.out.println(js.executeScript("return document.URL"));
		
		Thread.sleep(3000);
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
		
		WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchBTN = driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arugments[0].value = arugments[1]", searchTF,"shoes");
		js.executeScript("arugments[0].click()",searchBTN);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		}

}
