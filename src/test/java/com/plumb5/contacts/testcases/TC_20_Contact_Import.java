package com.plumb5.contacts.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.ContactsImport;
import com.plumb5.pageobjects.CreateContacts;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagedContacts;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_20_Contact_Import extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	CreateContacts createContacts;
	LoginPage loginPage;
	ContactsImport contactsImport;
	
	@Test(alwaysRun = true)
	public void createContact() throws Exception {

		test = extent.createTest("TC_20_Contact_Import", "Contact_Import");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		createContacts = new CreateContacts(driver, test);
		loginPage = new LoginPage(driver, test);
		contactsImport = new ContactsImport(driver, test);

		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.clickContacts();
		contact.clickContactImport();
		contactsImport.click_StartAnImport();
		contactsImport.select_CampaignName(JsonUtils.getData(DefineConstants.Contact_Import, "Group Name"));
		contactsImport.click_ChooseFileButton();
		contactsImport.uploadFile(JsonUtils.getData(DefineConstants.Contact_Import, "File Path"));
		contactsImport.select_DoNotAddContactToThisGroup();
		contactsImport.select_RemoveContacts_Button();
		contactsImport.click_NextButton();
		contactsImport.click_NextButton();
		contactsImport.click_FinishImportButton();
		contactsImport.verify_SuccessMessage(JsonUtils.getData(DefineConstants.Contact_Import, "Success Message"));
	}
}