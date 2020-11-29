package com.plumb5.sms.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.CreateGroups;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManageGroups;
import com.plumb5.pageobjects.ManagedContacts;
import com.plumb5.pageobjects.Reports;
import com.plumb5.pageobjects.SMS;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_03_SMS_Dashboard_WebEngagement extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;
	SMS sms;
	Campaigns campaigns;
	Reports reports;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_03_SMS_Dashboard_WebEngagement", "SMS_Dashboard_WebEngagement");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		manageGroups = new ManageGroups(driver, test);
		createGroup = new CreateGroups(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
		campaigns = new Campaigns(driver, test);
		reports = new Reports(driver, test);

		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_SMS();
		sms.click_GearIcon();
		sms.click_WebEngagement();
		sms.select_Checkbox(JsonUtils.getData(DefineConstants.TC_03_SMS_Dashboard_WebEngagement, "Form Submissions Over Time"));
		sms.select_Checkbox(JsonUtils.getData(DefineConstants.TC_03_SMS_Dashboard_WebEngagement, "Web Push Engagement Rate"));		
		sms.select_Checkbox(JsonUtils.getData(DefineConstants.TC_03_SMS_Dashboard_WebEngagement, "Aggregate Forms Data Widget"));
		sms.select_Checkbox(JsonUtils.getData(DefineConstants.TC_03_SMS_Dashboard_WebEngagement, "Web Push Delivery Rate"));
		sms.select_Checkbox(JsonUtils.getData(DefineConstants.TC_03_SMS_Dashboard_WebEngagement, "Form Platform Distribution"));
		sms.select_Checkbox(JsonUtils.getData(DefineConstants.TC_03_SMS_Dashboard_WebEngagement, "Web Push Subscriber"));
		sms.click_SaveButton_SelectDashboardWidgets();
	}
}