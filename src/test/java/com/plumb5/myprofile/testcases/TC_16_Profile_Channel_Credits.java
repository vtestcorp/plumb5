package com.plumb5.myprofile.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Preferences;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.Web;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_16_Profile_Channel_Credits extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
    Web web;
    Preferences preferences;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_16_Profile_Channel_Credits", "Profile_Channel_Credits");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
        web = new Web(driver, test);
        preferences= new Preferences(driver, test);
        
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Web();
		dashboard.click_NewUI();
		dashboard.click_Preferences();
		preferences.click_ChannelCredits();		
//		preferences.select_Account(JsonUtils.getData(DefineConstants.TC_16_Profile_Channel_Credits, "Account"));		
	}
}