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

public class TC_28_Settings_Configuration_Add_ESP_Validate_ESP extends BaseClass {

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

		test = extent.createTest("TC_28_Settings_Configuration_Add_ESP_Validate_ESP",
				"Settings_Configuration_Add_ESP_Validate_ESP");

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
				JsonUtils.getData(DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP, "Provider Name"));
		// Promotional Setting
		settings.click_PromotionalSettings();

		settings.enter_AccountName(JsonUtils.getData(DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP,
				"Promotional Account Name"));
		settings.enter_APIKey(JsonUtils.getData(DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP,
				"Promotional API Key"));
		settings.enter_ConfigurationUrl(JsonUtils.getData(
				DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP, "Promotional Configuration Url"));
		settings.click_TransactionalSettings();
		// Transactional Settings

		settings.enter_AccountNameTransactional(JsonUtils.getData(
				DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP, "Transactional Account Name"));
		settings.enter_APIKeyTransactional(JsonUtils
				.getData(DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP, "Transactional API Key"));
		settings.enter_ConfigurationUrlTransactional(JsonUtils.getData(
				DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP, "Transactional Configuration Url"));
		settings.click_SubmitButton();
		settings.verify_SuccessMessage(JsonUtils.getData(
				DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP, "Service Provider Success Message"));
		settings.verify_Email_Service_Provider(
				JsonUtils.getData(DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP, "Provider Name"));
		settings.select_Email_Service_Provider_To_Edit(
				JsonUtils.getData(DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP, "Provider Name"));
		settings.click_ValidateButton_ESP();		
		settings.verifyValidateSuccessfully(JsonUtils.getData(DefineConstants.TC_28_Settings_Configuration_Add_ESP_Validate_ESP, "Email Service Provider Validate Success Message"));

	}
}