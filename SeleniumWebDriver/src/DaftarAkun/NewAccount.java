package DaftarAkun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccount {
	
	private static WebElement element = null;
	
	 public static WebElement location(WebDriver driver){
		 String url = "http://olx.co.id/masuk/daftar";
    	 driver.get(url);
		return element;
    	 
    	 
 
 
         }
	 public static WebElement Username(WebDriver driver){

    	 element = driver.findElement(By.id("userEmail"));
 
         return element;

 
      		}
	 public static WebElement Password(WebDriver driver){

    	 element = driver.findElement(By.id("userPass"));
 
         return element;

 
      		}
	 public static WebElement Passwordrepeat(WebDriver driver){

    	 element = driver.findElement(By.id("userPass-repeat"));
 
         return element;

 
      		}
	 public static WebElement CheckboxIagree(WebDriver driver){

    	 element = driver.findElement(By.id("acceptCheck"));
 
         return element;

 
      		}
	 public static WebElement CreateButton(WebDriver driver){

    	 element = driver.findElement(By.id("se_userSignIn"));
 
         return element;

 
      		}
	
}
