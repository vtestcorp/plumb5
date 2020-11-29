package com.plumb5.web.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.FormSettings;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagePopUpForms;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.Web;
import com.plumb5.pageobjects.Web_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_18_Web_FormsBanners_ResourcesChangeStatus extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	Web web;
	Web_Template webTemplate;
	ManagePopUpForms managePopUpForms;
	FormSettings formSettings;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_18_Web_FormsBanners_ResourcesChangeStatus", "Web_FormsBanners_ResourcesChangeStatus");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
		web = new Web(driver, test);
		formSettings = new FormSettings(driver, test);

		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Web();
		web.click_Forms_Banners();
		web.click_Settings();
		formSettings.click_AddResources();
		formSettings.click_ResourcesSource(
				JsonUtils.getData(DefineConstants.TC_18_Web_FormsBanners_ResourcesChangeStatus, "Resources Source"),
				JsonUtils.getData(DefineConstants.TC_18_Web_FormsBanners_ResourcesChangeStatus, "Upload Sources File"),
				JsonUtils.getData(DefineConstants.TC_18_Web_FormsBanners_ResourcesChangeStatus, "Resource Url"));
		
		formSettings.enter_ResourcesDescription(JsonUtils.getData(DefineConstants.TC_18_Web_FormsBanners_ResourcesChangeStatus, "Resources Description"));
		formSettings.select_ResourcesType(JsonUtils.getData(DefineConstants.TC_18_Web_FormsBanners_ResourcesChangeStatus, "Resources Type"));
		formSettings.click_SaveButton();
		formSettings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_18_Web_FormsBanners_ResourcesChangeStatus, "Success Message"));
		formSettings.verifyInputValue(JsonUtils.getData(DefineConstants.TC_18_Web_FormsBanners_ResourcesChangeStatus, "Resources Type"));
		formSettings.select_ResourceToEdit(JsonUtils.getData(DefineConstants.TC_18_Web_FormsBanners_ResourcesChangeStatus, "Resources Type"));
		formSettings.click_ChangeStatus();
		
		//Change Status
		formSettings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_18_Web_FormsBanners_ResourcesChangeStatus, "Status Success Message"));	
	}
}