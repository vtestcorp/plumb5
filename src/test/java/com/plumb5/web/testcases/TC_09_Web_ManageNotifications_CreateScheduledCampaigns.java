package com.plumb5.web.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.SMS_Template;
import com.plumb5.pageobjects.Web;
import com.plumb5.pageobjects.Web_Scheduled_Campaigns;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_09_Web_ManageNotifications_CreateScheduledCampaigns extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	SMS_Template sms_Template;
	Mail mail;
	Campaigns campaigns;
	Web_Scheduled_Campaigns web_Scheduled_Campaigns;
	Web web;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_09_Web_ManageNotifications_CreateScheduledCampaigns","Web_ManageNotifications_CreateScheduledCampaigns");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
		sms_Template= new SMS_Template(driver, test);
		mail= new Mail(driver, test);
		campaigns= new Campaigns(driver, test);		
		web_Scheduled_Campaigns= new Web_Scheduled_Campaigns(driver, test); 
		web= new Web(driver, test);
		
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Web();
		web.click_BrowserNotification();
		web.click_ManageNotification();
		web.click_CreateScheduledCampaign();
		
		web_Scheduled_Campaigns.enter_CampaignIdentifier(JsonUtils.getData(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Campaign Identier"));
		web_Scheduled_Campaigns.select_CampaignName(JsonUtils.getData(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Campaign Name"));
		web_Scheduled_Campaigns.select_SelectTemplate(JsonUtils.getData(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Template Name"));
		web_Scheduled_Campaigns.enter_SendTo(JsonUtils.getArrayValues(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Send To"));

		web_Scheduled_Campaigns.click_NextButton();
		web_Scheduled_Campaigns.click_NextButton_GroupDetails();
	
		web_Scheduled_Campaigns.select_DeliveryDate(JsonUtils.getData(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Scheduled Date"));
		web_Scheduled_Campaigns.select_DeliveryTime(JsonUtils.getData(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Scheduled Time"));
		web_Scheduled_Campaigns.click_NextButton();
		web_Scheduled_Campaigns.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Test Campaign Value"));
		web_Scheduled_Campaigns.click_SaveButton();
		campaigns.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Time Period"));
		web_Scheduled_Campaigns.search_ScheduledCampaign(JsonUtils.getData(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Campaign Identier"));
		web_Scheduled_Campaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_09_Web_ManageNotifications_CreateScheduledCampaigns, "Campaign Identier"));		
	}
}