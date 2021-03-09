package com.plumb5.mobile.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.Mobile;
import com.plumb5.pageobjects.SMS_Scheduled_Campaigns;
import com.plumb5.pageobjects.SMS_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.DropDown;
import helperMethods.JsonUtils;

public class TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns extends BaseClass{

	Dashboard dashboard;
	LoginPage loginPage;
	Mobile mobile;
	SMS_Template sms_Template;
	Mail mail;
	Campaigns campaigns;
	SMS_Scheduled_Campaigns smsscheduledCampaigns;
	DropDown dropDown;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns","Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		mobile = new Mobile(driver, test);
		sms_Template= new SMS_Template(driver, test);
		mail= new Mail(driver, test);
		campaigns= new Campaigns(driver, test);	
		smsscheduledCampaigns= new SMS_Scheduled_Campaigns(driver, test);
		this.dropDown = new DropDown(driver);
		
		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		
		loginPage.clickSignInButton();
		dashboard.click_Mobile();
		mobile.click_PushNotifications();
		mobile.click_ManageCampaigns();
		
		//Creat
		mobile.click_CreateScheduledCampaign();
		mobile.enter_CampaignIdentifier();
		mobile.select_CampaignName(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Campaign Name"));
		mobile.select_TemplateName(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Template Name"));
//		mobile.select_CampaignType(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Campaign Type"));
		mobile.enter_SendTo(JsonUtils.getArrayValues(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Send To"));		
		mobile.click_NextButton();
		mobile.click_NextButton_GroupAnalysis();
//		smsscheduledCampaigns.select_BatchType(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Batch Type"));
		mobile.select_DeliveryDate(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Scheduled Date"));
		mobile.select_DeliveryTime(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Scheduled Time"));
		mobile.click_NextButton();
		mobile.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Test Campaign Value"));
		mobile.click_SaveButton();
		
		mobile.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Time Period"));
		mobile.search_ScheduleCampaign();
		mobile.verifyInputValueData();
		mobile.click_KebabMenu();
		mobile.click_DuplicateButton();
		
		//Duplicate
		mobile.enter_CampaignIdentifier();
		mobile.select_CampaignName(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Campaign Name Duplicated"));
		mobile.select_TemplateName(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Template Name Duplicated"));
		mobile.enter_SendTo(JsonUtils.getArrayValues(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Send To Duplicated"));		
		mobile.click_NextButton();
		smsscheduledCampaigns.click_NextButton_GroupAnalysis();
		mobile.select_DeliveryDate(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Scheduled Date Duplicated"));
		mobile.select_DeliveryTime(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Scheduled Time Duplicated"));
		mobile.click_NextButton();
		mobile.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Test Campaign Radio Button Duplicated"),
				JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Test Campaign Value Duplicated"));
		mobile.click_SaveButton();
		
		mobile.select_ShowingDataFor1(JsonUtils.getData(DefineConstants.TC_09_Mobile_PushNotification_ManageCampaigns_Duplicate_Scheduled_Campaigns, "Time Period Duplicated"));
		mobile.search_ScheduleCampaign();
		mobile.verifyInputValueData();
		
		
		
		
	}
}
