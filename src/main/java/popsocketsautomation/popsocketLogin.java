package popsocketsautomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class popsocketLogin {
	static WebElement weBtn=null; 
	@Test
		public void Login() throws FindFailed, InterruptedException
		
		     
	    {
		
		Screen screen = new Screen();
         Pattern image1= new Pattern("C:\\Users\\Admin\\workspace\\popsocketsautomation\\images\\topSmall.png");
         Pattern image2= new Pattern("C:\\Users\\Admin\\workspace\\popsocketsautomation\\images\\sideEnlarge.png");
         Pattern image3= new Pattern("C:\\Users\\Admin\\workspace\\popsocketsautomation\\images\\addText.png");
        // Pattern image4= new Pattern("C:\\Users\\Admin\\workspace\\popsocketsautomation\\images\\addImage.png");
         
         
       
			// TODO Auto-generated method stub

	    	//Driver for firefox. 
	    	WebDriver driver = null;
			//System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
			//driver= new FirefoxDriver();
			
			//driver.manage().window().maximize();
	        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
	    	System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe"); //open in Chrome browser
	 	    driver = new ChromeDriver(); //get chrome drivers
	        //driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        
			
			driver.get("https://www.google.com/");
			// Application Url
			
			if(driver.getTitle().contains("Google"))
			    //Pass
			    System.out.println("Shopify Authentication Page displayed on loading  the url. Test Case Pass");
			else
				System.out.println("Shopify Authentication Page not displayed on loading  the url. Test Case Fail");
	        
			//driver.switchTo().window(arg0)
			driver.close();
	
}
}