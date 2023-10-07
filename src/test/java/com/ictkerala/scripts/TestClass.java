package com.ictkerala.scripts;

import java.io.IOException;

import org.ictak.constants.Constant;
import org.ictkerala.pages.Login;
import org.ictkerala.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;

public class TestClass extends BaseClass {
	 
	Login log;
	 @Test(description = "Test Case:01")
	 public void verifyValidAdminLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(0, 0);
			String passwd=ExcelUtility.getCellData(0, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
	        String actualResult=log.VerifyLogin();
	        Assert.assertEquals(actualResult, Constant.text3);
}
	 @Test(description = "Test Case:02")
	 public void verifyInValidUsernameAdminLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(1, 0);
			String passwd=ExcelUtility.getCellData(1, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
	        String actualResult=log.LoginFailed();
	        Assert.assertEquals(actualResult,Constant.text1);
}   
	 @Test(description = "Test Case:03")
	 public void verifyInValidPasswordAdminLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(2, 0);
			String passwd=ExcelUtility.getCellData(2, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
			String actualResult=log.PassWrong();
	        Assert.assertEquals(actualResult,Constant.text2);
} 
	 @Test(description = "Test Case:04")
	 public void verifyInValidPassAndUserAdminLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(3, 0);
			String passwd=ExcelUtility.getCellData(3, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
			String actualResult=log.LoginFailed();
	        Assert.assertEquals(actualResult,Constant.text1);
} 
	 @Test(description = "Test Case:05")
	 public void verifyValidTrainingHead() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(4, 0);
			String passwd=ExcelUtility.getCellData(4, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
	        String actualResult=log.VerifyTrainerLogin();
	        Assert.assertEquals(actualResult, Constant.text4);
}
	 @Test(description = "Test Case:06")
	 public void verifyInValidUsernameTrainerLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(5, 0);
			String passwd=ExcelUtility.getCellData(5, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
			String actualResult=log.LoginFailed();
	        Assert.assertEquals(actualResult,Constant.text1);
}   
	 @Test(description = "Test Case:07")
	 public void verifyInValidPasswordTrainerLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(6, 0);
			String passwd=ExcelUtility.getCellData(6, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
			String actualResult=log.PassWrong();
	        Assert.assertEquals(actualResult,Constant.text2);
}   
	 @Test(description = "Test Case:08")
	 public void verifyInValidUserAndPassTrainerLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(7, 0);
			String passwd=ExcelUtility.getCellData(7, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
			String actualResult=log.LoginFailed();
	        Assert.assertEquals(actualResult,Constant.text1);
}   
	 @Test(description = "Test Case:09")
	 public void verifyValidPOLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(8, 0);
			String passwd=ExcelUtility.getCellData(8, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
	        String actualResult=log.POLogin();
	        Assert.assertEquals(actualResult,Constant.text5);
}
	 @Test(description = "Test Case:10")
	 public void verifyInValidUsernamePOLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(9, 0);
			String passwd=ExcelUtility.getCellData(9, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
			String actualResult=log.LoginFailed();
	        Assert.assertEquals(actualResult,Constant.text1);
}   
	 @Test(description = "Test Case:11")
	 public void verifyInValidPasswordPOLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(10, 0);
			String passwd=ExcelUtility.getCellData(10, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
			String actualResult=log.PassWrong();
	        Assert.assertEquals(actualResult,Constant.text2);
}   
	 @Test(description = "Test Case:12")
	 public void verifyInValidUserAndPassPOLogin() throws IOException, InterruptedException
	 {
		    log=new Login(driver);
			String username=ExcelUtility.getCellData(11, 0);
			String passwd=ExcelUtility.getCellData(11, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
			String actualResult=log.LoginFailed();
	        Assert.assertEquals(actualResult,Constant.text1);
} 
	
}
