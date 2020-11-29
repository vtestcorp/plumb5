package com.plumb5.sms.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.SMS_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_14_SMS_ManageCampaigns_EditTemplate extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	SMS_Template sms_Template;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_14_SMS_ManageCampaigns_EditTemplate","SMS_ManageCampaigns_EditTemplate");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
		sms_Template= new SMS_Template(driver, test);

		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_SMS();
		sms.click_Manage();
		sms.click_Templates();
		//Create Template
		sms_Template.click_CreateTemplate();
		sms_Template.select_CampaignName(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Campaign Name"));
		sms_Template.enter_TemplateName(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Template Name"));
		sms_Template.enter_TemplateDescription(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Template Description"));
		sms_Template.click_NextButton();	
		sms_Template.enter_TemplateMessage(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Template Message"));
		sms_Template.click_AddLandingPage();
		sms_Template.enter_PageUrl(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Page Url"));
		sms_Template.click_AddButton_PageUrl();
		sms_Template.click_SaveButton();
		// Search Template
		sms_Template.search_Template(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Template Name"));
		sms_Template.verifyInputValue(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Template Name"));
		sms_Template.selectTemplateToEdit(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Template Name"));
		//Edit Template
		sms_Template.click_EditButton();
		sms_Template.select_CampaignName(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Update Campaign Name"));
		sms_Template.enter_TemplateName(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Update Template Name"));
		sms_Template.enter_TemplateDescription(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Update Template Description"));
		sms_Template.click_NextButton();	
		sms_Template.enter_TemplateMessage(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Update Template Message"));
		sms_Template.click_AddLandingPage();
		sms_Template.enter_PageUrl(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Update Page Url"));
		sms_Template.click_AddButton_PageUrl();
		sms_Template.click_SaveButton();
		// Search Edit Template
		sms_Template.search_Template(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Update Template Name"));
		sms_Template.verifyInputValue(JsonUtils.getData(DefineConstants.TC_14_SMS_ManageCampaigns_EditTemplate, "Update Template Name"));
	}
}