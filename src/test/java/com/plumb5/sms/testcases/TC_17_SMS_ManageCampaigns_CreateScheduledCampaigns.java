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

public class TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	SMS_Template sms_Template;
	Mail mail;
	Campaigns campaigns;
	SMS_Scheduled_Campaigns smsscheduledCampaigns;
	
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns","SMS_ManageCampaigns_CreateScheduledCampaigns");

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
		smsscheduledCampaigns.enter_CampaignIdentifier(JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Campaign Identier"));
		smsscheduledCampaigns.select_CampaignName(JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Campaign Name"));
		smsscheduledCampaigns.select_CampaignType(JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Campaign Type"));
		smsscheduledCampaigns.enter_SendTo(JsonUtils.getArrayValues(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Send To"));
//		smsscheduledCampaigns.enter_SendTo(
//				JsonUtils.getArrayValues(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Send To"),
//				JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Merged Group Name"),
//				JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Merged Group Description"));
		smsscheduledCampaigns.select_SelectTemplate(JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Template Name"));
		smsscheduledCampaigns.click_NextButton();
		smsscheduledCampaigns.click_NextButton_GroupAnalysis();
		smsscheduledCampaigns.select_BatchType(JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Batch Type"));
		smsscheduledCampaigns.select_ScheduledDate(JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Scheduled Date"));
		smsscheduledCampaigns.select_ScheduledTime(JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Scheduled Time"));
		smsscheduledCampaigns.click_NextButton();
		smsscheduledCampaigns.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Test Campaign Value"));
		smsscheduledCampaigns.click_SaveButton();
		campaigns.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Time Period"));
		smsscheduledCampaigns.search_ScheduledCampaign(JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Campaign Identier"));
		smsscheduledCampaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns, "Campaign Identier"));		
	}
}