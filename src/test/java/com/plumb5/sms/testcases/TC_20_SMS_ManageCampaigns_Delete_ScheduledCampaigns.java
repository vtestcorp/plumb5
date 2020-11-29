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

public class TC_20_SMS_ManageCampaigns_Delete_ScheduledCampaigns extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	SMS_Template sms_Template;
	Mail mail;
	Campaigns campaigns;
	SMS_Scheduled_Campaigns smsscheduledCampaigns;
	
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_20_SMS_ManageCampaigns_Delete_ScheduledCampaigns","SMS_ManageCampaigns_Delete_ScheduledCampaigns");

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
		campaigns.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_20_SMS_ManageCampaigns_Delete_ScheduledCampaigns, "Time Period"));
		smsscheduledCampaigns.search_ScheduledCampaign(JsonUtils.getData(DefineConstants.TC_20_SMS_ManageCampaigns_Delete_ScheduledCampaigns, "Campaign Identier"));
		smsscheduledCampaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_20_SMS_ManageCampaigns_Delete_ScheduledCampaigns, "Campaign Identier"));
		smsscheduledCampaigns.selectCampaignToEdit(JsonUtils.getData(DefineConstants.TC_20_SMS_ManageCampaigns_Delete_ScheduledCampaigns, "Campaign Identier"));
		smsscheduledCampaigns.selectDeleteOption();
		smsscheduledCampaigns.clickDeletePopUp();
		smsscheduledCampaigns.verifyDeletedSuccessfully(JsonUtils.getData(DefineConstants.TC_20_SMS_ManageCampaigns_Delete_ScheduledCampaigns, "Delete Success Message"));
	}
}