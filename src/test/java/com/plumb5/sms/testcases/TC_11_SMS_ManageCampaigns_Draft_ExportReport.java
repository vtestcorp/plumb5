package com.plumb5.sms.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.SMS;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_11_SMS_ManageCampaigns_Draft_ExportReport extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_11_SMS_ManageCampaigns_Draft_ExportReport",
				"SMS_ManageCampaigns_Draft_ExportReport");

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
		sms.click_ExportButton();
		sms.select_FileFormat(JsonUtils.getData(DefineConstants.TC_11_SMS_ManageCampaigns_Draft_ExportReport, "File Format"));
		sms.select_ExportDataBy(
				JsonUtils.getData(DefineConstants.TC_11_SMS_ManageCampaigns_Draft_ExportReport, "Export Data by"),
				JsonUtils.getData(DefineConstants.TC_11_SMS_ManageCampaigns_Draft_ExportReport, "From Range"),
				JsonUtils.getData(DefineConstants.TC_11_SMS_ManageCampaigns_Draft_ExportReport, "To Range"));
		sms.click_DownloadButton_ExportReport();
	}
}