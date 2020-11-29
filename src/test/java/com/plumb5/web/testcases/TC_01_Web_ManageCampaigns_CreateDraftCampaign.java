package com.plumb5.web.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.Web;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_01_Web_ManageCampaigns_CreateDraftCampaign extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
    Web web;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_01_Web_ManageCampaigns_CreateDraftCampaign", "Web_ManageCampaigns_CreateDraftCampaign");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
        web = new Web(driver, test);
        
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Web();
		web.click_BrowserNotification();
		web.click_ManageNotification();
		web.click_Draft();
		
		web.click_CreateDraft();		
		web.enter_CampaignName(JsonUtils.getData(DefineConstants.TC_01_Web_ManageCampaigns_CreateDraftCampaign, "Campaign Name"));
		web.enter_CampaignDescription(JsonUtils.getData(DefineConstants.TC_01_Web_ManageCampaigns_CreateDraftCampaign, "Campaign Description"));
		web.click_CreateCampaign_Button();
		web.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_01_Web_ManageCampaigns_CreateDraftCampaign, "Success Message"));
		web.search_CampaignDraft(JsonUtils.getData(DefineConstants.TC_01_Web_ManageCampaigns_CreateDraftCampaign, "Campaign Name"));
		sms.verifyInputValue(JsonUtils.getData(DefineConstants.TC_01_Web_ManageCampaigns_CreateDraftCampaign, "Campaign Name"));
	}
}