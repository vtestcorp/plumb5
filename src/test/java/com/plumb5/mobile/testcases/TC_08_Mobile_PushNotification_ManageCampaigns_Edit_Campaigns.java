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

public class TC_08_Mobile_PushNotification_ManageCampaigns_Edit_Campaigns extends BaseClass{
	
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

		test = extent.createTest("TC_07_Mobile_PushNotification_ManageCampaigns_Search_Campaigns","Mobile_PushNotification_ManageCampaigns_SearchdCampaigns");

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
		mobile.select_CampaignName(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Campaign Name"));
		mobile.select_TemplateName(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Template Name"));
//		mobile.select_CampaignType(JsonUtils.getData(DefineConstants.TC_07_Mobile_PushNotification_ManageCampaigns_Search_Campaigns, "Campaign Type"));
		mobile.enter_SendTo(JsonUtils.getArrayValues(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Send To"));		
		mobile.click_NextButton();
		mobile.click_NextButton_GroupAnalysis();
//		smsscheduledCampaigns.select_BatchType(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Batch Type"));
		mobile.select_DeliveryDate(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Scheduled Date"));
		mobile.select_DeliveryTime(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Scheduled Time"));
		mobile.click_NextButton();
		mobile.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Test Campaign Value"));
		mobile.click_SaveButton();
		
		//Edit
		mobile.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Time Period"));
		mobile.search_ScheduleCampaign();
		mobile.verifyInputValueData();
		mobile.click_KebabMenu();
		
		mobile.click_EditButton();
		mobile.enter_CampaignIdentifier();
		mobile.enter_Campaign_Name_New(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "New Campaign Name Edited"));
		mobile.selectTemplateName(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "New Template Name Edited"));
		mobile.enter_SendTo(JsonUtils.getArrayValues(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Send To Edited"));	
		mobile.click_NextButton();
		smsscheduledCampaigns.click_NextButton_GroupAnalysis();
		mobile.select_DeliveryDate(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "New Scheduled Date Edited"));
		mobile.select_DeliveryTime(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "New Scheduled Time Edited"));
		mobile.click_NextButton();
		mobile.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Test Campaign Radio Button Edited"),
				JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Test Campaign Value Edited"));
		mobile.click_SaveButton();
		mobile.select_ShowingDataFor1(JsonUtils.getData(DefineConstants.TC_08_Mobile_PushNotification_ManageCampaigns_EditCampaigns, "Time Period Edited"));
		mobile.search_ScheduleCampaign();
		mobile.verifyInputValueData();
		
		
	}
}
