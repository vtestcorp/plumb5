package com.plumb5.mobile.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.Mobile;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.SMS_Scheduled_Campaigns;
import com.plumb5.pageobjects.SMS_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	Mobile mobile;
	SMS_Template sms_Template;
	Mail mail;
	Campaigns campaigns;
	SMS_Scheduled_Campaigns smsscheduledCampaigns;
	
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns","Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		mobile = new Mobile(driver, test);
		sms_Template= new SMS_Template(driver, test);
		mail= new Mail(driver, test);
		campaigns= new Campaigns(driver, test);		
		smsscheduledCampaigns= new SMS_Scheduled_Campaigns(driver, test);
		
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Mobile();
		mobile.click_PushNotifications();
		mobile.click_ManageCampaigns();
		mobile.click_CreateScheduledCampaign();
		
		
		mobile.enter_CampaignIdentifier(JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Campaign Identier"));
		mobile.select_CampaignName(JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Campaign Name"));
		mobile.select_TemplateName(JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Template Name"));
//		mobile.select_CampaignType(JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Campaign Type"));
		mobile.enter_SendTo(JsonUtils.getArrayValues(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Send To"));		
		mobile.click_NextButton();
//		smsscheduledCampaigns.click_NextButton_GroupAnalysis();
//		smsscheduledCampaigns.select_BatchType(JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Batch Type"));
		mobile.select_DeliveryDate(JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Scheduled Date"));
		mobile.select_DeliveryTime(JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Scheduled Time"));
		mobile.click_NextButton();
		mobile.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Test Campaign Value"));
		mobile.click_SaveButton();
		
//		campaigns.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Time Period"));
//		smsscheduledCampaigns.search_ScheduledCampaign(JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Campaign Identier"));
//		smsscheduledCampaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns, "Campaign Identier"));		
	}
}