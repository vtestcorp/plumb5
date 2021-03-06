package com.plumb5.mail.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_19_Spam_Score_Template extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	Mail mail;
    Template template;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_19_Spam_Score_Template", "Spam_Score_Template");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);
		template= new Template(driver, test);
		
		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Mail();
		mail.clickManage();
		mail.click_Templates();
		template.search_Template(JsonUtils.getData(DefineConstants.TC_19_Spam_Score_Template, "Template Name"));
        template.verifyInputValue(JsonUtils.getData(DefineConstants.TC_19_Spam_Score_Template, "Template Name"));
        template.selectTemplateToEdit(JsonUtils.getData(DefineConstants.TC_19_Spam_Score_Template, "Template Name"));        
        template.click_SpamScoreButton();
        template.selectType(JsonUtils.getData(DefineConstants.TC_19_Spam_Score_Template, "Type"));
        template.select_FromEmailID(JsonUtils.getData(DefineConstants.TC_19_Spam_Score_Template, "From Email Id"));
        template.enter_FromName(JsonUtils.getData(DefineConstants.TC_19_Spam_Score_Template, "From Name"));
        template.enter_Subject(JsonUtils.getData(DefineConstants.TC_19_Spam_Score_Template, "Subject"));
        template.click_VerifyButton();
        template.verify_SpamScoreTitle(JsonUtils.getData(DefineConstants.TC_19_Spam_Score_Template, ""));        
        template.click_ClosePopUp();
	}
}