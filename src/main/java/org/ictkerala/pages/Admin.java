package org.ictkerala.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Admin {
	WebDriver driver;
    private WebElement username;
    private WebElement password;
    private WebElement Login;
    private WebElement Update;
    private WebElement Name;
    private WebElement Submit;
    private WebElement Delete;
    private WebElement AddUser;
    private WebElement Username;
    private WebElement Email;
    private WebElement uname;
    private WebElement pass;
    private WebElement Role;
    private WebElement sub;
    private WebElement UserUpdate;
    private WebElement UserAdd;
    private WebElement UserSuccess;
    private WebElement BlankName;
    private WebElement BlankEmail;
    private WebElement BlankUserName;
    private WebElement BlankPassword;
    private WebElement BlankRole;
    
    public Admin(WebDriver driver)
    	
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
    public void UpdateClick()
    {
    Update=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div[1]/table/tbody/tr[1]/td[6]/button"));
    Update.click();
}
    public void setName(String name)
    {
   	 Name=driver.findElement(By.id("name"));
   	 Name.sendKeys(name);
   	 
    }
    public void Submit()
    {
   	 Submit=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[6]/div/div[2]/button"));
   	 Submit.click();
    }
    public void Delete()
    {
    Delete=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div[1]/table/tbody/tr[1]/td[7]/button"));
    Delete.click();
}
    public void AddUser()
    {
    AddUser=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/a/button"));
    AddUser.click();
}
    public void setUserName(String setUserName)
    {
   	 Username=driver.findElement(By.id("name"));
   	 Username.sendKeys(setUserName);
    }
    public void setEmail(String setEmail)
    {
     Email=driver.findElement(By.id("email"));
   	 Email.sendKeys(setEmail);
    }
    public void setUname(String setUname)
    {
    	uname=driver.findElement(By.id("username"));
    	uname.sendKeys(setUname);
    }
    public void setPass(String setPass)
    {
    	pass=driver.findElement(By.id("password"));
    	pass.sendKeys(setPass);
    }
    public void setRole(String setRole)
    {
    	Role=driver.findElement(By.xpath("//select[@name=\"roleInputs\"]"));
    	Role.sendKeys(setRole);
    }
    public void Submit1()
    {
   	 sub=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[6]/div/div[2]/button"));
   	 sub.click();
    }
    
    public String UserUpdate() {
    	UserUpdate=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[6]/div/div[2]/button"));
    	String update=UserUpdate.getText();
    	return update;
    	
    }
    public String UserAdd() {
    	UserAdd=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[6]/div/div[2]/button"));
    	String add=UserAdd.getText();
    	return add;
    	
    }
    public String UserSuccess() {
    	UserSuccess=driver.findElement(By.xpath("//*[@id=\"swal2-html-container\"]"));
    	String add=UserSuccess.getText();
    	return add;
}
    public String BlankName() {
    	BlankName=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[1]/div/div[2]/p"));
    	String name=BlankName.getText();
    	return name;
}
    public String BlankEmail() {
    	BlankEmail=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div[2]/p"));
    	String email=BlankEmail.getText();
    	return email;
}
    public String BlankUserName() {
    	BlankUserName=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[3]/div/div[2]/p"));
    	String name=BlankUserName.getText();
    	return name;
    }
    
    public String BlankPassword() {
    	BlankPassword=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[4]/div/div[2]/p"));
    	String pass=BlankPassword.getText();
    	return pass;
    }
    
    public String BlankRole() {
    	BlankRole=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[5]/div/div[2]/p"));
    	String role=BlankRole.getText();
    	return role;
    }
}

