package config;

public class DefineConstants {
	// Test data file Path
	public static final String Path_TestData = "";

	// Application URL
	public static final String URL = "http://p5app.p5email.com/";

	// Explicit Wait Time
	public static final int explicitWait_10 = 10;
	
	public static final int explicitWait_20 = 20;
	
	public static final int explicitWait_30 = 30;

	public static final int explicitWait_60 = 60;

	public static final String PROJECT_PATH = System.getProperty("user.dir");

	public static final String PROJECT_OS = System.getProperty("os.name");

	public static final String TestData_Folder = "Test_Data";

	public static final String Mail_TestData_Folder = "Mail";

	public static final String Contacts_TestData_Folder = "Contacts";

	public static final String There_is_no_data_for_this_view = "There is no data for this view";
	
	public static final String Settings_has_been_set_successfully = "Settings has been set successfully";
	
	public static final String Please_enable_primary_email_too_with_alternate_email = "Please enable primary email too with alternate email";
	
	public static final String jdbcUrl="jdbc:sqlserver://13.229.13.199:1433;databaseName=db_newui";
	public static final String db_UserName="gbadmin";
	public static final String db_Password="admin@2010";
	
	
	// Contacts Module Json file
	public static final String Login = TestData_Folder + "//" + Contacts_TestData_Folder + "//" + "Login.json";
	public static final String Create_Contact = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Create_Contact.json";
	public static final String Add_Remove_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Add_Remove_Group.json";
	public static final String Invalidate_Contact = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Invalidate_Contact.json";
	public static final String Unsubcribe_Contact = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Unsubcribe_Contact.json";
	public static final String Export_Report = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Export_Report.json";
	public static final String Search_Contact = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Search_Contact.json";
	public static final String Contact_Details = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Contact_Details.json";
	public static final String Create_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Create_Group.json";
	public static final String Custom_Fields = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Custom_Fields.json";
	public static final String Email_Verification = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Email_Verification.json";
	public static final String Verify_Custom_Field_Presence = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Verify_Custom_Field_Presence.json";
	public static final String Delete_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Delete_Group.json";
	public static final String Download_Sample_File = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Download_Sample_File.json";
	public static final String Duplicate_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Duplicate_Group.json";
	public static final String Edit_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Edit_Group.json";
	public static final String Exclusive_Contact_List = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Exclusive_Contact_List.json";
	public static final String Export_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Export_Group.json";
	public static final String Validate_Group = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "Validate_Group.json";
	
	public static final String TC_20_Create_NewContact_OnlyEmail = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "TC_20_Create_NewContact_OnlyEmail.json";
	
	public static final String TC_21_Create_NewContact_OnlyPhoneNumber = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "TC_21_Create_NewContact_OnlyPhoneNumber.json";
	
	public static final String TC_22_New_EmailId_Existing_PhoneNumber = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "TC_22_New_EmailId_Existing_PhoneNumber.json";
	
	public static final String TC_23_New_PhoneNumber_Existing_EmailId = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "TC_23_New_PhoneNumber_Existing_EmailId.json";
	
	public static final String TC_24_Old_Email_PhoneNumber_Update_New_Phone_Number = TestData_Folder + "//" + Contacts_TestData_Folder + "//"
			+ "TC_24_Old_Email_PhoneNumber_Update_New_Phone_Number.json";

	
	
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
	public static final String TC_17_Create_Templates_UploadTemplate = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_17_Create_Templates_UploadTemplate.json";
	public static final String TC_18_Duplicate_Template = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_18_Duplicate_Template.json";
	public static final String TC_19_Spam_Score_Template = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_19_Spam_Score_Template.json";
	public static final String TC_20_Delete_Template = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_20_Delete_Template.json";
	public static final String TC_21_Download_Template = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_21_Download_Template.json";
	public static final String TC_22_Edit_Template = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_22_Edit_Template.json";	
	public static final String TC_23_UseCase = TestData_Folder + "//" + Mail_TestData_Folder + "//" + "TC_23_UseCase.json";
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
}