package com.plumb5.mail.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.CreateGroups;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.ManageGroups;
import com.plumb5.pageobjects.ManagedContacts;
import com.plumb5.pageobjects.Settings;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_29_Settings_Configuration_Custom_Unsubscribe extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;
	Mail mail;
	Campaigns campaigns;
	Settings settings;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_29_Settings_Configuration_Custom_Unsubscribe", "Settings_Configuration_Custom_Unsubscribe");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		manageGroups = new ManageGroups(driver, test);
		createGroup = new CreateGroups(driver, test);
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);
		campaigns = new Campaigns(driver, test);
		settings = new Settings(driver, test);

		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();

		dashboard.click_Mail();
		mail.click_Settings();

		settings.click_EmailServiceProvider_ESP();
		settings.click_AddProvider();
		settings.enter_ProviderName(
				JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe, "Provider Name"));
		// Promotional Setting
		settings.click_PromotionalSettings();
		// settings.click_BulkSupport(JsonUtils.getData(DefineConstants.TC_24_Settings_Configuration,"Promotional
		// Bulk Support"));
		settings.enter_AccountName(JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe,
				"Promotional Account Name"));
		settings.enter_APIKey(JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe,
				"Promotional API Key"));
		settings.enter_ConfigurationUrl(JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe,
				"Promotional Configuration Url"));
		settings.click_TransactionalSettings();
		// Transactional Settings
		// settings.click_BulkSupportTransactional(JsonUtils.getData(DefineConstants.TC_24_Settings_Configuration,"Transactional
		// Bulk Support"));
		settings.enter_AccountNameTransactional(JsonUtils
				.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe, "Transactional Account Name"));
		settings.enter_APIKeyTransactional(JsonUtils
				.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe, "Transactional API Key"));
		settings.enter_ConfigurationUrlTransactional(JsonUtils.getData(
				DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe, "Transactional Configuration Url"));
		settings.click_SubmitButton();
		settings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe,
				"Service Provider Success Message"));
		settings.verify_Email_Service_Provider(
				JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe, "Provider Name"));
		 //Custom unsubscribe
		settings.click_CustomUnsubscribe();
		// settings.click_CustomUnsubscribeCheckbox();
		// settings.click_CustomUnsubscribeCheckbox();
		settings.enter_UnsubscribeUrl(JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe,"Unsubscribe Url"));
		settings.click_UpdateButtonCustomUnsubscribe();
		settings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe, "Success Message Custom Unsubscribe"));
        settings.click_EmailServiceProvider_ESP();
        settings.verify_Email_Service_Provider(
				JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe, "Provider Name"));
		settings.select_Email_Service_Provider_To_Edit(
				JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe, "Provider Name"));
		settings.click_DeleteButton_ESP();
		settings.click_Delete_PopUp_EmailServiceProvider();
		settings.verifyDeletedSuccessfully(JsonUtils.getData(DefineConstants.TC_29_Settings_Configuration_Custom_Unsubscribe, "Email Service Provider Delete Success Message"));
	}
}