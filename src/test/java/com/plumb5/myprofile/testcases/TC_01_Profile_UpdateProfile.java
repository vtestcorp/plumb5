package com.plumb5.myprofile.testcases;

import org.testng.annotations.Test;

import com.plumb5.pageobjects.Dashboard;
import com.plumb5.pageobjects.LoginPage;
import com.plumb5.pageobjects.MyProfile;
import com.plumb5.pageobjects.SMS;
import com.plumb5.pageobjects.Web;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_01_Profile_UpdateProfile extends BaseClass {

	Dashboard dashboard;
	LoginPage loginPage;
	SMS sms;
    Web web;
    MyProfile myProfile;
	
	@Test(alwaysRun = true)
	public void Create_Group() throws Exception {

		test = extent.createTest("TC_01_Profile_UpdateProfile", "Profile_UpdateProfile");

		dashboard = new Dashboard(driver, test);
		loginPage = new LoginPage(driver, test);
		sms = new SMS(driver, test);
        web = new Web(driver, test);
        myProfile= new MyProfile(driver, test);
        
		driver.get(DefineConstants.URL);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.Login, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.Login, "Passoword"));
		loginPage.clickSignInButton();
		dashboard.click_Web();
		dashboard.click_NewUI();
		dashboard.click_Profile();
		myProfile.enter_FirstName(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "First Name"));
		myProfile.enter_LastName(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Last Name"));
		myProfile.enter_EmailId(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Email Id"));
		myProfile.enter_MobilePhone(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Mobile Phone"));
		myProfile.enter_BusinessPhone(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Business Phone"));
		myProfile.enter_CompanyName(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Company Name"));
		myProfile.enter_CompanyWebUrl(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Company Web URL"));
		myProfile.enter_EmployeeCode(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Employee Code"));
		myProfile.enter_AddressDetails(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Address Details"));
		myProfile.enter_SecondaryAddress(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Secondary Address"));
		myProfile.enter_State(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "State"));
		myProfile.enter_City(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "City"));
		myProfile.enter_ZipPostalCode(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Zip / Postal Code"));
		myProfile.select_Country(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Country"));
//		myProfile.click_WorkFromHome();
		myProfile.click_UpdateButton();
		myProfile.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_01_Profile_UpdateProfile, "Success Message"));
	}
}