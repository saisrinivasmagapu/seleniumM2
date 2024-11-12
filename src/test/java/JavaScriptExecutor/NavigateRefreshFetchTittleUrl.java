package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateRefreshFetchTittleUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://www.nykaa.com/");
		
		System.out.println(js.executeScript("return document.tittle"));
		System.out.println(js.executeScript("return document.URL"));
		
		Thread.sleep(3000);
		js.executeScript("history.go(o)");
		Thread.sleep(3000);
		driver.quit();
	}

}
