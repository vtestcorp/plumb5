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

public class TC_10_Web_ManageNotifications_CreateRSSNotifications extends BaseClass {

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

		test = extent.createTest("TC_10_Web_ManageNotifications_CreateRSSNotifications","Web_ManageNotifications_CreateRSSNotifications");

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
		web.click_RSS_Notifications();
		web.click_CreateRSSNotifications();
		
		web_Scheduled_Campaigns.enter_CampaignIdentifier(JsonUtils.getData(DefineConstants.TC_10_Web_ManageNotifications_CreateRSSNotifications, "Campaign Identier"));
		web_Scheduled_Campaigns.select_RSSCampaignName(JsonUtils.getData(DefineConstants.TC_10_Web_ManageNotifications_CreateRSSNotifications, "Campaign Name"));
		web_Scheduled_Campaigns.enter_RSSUrl(JsonUtils.getData(DefineConstants.TC_10_Web_ManageNotifications_CreateRSSNotifications, "RSS Url"));
		web_Scheduled_Campaigns.enter_RSSGroup(JsonUtils.getData(DefineConstants.TC_10_Web_ManageNotifications_CreateRSSNotifications, "RSS Group"));
		web_Scheduled_Campaigns.enter_RSSHr(JsonUtils.getData(DefineConstants.TC_10_Web_ManageNotifications_CreateRSSNotifications, "RSS Hr"));
		web_Scheduled_Campaigns.enter_RSSMinutes(JsonUtils.getData(DefineConstants.TC_10_Web_ManageNotifications_CreateRSSNotifications, "RSS Minutes"));		
		web_Scheduled_Campaigns.click_RSSNextButton();
		web_Scheduled_Campaigns.click_RSSNextButton();
		web_Scheduled_Campaigns.enter_MachineID(JsonUtils.getData(DefineConstants.TC_10_Web_ManageNotifications_CreateRSSNotifications, "Machine Id"));
		web_Scheduled_Campaigns.click_RSSNextButton();		
		web_Scheduled_Campaigns.search_ScheduledCampaign(JsonUtils.getData(DefineConstants.TC_10_Web_ManageNotifications_CreateRSSNotifications, "Campaign Identier"));
		web_Scheduled_Campaigns.verifyRSSInputValue(JsonUtils.getData(DefineConstants.TC_10_Web_ManageNotifications_CreateRSSNotifications, "Campaign Identier"));		
	}
}