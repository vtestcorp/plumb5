package com.plumb5.contacts.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManageGroups;
import com.plumb5.pageobjects.ManagedContacts;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_17_Groups_Export extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	LoginPage loginPage;
	ManageGroups manageGroups;
	
	@Test(alwaysRun = true)
	public void contacts_ExportReport() throws Exception {

		test = extent.createTest("TC_17_Groups_Export", "Export Groups");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		manageGroups= new ManageGroups(driver, test);
		loginPage = new LoginPage(driver, test);
		
		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();

		dashboard.clickContacts();
		contact.clickManageGroups();
		manageGroups.clickExportReportButton();
		managedContacts.selectFileFormat(JsonUtils.getData(DefineConstants.Export_Group, "File Format"));
		managedContacts.selectExportDataBy(JsonUtils.getData(DefineConstants.Export_Group, "Export Data by"));
		managedContacts.clickExportPopUpDownloadButton();
	}
}