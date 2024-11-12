package ActionBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSliderBar {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hand bags" + Keys.ENTER);
	WebElement slider = driver.findElement(By.cssSelector("form[data-slider-id=\"p_36/range-slider\"]"));
	
	Actions action = new Actions(driver);
	action.scrollToElement(slider).perform();
	
	WebElement lower_bound_slider = driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider"));
	WebElement upper_bound_slider = driver.findElement(By.id("p_36/range-slider_slider-item_upper-bound-slider"));
	
	for(;;)	{
		lower_bound_slider.sendKeys(Keys.ARROW_LEFT);
		if(lower_bound_slider.getAttribute("aria-valuetext").contains("10,"))
		break;
		
		for(;;)	{
			upper_bound_slider.sendKeys(Keys.ARROW_LEFT);
			if(upper_bound_slider.getAttribute("aria-valuetext").contains("20,"))
			break;
			
driver.findElement(By.className("a-button-input")).click();
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(null)
			
	}
}
}
}
