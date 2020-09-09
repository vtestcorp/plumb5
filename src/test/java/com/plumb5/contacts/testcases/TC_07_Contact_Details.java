package com.plumb5.contacts.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagedContacts;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_07_Contact_Details extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	LoginPage loginPage;
	
	@Test(alwaysRun = true)
	public void fetch_Contact_Details() throws Exception {

		test = extent.createTest("TC_07_Contact_Details", "Fetch all contact details");

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
		managedContacts.searchContact(JsonUtils.getData(DefineConstants.Contact_Details, "Email"));
		managedContacts.fetchContactDetails();
	}
}
