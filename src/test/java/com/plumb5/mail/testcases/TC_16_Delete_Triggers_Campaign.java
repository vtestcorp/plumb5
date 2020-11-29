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
import com.plumb5.pageobjects.Scheduled_Campaigns;
import com.plumb5.pageobjects.Triggers;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;
import helperMethods.Keyboard;

public class TC_16_Delete_Triggers_Campaign extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;
	Mail mail;
	Campaigns campaigns;
	Scheduled_Campaigns scheduledCampaigns;
	Triggers triggers;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_16_Delete_Triggers_Campaign", "Delete_Triggers_Campaign");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		manageGroups = new ManageGroups(driver, test);
		createGroup = new CreateGroups(driver, test);
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);
		campaigns = new Campaigns(driver, test);
		scheduledCampaigns = new Scheduled_Campaigns(driver, test);
		triggers = new Triggers(driver, test);

		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Mail();
		mail.clickManage();
		mail.click_Campaigns();
		campaigns.click_Triggers();
		triggers.search_Draft(JsonUtils.getData(DefineConstants.TC_16_Delete_Triggers_Campaign, "Trigger Identifier"));
		triggers.verifyInputValue(
				JsonUtils.getData(DefineConstants.TC_16_Delete_Triggers_Campaign, "Trigger Identifier"));
		// Delete Trigger
		triggers.selectTriggerToEdit(JsonUtils.getData(DefineConstants.TC_16_Delete_Triggers_Campaign, "Trigger Identifier"));
		triggers.click_Delete();
		triggers.clickDeletePopUp();
		Keyboard.pressEscape();
		triggers.verify_DeleteSuccessfullyMessage(JsonUtils.getData(DefineConstants.TC_16_Delete_Triggers_Campaign, "Success Message"));	
	}
}