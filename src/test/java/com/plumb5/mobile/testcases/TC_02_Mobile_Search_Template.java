package com.plumb5.mobile.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.Mobile;
import com.plumb5.pageobjects.Mobile_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_02_Mobile_Search_Template extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	Mail mail;	
    Mobile_Template mobileTemplate;
    Mobile mobile;
    
    
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_02_Mobile_Search_Template", "Mobile_Search_Template");
		dashboard = new Dashboard(driver, test);	
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);	
		mobileTemplate= new Mobile_Template(driver, test);
		mobile = new Mobile(driver, test);
				
		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		
		dashboard.click_Mobile();
		mobile.click_PushNotifications();						
		mobile.click_Templates();
		
		mobileTemplate.click_CreateTemplate();	
		mobileTemplate.select_CampaignName(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Campaign Name"));				
		mobileTemplate.enter_TemplateName();
		mobileTemplate.enter_TemplateDescription(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Template Description"));
		mobileTemplate.click_NextButton();	
		mobileTemplate.enter_TemplateTitle(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Title"));
		mobileTemplate.enter_TemplateMessage(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Message"));
		mobileTemplate.enter_TemplateSubText(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "SubText"));
		mobileTemplate.select_DefaultAction(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Default Action"));
		mobileTemplate.enter_DeepURL(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Deep Url"));
		mobileTemplate.click_Buttons();
		mobileTemplate.enter_ButtonsName(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Button Name"));
		mobileTemplate.select_ButtonsDefaultAction(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Button Default Action"));
		mobileTemplate.enter_ButtonsDeepURL(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Button Deep Url"));		
		mobileTemplate.click_On_Add_Button();
		mobileTemplate.click_On_Button_2();
		mobileTemplate.enter_ButtonsName2(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Button Name 2"));
		mobileTemplate.select_ButtonsDefaultAction2(JsonUtils.getData(DefineConstants.TC_02_Mobile_Search_Template, "Button Default Action 2"));
		mobileTemplate.click_SaveButton();
		
		mobileTemplate.search_Template();
		mobileTemplate.verifyInputValue();
	}
}