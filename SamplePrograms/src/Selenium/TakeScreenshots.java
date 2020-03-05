package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshots {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Ratnakumar\\Downloads\\Selenium jar downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(50000);
		System.out.println("Test");
	}

}
