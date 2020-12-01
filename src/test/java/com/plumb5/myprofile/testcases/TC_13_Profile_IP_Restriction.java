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

public class TC_13_Profile_IP_Restriction extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
    Web web;
    Preferences preferences;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_13_Profile_IP_Restriction", "Profile_IP_Restriction");

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
		
		
		preferences.select_Account(JsonUtils.getData(DefineConstants.TC_13_Profile_IP_Restriction, "Account"));
		preferences.enter_IP_ExcludeTrafficFrom(JsonUtils.getData(DefineConstants.TC_13_Profile_IP_Restriction, "IP Exclude Traffic From"));
		preferences.enter_Subdirectory_ExcludeTrafficFrom(JsonUtils.getData(DefineConstants.TC_13_Profile_IP_Restriction, "Subdirectory Exclude Traffic From"));
		preferences.enter_City_ExcludeTrafficFrom(JsonUtils.getData(DefineConstants.TC_13_Profile_IP_Restriction, "City Exclude Traffic From"));
		preferences.enter_Country_ExcludeTrafficFrom(JsonUtils.getData(DefineConstants.TC_13_Profile_IP_Restriction, "Country Exclude Traffic From"));
		
		preferences.enter_IP_IncludeTrafficFrom(JsonUtils.getData(DefineConstants.TC_13_Profile_IP_Restriction, "IP Include Traffic From"));
		preferences.enter_Subdirectory_IncludeTrafficFrom(JsonUtils.getData(DefineConstants.TC_13_Profile_IP_Restriction, "Subdirectory Include Traffic From"));
		preferences.enter_City_IncludeTrafficFrom(JsonUtils.getData(DefineConstants.TC_13_Profile_IP_Restriction, "City Include Traffic From"));
		preferences.enter_Country_IncludeTrafficFrom(JsonUtils.getData(DefineConstants.TC_13_Profile_IP_Restriction, "Country Include Traffic From"));
		preferences.click_SaveButton();
		preferences.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_13_Profile_IP_Restriction, "Success Message"));
	}
}