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

public class TC_14_Duplicate_Group extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_14_Duplicate_Group", "Duplicate_Group");

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
		manageGroups.searchGroup(JsonUtils.getData(DefineConstants.Duplicate_Group, "Group Name"));
		manageGroups.selectGroupToEdit(JsonUtils.getData(DefineConstants.Duplicate_Group, "Group Name"));
		manageGroups.selectDuplicateOption();
		createGroup.enter_GroupDuplicateName(JsonUtils.getData(DefineConstants.Duplicate_Group, "Duplicate Group Name"));
		createGroup.enterDescription(JsonUtils.getData(DefineConstants.Duplicate_Group, "Duplicate Group Description"));
		createGroup.clickSaveGroup();
		manageGroups.searchGroup(JsonUtils.getData(DefineConstants.Duplicate_Group, "Duplicate Group Name"));
		managedContacts.verifyInputValue(JsonUtils.getData(DefineConstants.Duplicate_Group, "Duplicate Group Name"));
	}
}