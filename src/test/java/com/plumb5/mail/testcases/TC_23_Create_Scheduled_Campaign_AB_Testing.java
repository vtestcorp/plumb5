package com.plumb5.mail.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Campaigns;
import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.Mail;
import com.plumb5.pageobjects.Scheduled_Campaigns;
import com.plumb5.pageobjects.Settings;
import com.plumb5.pageobjects.Template;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_23_Create_Scheduled_Campaign_AB_Testing extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	Mail mail;
	Campaigns campaigns;
	Template template;
	Scheduled_Campaigns scheduledCampaigns;
	Settings settings;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_23_Create_Scheduled_Campaign_AB_Testing", "Create_Scheduled_Campaign_AB_Testing");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		mail = new Mail(driver, test);
		campaigns = new Campaigns(driver, test);
		template = new Template(driver, test);
		scheduledCampaigns = new Scheduled_Campaigns(driver, test);
        settings= new Settings(driver, test);
		
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();

		dashboard.click_Mail();
		// Settings
		mail.click_Settings();
		settings.click_EmailServiceProvider_ESP();
		settings.click_AddProvider();
		settings.enter_ProviderName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Provider Name"));
		// Promotional Setting
		settings.click_PromotionalSettings();
		// settings.click_BulkSupport(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing,"Promotional Bulk Support"));
		settings.enter_AccountName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Promotional Account Name"));
		settings.enter_APIKey(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Promotional API Key"));
		settings.enter_ConfigurationUrl(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Promotional Configuration Url"));
		settings.click_TransactionalSettings();
		// Transactional Settings
		// settings.click_BulkSupportTransactional(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing,"Transactional Bulk Support"));
		settings.enter_AccountNameTransactional(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Transactional Account Name"));
		settings.enter_APIKeyTransactional(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Transactional API Key"));
		settings.enter_ConfigurationUrlTransactional(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Transactional Configuration Url"));
		settings.click_SubmitButton();
		settings.verify_SuccessMessage_ESP(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing,"Service Provider Success Message"));
		settings.verify_Email_Service_Provider(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Provider Name"));

		//Create Draft		
		mail.clickManage();
		mail.click_Campaigns();
		campaigns.click_Draft();
		campaigns.click_CreateDraft();
		campaigns.enter_CampaignName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Name"));
		campaigns.enter_CampaignDescription(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Description"));
		campaigns.click_CreateCampaign();
		campaigns.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Success Message"));
		campaigns.search_Draft(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Name"));
		campaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Name"));
		
		// Create Template One
//		mail.clickManage();
		mail.click_Templates();
		template.click_CreateTemplate();
		template.selectTemplate(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template Select Name"));
		
		template.select_CampaignName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Name"));
		template.enter_TemplateName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template Name"));
		template.enter_TemplateDescription(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template Description"));
	    template.click_NextButton();	
	    template.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Success Message"));
//		template.click_SaveButton();
		mail.click_Templates();
		template.search_Template(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template Name"));
        template.verifyInputValue(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template Name"));
		
        // Template One Spam Score 
        template.selectTemplateToEdit(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template Name"));        
        template.click_SpamScoreButton();
        template.selectType(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template Type"));
        template.select_FromEmailID(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template From Email Id"));
        template.enter_FromName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template From Name"));
        template.enter_Subject(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template Subject"));
        template.click_VerifyButton();
        template.verify_SpamScoreTitle(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template Title"));        
        template.click_ClosePopUp();
//        TimeUnit.MINUTES.sleep(1);
//        driver.navigate().refresh();

		// Create template Two
        template.click_CreateTemplate();
		template.selectTemplate(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template Select Name"));
		template.select_CampaignName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Name"));
		template.enter_TemplateName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template Name"));
		template.enter_TemplateDescription(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template Description"));
	    template.click_NextButton();	
	    template.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Success Message"));
//		template.click_SaveButton();
		mail.click_Templates();
		template.search_Template(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template Name"));
        template.verifyInputValue(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template Name"));
		
        // Template Two Spam Score 
        template.selectTemplateToEdit(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template Name"));        
        template.click_SpamScoreButton();
        template.selectType(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template Type"));
        template.select_FromEmailID(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template From Email Id"));
        template.enter_FromName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template From Name"));
        template.enter_Subject(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template Subject"));
        template.click_VerifyButton();
        template.verify_SpamScoreTitle(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template Title"));        
        template.click_ClosePopUp();
//        TimeUnit.MINUTES.sleep(1);
//        driver.navigate().refresh();
//        TimeUnit.MINUTES.sleep(2);
        
		// Create schedule
		mail.click_Campaigns();
		campaigns.click_CreateScheduled();
		scheduledCampaigns.enter_CampaignIdentifier(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Identier"));
		scheduledCampaigns.select_CampaignName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Name"));
		scheduledCampaigns.select_CampaignType(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Type"));
		scheduledCampaigns.enter_SendTo(JsonUtils.getArrayValues(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Send To"),
				JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Merged Group Name"),
				JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Merged Group Description"));
		// scheduledCampaigns.click_NextButton();
		scheduledCampaigns.click_PopUpNextButton();
		scheduledCampaigns.enter_FromName(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "From Name"));
		scheduledCampaigns.select_FromAddress(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "From Address"));
		scheduledCampaigns.enter_SubjectLine(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Subject Line"));
		scheduledCampaigns.enable_A_BTesting();

		scheduledCampaigns.select_Variation_A_50(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "First Template Name"));

		scheduledCampaigns.select_Variation_B_50(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Second Template Name"));

		scheduledCampaigns.click_NextButton();
		scheduledCampaigns.select_ScheduledDate(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Scheduled Date"));
		scheduledCampaigns.select_ScheduledTime(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Scheduled Time"));
		scheduledCampaigns.click_NextButton();
		scheduledCampaigns.select_TestCampaign(
				JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Test Campaign Radio Button"),
				JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Test Campaign Value"));
		scheduledCampaigns.click_SaveButton();
		campaigns.select_ShowingDataFor(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Time Period"));
		scheduledCampaigns.search_ScheduledCampaign(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Identier"));
		scheduledCampaigns.verifyInputValue(JsonUtils.getData(DefineConstants.TC_23_Create_Scheduled_Campaign_AB_Testing, "Campaign Identier"));
	}
}