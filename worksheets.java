package data;



import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class worksheets{
	   


	public static void main(String[] args) throws InterruptedException {
 		
	        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(2000);
	     	
	        String baseUrl = " http://192.168.200.23";
	        driver.manage().window().maximize();
	       //String tagName = "";
	       driver.get(baseUrl);
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
	     	   
	     	   driver.findElement(By.cssSelector("k-state-focused > .ng-star-inserted:nth-child(4)"));
	     	  Thread.sleep(4000);
	     	   		//**********Click on payment Tree *********//
	      	 driver.findElement(By.cssSelector("li.k-item:nth-child(3) > div:nth-child(1) > span:nth-child(1)")).click();
	      	   Thread.sleep(4000);  
	      	   
	     	//**********Click on paymt Tree *********//
	      	driver.findElement(By.cssSelector("li.ng-tns-c25-9:nth-child(7) > div:nth-child(1) > span:nth-child(1)")).click();
	      	Thread.sleep(4000); 
	      	   
	      	   //*********Drag & Drop pmt********//
	       	
	     
}

	}


  
		}


		
	
 

		
	
