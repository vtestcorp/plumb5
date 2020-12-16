package com.plumb5.mobile.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.Mobile;
import com.plumb5.pageobjects.Mobile_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_03_Mobile_Search_Template extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	Mail mail;	
    Mobile_Template mobileTemplate;
    Mobile mobile;
    
    
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_03_Mobile_Search_Template", "Mobile_Search_Template");
		dashboard = new Dashboard(driver, test);	
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);	
		mobileTemplate= new Mobile_Template(driver, test);
		mobile = new Mobile(driver, test);
				
		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		
		dashboard.click_Mobile();
		mobile.click_PushNotifications();						
		mobile.click_Templates();
//		mobileTemplate.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_02_Mobile_Create_Template, "Success Message"));
		mobileTemplate.search_Template(JsonUtils.getData(DefineConstants.TC_03_Mobile_Search_Template, "Template Name"));
		mobileTemplate.verifyInputValue(JsonUtils.getData(DefineConstants.TC_03_Mobile_Search_Template, "Template Name"));
	}
}