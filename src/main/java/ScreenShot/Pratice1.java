package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.primevideo.com/");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("./files/amazonprime.png");
	FileUtils.copyFile(src, dest);
	
	
	
	Thread.sleep(2000);
	driver.quit();
	
	}

	
	}

