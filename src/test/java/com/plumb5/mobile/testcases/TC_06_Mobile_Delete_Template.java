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

public class TC_06_Mobile_Delete_Template extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	Mail mail;	
    Mobile_Template mobileTemplate;
    Mobile mobile;
    
    
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_06_Mobile_Delete_Template", "Mobile_Delete_Template");
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
		mobileTemplate.search_Template(JsonUtils.getData(DefineConstants.TC_06_Mobile_Delete_Template, "Template Name"));
		mobileTemplate.verifyInputValue(JsonUtils.getData(DefineConstants.TC_06_Mobile_Delete_Template, "Template Name"));
		mobileTemplate.selectTemplateToEdit(JsonUtils.getData(DefineConstants.TC_06_Mobile_Delete_Template, "Template Name"));
		mobileTemplate.click_DeleteButton();
		mobileTemplate.click_Delete_PopUp();
		mobileTemplate.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_06_Mobile_Delete_Template, "Success Message"));
	}
}