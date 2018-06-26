package popsocketsautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class popsocketLogin1 {
	
	@Test
	  public void Login() throws InterruptedException
	  {
	   // TODO Auto-generated method stub

	   //Driver for firefox. 
	   WebDriver driver = null;
	   //System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
	   //driver= new FirefoxDriver();
	   
	   System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe"); //open in Chrome browser
	   driver = new ChromeDriver(); //get chrome drivers
	   
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   driver.get("https://popsockets-test.myshopify.com"); // Application Url
	   
	  
	   
	   if(driver.getTitle().contains("Please Log In"))
	       //Pass
	     System.out.println("Shopify Authentication Page displayed on loading  the url. Test Case Pass");
	   else
	     System.out.println("Shopify Authentication Page not displayed on loading  the url. Test Case Fail");
	   
	   
	   
	   Thread.sleep(1000);
	   driver.findElement(By.id("password")).sendKeys("rtawbu"); //shopify authentication 
	   driver.findElement(By.name("commit")).click();
	   Thread.sleep(3000);
	   
	   if(driver.getTitle().contains("PopSockets"))
	       //Pass
	       System.out.println("Shopify Authentication Passed");
	   else
	    //Pass
	       System.out.println("Shopify Authentication Failed");
	   
	   Thread.sleep(5000);

	   //driver.findElement(By.xpath("//img[@src='//cdn.shopify.com/s/files/1/1161/1916/t/159/assets/account_icon.png?665274246055470872']")).click();
	   
	   WebElement  element = driver.findElement(By.xpath("//img[@src='//cdn.shopify.com/s/files/1/1161/1916/t/159/assets/account_icon.png?6942037246862509732']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	   
	   Thread.sleep(3000);
	   if(driver.getTitle().contains("Account"))
	       //Pass
	       System.out.println("Redirection to login screen passed.");
	   else
	    //fail
	       System.out.println("Redirection to login screen failed.");
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.name("customer[email]")).sendKeys("neha.jahagirdar@clariontechnologies.co.in"); //Email
	   driver.findElement(By.name("customer[password]")).sendKeys("test@123"); //Password
	   Thread.sleep(2000);
	   driver.findElement(By.className("login-form__wrapper__cta__sign-in")).click();
	   Thread.sleep(3000);
	   
	   if(driver.getTitle().contains("PopSockets"))
	    //Pass
	    System.out.println("You have successfully logged in.Test case pass");
	   else
	    //Fail
	    System.out.println("You have unsuccessfully logged in.");
	         
	   //driver.switchTo().window(arg0)
	   //driver.close();
	         }	

}
