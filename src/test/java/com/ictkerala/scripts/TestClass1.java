package com.ictkerala.scripts;

import java.io.IOException;

import org.ictak.constants.Constant;
import org.ictkerala.pages.Admin;
import org.ictkerala.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;

public class TestClass1 extends BaseClass {
	Admin log;
	 @Test(description = "Test Case:20")
	 public void AdminUserUpdate() throws IOException, InterruptedException
	 {
		    log=new Admin(driver);
			String username=ExcelUtility.getCellData(0, 0);
			String passwd=ExcelUtility.getCellData(0, 1);
			String name=ExcelUtility.getCellData(12, 0);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
	        log.UpdateClick();
	        String actualResult=log.UserUpdate();
	        Assert.assertEquals(actualResult,Constant.text6);
	        log.setName(name);
	        log.Submit();
	       
}
	       
	 @Test(description ="Test Case:21")
	 public void AdminUserDelete() throws IOException, InterruptedException
	 {
		    log=new Admin(driver);
			String username=ExcelUtility.getCellData(0, 0);
			String passwd=ExcelUtility.getCellData(0, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
			log.Delete();
	        
}
	 @Test(description ="Test Case:13")
	 public void UserAddButton() throws IOException, InterruptedException
	 {
		    log=new Admin(driver);
			String username=ExcelUtility.getCellData(0, 0);
			String passwd=ExcelUtility.getCellData(0, 1);
			log.setUsername(username);
			log.setPassword(passwd);
			log.LoginClick();
			Thread.sleep(2000);
			log.AddUser();
			 String actualResult=log.UserAdd();
		      Assert.assertEquals(actualResult,Constant.text7);
	 }
	 @Test(description = "Test Case:14")
	 public void AddUser() throws IOException, InterruptedException
	 {
		log=new Admin(driver);
		String username=ExcelUtility.getCellData(0, 0);
		String passwd=ExcelUtility.getCellData(0, 1);
		String name=ExcelUtility.getCellData(12, 0);
		String email=ExcelUtility.getCellData(13, 0);
		String uname=ExcelUtility.getCellData(14, 0);
		String pass=ExcelUtility.getCellData(15, 0);
		String role=ExcelUtility.getCellData(16, 0);
		log.setUsername(username);
		log.setPassword(passwd);
		log.LoginClick();
		Thread.sleep(2000);
		log.AddUser();
		log.setUserName(name);
		log.setEmail(email);
		log.setUname(uname);
	    log.setPassword(pass);
		log.setRole(role);
		log.Submit1();	
		Thread.sleep(2000);
		String actualResult=log.UserSuccess();
	      Assert.assertEquals(actualResult,Constant.text8);
	 }
	 @Test(description = "Test Case:15")
	 public void BlankName() throws IOException, InterruptedException
	 {
		log=new Admin(driver);
		String username=ExcelUtility.getCellData(0, 0);
		String passwd=ExcelUtility.getCellData(0, 1);
		//String name=ExcelUtility.getCellData(12, 0);
		String email=ExcelUtility.getCellData(13, 0);
		String uname=ExcelUtility.getCellData(14, 0);
		String pass=ExcelUtility.getCellData(15, 0);
		String role=ExcelUtility.getCellData(16, 0);
		log.setUsername(username);
		log.setPassword(passwd);
		log.LoginClick();
		Thread.sleep(2000);
		log.AddUser();
		//log.setUserName(name);
		log.setEmail(email);
		log.setUname(uname);
	    log.setPassword(pass);
		log.setRole(role);
		log.Submit1();	
		String actualResult=log.BlankName();
	    Assert.assertEquals(actualResult,Constant.text9);
	 }
	 @Test(description = "Test Case:16")
	 public void BlankEmail() throws IOException, InterruptedException
	 {
		log=new Admin(driver);
		String username=ExcelUtility.getCellData(0, 0);
		String passwd=ExcelUtility.getCellData(0, 1);
		String name=ExcelUtility.getCellData(12, 0);
		//String email=ExcelUtility.getCellData(13, 0);
		String uname=ExcelUtility.getCellData(14, 0);
		String pass=ExcelUtility.getCellData(15, 0);
		String role=ExcelUtility.getCellData(16, 0);
		log.setUsername(username);
		log.setPassword(passwd);
		log.LoginClick();
		Thread.sleep(2000);
		log.AddUser();
		log.setUserName(name);
		//log.setEmail(email);
		log.setUname(uname);
	    log.setPassword(pass);
		log.setRole(role);
		log.Submit1();	
		String actualResult=log.BlankEmail();
	    Assert.assertEquals(actualResult,Constant.text10);
	 }
	 
	 @Test(description = "Test Case:17")
	 public void BlankUsername() throws IOException, InterruptedException
	 {
		log=new Admin(driver);
		String username=ExcelUtility.getCellData(0, 0);
		String passwd=ExcelUtility.getCellData(0, 1);
		String name=ExcelUtility.getCellData(12, 0);
		String email=ExcelUtility.getCellData(13, 0);
		//String uname=ExcelUtility.getCellData(14, 0);
		String pass=ExcelUtility.getCellData(15, 0);
		String role=ExcelUtility.getCellData(16, 0);
		log.setUsername(username);
		log.setPassword(passwd);
		log.LoginClick();
		Thread.sleep(2000);
		log.AddUser();
		log.setUserName(name);
		log.setEmail(email);
		//log.setUname(uname);
	    log.setPassword(pass);
		log.setRole(role);
		log.Submit1();	
		String actualResult=log.BlankUserName();
	    Assert.assertEquals(actualResult,Constant.text11);
	 }
	 
	 @Test(description = "Test Case:18")
	 public void BlankPassword() throws IOException, InterruptedException
	 {
		log=new Admin(driver);
		String username=ExcelUtility.getCellData(0, 0);
		String passwd=ExcelUtility.getCellData(0, 1);
		String name=ExcelUtility.getCellData(12, 0);
		String email=ExcelUtility.getCellData(13, 0);
		String uname=ExcelUtility.getCellData(14, 0);
		//String pass=ExcelUtility.getCellData(15, 0);
		String role=ExcelUtility.getCellData(16, 0);
		log.setUsername(username);
		log.setPassword(passwd);
		log.LoginClick();
		Thread.sleep(2000);
		log.AddUser();
		log.setUserName(name);
		log.setEmail(email);
		log.setUname(uname);
	    //log.setPassword(pass);
		log.setRole(role);
		log.Submit1();	
		String actualResult=log.BlankPassword();
	    Assert.assertEquals(actualResult,Constant.text12);
	 }
	 
	 @Test(description = "Test Case:18")
	 public void RoleNotSelected() throws IOException, InterruptedException
	 {
		log=new Admin(driver);
		String username=ExcelUtility.getCellData(0, 0);
		String passwd=ExcelUtility.getCellData(0, 1);
		String name=ExcelUtility.getCellData(12, 0);
		String email=ExcelUtility.getCellData(13, 0);
		String uname=ExcelUtility.getCellData(14, 0);
		String pass=ExcelUtility.getCellData(15, 0);
		//String role=ExcelUtility.getCellData(16, 0);
		log.setUsername(username);
		log.setPassword(passwd);
		log.LoginClick();
		Thread.sleep(2000);
		log.AddUser();
		log.setUserName(name);
		log.setEmail(email);
		log.setUname(uname);
	    log.setPassword(pass);
		//log.setRole(role);
		log.Submit1();	
		String actualResult=log.BlankRole();
	    Assert.assertEquals(actualResult,Constant.text13);
	 }
	 }
	


