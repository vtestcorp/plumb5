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

public class TC_19_Web_FormsBanners_DeleteResources extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	Web web;
	Web_Template webTemplate;
	ManagePopUpForms managePopUpForms;
	FormSettings formSettings;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_19_Web_FormsBanners_DeleteResources", "Web_FormsBanners_DeleteResources");

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
				JsonUtils.getData(DefineConstants.TC_19_Web_FormsBanners_DeleteResources, "Resources Source"),
				JsonUtils.getData(DefineConstants.TC_19_Web_FormsBanners_DeleteResources, "Upload Sources File"),
				JsonUtils.getData(DefineConstants.TC_19_Web_FormsBanners_DeleteResources, "Resource Url"));
		
		formSettings.enter_ResourcesDescription(JsonUtils.getData(DefineConstants.TC_19_Web_FormsBanners_DeleteResources, "Resources Description"));
		formSettings.select_ResourcesType(JsonUtils.getData(DefineConstants.TC_19_Web_FormsBanners_DeleteResources, "Resources Type"));
		formSettings.click_SaveButton();
		formSettings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_19_Web_FormsBanners_DeleteResources, "Success Message"));
		formSettings.verifyInputValue(JsonUtils.getData(DefineConstants.TC_19_Web_FormsBanners_DeleteResources, "Resources Type"));
		formSettings.select_ResourceToEdit(JsonUtils.getData(DefineConstants.TC_19_Web_FormsBanners_DeleteResources, "Resources Type"));
		formSettings.click_DeleteButton();
		formSettings.click_Delete_PopUp();
		//Delete Resources
		formSettings.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_19_Web_FormsBanners_DeleteResources, "Delete Success Message"));	
	}
}