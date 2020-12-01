package com.plumb5.myprofile.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.MyProfile;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.Web;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_02_Profile_UpdatePassword extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
    Web web;
    MyProfile myProfile;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_02_Profile_UpdatePassword", "Profile_UpdatePassword");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
        web = new Web(driver, test);
        myProfile= new MyProfile(driver, test);
        
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Web();
		dashboard.click_NewUI();
		dashboard.click_Profile();
		myProfile.click_PasswordTab();
		myProfile.enter_OldPassword(JsonUtils.getData(DefineConstants.TC_02_Profile_UpdatePassword, "Old Password"));
		myProfile.enter_NewPassword(JsonUtils.getData(DefineConstants.TC_02_Profile_UpdatePassword, "New Password"));
		myProfile.enter_ConfirmPassword(JsonUtils.getData(DefineConstants.TC_02_Profile_UpdatePassword, "Confirm Password"));
		myProfile.click_PasswordUpdateButon();
		myProfile.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_02_Profile_UpdatePassword, "Success Message"));
	}
}