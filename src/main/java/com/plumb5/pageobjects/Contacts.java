package com.plumb5.pageobjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.DefineConstants;
import helperMethods.JavascriptClick;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class Contacts {

	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private String success_Message;
	private String error_Message;

	public Contacts(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
	}

	@FindBy(linkText = "Manage Contacts")
	private WebElement manageContacts;

	@FindBy(linkText = "Settings")
	private WebElement settings;

	@FindBy(linkText = "Manage Group")
	private WebElement manageGroups;

	@FindBy(linkText = "Contact Import")
	private WebElement contactImport;

	@FindBy(xpath = "//span[contains(text(),'Download Sample file')]")
	private WebElement downloadSampleFile;

	@FindBy(xpath = "//label[contains(text(),'Primary Email')]//following::div[1]")
	private WebElement primaryEmail;

	@FindBy(xpath = "//label[contains(text(),'Primary SMS')]//following::div[1]")
	private WebElement primarySMS;

	@FindBy(xpath = "//label[contains(text(),'Alternate Email')]//following::div[1]")
	private WebElement alternateEmail;

	@FindBy(xpath = "//label[contains(text(),'Alternate SMS')]//following::div[1]")
	private WebElement alternateSMS;

	@FindBy(xpath = "//button[@id='ui_btnSaveContactSetting']")
	private WebElement settingsSaveButton;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	public void clickManageContacts() {
		try {
			applyWait.waitForElementToBeClickable(manageContacts, DefineConstants.explicitWait_30);
			javascriptClick.click(manageContacts);
			Screenshots.takeScreenshot(driver, "Managed Contacts");
			test.log(Status.INFO, "User clicked on Manage Contacts");
			Log.info("User clicked on Managed Contacts");
			Thread.sleep(3000L);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void click_Settings() {
		try {
			applyWait.waitForElementToBeClickable(settings, DefineConstants.explicitWait_30);
			javascriptClick.click(settings);
			Screenshots.takeScreenshot(driver, "User clicked Settings");
			test.log(Status.INFO, "User clicked Settings");
			Log.info("User clicked Settings");
			Thread.sleep(3000L);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickManageGroups() {
		applyWait.waitForElementToBeClickable(manageGroups, DefineConstants.explicitWait_30);
		javascriptClick.click(manageGroups);
		try {
			Screenshots.takeScreenshot(driver, "Managed Groups");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked on Managed Groups");
		Log.info("User clicked on Managed Groups");
	}

	public void clickContactImport() {
		applyWait.waitForElementToBeClickable(contactImport, DefineConstants.explicitWait_30);
		javascriptClick.click(contactImport);
		try {
			Screenshots.takeScreenshot(driver, "User clicked contact import");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked contact import");
		Log.info("User clicked contact import");
	}

	public void click_DownloadSampleFile() {
		applyWait.waitForElementToBeClickable(downloadSampleFile, DefineConstants.explicitWait_30);
		javascriptClick.click(downloadSampleFile);
		try {
			Screenshots.takeScreenshot(driver, "User clicked download sample file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked download sample file");
		Log.info("User clicked download sample file");
	}

	public void verify_PrimaryEmailEnabled() {
		try {
			applyWait.waitForElementToBeClickable(primaryEmail, DefineConstants.explicitWait_30);

			if (primaryEmail.isDisplayed()) {
				System.out.println("Primary Email is enabled");
				Screenshots.takeScreenshot(driver, "Primary Email is enabled");
				test.log(Status.INFO, "Primary Email is enabled");
				Log.info("Primary Email is enabled");
			}
			else{
				System.out.println("Primary Email is dis-abled");
				Screenshots.takeScreenshot(driver, "Primary Email is dis-abled");
				test.log(Status.INFO, "Primary Email is dis-abled");
				Log.info("Primary Email is dis-abled");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_PrimarySMSEnabled() {
		try {
			applyWait.waitForElementToBeClickable(primarySMS, DefineConstants.explicitWait_30);

			if (primarySMS.isDisplayed()) {
				System.out.println("Primary SMS is enabled");
				Screenshots.takeScreenshot(driver, "Primary SMS is enabled");
				test.log(Status.INFO, "Primary SMS is enabled");
				Log.info("Primary SMS is enabled");
			}
			else {
				System.out.println("Primary SMS is dis-abled");
				Screenshots.takeScreenshot(driver, "Primary SMS is dis-abled");
				test.log(Status.INFO, "Primary SMS is dis-abled");
				Log.info("Primary SMS is dis-abled");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_AlternateEmailEnabled() {
		try {
			applyWait.waitForElementToBeClickable(alternateEmail, DefineConstants.explicitWait_30);

			if (alternateEmail.isDisplayed()) {
				System.out.println("Alternate Email is enabled");
				Screenshots.takeScreenshot(driver, "Alternate Email is enabled");
				test.log(Status.INFO, "Alternate Email is enabled");
				Log.info("Alternate Email is enabled");
			}
			else {
				System.out.println("Alternate Email is dis-abled");
				Screenshots.takeScreenshot(driver, "Alternate Email is dis-abled");
				test.log(Status.INFO, "Alternate Email is dis-abled");
				Log.info("Alternate Email is dis-abled");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_AlternateSMSEnabled() {
		try {
			applyWait.waitForElementToBeClickable(alternateSMS, DefineConstants.explicitWait_30);

			if (alternateSMS.isDisplayed()) {
				System.out.println("Alternate SMS is enabled");
				Screenshots.takeScreenshot(driver, "Alternate SMS is enabled");
				test.log(Status.INFO, "Alternate SMS is enabled");
				Log.info("Alternate SMS is enabled");
			}
			else {
				System.out.println("Alternate SMS is dis-abled");
				Screenshots.takeScreenshot(driver, "Alternate SMS is dis-abled");
				test.log(Status.INFO, "Alternate SMS is dis-abled");
				Log.info("Alternate SMS is dis-abled");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void unmerge_PrimaryEmail() {
		try {
			applyWait.waitForElementToBeClickable(primaryEmail, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked primary email");
			test.log(Status.INFO, "User clicked primary email");
			Log.info("User clicked primary email");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void unmerge_PrimarySMS() {
		try {
			applyWait.waitForElementToBeClickable(primarySMS, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked primary SMS");
			test.log(Status.INFO, "User clicked primary SMS");
			Log.info("User clicked primary SMS");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void unmerge_AlternateEmail() {
		try {
			applyWait.waitForElementToBeClickable(alternateEmail, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked alternate email");
			test.log(Status.INFO, "User clicked alternate email");
			Log.info("User clicked alternate email");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void unmerge_AlternateSMS() {
		try {
			applyWait.waitForElementToBeClickable(alternateSMS, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked alternate SMS");
			test.log(Status.INFO, "User clicked alternate SMS");
			Log.info("User clicked alternate SMS");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void unmerge_SettingsSaveButton() {
		try {
			applyWait.waitForElementToBeClickable(settingsSaveButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked settings save button");
			test.log(Status.INFO, "User clicked settings save button");
			Log.info("User clicked settings save button");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_Successfull_Error_Message() {
		try {
			if (successMessage.isDisplayed()) {
				success_Message = successMessage.getText();
				Screenshots.takeScreenshot(driver, DefineConstants.Settings_has_been_set_successfully + " is verified");
				System.out.println(DefineConstants.Settings_has_been_set_successfully + " is verified");
				test.log(Status.INFO, DefineConstants.Settings_has_been_set_successfully + " is verified");
				Log.info(DefineConstants.Settings_has_been_set_successfully + " is verified");
				Assert.assertEquals(success_Message, DefineConstants.Settings_has_been_set_successfully);
			} else if (errorMessage.isDisplayed()) {
				error_Message = errorMessage.getText();
				Screenshots.takeScreenshot(driver,
						DefineConstants.Please_enable_primary_email_too_with_alternate_email + " is verified");
				System.out
						.println(DefineConstants.Please_enable_primary_email_too_with_alternate_email + " is verified");
				test.log(Status.INFO,
						DefineConstants.Please_enable_primary_email_too_with_alternate_email + " is verified");
				Log.info(DefineConstants.Please_enable_primary_email_too_with_alternate_email + " is verified");
				Assert.assertEquals(error_Message, DefineConstants.Settings_has_been_set_successfully);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}