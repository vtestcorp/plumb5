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

public class TC_09_Profile_Edit_Delete_Groups extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
    Web web;
    ManageUsers manageUsers;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_09_Profile_Edit_Delete_Groups", "Profile_Edit_Delete_Groups");

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
		manageUsers.click_Groups();
		manageUsers.click_CreateGroups();		
		manageUsers.enter_GroupName(JsonUtils.getData(DefineConstants.TC_09_Profile_Edit_Delete_Groups, "Group Name"));
		manageUsers.enter_GroupDescription(JsonUtils.getData(DefineConstants.TC_09_Profile_Edit_Delete_Groups, "Group Description"));
		manageUsers.click_Plumb5V6Checkbox();
		manageUsers.click_FullControlCheckbox();
		manageUsers.click_SaveButtonGroup();
		manageUsers.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_09_Profile_Edit_Delete_Groups, "Success Message"));
		manageUsers.search_GroupName(JsonUtils.getData(DefineConstants.TC_09_Profile_Edit_Delete_Groups, "Group Name"));
        manageUsers.verifyGroupName(JsonUtils.getData(DefineConstants.TC_09_Profile_Edit_Delete_Groups, "Group Name"));
        
        //Edit
        manageUsers.select_GroupNameToEdit(JsonUtils.getData(DefineConstants.TC_09_Profile_Edit_Delete_Groups, "Group Name"));
        manageUsers.click_EditButton();
        manageUsers.enter_GroupDescription(JsonUtils.getData(DefineConstants.TC_09_Profile_Edit_Delete_Groups, "Update Group Description"));
        manageUsers.click_SaveButtonGroup();
		manageUsers.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_09_Profile_Edit_Delete_Groups, "Update Success Message"));
		
		//Delete
		manageUsers.select_GroupNameToEdit(JsonUtils.getData(DefineConstants.TC_09_Profile_Edit_Delete_Groups, "Group Name"));
        manageUsers.click_DeleteButton();
        manageUsers.click_Delete_PopUp();
        manageUsers.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_09_Profile_Edit_Delete_Groups, "Delete Success Message"));
	}
}