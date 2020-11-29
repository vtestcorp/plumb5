package com.plumb5.sms.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.SMS_Scheduled_Campaigns;
import com.plumb5.pageobjects.SMS_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	SMS_Template sms_Template;
	Mail mail;
	Campaigns campaigns;
	SMS_Scheduled_Campaigns smsscheduledCampaigns;
	
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns","SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
		sms_Template= new SMS_Template(driver, test);
		mail= new Mail(driver, test);
		campaigns= new Campaigns(driver, test);		
		smsscheduledCampaigns= new SMS_Scheduled_Campaigns(driver, test);
		
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_SMS();
		sms.click_Manage();
		mail.click_Campaigns();
		campaigns.click_CreateScheduled();
		smsscheduledCampaigns.enter_CampaignIdentifier(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Campaign Identier"));
		smsscheduledCampaigns.select_CampaignName(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Campaign Name"));
		smsscheduledCampaigns.select_CampaignType(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Campaign Type"));
		smsscheduledCampaigns.enter_SendTo(JsonUtils.getArrayValues(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Send To"));
//		smsscheduledCampaigns.enter_SendTo(
//				JsonUtils.getArrayValues(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Send To"),
//				JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Merged Group Name"),
//				JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Merged Group Description"));
		smsscheduledCampaigns.select_SelectTemplate(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Template Name"));
		smsscheduledCampaigns.click_NextButton();
		smsscheduledCampaigns.click_NextButton_GroupAnalysis();
		smsscheduledCampaigns.select_BatchType(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Batch Type"));
		smsscheduledCampaigns.select_ScheduledDate(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Scheduled Date"));
		smsscheduledCampaigns.select_ScheduledTime(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Scheduled Time"));
		smsscheduledCampaigns.click_NextButton();
		smsscheduledCampaigns.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Test Campaign Value"));
		smsscheduledCampaigns.click_SaveButton();
		campaigns.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Time Period"));
		smsscheduledCampaigns.search_ScheduledCampaign(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Campaign Identier"));
		smsscheduledCampaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Campaign Identier"));
		smsscheduledCampaigns.selectCampaignToEdit(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Campaign Identier"));
		smsscheduledCampaigns.selectDuplicateOption();
		// Duplicate Campaign
		smsscheduledCampaigns.enter_CampaignIdentifier(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Campaign Identier"));
		smsscheduledCampaigns.select_CampaignName(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Campaign Name"));
		smsscheduledCampaigns.select_CampaignType(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Campaign Type"));
		smsscheduledCampaigns.clear_SendTo();
		smsscheduledCampaigns.enter_SendTo(JsonUtils.getArrayValues(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Send To"));
		smsscheduledCampaigns.select_SelectTemplate(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Template Name"));
		smsscheduledCampaigns.click_NextButton();
		smsscheduledCampaigns.click_NextButton_GroupAnalysis();
//		smsscheduledCampaigns.select_BatchType(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Batch Type"));
		smsscheduledCampaigns.select_ScheduledDate(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Scheduled Date"));
		smsscheduledCampaigns.select_ScheduledTime(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Scheduled Time"));
		smsscheduledCampaigns.click_NextButton();
		smsscheduledCampaigns.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Test Campaign Value"));
		smsscheduledCampaigns.click_SaveButton();
		campaigns.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Time Period"));
		smsscheduledCampaigns.search_ScheduledCampaign(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Campaign Identier"));
		smsscheduledCampaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns, "Duplicate Campaign Identier"));
	}
}