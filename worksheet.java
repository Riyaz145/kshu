package data;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class worksheet{
	   
 

	public static void main(String[] args) throws InterruptedException {
 		
	        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(2000);
	     	
	        String baseUrl = " http://192.168.200.23";
	        driver.manage().window().maximize();
	       //String tagName = "";
	       driver.get(baseUrl);
	       Thread.sleep(1000);
		   driver.findElement(By.id("UserName")).sendKeys("nagayogitak");
		   driver.findElement(By.id("Password")).sendKeys("password");
		   driver.findElement(By.cssSelector(".material-button")).click();
	    Thread.sleep(5000);    
	      {
	//************Click on worksheet icon********//
	    	  driver.findElement(By.cssSelector(".item-list > div:nth-child(4) > span:nth-child(1) > span:nth-child(1) > span:nth-child(3)")).click();
      	   Thread.sleep(4000);
      	   
	  //**********Click on New button***********//	      	   
      	 driver.findElement(By.className("label")).click();
	     	   Thread.sleep(4000);
	   //**********Click on payment Tree *********//
	      	 driver.findElement(By.cssSelector("li.k-item:nth-child(3) > div:nth-child(1) > span:nth-child(1)")).click();
	      	   Thread.sleep(4000);  
	      	   
	     	//**********Click on paymt Tree *********//
	      	driver.findElement(By.cssSelector("li.ng-tns-c25-9:nth-child(7) > div:nth-child(1) > span:nth-child(1)")).click();
	      	Thread.sleep(2000); 
	      	   
	      	   //*********Drag & Drop pmt********//

          Actions act=new Actions(driver);
	driver.findElement(By.cssSelector("li.ng-tns-c25-10:nth-child(1)")).click();
	Thread.sleep(5000);
			  // find element which we need to drag
		WebElement drag=driver.findElement(By.cssSelector("li.ng-tns-c25-10:nth-child(1)"));
	Thread.sleep(2000);                                    
			  // find element which we need to drop
	WebElement drop=driver.findElement(By.className("droped-fields"));
Thread.sleep(2000);

			  // this will drag element to destination
act.dragAndDrop(drag, drop).build().perform();
	
	//***********Navigating to search tab***********//
	driver.findElement(By.id("mat-tab-label-0-1")).click();
	Thread.sleep(8000);
	
	//**********Run button*********//
	
	driver.findElement(By.className("run-button")).click();
	
	Thread.sleep(5000);
	


	      	 
	      	  
	      }
	
		
	}
}