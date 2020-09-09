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

public class TC_09_Create_Custom_Field extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	CreateContacts createContacts;
	LoginPage loginPage;

	@Test(alwaysRun = true)
	public void createContact() throws Exception {

		test = extent.createTest("TC 09 Create Custom Field", "Create Custom Field in create contact");

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
		createContacts.clickCustomFields();
		createContacts.enterCustomFieldName(JsonUtils.getData(DefineConstants.Custom_Fields, "Field Name"));
		createContacts.selectFieldType(JsonUtils.getData(DefineConstants.Custom_Fields, "Field Type"));
		createContacts.selectMandate(JsonUtils.getData(DefineConstants.Custom_Fields, "Mandatory"));
		createContacts.clickAddField();
		createContacts.verifyCustomFieldSuccessMessage(JsonUtils.getData(DefineConstants.Custom_Fields, "Field Name"));		
//		createContacts.clickCreateContact();
	}
}
