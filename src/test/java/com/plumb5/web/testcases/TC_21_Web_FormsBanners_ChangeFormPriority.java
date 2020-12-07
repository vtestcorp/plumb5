package com.plumb5.web.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagePopUpForms;
import com.plumb5.pageobjects.SetRules;
import com.plumb5.pageobjects.Web;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_21_Web_FormsBanners_ChangeFormPriority extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;	
	Web web;	
	ManagePopUpForms managePopUpForms;
	SetRules setRules;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_21_Web_FormsBanners_ChangeFormPriority", "Web_FormsBanners_ChangeFormPriority");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);		
		web = new Web(driver, test);		
		managePopUpForms = new ManagePopUpForms(driver, test);
		setRules = new SetRules(driver, test);

		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Web();
		web.click_Forms_Banners();
		web.click_Manage_Forms();
		web.click_Pop_Up_Forms();
		managePopUpForms.changePriority(JsonUtils.getData(DefineConstants.TC_21_Web_FormsBanners_ChangeFormPriority, "From"),JsonUtils.getData(DefineConstants.TC_21_Web_FormsBanners_ChangeFormPriority, "To"));
		managePopUpForms.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_21_Web_FormsBanners_ChangeFormPriority, "Success Message"));
	}
}