package AutomationFramework;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		String url = "http://olx.co.id";
		//String pasangiklan = "http://olx.co.id/pasang";
		
		driver.get(url);
		//WebElement mouseover = driver.findElement(ByXPath("//a[@id='cat-86']/span"));
		FindYamahaR15.location(driver).click();
		FindYamahaR15.location(driver).sendKeys(" Jakarta");
		FindYamahaR15.JakartaBarat(driver).click();
		FindYamahaR15.Keywords(driver).sendKeys("Yamaha R15");
		WebElement search = driver.findElement(By.id("submit-searchmain"));
		search.click();
		//driver.close();
		
		
	}

}
