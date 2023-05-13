package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprovidersTestng {

	
		// TODO Auto-generated method stub
		 @DataProvider(name = "loginData")
		 public Object[][] getLoginData() 
		 {
		    // Define your login data here
		    Object[][] data = new Object[][] {
		      {"pillisairam44@gmail.com", "Sairam@78"},
		      {"shetty@gmail.com", "Iamking@000"},
		      {"pillisairam44@gmail.com", "Sairam@78"}
		    };
		    return data;
		  }

		 @Test(dataProvider = "loginData")
		  public void testLogin(String username, String password) {
		    // Initialize WebDriver and navigate to login page
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://rahulshettyacademy.com/client");
		    
		    // Find username and password fields and enter the values
		    WebElement usernameField = driver.findElement(By.id("userEmail"));
		    usernameField.sendKeys(username);
		    
		    WebElement passwordField = driver.findElement(By.id("userPassword"));
		    passwordField.sendKeys(password);
		    
		    // Find and click on the login button
		    WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		    loginButton.click();
		    
		    // Add your assertions or further actions here
		    
		    // Close the browser
		    driver.quit();
		 }

}


