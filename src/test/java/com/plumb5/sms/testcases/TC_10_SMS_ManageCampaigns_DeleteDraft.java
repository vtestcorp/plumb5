package com.plumb5.sms.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.SMS;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_10_SMS_ManageCampaigns_DeleteDraft extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_10_SMS_ManageCampaigns_DeleteDraft", "SMS_ManageCampaigns_DeleteDraft");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);

		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_SMS();
		sms.click_Manage();
		sms.click_Campaigns();
		sms.click_Draft();
		sms.click_CreateDraft_Button();		
		sms.enter_CampaignName(JsonUtils.getData(DefineConstants.TC_10_SMS_ManageCampaigns_DeleteDraft, "Campaign Name"));
		sms.enter_CampaignDescription(JsonUtils.getData(DefineConstants.TC_10_SMS_ManageCampaigns_DeleteDraft, "Campaign Description"));
		sms.click_CreateCampaign_Button();
		sms.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_10_SMS_ManageCampaigns_DeleteDraft, "Success Message"));
		sms.search_CampaignDraft(JsonUtils.getData(DefineConstants.TC_10_SMS_ManageCampaigns_DeleteDraft, "Campaign Name"));
		sms.verifyInputValue(JsonUtils.getData(DefineConstants.TC_10_SMS_ManageCampaigns_DeleteDraft, "Campaign Name"));
		sms.select_DraftToEdit(JsonUtils.getData(DefineConstants.TC_10_SMS_ManageCampaigns_DeleteDraft, "Campaign Name"));
		sms.click_DeleteButton();
		sms.click_DeleteButtonPopUp();
		sms.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_10_SMS_ManageCampaigns_DeleteDraft, "Delete Success Message"));
	}
}