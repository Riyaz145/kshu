package data;
//with filter//

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;



public class css{
	  
 
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
	     	   
	//*******Click on Open button******//
	     	   driver.findElement(By.cssSelector("button.menu-button:nth-child(2) > div:nth-child(2)")).click();
	     	  Thread.sleep(4000);
	     	  
	     //**********filtered data *********//
	      	 driver.findElement(By.cssSelector(".k-grid-table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1)")).click();
	      	 Thread.sleep(2000);
	      
			  // click on open button//
	driver.findElement(By.cssSelector(".submit-button > span:nth-child(1)")).click();
	Thread.sleep(2000);

	//click on serach//
	//***********Navigating to search tab***********//
		driver.findElement(By.id("mat-tab-label-0-1")).click();
		Thread.sleep(3000);
		
		//click on open button//
	
		driver.findElement(By.cssSelector("button.menu-button:nth-child(2) > div:nth-child(2)")).click();
  	   Thread.sleep(4000);
  	   
  	   //select existing serach//
  	 driver.findElement(By.cssSelector("td.ng-star-inserted:nth-child(1)")).click();
	   Thread.sleep(2000);
	   
	   //click on open//
	   driver.findElement(By.cssSelector(".submit-button > span:nth-child(1)")).click();
	   Thread.sleep(2000);
	   //click on run button//
	   driver.findElement(By.className("run-button")).click();
		Thread.sleep(5000);
		
		//Click on sort//
		
		driver.findElement(By.cssSelector(".buttons > span:nth-child(1)")).click();
		Thread.sleep(2000);
		
		//select a checkbox//
		
		driver.findElement(By.className("mat-radio-container")).click();
		Thread.sleep(2000);
		//Click on save button//
		
		driver.findElement(By.cssSelector(".submit-button > span:nth-child(1)")).click();
		Thread.sleep(2000);
  	   


	      	 
	      	  
	      }
	
		
	}
}