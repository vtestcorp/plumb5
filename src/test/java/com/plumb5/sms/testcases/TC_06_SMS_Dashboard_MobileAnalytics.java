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

public class TC_06_SMS_Dashboard_MobileAnalytics extends BaseClass {

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

		test = extent.createTest("TC_06_SMS_Dashboard_MobileAnalytics", "SMS_Dashboard_MobileAnalytics");

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
		sms.click_SelectDashboardWidgets_MobileAnalytics();
		sms.select_MobileAnalytics_Checkbox(JsonUtils.getData(DefineConstants.TC_06_SMS_Dashboard_MobileAnalytics, "Sessions Vs Unique Visitors"));
		sms.select_MobileAnalytics_Checkbox(JsonUtils.getData(DefineConstants.TC_06_SMS_Dashboard_MobileAnalytics, "New Vs Return"));
		sms.select_MobileAnalytics_Checkbox(JsonUtils.getData(DefineConstants.TC_06_SMS_Dashboard_MobileAnalytics, "Time On App"));		
		sms.select_MobileAnalytics_Checkbox(JsonUtils.getData(DefineConstants.TC_06_SMS_Dashboard_MobileAnalytics, "Frequency"));
		sms.select_MobileAnalytics_Checkbox(JsonUtils.getData(DefineConstants.TC_06_SMS_Dashboard_MobileAnalytics, "Recency"));
		sms.click_SaveButton_SelectDashboardWidgets();
		sms.verify_SuccessMessage("");
	}
}