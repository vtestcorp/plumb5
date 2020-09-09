package com.plumb5.contacts.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagedContacts;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_02_Add_Remove_Group extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	LoginPage loginPage;

	@Test(alwaysRun = true)
	public void add_Remove_Group() throws Exception {

		test = extent.createTest("TC_02_Add_Remove_Group", "Add Remove Group");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		loginPage = new LoginPage(driver, test);

		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.clickContacts();
		contact.clickManageContacts();	
		
		managedContacts.searchContact(JsonUtils.getData(DefineConstants.Add_Remove_Group, "Email"));
		managedContacts.verifyInputValue(JsonUtils.getData(DefineConstants.Add_Remove_Group, "Email"));
		managedContacts.selectContact(JsonUtils.getData(DefineConstants.Add_Remove_Group, "Email"));	
		managedContacts.select_ActionDropdownValue(JsonUtils.getData(DefineConstants.Add_Remove_Group, "Action"));
		// Add Group
		managedContacts.select_AddRemoveGroupAlertDropdownValue(JsonUtils.getData(DefineConstants.Add_Remove_Group, "ADD GROUP"));
		managedContacts.clickSaveChanges();
		managedContacts.verifyAddedToGroupSuccessfully(JsonUtils.getData(DefineConstants.Add_Remove_Group, "Verification Message"));
		// Remove group
		managedContacts.selectContact(JsonUtils.getData(DefineConstants.Add_Remove_Group, "Email"));	
		managedContacts.select_ActionDropdownValue(JsonUtils.getData(DefineConstants.Add_Remove_Group, "Action"));
		managedContacts.removeGroup(JsonUtils.getData(DefineConstants.Add_Remove_Group, "REMOVE GROUP"));
		managedContacts.clickSaveChanges();
		managedContacts.verifyAddedToGroupSuccessfully(JsonUtils.getData(DefineConstants.Add_Remove_Group, "Verification Message"));
	}
}