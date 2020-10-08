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

public class TC_01_Create_Contact extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	CreateContacts createContacts;
	LoginPage loginPage;

	@Test(alwaysRun = true)
	public void createContact() throws Exception {

		test = extent.createTest("TC_01_Create_Contact", "Create Contact By Filling all details");

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
		createContacts.enterFirstName(JsonUtils.getData(DefineConstants.Create_Contact, "First Name"));
		createContacts.enterLastName(JsonUtils.getData(DefineConstants.Create_Contact, "Last Name"));
		createContacts.enterEmailID(JsonUtils.getData(DefineConstants.Create_Contact, "Email"));
		createContacts.enterAlternateEmailID(JsonUtils.getData(DefineConstants.Create_Contact, "Alternate Email Id"));
		createContacts.enterPhoneNumber(JsonUtils.getData(DefineConstants.Create_Contact, "Phone Number"));
		createContacts.enterAlternatePhoneNumber(JsonUtils.getData(DefineConstants.Create_Contact, "Alternate Phone Number"));
		createContacts.enterAddress1(JsonUtils.getData(DefineConstants.Create_Contact, "Address 1"));
		createContacts.enterAddress2(JsonUtils.getData(DefineConstants.Create_Contact, "Address 2"));
		createContacts.enterState(JsonUtils.getData(DefineConstants.Create_Contact, "State"));
		createContacts.enterCountry(JsonUtils.getData(DefineConstants.Create_Contact, "country"));
		createContacts.enterPostalCode(JsonUtils.getData(DefineConstants.Create_Contact, "Postal Code"));
		createContacts.enterDOB(JsonUtils.getData(DefineConstants.Create_Contact, "D.O.B"));
		// createContacts.enterCity(JsonUtils.getData(DefineConstants.Create_Contact,"city"));
		createContacts.selectGender(JsonUtils.getData(DefineConstants.Create_Contact, "Gender"));
		createContacts.selectMaritalStatus(JsonUtils.getData(DefineConstants.Create_Contact, "Martial Status"));
		createContacts.enterEducation(JsonUtils.getData(DefineConstants.Create_Contact, "Education"));
		createContacts.enterOccupation(JsonUtils.getData(DefineConstants.Create_Contact, "Occupation"));
		createContacts.enterInterests(JsonUtils.getData(DefineConstants.Create_Contact, "Interests"));
		createContacts.enterReligion(JsonUtils.getData(DefineConstants.Create_Contact, "Religion"));
		createContacts.enterCompanyName(JsonUtils.getData(DefineConstants.Create_Contact, "Company Name"));
		createContacts.enterCompanyUrl(JsonUtils.getData(DefineConstants.Create_Contact, "Company Web URL"));
		createContacts.enterDomainName(JsonUtils.getData(DefineConstants.Create_Contact, "Domain Name"));
		createContacts.enterCompanyAddress(JsonUtils.getData(DefineConstants.Create_Contact, "Company Address"));
		createContacts.enterProject(JsonUtils.getData(DefineConstants.Create_Contact, "project"));
		createContacts.enterStage(JsonUtils.getData(DefineConstants.Create_Contact, "Stage"));
		createContacts.enterNotes(JsonUtils.getData(DefineConstants.Create_Contact, "Notes"));
		createContacts.enterNewExtra(JsonUtils.getData(DefineConstants.Create_Contact, "NewExtra"));
		createContacts.enterExtra2(JsonUtils.getData(DefineConstants.Create_Contact, "Extra2"));
		createContacts.enterTestingOnly(JsonUtils.getData(DefineConstants.Create_Contact, "testing only"));
		createContacts.enterCustomOneTest(JsonUtils.getData(DefineConstants.Create_Contact, "Custom one Test"));
		createContacts.enterFieldOne(JsonUtils.getData(DefineConstants.Create_Contact, "field one"));
		createContacts.enterFieldTwo(JsonUtils.getData(DefineConstants.Create_Contact, "field two"));
		createContacts.enterOne(JsonUtils.getData(DefineConstants.Create_Contact, "one"));
		createContacts.enterTwo(JsonUtils.getData(DefineConstants.Create_Contact, "two"));
		createContacts.enterOneOne(JsonUtils.getData(DefineConstants.Create_Contact, "one one"));
		createContacts.enterKK(JsonUtils.getData(DefineConstants.Create_Contact, "kk"));
		createContacts.entercxxzzxCzxc(JsonUtils.getData(DefineConstants.Create_Contact, "cxxzzxCzxc"));
		createContacts.clickCreateContact();
		managedContacts.searchContact(JsonUtils.getData(DefineConstants.Create_Contact, "Email"));
		managedContacts.verifyInputValue(JsonUtils.getData(DefineConstants.Create_Contact, "Email"));
	}
}