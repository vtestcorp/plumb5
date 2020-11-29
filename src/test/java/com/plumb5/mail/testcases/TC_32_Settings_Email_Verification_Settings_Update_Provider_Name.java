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
import helperMethods.DatabaseUtils;
import helperMethods.JsonUtils;

public class TC_32_Settings_Email_Verification_Settings_Update_Provider_Name extends BaseClass {

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

		test = extent.createTest("TC_32_Settings_Email_Verification_Settings_Update_Provider_Name","Settings_Email_Verification_Settings_Update_Provider_Name");

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

		// Email Verification Settings
		DatabaseUtils.clearEmailVerificationsSetting();
		settings.click_EmailVerificationSettings();
		settings.enter_ProviderNameEmailVerificationSettings(JsonUtils.getData(DefineConstants.TC_32_Settings_Email_Verification_Settings_Update_Provider_Name,"Provider Name Email Verification Settings"));
		settings.enter_APIKey_APIUrl_EmailVerificationSettings(JsonUtils.getData(DefineConstants.TC_32_Settings_Email_Verification_Settings_Update_Provider_Name,"apiKey_EmailVerificationSettings"),JsonUtils.getData(DefineConstants.TC_32_Settings_Email_Verification_Settings_Update_Provider_Name,"apiUrl_EmailVerificationSettings"));
		settings.click_AddProvider_EmailVerificationSettings();
		settings.verify_SuccessMessage(
				JsonUtils.getData(DefineConstants.TC_32_Settings_Email_Verification_Settings_Update_Provider_Name,"Added Successfully Email Verification Settings"));
		settings.verify_Provider_Name_Email_Verification_Settings(
				JsonUtils.getData(DefineConstants.TC_32_Settings_Email_Verification_Settings_Update_Provider_Name,"Provider Name Email Verification Settings"));
		driver.navigate().refresh();
		settings.click_EmailVerificationSettings();
		settings.click_Edit_Button_Provider_Name_Email_Verification_Settings(
				JsonUtils.getData(DefineConstants.TC_32_Settings_Email_Verification_Settings_Update_Provider_Name,"Provider Name Email Verification Settings"));
		// Update
//		settings.click_AddProvider_EmailVerificationSettings();
		settings.enter_ProviderNameEmailVerificationSettings(
				JsonUtils.getData(DefineConstants.TC_32_Settings_Email_Verification_Settings_Update_Provider_Name,"Update Provider Name Email Verification Settings"));
		settings.update_APIKey_APIUrl_EmailVerificationSettings(
				JsonUtils.getData(DefineConstants.TC_32_Settings_Email_Verification_Settings_Update_Provider_Name,"Update apiKey_EmailVerificationSettings"),
				JsonUtils.getData(DefineConstants.TC_32_Settings_Email_Verification_Settings_Update_Provider_Name,"Update apiUrl_EmailVerificationSettings"));

	}
}