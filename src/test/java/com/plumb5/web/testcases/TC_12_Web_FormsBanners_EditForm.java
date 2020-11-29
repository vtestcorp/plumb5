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

public class TC_12_Web_FormsBanners_EditForm extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
	Web web;
	Web_Template webTemplate;
	ManagePopUpForms managePopUpForms;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_12_Web_FormsBanners_EditForm", "Web_FormsBanners_EditForm");

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
		managePopUpForms.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Success Message"));
		managePopUpForms.searchForm();
		managePopUpForms.verifyInputValue();
		managePopUpForms.select_FormToEdit();
		managePopUpForms.click_EditButton();
		
		//Edit form Title
		managePopUpForms.edit_Form_Title(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Edit Form Title"));
		
		//Edit Username
		managePopUpForms.click_EditUserName();
		managePopUpForms.enter_AddFieldName(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Add Field Name"));
		managePopUpForms.select_AddFieldMappingValue(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Add Field Mapping"));	
		managePopUpForms.select_Mandatory(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Mandatory"));
		managePopUpForms.click_AddTextBoxName();
		
		//Edit Email		
		managePopUpForms.click_EditEmail();
		managePopUpForms.enter_AddEmailNameField(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Email Add Field Name"));
		managePopUpForms.select_EmailAddFieldMappingValue(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Email Add Field Mapping"));	
		managePopUpForms.select_EmailMandatory(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Email Mandatory"));
		managePopUpForms.click_EmailAddTextBoxName();
		
		//Edit Phone
		managePopUpForms.click_EditPhone();
		managePopUpForms.enter_AddPhoneNameField(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Phone Add Field Name"));
		managePopUpForms.select_PhoneAddFieldMappingValue(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Phone Add Field Mapping"));	
		managePopUpForms.select_PhoneMandatory(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Phone Mandatory"));
		managePopUpForms.click_PhoneAddTextBoxName();
		
		//Edit Submit button
		managePopUpForms.click_EditSubmitButton();
		managePopUpForms.enter_SubmitNameField(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Submit Add Field Name"));
		managePopUpForms.click_AddSubmitName();
		managePopUpForms.click_SaveButton();
		managePopUpForms.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_12_Web_FormsBanners_EditForm, "Success Message"));
	}
}