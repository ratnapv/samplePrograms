package Selenium;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshots {

	public static void main(String[] args) throws Exception {

		//driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ratnakumar\\Downloads\\Selenium jar downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		System.out.println("Test");

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File  Source = scrShot.getScreenshotAs(OutputType.FILE);
		File Destination = new File("F:\\Screenshots\\test.png");
		FileHandler.copy(Source, Destination);
		driver.close();

	}

}
