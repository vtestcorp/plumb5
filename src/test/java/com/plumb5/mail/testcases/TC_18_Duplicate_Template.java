package com.plumb5.mail.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Contacts;
import com.plumb5.pageobjects.CreateGroups;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.ManageGroups;
import com.plumb5.pageobjects.ManagedContacts;
import com.plumb5.pageobjects.Scheduled_Campaigns;
import com.plumb5.pageobjects.Template;
import com.plumb5.pageobjects.Triggers;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_18_Duplicate_Template extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;
	Mail mail;
	Campaigns campaigns;
	Scheduled_Campaigns scheduledCampaigns;
	Triggers triggers;
    Template template;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_18_Duplicate_Template", "Duplicate_Template");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		manageGroups = new ManageGroups(driver, test);
		createGroup = new CreateGroups(driver, test);
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);
		campaigns = new Campaigns(driver, test);
		scheduledCampaigns = new Scheduled_Campaigns(driver, test);
		triggers = new Triggers(driver, test);
		template= new Template(driver, test);
		
		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Mail();
		mail.clickManage();
		mail.click_Templates();
		template.search_Template(JsonUtils.getData(DefineConstants.TC_18_Duplicate_Template, "Template Name"));
        template.verifyInputValue(JsonUtils.getData(DefineConstants.TC_18_Duplicate_Template, "Template Name"));
        template.selectTemplateToEdit(JsonUtils.getData(DefineConstants.TC_18_Duplicate_Template, "Template Name"));
        template.click_Duplicate();
		template.enter_DuplicateTemplateName(JsonUtils.getData(DefineConstants.TC_18_Duplicate_Template, "Duplicate Template Name"));
		template.enter_DuplicateTemplateDescription(JsonUtils.getData(DefineConstants.TC_18_Duplicate_Template, "Template Description"));
	    template.click_DuplicateNextButton();	
	    template.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_18_Duplicate_Template, "Success Message"));
//		template.click_SaveButton();
		mail.click_Templates();
		template.search_Template(JsonUtils.getData(DefineConstants.TC_18_Duplicate_Template, "Duplicate Template Name"));
        template.verifyInputValue(JsonUtils.getData(DefineConstants.TC_18_Duplicate_Template, "Duplicate Template Name"));
	}
}