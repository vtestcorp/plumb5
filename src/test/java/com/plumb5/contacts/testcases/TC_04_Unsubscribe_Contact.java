package com.plumb5.contacts.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagedContacts;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_04_Unsubscribe_Contact extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	LoginPage loginPage;

	@Test(alwaysRun = true)
	public void unsubscribe_Contact() throws Exception {

		test = extent.createTest("TC_04_Unsubscribe_Contact", "Unsubscribe contact by selecting contact");

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

		managedContacts.searchContact(JsonUtils.getData(DefineConstants.Unsubcribe_Contact, "Email"));
		managedContacts.verifyInputValue(JsonUtils.getData(DefineConstants.Unsubcribe_Contact, "Email"));

		managedContacts.selectContact(JsonUtils.getData(DefineConstants.Unsubcribe_Contact, "Email"));
		managedContacts.select_ActionDropdownValue(JsonUtils.getData(DefineConstants.Unsubcribe_Contact, "Action"));
		managedContacts.unsubcribePopUp_Email();
		managedContacts.unsubcribePopUp_SMS();
		managedContacts.clickPopUpUnsubcribeButton();
		managedContacts.verifyUnsubscribeMessage(JsonUtils.getData(DefineConstants.Unsubcribe_Contact, "Message"));
	}
}