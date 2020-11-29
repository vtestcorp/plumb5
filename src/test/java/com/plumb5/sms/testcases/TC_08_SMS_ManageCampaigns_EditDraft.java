package com.plumb5.sms.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.SMS;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_08_SMS_ManageCampaigns_EditDraft extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_08_SMS_ManageCampaigns_EditDraft", "SMS_ManageCampaigns_EditDraft");

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
		sms.enter_CampaignName(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Campaign Name"));
		sms.enter_CampaignDescription(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Campaign Description"));
		sms.click_CreateCampaign_Button();
		sms.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Success Message"));
		sms.search_CampaignDraft(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Campaign Name"));
		sms.verifyInputValue(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Campaign Name"));
		sms.select_DraftToEdit(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Campaign Name"));
		sms.click_EditButton();
		sms.enter_CampaignName(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Update Campaign Name"));
		sms.enter_CampaignDescription(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Update Campaign Description"));
		sms.click_UpdateCampaign_Button();
		sms.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Update Success Message"));
		sms.search_CampaignDraft(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Update Campaign Name"));
		sms.verifyInputValue(JsonUtils.getData(DefineConstants.TC_08_SMS_ManageCampaigns_EditDraft, "Update Campaign Name"));
	}
}