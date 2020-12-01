package com.plumb5.myprofile.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManageUsers;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.Web;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_10_Profile_Create_SearchUsers extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
    Web web;
    ManageUsers manageUsers;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_10_Profile_Create_SearchUsers", "TC_10_Profile_Create_SearchUsers");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
        web = new Web(driver, test);
        manageUsers= new ManageUsers(driver, test);
        
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Web();
		dashboard.click_NewUI();
		dashboard.click_ManageUsers();
		manageUsers.click_CreateUser();
		manageUsers.enter_FirstName(JsonUtils.getData(DefineConstants.TC_10_Profile_Create_SearchUsers, "First Name"));
		manageUsers.enter_LastName(JsonUtils.getData(DefineConstants.TC_10_Profile_Create_SearchUsers, "Last Name"));
		manageUsers.enter_EmailID(JsonUtils.getData(DefineConstants.TC_10_Profile_Create_SearchUsers, "Email Id"));
		manageUsers.enter_MobileNumber(JsonUtils.getData(DefineConstants.TC_10_Profile_Create_SearchUsers, "Mobile Number"));
		manageUsers.enter_ReportTo(JsonUtils.getData(DefineConstants.TC_10_Profile_Create_SearchUsers, "Report To"));
		manageUsers.enter_Role(JsonUtils.getData(DefineConstants.TC_10_Profile_Create_SearchUsers, "Role"));
		manageUsers.enter_Account(JsonUtils.getData(DefineConstants.TC_10_Profile_Create_SearchUsers, "Account"));
		manageUsers.enter_Group(JsonUtils.getData(DefineConstants.TC_10_Profile_Create_SearchUsers, "Group"));
		manageUsers.click_SaveButton();
		manageUsers.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_10_Profile_Create_SearchUsers, "Success Message"));
        manageUsers.verifyInputValue(JsonUtils.getData(DefineConstants.TC_10_Profile_Create_SearchUsers, "First Name"));
	}
}