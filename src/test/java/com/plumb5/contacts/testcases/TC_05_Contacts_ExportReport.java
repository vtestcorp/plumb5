package com.plumb5.contacts.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagedContacts;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_05_Contacts_ExportReport extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	LoginPage loginPage;
	
	@Test(alwaysRun = true)
	public void contacts_ExportReport() throws Exception {

		test = extent.createTest("TC_05_Contacts_ExportReport", "Export contact report");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		loginPage = new LoginPage(driver, test);
		
		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();

		dashboard.clickContacts();
		contact.clickManageContacts();
		managedContacts.clickExportReportButton();
		managedContacts.selectFileFormat(JsonUtils.getData(DefineConstants.Export_Report, "File Format"));
		managedContacts.selectExportDataBy(JsonUtils.getData(DefineConstants.Export_Report, "Export Data by"));
		managedContacts.clickExportPopUpDownloadButton();
	}
}