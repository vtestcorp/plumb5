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

public class TC_08_Web_BrowserNotifications_Duplicate_Template extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	Web web;
	Web_Template webTemplate;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_08_Web_BrowserNotifications_Duplicate_Template", "Web_BrowserNotifications_Duplicate_Template");

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
		webTemplate.select_CampaignName(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Campaign Name"));
		webTemplate.enter_TemplateName(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Template Name"));
		webTemplate.enter_TemplateDescription(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Template Description"));
		webTemplate.click_NextButton();	
//		webTemplate.select_NotificationType(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Notification Type"));
		webTemplate.enter_TemplateTitle(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Template Title"));
		webTemplate.enter_TemplateMessage(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Template Message"));
		webTemplate.click_MessageButton();
		webTemplate.click_UploadButton();
		webTemplate.uploadFile(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "File Path"));		
		webTemplate.enter_OnClickAction(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Page Url"));					
		webTemplate.click_SaveButton();
		webTemplate.search_Template(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Template Name"));
		webTemplate.verifyInputValue(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Template Name"));		
		webTemplate.selectTemplateToEdit(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Template Name"));				
		//Duplicate Template
		
		webTemplate.click_DuplicateButton();
		webTemplate.select_CampaignName(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Duplicate Campaign Name"));
		webTemplate.enter_TemplateName(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Duplicate Template Name"));
		webTemplate.enter_TemplateDescription(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Duplicate Template Description"));
		webTemplate.click_NextButton();	
		
		webTemplate.enter_TemplateTitle(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Duplicate Template Title"));
		webTemplate.enter_TemplateMessage(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Duplicate Template Message"));
		webTemplate.click_MessageButton();
		webTemplate.click_UploadButton();
		webTemplate.uploadFile(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Duplicate File Path"));		
		webTemplate.enter_OnClickAction(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Duplicate Page Url"));					
		webTemplate.click_SaveButton();
		webTemplate.search_Template(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Duplicate Template Name"));
		webTemplate.verifyInputValue(JsonUtils.getData(DefineConstants.TC_08_Web_BrowserNotifications_Duplicate_Template, "Duplicate Template Name"));
	}
}