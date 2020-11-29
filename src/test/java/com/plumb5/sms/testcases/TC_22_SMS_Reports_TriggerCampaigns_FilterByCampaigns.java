package com.plumb5.sms.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.CreateGroups;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.ManageGroups;
import com.plumb5.pageobjects.ManagedContacts;
import com.plumb5.pageobjects.Reports;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.SMS_Reports;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_22_SMS_Reports_TriggerCampaigns_FilterByCampaigns extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;
	Mail mail;
	Campaigns campaigns;
	Reports reports;
	SMS sms;
	SMS_Reports smsreports;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_22_SMS_Reports_TriggerCampaigns_FilterByCampaigns", "SMS_Reports_TriggerCampaigns_FilterByCampaigns");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		manageGroups = new ManageGroups(driver, test);
		createGroup = new CreateGroups(driver, test);
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
		smsreports.click_TriggerCampaigns();
		smsreports.select_ShowingDataFor(
				JsonUtils.getData(DefineConstants.TC_22_SMS_Reports_TriggerCampaigns_FilterByCampaigns, "Showing Data For"),
				JsonUtils.getData(DefineConstants.TC_22_SMS_Reports_TriggerCampaigns_FilterByCampaigns, "Start Date"),
				JsonUtils.getData(DefineConstants.TC_22_SMS_Reports_TriggerCampaigns_FilterByCampaigns, "End Date"));
		smsreports.select_FilterByCampaigns(JsonUtils.getData(DefineConstants.TC_22_SMS_Reports_TriggerCampaigns_FilterByCampaigns, "Campaigns Name"));
		smsreports.select_RecentActivityDate(JsonUtils.getData(DefineConstants.TC_22_SMS_Reports_TriggerCampaigns_FilterByCampaigns, "Recent Activity Date"));
	}
}