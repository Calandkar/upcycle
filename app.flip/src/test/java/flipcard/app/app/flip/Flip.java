package flipcard.app.app.flip;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Flip {

	

			   
	public static void main(String[] args) {
			  WebDriverManager.chromedriver().setup();
			  WebDriver driver = new ChromeDriver();
			      
			      //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application");
			      
			      driver.get("https://www.flipkart.com/");
			      //driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
			   

			      driver.findElement(By.className("_2doB4z")).click();
			      
			    
				   //WebDriver driver = new ChromeDriver();
			      WebElement searchBox = driver.findElement(By.name("q"));
			      searchBox.sendKeys("ipad");

			     
			      
				WebElement suggestion = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@class, 'Y5N')]")));
			      suggestion.click();
			      driver.findElement(By.className("L0Z3Pu")).click();
			     
			      WebElement onlineOnlyFilter =  new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.className("_24_Dny")));
			     driver.findElement(By.className("_4rR01T")).click();
			     onlineOnlyFilter =  new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.className("_1KOMV2")));
			    
			    //  WebElement result = driver.findElement(By.xpath("//div[contains(@class, '_1YokD2 _3Mn1Gg')]"));
			      //result.click();

			      
			     driver.findElement(By.className("_3iRXzi"));

			      WebElement emailField = driver.findElement(By.name("email"));
			      emailField.sendKeys("random@email.com");
			      
			      WebElement phoneField = driver.findElement(By.name("phone"));
			      phoneField.sendKeys("1234567890");

			      WebElement confirmationMsg = driver.findElement(By.xpath("//div[contains(text(), 'Your order has been placed successfully!')]"));
			      Assert.assertTrue(confirmationMsg.isDisplayed());
			   }
			 
	}		

	


