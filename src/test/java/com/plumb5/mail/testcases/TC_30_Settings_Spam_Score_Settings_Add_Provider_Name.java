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

public class TC_30_Settings_Spam_Score_Settings_Add_Provider_Name extends BaseClass {

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

		test = extent.createTest("TC_30_Settings_Spam_Score_Settings_Add_Provider_Name", "Settings_Spam_Score_Settings_Add_Provider_Name");

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
//		 Spam Score Settings
		DatabaseUtils.clearSpamScoreSetting();
	    settings.click_SpamScoreSettings();
		settings.enter_ProviderNameSpamScoreSettings(JsonUtils.getData(DefineConstants.TC_30_Settings_Spam_Score_Settings_Add_Provider_Name,"Provider Name Spam Score Settings"));
		settings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_30_Settings_Spam_Score_Settings_Add_Provider_Name,"Added Successfully Spam Score Settings"));
		settings.verify_Provider_Name_Spam_Score_Settings(JsonUtils.getData(DefineConstants.TC_30_Settings_Spam_Score_Settings_Add_Provider_Name,"Provider Name Spam Score Settings"));
	}
}