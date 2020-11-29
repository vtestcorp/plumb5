package com.plumb5.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.DefineConstants;
import helperMethods.DropDown;
import helperMethods.JavascriptClick;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class MyProfile {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropdown;
	
	public MyProfile(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropdown= new DropDown(driver);
	}

	@FindBy(xpath ="//label[contains(text(),'First Name*')]//following::input[1]")
	private WebElement firstName;

	@FindBy(xpath ="//label[contains(text(),'Last Name')]//following::input[1]")
	private WebElement lastName;
	
	@FindBy(xpath ="//label[contains(text(),'Email Id*')]//following::input[1]")
	private WebElement emailId;
	
	@FindBy(xpath ="//label[contains(text(),'Mobile Phone*')]//following::input[1]")
	private WebElement mobilePhone;
	
	@FindBy(xpath ="//label[contains(text(),'Business Phone*')]//following::input[1]")
	private WebElement businessPhone;
	
	@FindBy(xpath ="//label[contains(text(),'Company Name*')]//following::input[1]")
	private WebElement companyName;				

	@FindBy(xpath ="//label[contains(text(),'Company Web URL*')]//following::input[1]")
	private WebElement companyWebUrl;				
	
	@FindBy(xpath ="//label[contains(text(),'Company Web URL*')]//following::input[2]")
	private WebElement employeeCode;
	
	@FindBy(xpath ="//label[contains(text(),'Address Details*')]//following::textarea[1]")
	private WebElement addressDetails;
	
	@FindBy(xpath ="//label[contains(text(),'Secondary Address*')]//following::textarea[1]")
	private WebElement secondaryAddress;
	
	@FindBy(xpath ="//label[contains(text(),'State*')]//following::input[1]")
	private WebElement state;
	
	@FindBy(xpath ="//label[contains(text(),'City*')]//following::input[1]")
	private WebElement city;
	
	@FindBy(xpath ="//label[contains(text(),'Zip / Postal Code*')]//following::input[1]")
	private WebElement zipPostalCode;
	
	@FindBy(xpath ="//label[contains(text(),'Country*')]//following::select[1]")
	private WebElement country;
	
	@FindBy(xpath ="//label[contains(text(),'Work from home')]")
	private WebElement workFromHome;
		
	@FindBy(xpath ="//button[@id='ui_btn_ProfileUpdate']")
	private WebElement updateButton;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Password')]")
	private WebElement password;
	
	@FindBy(xpath = "//div[contains(text(),'API Key')]")
	private WebElement apiKey;
	
	@FindBy(xpath = "//label[contains(text(),'Old Password')]//following::input[1]")
	private WebElement oldPassword;
	
	@FindBy(xpath = "//label[contains(text(),'New Password')]//following::input[1]")
	private WebElement newPassword;
	
	@FindBy(xpath = "//label[contains(text(),'Confirm Password')]//following::input[1]")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//button[@id='ui_btn_SubmitPassword']")
	private WebElement passwordUpdateButton;
	
	@FindBy(xpath = "//input[@id='ui_txt_ApiKey']")
	private WebElement apiKeyTextbox;
	
	@FindBy(xpath = "//button[@id='ui_btn_ResetApiKey']")
	private WebElement resetButton;
	
	public void enter_FirstName(String inputFirstName) {		
		try {
			applyWait.waitForElementToBeClickable(firstName, DefineConstants.explicitWait_30).clear();
			firstName.sendKeys(inputFirstName);
			Screenshots.takeScreenshot(driver, "User entered "+inputFirstName+ " as First Name");
			test.log(Status.INFO, "User entered "+inputFirstName+ " as First Name");
			Log.info("User entered "+inputFirstName+ " as First Name");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	
	public void enter_LastName(String inputLastName) {		
		try {
			applyWait.waitForElementToBeClickable(lastName, DefineConstants.explicitWait_30).clear();
			lastName.sendKeys(inputLastName);
			Screenshots.takeScreenshot(driver, "User entered "+inputLastName+ " as Last Name");
			test.log(Status.INFO, "User entered "+inputLastName+ " as Last Name");
			Log.info("User entered "+inputLastName+ " as Last Name");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_EmailId(String inputEmailId) {		
		try {
			applyWait.waitForElementToBeClickable(emailId, DefineConstants.explicitWait_30).clear();
			emailId.sendKeys(inputEmailId);
			Screenshots.takeScreenshot(driver, "User entered "+inputEmailId+ " as Email Id");
			test.log(Status.INFO, "User entered "+inputEmailId+ " as Email Id");
			Log.info("User entered "+inputEmailId+ " as Email Id");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_MobilePhone(String inputMobilePhone) {		
		try {
			applyWait.waitForElementToBeClickable(mobilePhone, DefineConstants.explicitWait_30).clear();
			mobilePhone.sendKeys(inputMobilePhone);
			Screenshots.takeScreenshot(driver, "User entered "+inputMobilePhone+ " as Mobile Phone");
			test.log(Status.INFO, "User entered "+inputMobilePhone+ " as Mobile Phone");
			Log.info("User entered "+inputMobilePhone+ " as Mobile Phone");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public void enter_BusinessPhone(String inputBusinessPhone) {		
		try {
			applyWait.waitForElementToBeClickable(businessPhone, DefineConstants.explicitWait_30).clear();
			businessPhone.sendKeys(inputBusinessPhone);
			Screenshots.takeScreenshot(driver, "User entered "+inputBusinessPhone+ " as Business Phone");
			test.log(Status.INFO, "User entered "+inputBusinessPhone+ " as Business Phone");
			Log.info("User entered "+inputBusinessPhone+ " as Business Phone");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_CompanyName(String inputCompanyName) {		
		try {
			applyWait.waitForElementToBeClickable(companyName, DefineConstants.explicitWait_30).clear();
			companyName.sendKeys(inputCompanyName);
			Screenshots.takeScreenshot(driver, "User entered "+inputCompanyName+ " as Company Phone");
			test.log(Status.INFO, "User entered "+inputCompanyName+ " as Company Phone");
			Log.info("User entered "+inputCompanyName+ " as Company Phone");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_CompanyWebUrl(String inputCompanyWebUrl) {		
		try {
			applyWait.waitForElementToBeClickable(companyWebUrl, DefineConstants.explicitWait_30).clear();
			companyWebUrl.sendKeys(inputCompanyWebUrl);
			Screenshots.takeScreenshot(driver, "User entered "+inputCompanyWebUrl+ " as Company Web Url");
			test.log(Status.INFO, "User entered "+inputCompanyWebUrl+ " as Company Web Url");
			Log.info("User entered "+inputCompanyWebUrl+ " as Company Web Url");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_EmployeeCode(String inputEmployeeCode) {		
		try {
			applyWait.waitForElementToBeClickable(employeeCode, DefineConstants.explicitWait_30).clear();
			employeeCode.sendKeys(inputEmployeeCode);
			Screenshots.takeScreenshot(driver, "User entered "+inputEmployeeCode+ " as Employee Code");
			test.log(Status.INFO, "User entered "+inputEmployeeCode+ " as Employee Code");
			Log.info("User entered "+inputEmployeeCode+ " as Employee Code");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_AddressDetails(String inputAddressDetails) {		
		try {
			applyWait.waitForElementToBeClickable(addressDetails, DefineConstants.explicitWait_30).clear();
			addressDetails.sendKeys(inputAddressDetails);
			Screenshots.takeScreenshot(driver, "User entered "+inputAddressDetails+ " as Address Details");
			test.log(Status.INFO, "User entered "+inputAddressDetails+ " as Address Details");
			Log.info("User entered "+inputAddressDetails+ " as Address Details");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_SecondaryAddress(String inputSecondaryAddress) {		
		try {
			applyWait.waitForElementToBeClickable(secondaryAddress, DefineConstants.explicitWait_30).clear();
			secondaryAddress.sendKeys(inputSecondaryAddress);
			Screenshots.takeScreenshot(driver, "User entered "+inputSecondaryAddress+ " as Secondary Address");
			test.log(Status.INFO, "User entered "+inputSecondaryAddress+ " as Secondary Address");
			Log.info("User entered "+inputSecondaryAddress+ " as Secondary Address");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_State(String inputState) {		
		try {
			applyWait.waitForElementToBeClickable(state, DefineConstants.explicitWait_30).clear();
			state.sendKeys(inputState);
			Screenshots.takeScreenshot(driver, "User entered "+inputState+ " as State");
			test.log(Status.INFO, "User entered "+inputState+ " as State");
			Log.info("User entered "+inputState+ " as State");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_City(String inputCity) {		
		try {
			applyWait.waitForElementToBeClickable(city, DefineConstants.explicitWait_30).clear();
			city.sendKeys(inputCity);
			Screenshots.takeScreenshot(driver, "User entered "+inputCity+ " as City");
			test.log(Status.INFO, "User entered "+inputCity+ " as City");
			Log.info("User entered "+inputCity+ " as City");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_ZipPostalCode(String inputZipPostalCode) {		
		try {
			applyWait.waitForElementToBeClickable(zipPostalCode, DefineConstants.explicitWait_30).clear();
			zipPostalCode.sendKeys(inputZipPostalCode);
			Screenshots.takeScreenshot(driver, "User entered "+inputZipPostalCode+ " as Zip Postal Code");
			test.log(Status.INFO, "User entered "+inputZipPostalCode+ " as Zip Postal Code");
			Log.info("User entered "+inputZipPostalCode+ " as Zip Postal Code");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void select_Country(String inputCountry) {		
		try {
			applyWait.waitForElementToBeClickable(country, DefineConstants.explicitWait_30);
			dropdown.selectByVisibleText(country, inputCountry);
			Screenshots.takeScreenshot(driver, "User selected "+inputCountry+ " as Country");
			test.log(Status.INFO, "User selected "+inputCountry+ " as Country");
			Log.info("User selected "+inputCountry+ " as Country");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void click_WorkFromHome() {		
		try {
			applyWait.waitForElementToBeClickable(workFromHome, DefineConstants.explicitWait_30);
			javascriptClick.click(workFromHome);
			Screenshots.takeScreenshot(driver, "User clicked Work From Home");
			test.log(Status.INFO, "User clicked Work From Home");
			Log.info("User clicked Work From Home");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void click_UpdateButton() {		
		try {
			applyWait.waitForElementToBeClickable(updateButton, DefineConstants.explicitWait_30);
			javascriptClick.click(updateButton);
			Screenshots.takeScreenshot(driver, "User clicked Update Button");
			test.log(Status.INFO, "User clicked Update Button");
			Log.info("User clicked Update Button");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void verify_SuccessMessage(String successMessage) {
		try {
			if (addedSuccessfullyMessage.isDisplayed()) {
				String text = addedSuccessfullyMessage.getText();
				if (text.equals(successMessage)) {
					System.out.println("Message is " + addedSuccessfullyMessage.getText());
					test.log(Status.INFO, "Message is " + addedSuccessfullyMessage.getText());
					Log.info("Message is " + addedSuccessfullyMessage.getText());
					Screenshots.takeScreenshot(driver, successMessage + " is verified");
					System.out.println(successMessage + " is verified");
					test.log(Status.INFO, successMessage + " is verified");
					Log.info(successMessage + " is verified");
				}
			} else if (errorMessage.isDisplayed()) {
				Screenshots.takeScreenshot(driver, errorMessage.getText() + " is displayed");
				System.out.println(errorMessage.getText() + " is displayed");
				test.log(Status.INFO, errorMessage.getText() + "  is displayed");
				Log.info(errorMessage.getText() + "  is displayed");
				Assert.assertEquals(successMessage, errorMessage.getText());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void click_PasswordTab() {		
		try {
			applyWait.waitForElementToBeClickable(password, DefineConstants.explicitWait_30);
			javascriptClick.click(password);
			Screenshots.takeScreenshot(driver, "User clicked Password Tab");
			test.log(Status.INFO, "User clicked Password Tab");
			Log.info("User clicked Password Tab");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void click_APIKey() {		
		try {
			applyWait.waitForElementToBeClickable(apiKey, DefineConstants.explicitWait_30);
			javascriptClick.click(apiKey);
			Screenshots.takeScreenshot(driver, "User clicked API Key Tab");
			test.log(Status.INFO, "User clicked API Key Tab");
			Log.info("User clicked API Key Tab");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_OldPassword(String inputOldPassword) {		
		try {
			applyWait.waitForElementToBeClickable(oldPassword, DefineConstants.explicitWait_30).clear();
			oldPassword.sendKeys(inputOldPassword);
			Screenshots.takeScreenshot(driver, "User entered "+inputOldPassword+ " as Old Password");
			test.log(Status.INFO, "User entered "+inputOldPassword+ " as Old Password");
			Log.info("User entered "+inputOldPassword+ " as Old Password");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_NewPassword(String inputNewPassword) {		
		try {
			applyWait.waitForElementToBeClickable(newPassword, DefineConstants.explicitWait_30).clear();
			newPassword.sendKeys(inputNewPassword);
			Screenshots.takeScreenshot(driver, "User entered "+inputNewPassword+ " as New Password");
			test.log(Status.INFO, "User entered "+inputNewPassword+ " as New Password");
			Log.info("User entered "+inputNewPassword+ " as New Password");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_ConfirmPassword(String inputConfirmPassword) {		
		try {
			applyWait.waitForElementToBeClickable(confirmPassword, DefineConstants.explicitWait_30).clear();
			confirmPassword.sendKeys(inputConfirmPassword);
			Screenshots.takeScreenshot(driver, "User entered "+inputConfirmPassword+ " as Confirm Password");
			test.log(Status.INFO, "User entered "+inputConfirmPassword+ " as Confirm Password");
			Log.info("User entered "+inputConfirmPassword+ " as Confirm Password");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void click_PasswordUpdateButon() {		
		try {
			applyWait.waitForElementToBeClickable(passwordUpdateButton, DefineConstants.explicitWait_30);
			javascriptClick.click(passwordUpdateButton);
			Screenshots.takeScreenshot(driver, "User clicked Update Button in Password Tab");
			test.log(Status.INFO, "User clicked Update Button in Password Tab");
			Log.info("User clicked Update Button in Password Tab");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void enter_APIKey(String inputAPIKey) {		
		try {
			applyWait.waitForElementToBeClickable(apiKeyTextbox, DefineConstants.explicitWait_30).clear();
			apiKeyTextbox.sendKeys(inputAPIKey);
			Screenshots.takeScreenshot(driver, "User entered "+inputAPIKey+ " as API Key");
			test.log(Status.INFO, "User entered "+inputAPIKey+ " as API Key");
			Log.info("User entered "+inputAPIKey+ " as API Key");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void click_RestButton() {		
		try {
			applyWait.waitForElementToBeClickable(resetButton, DefineConstants.explicitWait_30);
			javascriptClick.click(resetButton);
			Screenshots.takeScreenshot(driver, "User clicked reset button");
			test.log(Status.INFO, "User clicked reset button");
			Log.info("User clicked reset button");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
