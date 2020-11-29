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
import com.plumb5.pageobjects.Settings;
import com.plumb5.pageobjects.Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_09_Edit_Scheduled_Campaign extends BaseClass {

	Dashboard dashboard;
	Contacts contact;
	ManagedContacts managedContacts;
	ManageGroups manageGroups;
	CreateGroups createGroup;
	LoginPage loginPage;
	Mail mail;
	Campaigns campaigns;
	Scheduled_Campaigns scheduledCampaigns;
	Settings settings;
	Template template;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_09_Edit_Scheduled_Campaign", "Edit_Scheduled_Campaign");

		dashboard = new Dashboard(driver, test);
		contact = new Contacts(driver, test);
		managedContacts = new ManagedContacts(driver, test);
		manageGroups = new ManageGroups(driver, test);
		createGroup = new CreateGroups(driver, test);
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);
		campaigns = new Campaigns(driver, test);
		scheduledCampaigns= new Scheduled_Campaigns(driver, test);
		settings= new Settings(driver, test);
		template= new Template(driver, test);
		
		driver.get(DefineConstants.URL);
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Mail();
		// Create Schedule Campaign
		mail.click_Settings();
		settings.click_EmailServiceProvider_ESP();
		settings.click_AddProvider();
		settings.enter_ProviderName(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Provider Name"));
		// Promotional Setting
		settings.click_PromotionalSettings();
		// settings.click_BulkSupport(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign,"Promotional Bulk Support"));
		settings.enter_AccountName(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Promotional Account Name"));
		settings.enter_APIKey(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Promotional API Key"));
		settings.enter_ConfigurationUrl(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Promotional Configuration Url"));
		settings.click_TransactionalSettings();
		// Transactional Settings
		// settings.click_BulkSupportTransactional(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign,"Transactional Bulk Support"));
		settings.enter_AccountNameTransactional(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Transactional Account Name"));
		settings.enter_APIKeyTransactional(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Transactional API Key"));
		settings.enter_ConfigurationUrlTransactional(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Transactional Configuration Url"));
		settings.click_SubmitButton();
		settings.verify_SuccessMessage_ESP(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign,"Service Provider Success Message"));
		settings.verify_Email_Service_Provider(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Provider Name"));

		//Create Draft		
		mail.clickManage();
		mail.click_Campaigns();
		campaigns.click_Draft();
		campaigns.click_CreateDraft();
		campaigns.enter_CampaignName(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Name"));
		campaigns.enter_CampaignDescription(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Description"));
		campaigns.click_CreateCampaign();
		campaigns.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Success Message"));
		campaigns.search_Draft(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Name"));
		campaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Name"));
		
		// Create Template
//		mail.clickManage();
		mail.click_Templates();
		template.click_CreateTemplate();
		template.selectTemplate(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Select Name"));
		
		template.select_CampaignName(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Name"));
		template.enter_TemplateName(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Template Name"));
		template.enter_TemplateDescription(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Template Description"));
	    template.click_NextButton();	
	    template.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Success Message"));
//		template.click_SaveButton();
		mail.click_Templates();
		template.search_Template(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Template Name"));
        template.verifyInputValue(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Template Name"));
		
        // Template Spam Score 
        template.selectTemplateToEdit(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Template Name"));        
        template.click_SpamScoreButton();
        template.selectType(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Type"));
        template.select_FromEmailID(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "From Email Id"));
        template.enter_FromName(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "From Name"));
        template.enter_Subject(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Subject"));
        template.click_VerifyButton();
        template.verify_SpamScoreTitle(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Title"));        
        template.click_ClosePopUp();
        
		//Create Schedule
//		mail.clickManage();
		mail.click_Campaigns();
		campaigns.click_CreateScheduled();
		scheduledCampaigns.enter_CampaignIdentifier(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Identier"));
		scheduledCampaigns.select_CampaignName(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Name"));
		scheduledCampaigns.select_CampaignType(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Type"));
		scheduledCampaigns.enter_SendTo(
				JsonUtils.getArrayValues(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Send To"),
				JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Merged Group Name"),
				JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Merged Group Description"));
//		scheduledCampaigns.click_NextButton();
		scheduledCampaigns.click_PopUpNextButton();
		scheduledCampaigns.enter_FromName(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "From Name"));
		scheduledCampaigns.select_FromAddress(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "From Address"));
		scheduledCampaigns.enter_SubjectLine(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Subject Line"));
		scheduledCampaigns.select_SelectTemplate(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Template Name"));
		scheduledCampaigns.click_NextButton();
		scheduledCampaigns.select_ScheduledDate(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Scheduled Date"));
		scheduledCampaigns.select_ScheduledTime(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Scheduled Time"));
		scheduledCampaigns.click_NextButton();
		scheduledCampaigns.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Test Campaign Value"));
		scheduledCampaigns.click_SaveButton();
		campaigns.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Time Period"));
		scheduledCampaigns.search_ScheduledCampaign(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Identier"));
		scheduledCampaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Identier"));

		// Edit Schedule Campaign
		scheduledCampaigns.selectCampaignToEdit(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Identier"));
		scheduledCampaigns.selectEditOption();
//		scheduledCampaigns.enter_CampaignIdentifier(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Campaign Identier"));
		scheduledCampaigns.edit_CampaignName(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Campaign Name"));
		scheduledCampaigns.select_CampaignType(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Campaign Type"));
		scheduledCampaigns.clear_SendTo();
		scheduledCampaigns.enter_SendTo(
				JsonUtils.getArrayValues(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Send To"),
				JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Merged Group Name"),
				JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Merged Group Description"));
//		scheduledCampaigns.click_NextButton();
		scheduledCampaigns.click_PopUpNextButton();
		scheduledCampaigns.clear_FromName();
		scheduledCampaigns.enter_FromName(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit From Name"));
		scheduledCampaigns.select_FromAddress(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit From Address"));
		scheduledCampaigns.clear_SubjectLine();
		scheduledCampaigns.enter_SubjectLine(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Subject Line"));
		scheduledCampaigns.select_SelectTemplate(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Select Template"));
		scheduledCampaigns.click_NextButton();
		scheduledCampaigns.select_ScheduledDate(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Scheduled Date"));
		scheduledCampaigns.select_ScheduledTime(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Scheduled Time"));
		scheduledCampaigns.click_NextButton();
		scheduledCampaigns.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Test Campaign Value"));
		scheduledCampaigns.click_SaveButton();
		campaigns.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Edit Time Period"));
		campaigns.search_Draft(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Identier"));
		scheduledCampaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_09_Edit_Scheduled_Campaign, "Campaign Identier"));
	}
}