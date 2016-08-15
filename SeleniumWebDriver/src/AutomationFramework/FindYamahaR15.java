package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindYamahaR15 {
	 private static WebElement element = null;
	 
	    public static WebElement location(WebDriver driver){
	 
	    	 element = driver.findElement(By.id("cityField"));
	 
	         return element;
	 
	         }
	 
	     public static WebElement JakartaBarat(WebDriver driver){
	 
	         element = driver.findElement(By.className("regionSelectA2"));
	 
	         return element;
	 
	         }
	 
	     public static WebElement Keywords(WebDriver driver){
	 
	         element = driver.findElement(By.id("headerSearch"));
	 
	         return element;
	 
	         }
}
