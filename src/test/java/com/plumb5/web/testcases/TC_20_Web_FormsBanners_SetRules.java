package com.plumb5.web.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.ManagePopUpForms;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.SetRules;
import com.plumb5.pageobjects.Web;
import com.plumb5.pageobjects.Web_Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_20_Web_FormsBanners_SetRules extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	Web web;
	Web_Template webTemplate;
	ManagePopUpForms managePopUpForms;
	SetRules setRules;

	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_20_Web_FormsBanners_SetRules", "Web_FormsBanners_SetRules");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
		web = new Web(driver, test);
		webTemplate = new Web_Template(driver, test);
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
		managePopUpForms.click_CreateForms();
		managePopUpForms.click_PopUpBox();
		managePopUpForms.click_NextButton();
		managePopUpForms.click_Form_Title();
		managePopUpForms.click_UserName();
		managePopUpForms.click_Email();
		managePopUpForms.click_Phone();
		managePopUpForms.click_SubmitButton();
		managePopUpForms.storeFormIdentifierNumber();
		managePopUpForms.click_SetRules();
		setRules.click_Checkbox_IfTheVisitorTypeIs();
		setRules.select_IfTheVisitorTypeIs(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "Visitor Type"));
		setRules.click_Checkbox_IfTheVisitorBelongsToOrDoesNotBelongToAGroup();
		setRules.select_IfTheVisitorBelongsToOrDoesNotBelongToAGroup(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "Visitor Belongs"));
		setRules.enter_GroupName(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "Group Name"));
		
		//By Behaviour
		setRules.click_ByBehaviour();
		
		setRules.click_Checkbox_IfTheVisitorSessionIs();
		setRules.select_IfTheVisitorSessionIs(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "If The Visitor Session Is"));
		setRules.enter_IfTheVisitorSessionIsEx(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "If The Visitor Session Is Ex"));
		
		setRules.click_Checkbox_ifTheVisitorPageDepth();
		setRules.select_ifTheVisitorPageDepth(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "If The Visitor Page Depth"));
		setRules.enter_ifTheVisitorPageDepth(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "If The Visitor Page Depth Ex"));
		
		// By Interaction
		setRules.click_ByInteraction();		
		setRules.click_Checkbox_IfTheVisitorRespondedWithChatAgent();
		setRules.click_IfTheVisitorResponseToYourMailCampaignsAre();
		setRules.select_IfTheVisitorResponseToYourMailCampaignsAre(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "If the visitor's response to your mail campaigns are"));
		
		// By Event
		setRules.click_ByEvent();
		setRules.click_Checkbox_IfTheVisitorFormImpression();
		setRules.click_Checkbox_IfTheVisitorFormClose();
		
		// By Profile
		setRules.click_ByProfile();
		setRules.click_Checkbox_IfTheCustomerprospectSocialStatusIs();
		setRules.select_selectSocialStatus(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "Social Status"));
		
		setRules.click_Checkbox_IfTheCustomerProspectInfluentialScoreIs();
		setRules.select_Score(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "Score Dropdown"));
		setRules.enter_ScoreValue(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "Score Value"));
		managePopUpForms.click_SaveButton(); 
		managePopUpForms.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_20_Web_FormsBanners_SetRules, "Success Message"));
		managePopUpForms.searchForm();
		managePopUpForms.verifyInputValue();
	}
}