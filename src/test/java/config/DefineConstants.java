package config;

public class DefineConstants {
	// Test data file Path
	public static final String Path_TestData = "";

	// Application URL
	public static final String URL = "http://p5app.p5email.com/";

//	 http://p5beta.plumb5.com/p5-newdesign/manage-campaigns.html
	
	// Explicit Wait Time
	public static final int explicitWait_10 = 10;
	
	public static final int explicitWait_20 = 20;
	
	public static final int explicitWait_30 = 30;

	public static final int explicitWait_60 = 60;

	public static final String PROJECT_PATH = System.getProperty("user.dir");

	public static final String PROJECT_OS = System.getProperty("os.name");

	public static final String TestData_Folder = "Test_Data";

	public static final String Mail_TestData_Folder = "Mail";

	public static final String SMS_TestData_Folder = "SMS";
	
	public static final String Mobile_TestData_Folder = "Mobile";
	
	public static final String Web_TestData_Folder = "Web";
	
	public static final String Profile_TestData_Folder = "Profile";
	
	public static final String Contacts_TestData_Folder = "Contacts";

	public static final String There_is_no_data_for_this_view = "There is no data for this view";
	
	public static final String Settings_has_been_set_successfully = "Settings has been set successfully";
	
	public static final String Please_enable_primary_email_too_with_alternate_email = "Please enable primary email too with alternate email";
	
	public static final String jdbcUrl="jdbc:sqlserver://13.229.13.199:1433;databaseName=db_newui";
	public static final String db_UserName="gbadmin";
	public static final String db_Password="admin@2010";
	
	
	// Contacts Module Json file
	public static final String Login = TestData_Folder + "//" + Contacts_TestData_Folder + "//" + "Login.json";
	public static final String Create_Contact = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Create_Contact.json";
	public static final String Add_Remove_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Add_Remove_Group.json";
	public static final String Invalidate_Contact = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Invalidate_Contact.json";
	public static final String Unsubcribe_Contact = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Unsubcribe_Contact.json";
	public static final String Export_Report = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Export_Report.json";
	public static final String Search_Contact = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Search_Contact.json";
	public static final String Contact_Details = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Contact_Details.json";
	public static final String Create_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Create_Group.json";
	public static final String Custom_Fields = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Custom_Fields.json";
	public static final String Email_Verification = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Email_Verification.json";
	public static final String Verify_Custom_Field_Presence = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Verify_Custom_Field_Presence.json";
	public static final String Delete_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Delete_Group.json";
	public static final String Download_Sample_File = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Download_Sample_File.json";
	public static final String Duplicate_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Duplicate_Group.json";
	public static final String Edit_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Edit_Group.json";
	public static final String Exclusive_Contact_List = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Exclusive_Contact_List.json";
	public static final String Export_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Export_Group.json";
	public static final String Validate_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Validate_Group.json";
	public static final String Contact_Import = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "Contact_Import.json";
	
	public static final String TC_20_Create_NewContact_OnlyEmail = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "TC_20_Create_NewContact_OnlyEmail.json";	
	public static final String TC_21_Create_NewContact_OnlyPhoneNumber = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "TC_21_Create_NewContact_OnlyPhoneNumber.json";	
	public static final String TC_22_New_EmailId_Existing_PhoneNumber = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "TC_22_New_EmailId_Existing_PhoneNumber.json";	
	public static final String TC_23_New_PhoneNumber_Existing_EmailId = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "TC_23_New_PhoneNumber_Existing_EmailId.json";	
	public static final String TC_24_Old_Email_PhoneNumber_Update_New_Phone_Number = TestData_Folder + "//" + Contacts_TestData_Folder + "//"+ "TC_24_Old_Email_PhoneNumber_Update_New_Phone_Number.json";

	// Mail Module Json file
	public static final String TC_01_Create_Draft_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_01_Create_Draft_Campaign.json";
	public static final String TC_02_Search_Draft_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_02_Search_Draft_Campaign.json";
	public static final String TC_03_Edit_Draft_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_03_Edit_Draft_Campaign.json";
	public static final String TC_04_Duplicate_Draft_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_04_Duplicate_Draft_Campaign.json";
	public static final String TC_05_Delete_Draft_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_05_Delete_Draft_Campaign.json";
	public static final String TC_06_Create_Scheduled_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_06_Create_Scheduled_Campaign.json";
	public static final String TC_07_Search_Scheduled_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_07_Search_Scheduled_Campaign.json";
	public static final String TC_08_Delete_Scheduled_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_08_Delete_Scheduled_Campaign.json";
	public static final String TC_09_Edit_Scheduled_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_09_Edit_Scheduled_Campaign.json";
	public static final String TC_10_Duplicate_Scheduled_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_10_Duplicate_Scheduled_Campaign.json";
	public static final String TC_11_Create_Triggers_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_11_Create_Triggers_Campaign.json";
	public static final String TC_12_Search_Triggers_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_12_Search_Triggers_Campaign.json";
	public static final String TC_13_Edit_Triggers_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_13_Edit_Triggers_Campaign.json";
	public static final String TC_14_Duplicate_Triggers_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_14_Duplicate_Triggers_Campaign.json";
	public static final String TC_15_Change_Status_Triggers_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_15_Change_Status_Triggers_Campaign.json";
	public static final String TC_16_Delete_Triggers_Campaign = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_16_Delete_Triggers_Campaign.json";
	public static final String TC_17_Create_Templates = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_17_Create_Templates.json";	
	public static final String TC_18_Duplicate_Template = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_18_Duplicate_Template.json";
	public static final String TC_19_Spam_Score_Template = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_19_Spam_Score_Template.json";
	public static final String TC_20_Delete_Template = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_20_Delete_Template.json";
	public static final String TC_21_Download_Template = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_21_Download_Template.json";
	public static final String TC_22_Edit_Template = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_22_Edit_Template.json";	
	public static final String TC_23_Create_Scheduled_Campaign_AB_Testing = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_23_Create_Scheduled_Campaign_AB_Testing.json";
	public static final String TC_24_Settings_Configuration_Add_Senders_Email_Delete_Senders_Email = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_24_Settings_Configuration_Add_Senders_Email_Delete_Senders_Email.json";
	public static final String TC_25_Settings_Configuration_Add_Senders_Email_Update_Senders_Email = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_25_Settings_Configuration_Add_Senders_Email_Update_Senders_Email.json";
	public static final String TC_26_Settings_Configuration_Add_ESP_Edit_ESP = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_26_Settings_Configuration_Add_ESP_Edit_ESP.json";
	public static final String TC_27_Settings_Configuration_Add_ESP_Delete_ESP = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_27_Settings_Configuration_Add_ESP_Delete_ESP.json";
	public static final String TC_28_Settings_Configuration_Add_ESP_Validate_ESP = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_28_Settings_Configuration_Add_ESP_Validate_ESP.json";
	public static final String TC_29_Settings_Configuration_Custom_Unsubscribe = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_29_Settings_Configuration_Custom_Unsubscribe.json";	
	public static final String TC_30_Settings_Spam_Score_Settings_Add_Provider_Name = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_30_Settings_Spam_Score_Settings_Add_Provider_Name.json";
	public static final String TC_31_Settings_Email_Verification_Settings_Add_Provider_Name = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_31_Settings_Email_Verification_Settings_Add_Provider_Name.json";
	public static final String TC_32_Settings_Email_Verification_Settings_Update_Provider_Name = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_32_Settings_Email_Verification_Settings_Update_Provider_Name.json";
	public static final String TC_33_Reports_Filter_By_Campaigns = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_33_Reports_Filter_By_Campaigns.json";
	public static final String TC_34_Reports_TriggerCampaigns_FilterByCampaigns = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_34_Reports_TriggerCampaigns_FilterByCampaigns.json";
	public static final String TC_35_Reports_A_B_Testing_FilterByCampaigns = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_35_Reports_A_B_Testing_FilterByCampaigns.json";
	public static final String TC_36_Reports_Hard_Bounced_FilterByReason_Download = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_36_Reports_Hard_Bounced_FilterByReason_Download.json";
	public static final String TC_37_Reports_Soft_Bounced_FilterByReason_Download = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_37_Reports_Soft_Bounced_FilterByReason_Download.json";
	public static final String TC_38_Reports_Alerts_Notifications = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_38_Reports_Alerts_Notifications.json";
	public static final String TC_39_Dashboard_Home = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_39_Dashboard_Home.json";
	public static final String TC_40_Create_Templates_UploadTemplate = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_40_Create_Templates_UploadTemplate.json";
	// SMS Module Json File
	public static final String TC_01_SMS_Dashboard_ShowingDataFor = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_01_SMS_Dashboard_ShowingDataFor.json";
	public static final String TC_02_SMS_Dashboard_WebAnalytics = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_02_SMS_Dashboard_WebAnalytics.json";
	public static final String TC_03_SMS_Dashboard_WebEngagement = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_03_SMS_Dashboard_WebEngagement.json";
	public static final String TC_04_SMS_Dashboard_Mail = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_04_SMS_Dashboard_Mail.json";
	public static final String TC_05_SMS_Dashboard_Sms = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_05_SMS_Dashboard_Sms.json";
	public static final String TC_06_SMS_Dashboard_MobileAnalytics = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_06_SMS_Dashboard_MobileAnalytics.json";
	public static final String TC_07_SMS_ManageCampaigns_CreateDraft = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_07_SMS_ManageCampaigns_CreateDraft.json";
	public static final String TC_08_SMS_ManageCampaigns_EditDraft = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_08_SMS_ManageCampaigns_EditDraft.json";
	public static final String TC_09_SMS_ManageCampaigns_DuplicateDraft = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_09_SMS_ManageCampaigns_DuplicateDraft.json";
	public static final String TC_10_SMS_ManageCampaigns_DeleteDraft = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_10_SMS_ManageCampaigns_DeleteDraft.json";
	public static final String TC_11_SMS_ManageCampaigns_Draft_ExportReport = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_11_SMS_ManageCampaigns_Draft_ExportReport.json";
	public static final String TC_12_SMS_ManageCampaigns_CreateTemplate = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_12_SMS_ManageCampaigns_CreateTemplate.json";
	public static final String TC_13_SMS_ManageCampaigns_SearchTemplate = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_13_SMS_ManageCampaigns_SearchTemplate.json";
	public static final String TC_14_SMS_ManageCampaigns_EditTemplate = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_14_SMS_ManageCampaigns_EditTemplate.json";
	public static final String TC_15_SMS_ManageCampaigns_DuplicateTemplate = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_15_SMS_ManageCampaigns_DuplicateTemplate.json";
	public static final String TC_16_SMS_ManageCampaigns_DeleteTemplate = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_16_SMS_ManageCampaigns_DeleteTemplate.json";
	public static final String TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_17_SMS_ManageCampaigns_CreateScheduledCampaigns.json";
	public static final String TC_18_SMS_ManageCampaigns_Create_Edit_ScheduledCampaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_18_SMS_ManageCampaigns_Create_Edit_ScheduledCampaigns.json";
	public static final String TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_19_SMS_ManageCampaigns_Create_Duplicate_ScheduledCampaigns.json";
	public static final String TC_20_SMS_ManageCampaigns_Delete_ScheduledCampaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_20_SMS_ManageCampaigns_Delete_ScheduledCampaigns.json";
	public static final String TC_21_SMS_Reports_Filter_By_Campaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_21_SMS_Reports_Filter_By_Campaigns.json";
	public static final String TC_22_SMS_Reports_TriggerCampaigns_FilterByCampaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_22_SMS_Reports_TriggerCampaigns_FilterByCampaigns.json";
	public static final String TC_23_SMS_Reports_Alerts_Notifications = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_23_SMS_Reports_Alerts_Notifications.json";
	public static final String TC_24_SMS_Reports_Alerts_Notifications_Download = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_24_SMS_Reports_Alerts_Notifications_Download.json";
	public static final String TC_25_SMS_ManageCampaigns_CreateScheduledCampaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_25_SMS_ManageCampaigns_CreateScheduledCampaigns.json";
	public static final String TC_26_SMS_Settings_Configuration_Add_ESP = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_26_SMS_Settings_Configuration_Add_ESP.json";
	public static final String TC_27_SMS_Settings_Configuration_AddESP_EditESP = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_27_SMS_Settings_Configuration_AddESP_EditESP.json";
	public static final String TC_28_SMS_Settings_Configuration_Add_ESP_Validate_ESP = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_28_SMS_Settings_Configuration_Add_ESP_Validate_ESP.json";
	public static final String TC_29_SMS_Settings_Configuration_AddESP_DeleteESP = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_29_SMS_Settings_Configuration_AddESP_DeleteESP.json";
	public static final String TC_30_Create_Triggers_Campaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_30_Create_Triggers_Campaigns.json";
	public static final String TC_31_Create_Edit_Triggers_Campaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_31_Create_Edit_Triggers_Campaigns.json";
	public static final String TC_32_Create_Duplicate_Triggers_Campaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_32_Create_Duplicate_Triggers_Campaigns.json";
	public static final String TC_33_Change_Status_Triggers_Campaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_33_Change_Status_Triggers_Campaigns.json";
	public static final String TC_34_Delete_Triggers_Campaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_34_Delete_Triggers_Campaigns.json";
	public static final String TC_35_Create_Test_Triggers_Campaigns = TestData_Folder + "//" + SMS_TestData_Folder + "//" + "TC_35_Create_Test_Triggers_Campaigns.json";
	// Web Module
	public static final String TC_01_Web_ManageCampaigns_CreateDraftCampaign = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_01_Web_ManageCampaigns_CreateDraftCampaign.json";
	public static final String TC_02_Web_ManageCampaigns_EditDraftCampaign = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_02_Web_ManageCampaigns_EditDraftCampaign.json";
	public static final String TC_03_Web_ManageCampaigns_DuplicateDraftCampaign = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_03_Web_ManageCampaigns_DuplicateDraftCampaign.json";
	public static final String TC_04_Web_ManageCampaigns_DeleteDraftCampaign = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_04_Web_ManageCampaigns_DeleteDraftCampaign.json";
	public static final String TC_05_Web_BrowserNotifications_CreateTemplate = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_05_Web_BrowserNotifications_CreateTemplate.json";
	public static final String TC_06_Web_BrowserNotifications_Create_Edit_Template = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_06_Web_BrowserNotifications_Create_Edit_Template.json";
	public static final String TC_07_Web_BrowserNotifications_Delete_Template = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_07_Web_BrowserNotifications_Delete_Template.json";
	public static final String TC_08_Web_BrowserNotifications_Duplicate_Template = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_08_Web_BrowserNotifications_Duplicate_Template.json";
	public static final String TC_09_Web_ManageNotifications_CreateScheduledCampaigns = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_09_Web_ManageNotifications_CreateScheduledCampaigns.json";
	public static final String TC_10_Web_ManageNotifications_CreateRSSNotifications = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_10_Web_ManageNotifications_CreateRSSNotifications.json";
	public static final String TC_11_Web_FormsBanners_CreateForm = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_11_Web_FormsBanners_CreateForm.json";
	public static final String TC_12_Web_FormsBanners_EditForm = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_12_Web_FormsBanners_EditForm.json";
	public static final String TC_13_Web_FormsBanners_FormSettings = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_13_Web_FormsBanners_FormSettings.json";
	public static final String TC_14_Web_FormsBanners_FormPreview = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_14_Web_FormsBanners_FormPreview.json";
	public static final String TC_15_Web_FormsBanners_ChangeFormStatus = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_15_Web_FormsBanners_ChangeFormStatus.json";
	public static final String TC_16_Web_FormsBanners_AddResources = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_16_Web_FormsBanners_AddResources.json";
	public static final String TC_17_Web_FormsBanners_EditResources = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_17_Web_FormsBanners_EditResources.json";
	public static final String TC_18_Web_FormsBanners_ResourcesChangeStatus = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_18_Web_FormsBanners_ResourcesChangeStatus.json";
	public static final String TC_19_Web_FormsBanners_DeleteResources = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_19_Web_FormsBanners_DeleteResources.json";
	public static final String TC_20_Web_FormsBanners_SetRules = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_20_Web_FormsBanners_SetRules.json";
	public static final String TC_21_Web_FormsBanners_ChangeFormPriority = TestData_Folder + "//" + Web_TestData_Folder + "//" + "TC_21_Web_FormsBanners_ChangeFormPriority.json";	
	//My Profile
	public static final String TC_01_Profile_UpdateProfile = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_01_Profile_UpdateProfile.json";
	public static final String TC_02_Profile_UpdatePassword = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_02_Profile_UpdatePassword.json";
	public static final String TC_03_Profile_Update_APIKey = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_03_Profile_Update_APIKey.json";
	public static final String TC_04_Profile_CreateUsersVerification = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_04_Profile_CreateUsersVerification.json";
	public static final String TC_05_Profile_CreateRolesVerification = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_05_Profile_CreateRolesVerification.json";
	public static final String TC_06_Profile_CreateGroupsVerification = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_06_Profile_CreateGroupsVerification.json";
	public static final String TC_07_Profile_Edit_Delete_Users = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_07_Profile_Edit_Delete_Users.json";
	public static final String TC_08_Profile_Edit_Delete_Roles = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_08_Profile_Edit_Delete_Roles.json";
	public static final String TC_09_Profile_Edit_Delete_Groups = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_09_Profile_Edit_Delete_Groups.json";
	public static final String TC_10_Profile_Create_SearchUsers = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_10_Profile_Create_SearchUsers.json";
	public static final String TC_11_Profile_Create_SearchRoles = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_11_Profile_Create_SearchRoles.json";
	public static final String TC_12_Profile_Create_SearchGroups = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_12_Profile_Create_SearchGroups.json";
	public static final String TC_13_Profile_IP_Restriction = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_13_Profile_IP_Restriction.json";
	public static final String TC_14_Profile_CreateCampaignIdentifier = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_14_Profile_CreateCampaignIdentifier.json";
	public static final String TC_15_Profile_Integration_Status = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_15_Profile_Integration_Status.json";	
	public static final String TC_16_Profile_Channel_Credits = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_16_Profile_Channel_Credits.json";
	public static final String TC_17_Profile_Time_Zone = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_17_Profile_Time_Zone.json";
	public static final String TC_18_Profile_DND_Hours = TestData_Folder + "//" + Profile_TestData_Folder + "//" + "TC_18_Profile_DND_Hours.json";
	// Mobile Module	
	public static final String TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns = TestData_Folder + "//" + Mobile_TestData_Folder + "//" + "TC_01_Mobile_PushNotification_ManageCampaigns_CreateScheduledCampaigns.json";
}