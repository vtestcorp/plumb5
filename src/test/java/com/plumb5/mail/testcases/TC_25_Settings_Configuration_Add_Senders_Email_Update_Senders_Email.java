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

public class TC_25_Settings_Configuration_Add_Senders_Email_Update_Senders_Email extends BaseClass {

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

		test = extent.createTest("TC_25_Settings_Configuration_Add_Senders_Email_Update_Senders_Email", "Settings_Configuration_Add_Senders_Email_Update_Senders_Email");

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
		settings.click_AddEmail();
		settings.enter_EmailAddress(JsonUtils.getData(DefineConstants.TC_25_Settings_Configuration_Add_Senders_Email_Update_Senders_Email, "Email Address"));
		settings.click_AddEmail_PopUp();
		settings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_25_Settings_Configuration_Add_Senders_Email_Update_Senders_Email, "Success Message"));
		settings.verify_FromEmailID(JsonUtils.getData(DefineConstants.TC_25_Settings_Configuration_Add_Senders_Email_Update_Senders_Email, "Email Address"));
        settings.update_SenderEmailIdsDetails(JsonUtils.getData(DefineConstants.TC_25_Settings_Configuration_Add_Senders_Email_Update_Senders_Email, "Email Address"));
//        settings.click_Delete_PopUp();
        settings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_25_Settings_Configuration_Add_Senders_Email_Update_Senders_Email, "Success Message Update Email"));
	}
}