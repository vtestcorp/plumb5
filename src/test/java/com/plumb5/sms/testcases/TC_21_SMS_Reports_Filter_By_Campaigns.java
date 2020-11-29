package com.plumb5.sms.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.Reports;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.SMS_Reports;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_21_SMS_Reports_Filter_By_Campaigns extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	Mail mail;
	Campaigns campaigns;
	SMS_Reports smsreports;
	SMS sms;
	Reports reports;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_21_SMS_Reports_Filter_By_Campaigns", "SMS_Reports_Filter_By_Campaigns");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);
		campaigns = new Campaigns(driver, test);
		reports = new Reports(driver, test);
		sms = new SMS(driver, test);
		smsreports = new SMS_Reports(driver, test);

		
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();

		dashboard.click_SMS();
		sms.click_Reports();
		smsreports.click_CampaignResponses();
		smsreports.select_ShowingDataFor(
				JsonUtils.getData(DefineConstants.TC_21_SMS_Reports_Filter_By_Campaigns, "Showing Data For"),
				JsonUtils.getData(DefineConstants.TC_21_SMS_Reports_Filter_By_Campaigns, "Start Date"),
				JsonUtils.getData(DefineConstants.TC_21_SMS_Reports_Filter_By_Campaigns, "End Date"));
		smsreports.select_FilterByCampaigns(JsonUtils.getData(DefineConstants.TC_21_SMS_Reports_Filter_By_Campaigns, "Campaigns Name"));
	}
}