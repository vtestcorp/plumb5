package com.plumb5.sms.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.SMS_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_13_SMS_ManageCampaigns_SearchTemplate extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	SMS_Template sms_Template;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_13_SMS_ManageCampaigns_SearchTemplate", "SMS_ManageCampaigns_SearchTemplate");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
		sms_Template = new SMS_Template(driver, test);

		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_SMS();
		sms.click_Manage();
		sms.click_Templates();
		sms_Template.search_Template(JsonUtils.getData(DefineConstants.TC_13_SMS_ManageCampaigns_SearchTemplate, "Template Name"));
		sms_Template.verifyInputValue(JsonUtils.getData(DefineConstants.TC_13_SMS_ManageCampaigns_SearchTemplate, "Template Name"));
	}
}