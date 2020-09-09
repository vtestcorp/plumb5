package com.plumb5.contacts.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.CreateGroups;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManageGroups;
import com.plumb5.pageobjects.ManagedContacts;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_12_Delete_Group extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_08_Delete_Group", "Delete Group");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		manageGroups = new ManageGroups(driver, test);
		createGroup = new CreateGroups(driver, test);
		loginPage = new LoginPage(driver, test);

		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();

		dashboard.clickContacts();
		contact.clickManageGroups();
		manageGroups.searchGroup(JsonUtils.getData(DefineConstants.Delete_Group, "Group Name To Be Deleted"));
		manageGroups.selectGroupToEdit(JsonUtils.getData(DefineConstants.Delete_Group, "Group Name To Be Deleted"));
		manageGroups.selectDeleteOption();
		manageGroups.clickDeletePopUp();
		managedContacts.verifyAddedToGroupSuccessfully(JsonUtils.getData(DefineConstants.Delete_Group, "Verification Message"));
	}
}
