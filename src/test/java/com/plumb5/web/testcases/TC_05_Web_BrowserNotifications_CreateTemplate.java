package com.plumb5.web.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.Web;
import com.plumb5.pageobjects.Web_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_05_Web_BrowserNotifications_CreateTemplate extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	Web web;
	Web_Template webTemplate;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_05_Web_BrowserNotifications_CreateTemplate", "Web_BrowserNotifications_CreateTemplate");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
		web = new Web(driver, test);
		webTemplate= new Web_Template(driver, test);
		
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Web();
		web.click_BrowserNotification();
		web.click_Templates();
		
		webTemplate.click_CreateTemplate();
		webTemplate.select_CampaignName(JsonUtils.getData(DefineConstants.TC_05_Web_BrowserNotifications_CreateTemplate, "Campaign Name"));
		webTemplate.enter_TemplateName(JsonUtils.getData(DefineConstants.TC_05_Web_BrowserNotifications_CreateTemplate, "Template Name"));
		webTemplate.enter_TemplateDescription(JsonUtils.getData(DefineConstants.TC_05_Web_BrowserNotifications_CreateTemplate, "Template Description"));
		webTemplate.click_NextButton();	
//		webTemplate.select_NotificationType(JsonUtils.getData(DefineConstants.TC_05_Web_BrowserNotifications_CreateTemplate, "Notification Type"));
		webTemplate.enter_TemplateTitle(JsonUtils.getData(DefineConstants.TC_05_Web_BrowserNotifications_CreateTemplate, "Template Title"));
		webTemplate.enter_TemplateMessage(JsonUtils.getData(DefineConstants.TC_05_Web_BrowserNotifications_CreateTemplate, "Template Message"));
		
		webTemplate.click_UploadButton();
		webTemplate.uploadFile(JsonUtils.getData(DefineConstants.TC_05_Web_BrowserNotifications_CreateTemplate, "File Path"));
		
		webTemplate.enter_OnClickAction(JsonUtils.getData(DefineConstants.TC_05_Web_BrowserNotifications_CreateTemplate, "Page Url"));					
		webTemplate.click_SaveButton();
		webTemplate.search_Template(JsonUtils.getData(DefineConstants.TC_05_Web_BrowserNotifications_CreateTemplate, "Template Name"));
		webTemplate.verifyInputValue(JsonUtils.getData(DefineConstants.TC_05_Web_BrowserNotifications_CreateTemplate, "Template Name"));		
	}
}