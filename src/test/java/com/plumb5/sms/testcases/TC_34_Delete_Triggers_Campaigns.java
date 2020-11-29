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
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.SMS_Triggers;
import com.plumb5.pageobjects.Scheduled_Campaigns;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_34_Delete_Triggers_Campaigns extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;
	Mail mail;
	Campaigns campaigns;
	Scheduled_Campaigns scheduledCampaigns;
	SMS_Triggers smsTriggers;
	SMS sms;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_34_Delete_Triggers_Campaigns", "Delete_Triggers_Campaigns");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		manageGroups = new ManageGroups(driver, test);
		createGroup = new CreateGroups(driver, test);
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);
		campaigns = new Campaigns(driver, test);
		scheduledCampaigns = new Scheduled_Campaigns(driver, test);
		sms = new SMS(driver, test);
		smsTriggers = new SMS_Triggers(driver, test);
		
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_SMS();
		sms.click_Manage();
		sms.click_Campaigns();
		sms.click_Triggers();
		
		smsTriggers.click_CreateTriggers();
		smsTriggers.enter_TriggerIdentifier(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Trigger Identifier"));
		smsTriggers.select_CampaignName(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Campaign Name"));
		smsTriggers.select_ContentType(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Content Type"));
		smsTriggers.select_Template(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Select Template"));		
		smsTriggers.select_DeliveryTime(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Delivery Time"));
		smsTriggers.click_NextButton();
		smsTriggers.select_Rule(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Select Rule"));
		smsTriggers.click_NextButton();
		smsTriggers.select_TestCampaign_Value1(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Test Campaign Value 1"));
		smsTriggers.select_TestCampaign_Value2(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Test Campaign Value 2"));	
		smsTriggers.enter_PhoneNumber(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Phone Number"));
//		smsTriggers.click_TestCampaign_Button();
		smsTriggers.click_SaveButton();
		smsTriggers.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Success Message"));	
		smsTriggers.search_Triggers(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Trigger Identifier"));
		smsTriggers.verifyInputValue(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Trigger Identifier"));
		smsTriggers.check_TriggerStatus();
		// Delete Triggers
		smsTriggers.selectTriggerToEdit(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Trigger Identifier"));
		smsTriggers.click_Delete();
		smsTriggers.clickDeletePopUp();
		smsTriggers.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_34_Delete_Triggers_Campaigns, "Delete Success Message"));		
		}
}