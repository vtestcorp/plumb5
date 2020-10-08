package com.plumb5.contacts.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.CreateContacts;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagedContacts;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.DatabaseUtils;
import helperMethods.JsonUtils;

public class TC_19_Contact_Settings extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	CreateContacts createContacts;
	LoginPage loginPage;

	@Test(alwaysRun = true)
	public void createContact() throws Exception {

		test = extent.createTest("TC_19_Contact_Settings", "Contact_Settings");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		createContacts = new CreateContacts(driver, test);
		loginPage = new LoginPage(driver, test);

		DatabaseUtils.enable_ContactSetting();
		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.clickContacts();
		contact.click_Settings();
		
		// Verify fields Enabled
		contact.verify_PrimaryEmailEnabled();
		contact.verify_PrimarySMSEnabled();
		contact.verify_AlternateEmailEnabled();
		contact.verify_AlternateSMSEnabled();
		
		// Umnerge or disable fields
		contact.unmerge_PrimaryEmail();
		contact.unmerge_PrimarySMS();
		contact.unmerge_AlternateEmail();
		contact.unmerge_AlternateSMS();
		
		contact.unmerge_SettingsSaveButton();		
		contact.verify_Successfull_Error_Message();		
	}
}