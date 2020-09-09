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

public class TC_08_Create_Group extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_08_Create_Group", "Create Group");

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
		manageGroups.clickCreateGroups();
		createGroup.enterName(JsonUtils.getData(DefineConstants.Create_Group, "Name"));
		createGroup.enterDescription(JsonUtils.getData(DefineConstants.Create_Group, "Description"));
		createGroup.clickAddContactsCheckbox();
		createGroup.clickAddContactsSlider();

		createGroup.startCount(JsonUtils.getData(DefineConstants.Create_Group, "Start Count"));
		createGroup.endCount(JsonUtils.getData(DefineConstants.Create_Group, "End Count"));

		createGroup.enterFirstName(JsonUtils.getData(DefineConstants.Create_Group, "First Name"));
		createGroup.enterLastName(JsonUtils.getData(DefineConstants.Create_Group, "Last Name"));

		// createGroup.enterRangeStart(JsonUtils.getData(DefineConstants.Create_Group,
		// "Age Start Range"));
		// createGroup.enterRangeEnd(JsonUtils.getData(DefineConstants.Create_Group,
		// "Age End Range"));
		createGroup.enterEducation(JsonUtils.getData(DefineConstants.Create_Group, "Education"));
		createGroup.selectGender(JsonUtils.getData(DefineConstants.Create_Group, "Gender"));
		createGroup.enterOccupation(JsonUtils.getData(DefineConstants.Create_Group, "Occupation"));
		createGroup.selectMartialStatus(JsonUtils.getData(DefineConstants.Create_Group, "Marital Status"));
		createGroup.enterLocation(JsonUtils.getData(DefineConstants.Create_Group, "Location"));
		createGroup.enterInterests(JsonUtils.getData(DefineConstants.Create_Group, "Interests"));
		createGroup.enterUtmSource(JsonUtils.getData(DefineConstants.Create_Group, "Utm Source"));
		createGroup.enterUtmMedium(JsonUtils.getData(DefineConstants.Create_Group, "Utm Medium"));
		createGroup.enterUtmCampaign(JsonUtils.getData(DefineConstants.Create_Group, "Utm Campaign"));
		createGroup.enterUtmTerm(JsonUtils.getData(DefineConstants.Create_Group, "Utm Term"));
		createGroup.enterUtmContent(JsonUtils.getData(DefineConstants.Create_Group, "Utm Content"));
		createGroup.selectMailSubscribe(JsonUtils.getData(DefineConstants.Create_Group, "Mail Subscribe"));
		// createGroup.selectMailOverallSubscribe(JsonUtils.getData(DefineConstants.Create_Group, "Mail Overall Subscribe"));
		createGroup.selectSMSSubscribe(JsonUtils.getData(DefineConstants.Create_Group, "SMS Subscribe"));
		// createGroup.selectSMSOverallSubscribe(JsonUtils.getData(DefineConstants.Create_Group, "SMS Overall Subscribe"));
		createGroup.inputAccountType(JsonUtils.getData(DefineConstants.Create_Group, "Account Type"));
		createGroup.clickCreatedFromDateCalendar(JsonUtils.getData(DefineConstants.Create_Group, "Created From Date"));
		createGroup.clickCreatedToDateCalendar(JsonUtils.getData(DefineConstants.Create_Group, "Created To Date"));
		createGroup.selectIsAccountHolder(JsonUtils.getData(DefineConstants.Create_Group, "Is Account Holder"));
		createGroup.enterAccountOpenedSource(JsonUtils.getData(DefineConstants.Create_Group, "Account Opened Source"));
		createGroup.clickSaveGroup();
		managedContacts.verifyAddedToGroupSuccessfully(JsonUtils.getData(DefineConstants.Create_Group, "Verification Message"));
		manageGroups.searchGroup(JsonUtils.getData(DefineConstants.Create_Group, "Name"));
		manageGroups.verifyInputValue(JsonUtils.getData(DefineConstants.Create_Group, "Name"));
	}
}
