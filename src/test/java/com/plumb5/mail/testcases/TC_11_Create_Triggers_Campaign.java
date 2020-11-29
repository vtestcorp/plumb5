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

public class TC_11_Create_Triggers_Campaign extends BaseClass {

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

		test = extent.createTest("TC_11_Create_Triggers_Campaign", "Create_Triggers_Campaign");

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
		triggers.click_CreateTriggers();
		triggers.enter_TriggerIdentifier(
				JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Trigger Identifier"));
		triggers.select_CampaignName(
				JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Campaign Name"));
		triggers.select_ContentType(JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Content Type"));
		triggers.select_DeliveryTime(
				JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Delivery Time"));
		triggers.click_NextButton();
		triggers.enter_FromName(JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "From Name"));
		triggers.select_FromAddress(JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "From Address"));
		triggers.enter_ReplyToAddress(
				JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Reply to Address"));
		triggers.enter_SubjectLine(JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Subject Line"));
		triggers.select_Template(JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Select Template"));
		triggers.click_NextButton();
		triggers.click_NextButton();
		triggers.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Test Campaign Value"));
		triggers.click_SaveButton();
		triggers.verify_SuccessMessage(
				JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Success Message"));
		triggers.search_Draft(JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Trigger Identifier"));
		triggers.verifyInputValue(
				JsonUtils.getData(DefineConstants.TC_11_Create_Triggers_Campaign, "Trigger Identifier"));
	}
}