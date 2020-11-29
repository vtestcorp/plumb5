package com.plumb5.sms.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.CreateGroups;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.ManageGroups;
import com.plumb5.pageobjects.ManagedContacts;
import com.plumb5.pageobjects.SMS_Settings;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_29_SMS_Settings_Configuration_AddESP_DeleteESP extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;
	Mail mail;
	Campaigns campaigns;
	SMS_Settings smssettings;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_29_SMS_Settings_Configuration_AddESP_DeleteESP", "SMS_Settings_Configuration_AddESP_DeleteESP");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		manageGroups = new ManageGroups(driver, test);
		createGroup = new CreateGroups(driver, test);
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);
		campaigns = new Campaigns(driver, test);
		smssettings = new SMS_Settings(driver, test);

		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_SMS();
		dashboard.click_SMS_Settings();

		smssettings.click_SelectProvider();
		smssettings.enter_ProviderName(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Promotional Provider Name"));
		// Promotional Setting
		smssettings.click_PromotionalSettings();
		smssettings.enter_PromotionalNameYourConfiguration(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Promotional Configuration"));
		smssettings.enter_PromotionalSendersName(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Promotional Sender Name"));
        smssettings.enter_PromotionalUserName(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Promotional User Name"));
        smssettings.enter_PromotionalPassword(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Promotional Password"));
        //Transactional Setting
        smssettings.click_TransactionalSettings();
        smssettings.enter_TransactionalNameYourConfiguration(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Transactional Configuration"));
        smssettings.enter_TransactionalSendersName(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Transactional Sender Name"));
        smssettings.enter_TransactionalUserName(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Transactional User Name"));
        smssettings.enter_TransactionalPassword(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Transactional Password"));
        smssettings.click_Add_SSP();
        smssettings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Success Message"));
        smssettings.verifyInputValue(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Promotional Provider Name"));
        smssettings.selectProviderToEdit(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Promotional Provider Name"));
        smssettings.click_DeleteButton();
        smssettings.click_DeleteButtonPopUp();
        smssettings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_29_SMS_Settings_Configuration_AddESP_DeleteESP, "Delete Success Message"));
	}
}