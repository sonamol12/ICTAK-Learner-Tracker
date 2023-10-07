package org.ictkerala.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Login {
	     WebDriver driver;
	     private WebElement username;
	     private WebElement password;
	     private WebElement Login;
	     private WebElement LoginFailed;
	     private WebElement PassWrong;
	     private WebElement VerifyAdminLogin;
	     private WebElement VerifyTrainerLogin;
	     private WebElement VerifyPOLogin;
	     
	     public Login(WebDriver driver)
	     	
	     {
	    	 this.driver=driver;
	     }
	     
	     public void setUsername(String setUsername)
	     {
	    	 username=driver.findElement(By.id("username"));
	    	 username.sendKeys(setUsername);
	     }
	     
	     public void setPassword(String pass)
	     {
	    	 password=driver.findElement(By.id("password"));
	    	 password.sendKeys(pass);
	    	 
	     }
	     public void LoginClick()
	     {
	    	 Login=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[3]/button"));
	    	 Login.click();
	     }
	     
	     public String LoginFailed()
	     {
	    	LoginFailed=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[4]/div/div"));
	    	String failed=LoginFailed.getText();
	    	return failed;
	     }
	     
	     public String PassWrong() {
	    	 PassWrong=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[4]/div/div"));
	    	 String failed=PassWrong.getText();
	    	 return failed;
	     }
	     
	     public String VerifyLogin() {
	    	 VerifyAdminLogin=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div[1]/table/thead/tr/th[1]"));
	    	 String success=VerifyAdminLogin.getText();
	    	 return success;
	     }
	     public String VerifyTrainerLogin() {
	    	 VerifyTrainerLogin=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div[1]/table/thead/tr/th[1]"));
	    	 String success=VerifyTrainerLogin.getText();
	    	 return success;
	     }
	     
	     public String POLogin() {
	    	 VerifyPOLogin=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div[1]/table/thead/tr/th[1]"));
	    	 String success=VerifyPOLogin.getText();
			return success;
	    	 
	     }
	     
	}
	


