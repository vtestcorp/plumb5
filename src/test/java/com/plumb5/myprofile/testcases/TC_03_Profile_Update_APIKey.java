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

public class TC_03_Profile_Update_APIKey extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
    Web web;
    MyProfile myProfile;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_03_Profile_Update_APIKey", "Profile_Update_APIKey");

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
		myProfile.click_APIKey();
		myProfile.enter_APIKey(JsonUtils.getData(DefineConstants.TC_03_Profile_Update_APIKey, "API Key"));
		myProfile.click_RestButton();
		myProfile.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_03_Profile_Update_APIKey, "Success Message"));
	}
}