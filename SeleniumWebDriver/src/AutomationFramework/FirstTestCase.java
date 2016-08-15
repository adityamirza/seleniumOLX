package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import DaftarAkun.NewAccount;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		//Chrome WebDrivers
		String exePath = "D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		String url = "http://olx.co.id";
		
		
		//Page Object Model
		driver.get(url);
		FindYamahaR15.location(driver).click();
		FindYamahaR15.location(driver).sendKeys(" Jakarta");
		FindYamahaR15.JakartaBarat(driver).click();
		FindYamahaR15.Keywords(driver).sendKeys("Yamaha R15");
		WebElement search = driver.findElement(By.id("submit-searchmain"));
		search.click();
		//System.out.println("Iklan Berhasil Ditemukan");
		
		
		//Modular Framework With Parse Parameter and static value.
		DaftarAkun.NewAccount.location(driver);
		DaftarAkun.NewAccount.Username(driver).sendKeys("aditya.mirza@gmail.com");
		DaftarAkun.NewAccount.Password(driver).sendKeys("GroupM006");
		DaftarAkun.NewAccount.Passwordrepeat(driver).sendKeys("GroupM006");
		DaftarAkun.NewAccount.CheckboxIagree(driver).click();
		DaftarAkun.NewAccount.CreateButton(driver).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		
		
	}

}
