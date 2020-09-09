package com.plumb5.contacts.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.CreateContacts;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagedContacts;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_11_Verify_Custom_Field_Present extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	CreateContacts createContacts;
	LoginPage loginPage;

	@Test(alwaysRun = true)
	public void createContact() throws Exception {

		test = extent.createTest("TC_11_Verify_Custom_Field_Present", "Verify custom field is present or not");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		createContacts = new CreateContacts(driver, test);
		loginPage = new LoginPage(driver, test);

		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.clickContacts();
		contact.clickManageContacts();
		managedContacts.clickCreateContacts();
		createContacts.verifyCustomField(
				JsonUtils.getData(DefineConstants.Verify_Custom_Field_Presence, "Check field presence"));
	}
}
