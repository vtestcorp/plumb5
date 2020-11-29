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

public class TC_27_SMS_Settings_Configuration_AddESP_EditESP extends BaseClass {

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

		test = extent.createTest("TC_27_SMS_Settings_Configuration_AddESP_EditESP", "SMS_Settings_Configuration_AddESP_EditESP");

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
		smssettings.enter_ProviderName(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Promotional Provider Name"));
		// Promotional Setting
		smssettings.click_PromotionalSettings();
		smssettings.enter_PromotionalNameYourConfiguration(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Promotional Configuration"));
		smssettings.enter_PromotionalSendersName(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Promotional Sender Name"));
        smssettings.enter_PromotionalUserName(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Promotional User Name"));
        smssettings.enter_PromotionalPassword(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Promotional Password"));
        //Transactional Setting
        smssettings.click_TransactionalSettings();
        smssettings.enter_TransactionalNameYourConfiguration(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Transactional Configuration"));
        smssettings.enter_TransactionalSendersName(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Transactional Sender Name"));
        smssettings.enter_TransactionalUserName(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Transactional User Name"));
        smssettings.enter_TransactionalPassword(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Transactional Password"));
        smssettings.click_Add_SSP();
        smssettings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Success Message"));
        smssettings.verifyInputValue(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Promotional Provider Name"));
        smssettings.selectProviderToEdit(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Promotional Provider Name"));
        smssettings.click_EditButton();
        //Update SSP
        //Update Promotional Setting
     	smssettings.click_PromotionalSettings();
     	smssettings.enter_PromotionalNameYourConfiguration(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Update Promotional Configuration"));
     	smssettings.enter_PromotionalSendersName(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Update Promotional Sender Name"));
        smssettings.enter_PromotionalUserName(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Update Promotional User Name"));
        smssettings.enter_PromotionalPassword(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Update Promotional Password"));
        //Update Transactional Setting
        smssettings.click_TransactionalSettings();
        smssettings.enter_TransactionalNameYourConfiguration(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Update Transactional Configuration"));
        smssettings.enter_TransactionalSendersName(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Update Transactional Sender Name"));
        smssettings.enter_TransactionalUserName(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Update Transactional User Name"));
        smssettings.enter_TransactionalPassword(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Update Transactional Password"));
        smssettings.click_Add_SSP();
        smssettings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_27_SMS_Settings_Configuration_AddESP_EditESP, "Success Message"));
	}
}