package com.plumb5.web.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagePopUpForms;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.Web;
import com.plumb5.pageobjects.Web_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_13_Web_FormsBanners_FormSettings extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	Web web;
	Web_Template webTemplate;
	ManagePopUpForms managePopUpForms;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_13_Web_FormsBanners_FormSettings", "Web_FormsBanners_FormSettings");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
		web = new Web(driver, test);
		webTemplate= new Web_Template(driver, test);
		managePopUpForms = new ManagePopUpForms(driver, test);
		
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Web();
		web.click_Forms_Banners();
		web.click_Manage_Forms();
		web.click_Pop_Up_Forms();
		managePopUpForms.click_CreateForms();
		managePopUpForms.click_PopUpBox();
		managePopUpForms.click_NextButton();		
		managePopUpForms.click_Form_Title();		
		managePopUpForms.click_UserName();		
		managePopUpForms.click_Email();		
		managePopUpForms.click_Phone();	
		managePopUpForms.click_SubmitButton();		
		managePopUpForms.storeFormIdentifierNumber();
		managePopUpForms.click_SaveButton();
		managePopUpForms.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_13_Web_FormsBanners_FormSettings, "Success Message"));
		managePopUpForms.searchForm();
		managePopUpForms.verifyInputValue();
		managePopUpForms.select_FormToEdit();
		managePopUpForms.click_SettingsButton();
		
		managePopUpForms.enter_ClientCampaignIdentifier(JsonUtils.getData(DefineConstants.TC_13_Web_FormsBanners_FormSettings, "Client Campaign Identifier"));
		managePopUpForms.enter_CampaignIdentifier(JsonUtils.getData(DefineConstants.TC_13_Web_FormsBanners_FormSettings, "Campaign Identifier"));
		managePopUpForms.select_MobileForm(JsonUtils.getData(DefineConstants.TC_13_Web_FormsBanners_FormSettings, "Mobile Form"));
		managePopUpForms.select_OTPForm(JsonUtils.getData(DefineConstants.TC_13_Web_FormsBanners_FormSettings, "OTP Form"));
		managePopUpForms.click_SaveForm();
//		managePopUpForms.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_13_Web_FormsBanners_FormSettings, "Success Message"));
	}
}