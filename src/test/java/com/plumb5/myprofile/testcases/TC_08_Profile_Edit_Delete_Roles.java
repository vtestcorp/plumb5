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

public class TC_08_Profile_Edit_Delete_Roles extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
    Web web;
    ManageUsers manageUsers;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_08_Profile_Edit_Delete_Roles", "Profile_Edit_Delete_Roles");

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
		manageUsers.click_Roles();
		manageUsers.click_CreateRole();
		
		manageUsers.enter_RoleName(JsonUtils.getData(DefineConstants.TC_08_Profile_Edit_Delete_Roles, "Role Name"));
		manageUsers.enter_RoleDescription(JsonUtils.getData(DefineConstants.TC_08_Profile_Edit_Delete_Roles, "Role Description"));
		manageUsers.click_Administrator();
		manageUsers.click_SaveButtonRoles();
		manageUsers.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_08_Profile_Edit_Delete_Roles, "Success Message"));
		manageUsers.search_RoleName(JsonUtils.getData(DefineConstants.TC_08_Profile_Edit_Delete_Roles, "Role Name"));
        manageUsers.verifyRoleName(JsonUtils.getData(DefineConstants.TC_08_Profile_Edit_Delete_Roles, "Role Name"));
        
        //Edit 
        manageUsers.select_RolesToEdit(JsonUtils.getData(DefineConstants.TC_08_Profile_Edit_Delete_Roles, "Role Name"));
        manageUsers.click_EditButton();
        manageUsers.enter_RoleDescription(JsonUtils.getData(DefineConstants.TC_08_Profile_Edit_Delete_Roles, "Update Role Description"));
        manageUsers.click_Administrator();
        manageUsers.click_Administrator();
		manageUsers.click_SaveButtonRoles();
		manageUsers.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_08_Profile_Edit_Delete_Roles, "Update Success Message"));
		
		//Delete
		manageUsers.select_RolesToEdit(JsonUtils.getData(DefineConstants.TC_08_Profile_Edit_Delete_Roles, "Role Name"));
		manageUsers.click_DeleteButton();
		manageUsers.click_Delete_PopUp();
		manageUsers.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_08_Profile_Edit_Delete_Roles, "Delete Success Message"));
	}
}