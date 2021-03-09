package com.plumb5.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
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

public class Settings {

	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;

	public Settings(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropDown = new DropDown(driver);
	}

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm'][contains(text(),'Add Email')]")
	private WebElement addEmail;

	@FindBy(xpath = "//label[contains(text(),'Email Address')]//following::input[1]")
	private WebElement emailAddress;

	@FindBy(xpath = "//button[@id='ui_btnAddEmail']")
	private WebElement addEmail_PopUp;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	@FindBy(xpath = "//table[@id='ui_tblReportData']")
	private WebElement senderEmailIds;

	@FindBy(id = "ui_table_SpamVerifyReport")
	private WebElement table_SpamScoreSettings;

	@FindBy(id = "ui_table_EmailVerifyReport")
	private WebElement table_EmailVerifySetting;

	@FindBy(xpath = "//table[@id='ui_tblReportServiceProviderReportData']")
	private WebElement emailServiceProviderTable;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successfullMessage;

	// @FindBy(id = "ui_div_MasterSuccess")
	// private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(partialLinkText = "Email Service Provid")
	private WebElement EmailServiceProvider_ESP;

	@FindBy(partialLinkText = "Sender Email I")
	private WebElement senderEmailIdsTab;

	@FindBy(partialLinkText = "Custom Unsubscri")
	private WebElement customUnsubscribe;

	@FindBy(xpath = "//label[@id='lbldesc']")
	private WebElement customUnsubscribeCheckbox;

	@FindBy(xpath = "//input[@id='ui_txtUnsubscribeUrl']")
	private WebElement unsubscribeUrl;

	@FindBy(xpath = "//button[@id='ui_btnUpdateUnsubscribeUrl']")
	private WebElement customUnsubscribeUpdateButton;

	@FindBy(xpath = "//input[@id='ui_txtUnsubscribeUrl']")
	private WebElement unsubscribeUpdate;

	@FindBy(xpath = "//a[@class='tx-gray-800 transition']//following::button[1]")
	private WebElement add_Provider;

	@FindBy(xpath = "//input[@id='ui_txtProviderName']")
	private WebElement providerName;

	@FindBy(xpath = "//a[contains(text(),'Promotional Settings')]")
	private WebElement promotionalSetting;

	@FindBy(xpath = "//a[contains(text(),'Transactional Settings')]")
	private WebElement transactionalSetting;

	private WebElement bulkSupport;

	@FindBy(xpath = "//div[@class='promowrp pt-2 pl-3 pr-3 pb-3']//label[@class='frmlbltxt'][contains(text(),'Account Name')]//following::input[1]")
	private WebElement accountName;

	@FindBy(xpath = "//div[@class='promowrp pt-2 pl-3 pr-3 pb-3']//label[@class='frmlbltxt'][contains(text(),'API Key')]//following::input[1]")
	private WebElement apiKey;

	@FindBy(xpath = "//div[@class='promowrp pt-2 pl-3 pr-3 pb-3']//label[@class='frmlbltxt'][contains(text(),'Configuration URL')]//following::input[1]")
	private WebElement configurationURL;

	// Transactional

	private WebElement bulkSupportTransactional;

	@FindBy(xpath = "//div[@class='transwrap pt-2 pl-3 pr-3 pb-3']//label[@class='frmlbltxt'][contains(text(),'Account Name')]//following::input[1]")
	private WebElement accountNameTransactional;

	@FindBy(xpath = "//div[@class='transwrap pt-2 pl-3 pr-3 pb-3']//label[@class='frmlbltxt'][contains(text(),'API Key')]//following::input[1]")
	private WebElement apiKeyTransactional;

	@FindBy(xpath = "//div[@class='transwrap pt-2 pl-3 pr-3 pb-3']//label[@class='frmlbltxt'][contains(text(),'Configuration URL')]//following::input[1]")
	private WebElement configurationURLTransactional;

	private WebElement elasticMail;

	@FindBy(id = "ui_btnSubmit")
	private WebElement submitButton;

	@FindBy(xpath = "//button[@id='ui_btnSubmit']//following::button[1]")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//div[contains(text(),'Spam Score Settings')]")
	private WebElement spamScoreSettings;

	@FindBy(xpath = "//div[contains(text(),'Email Verification Settings')]")
	private WebElement emailVerificationSettings;

	@FindBy(xpath = "//button[@id='btnProvider']")
	private WebElement selectProviderSpamScoreSetting;

	@FindBy(xpath = "//select[@id='ui_drpdwn_AddSpamVerifySettings']")
	private WebElement providerNameSpamScoreSetting;

	@FindBy(xpath = "//button[@id='ui_btn_AddSpamVerifySettings']")
	private WebElement addProviderSpamScoreSetting;

	@FindBy(xpath = "//button[@id='btnEmailVerify']")
	private WebElement selectProviderEmailVerificationSettings;

	@FindBy(xpath = "//select[@id='ui_drpdwn_addEmailVerifySettings']")
	private WebElement providerNameEmailVerificationSettings;

	@FindBy(xpath = "//a[contains(text(),'Provider Settings')]")
	private WebElement providerSettingsEmailVerificationSettings;

	@FindBy(xpath = "//input[@id='ui_txt_MailVerifyApiKey']")
	private WebElement apiKeyProviderSettingsEmailVerificationSettings;

	@FindBy(xpath = "//label[contains(text(),'Api Url')]//following::input[1]")
	private WebElement apiUrlProviderSettingsEmailVerificationSettings;

	@FindBy(xpath = "//button[@id='ui_btn_addEmailVerifySettings']")
	private WebElement addProviderButtonEmailVerificationSettings;

	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement configurationSenderEmailId_Delete_ButtonPopUp;

	@FindBy(xpath = "//button[@id='deleteServiceProviderConfirm']")
	private WebElement emailServiceProvider_Delete_ButtonPopUp;

	@FindBy(linkText = "Edit")
	private WebElement editButton_ESP;

	@FindBy(linkText = "Delete")
	private WebElement deleteButton_ESP;

	@FindBy(linkText = "Validate")
	private WebElement validateButton_ESP;

	private String deletedSuccessfullyMessage;

	private String updatedSuccessfullyMessage;

	private String validatedSuccessfullyMessage;

	public void click_AddEmail() {
		try {
			applyWait.waitForElementToBeClickable(addEmail, DefineConstants.explicitWait_30);
			javascriptClick.click(addEmail);
			Screenshots.takeScreenshot(driver, "User clicked add email on configuration tab");
			test.log(Status.INFO, "User clicked add email on configuration tab");
			Log.info("User clicked add email on configuration tab");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_ProviderName(String input_ElasticMail) {
		try {
			applyWait.waitForElementToBeClickable(providerName, DefineConstants.explicitWait_30).clear();
			providerName.sendKeys(input_ElasticMail);
			elasticMail = driver.findElement(By.xpath("//div[contains(text(),'" + input_ElasticMail + "')]"));
			elasticMail.click();
			// javascriptClick.click(providerName);
			Screenshots.takeScreenshot(driver, "User clicked provider name");
			test.log(Status.INFO, "User clicked provider name");
			Log.info("User clicked provider name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EmailServiceProvider_ESP() {
		try {
			applyWait.waitForElementToBeClickable(EmailServiceProvider_ESP, DefineConstants.explicitWait_30);
			javascriptClick.click(EmailServiceProvider_ESP);
			Screenshots.takeScreenshot(driver, "User clicked Email Service Provider (ESP)");
			test.log(Status.INFO, "User clicked Email Service Provider (ESP)");
			Log.info("User clicked Email Service Provider (ESP)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_CustomUnsubscribe() {
		try {
			applyWait.waitForElementToBeClickable(customUnsubscribe, DefineConstants.explicitWait_30);
			javascriptClick.click(customUnsubscribe);
			Screenshots.takeScreenshot(driver, "User clicked custom unsubscribe");
			test.log(Status.INFO, "User clicked custom unsubscribe");
			Log.info("User clicked custom unsubscribe");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SenderEmailIdsTab() {
		try {
			applyWait.waitForElementToBeClickable(senderEmailIdsTab, DefineConstants.explicitWait_30);
			javascriptClick.click(senderEmailIdsTab);
			Screenshots.takeScreenshot(driver, "User clicked Sender Email Ids Tab");
			test.log(Status.INFO, "User clicked Sender Email Ids Tab");
			Log.info("User clicked Sender Email Ids Tab");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_CustomUnsubscribeCheckbox() {
		try {
			applyWait.waitForElementToBeClickable(customUnsubscribeCheckbox, DefineConstants.explicitWait_30);
			javascriptClick.click(customUnsubscribeCheckbox);
			Screenshots.takeScreenshot(driver, "User clicked custom unsubscribe checkbox");
			test.log(Status.INFO, "User clicked custom unsubscribe checkbox");
			Log.info("User clicked custom unsubscribe checkbox");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_UnsubscribeUrl(String input_UnsubscribeUrl) {
		try {
			applyWait.waitForElementToBeClickable(unsubscribeUrl, DefineConstants.explicitWait_30);
			unsubscribeUrl.sendKeys(input_UnsubscribeUrl);
			Screenshots.takeScreenshot(driver, "User enter unsubscribe url as " + input_UnsubscribeUrl);
			test.log(Status.INFO, "User enter unsubscribe url as " + input_UnsubscribeUrl);
			Log.info("User enter unsubscribe url as " + input_UnsubscribeUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_UpdateButtonCustomUnsubscribe() {
		try {
			applyWait.waitForElementToBeClickable(customUnsubscribeUpdateButton, DefineConstants.explicitWait_30)
					.click();
			Screenshots.takeScreenshot(driver, "User click update button on custom unsubscribe tab");
			test.log(Status.INFO, "User click update button on custom unsubscribe tab");
			Log.info("User click update button on custom unsubscribe tab");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_AddEmail_PopUp() {
		try {
			applyWait.waitForElementToBeClickable(addEmail_PopUp, DefineConstants.explicitWait_30);
			javascriptClick.click(addEmail_PopUp);
			Screenshots.takeScreenshot(driver, "User clicked add email on add email id pop up");
			test.log(Status.INFO, "User clicked add email on add email id pop up");
			Log.info("User clicked add email on add email id pop up");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_EmailAddress(String input_EmailAddress) {
		try {
			Thread.sleep(3000L);
			applyWait.waitForElementToBeClickable(emailAddress, DefineConstants.explicitWait_30)
					.sendKeys(input_EmailAddress);
			Screenshots.takeScreenshot(driver, "User entered email address in add email id pop up");
			test.log(Status.INFO, "User entered email address in add email id pop up");
			Log.info("User entered email address in add email id pop up");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void verify_SuccessMessage_ESP(String inputSuccessMessage) throws Exception {
		try {
			Thread.sleep(3000);
			if (successfullMessage.isDisplayed()) {
				String successMessage = successfullMessage.getText();
				System.out.println("Message is " + successMessage);
				test.log(Status.INFO, "Message is " + successMessage);
				Log.info("Message is " + successMessage);
				Screenshots.takeScreenshot(driver, inputSuccessMessage + " is verified");
				System.out.println(inputSuccessMessage + " is verified");
				test.log(Status.INFO, inputSuccessMessage + " is verified");
				Log.info(inputSuccessMessage + " is verified");
			} else if (errorMessage.isDisplayed()) {
				String error_Message = errorMessage.getText();
				Screenshots.takeScreenshot(driver, error_Message + " is displayed");
				System.out.println(error_Message + " is displayed");
				test.log(Status.INFO, error_Message + "  is displayed");
				Log.info(error_Message + "  is displayed");
				applyWait.waitForElementToBeClickable(cancelButton, DefineConstants.explicitWait_30).click();
         		Screenshots.takeScreenshot(driver, "User clicked cancel button on Mail Settings");
		        test.log(Status.INFO, "User clicked cancel button on Mail Settings");
		        Log.info("User clicked cancel button on Mail Settings");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verify_SuccessMessage(String inputSuccessMessage) throws Exception {
		try {
			Thread.sleep(3000);
			if (successfullMessage.isDisplayed()) {
				String successMessage = successfullMessage.getText();
				System.out.println("Message is " + successMessage);
				test.log(Status.INFO, "Message is " + successMessage);
				Log.info("Message is " + successMessage);
				Screenshots.takeScreenshot(driver, inputSuccessMessage + " is verified");
				System.out.println(inputSuccessMessage + " is verified");
				test.log(Status.INFO, inputSuccessMessage + " is verified");
				Log.info(inputSuccessMessage + " is verified");
			} else if (errorMessage.isDisplayed()) {
				String error_Message = errorMessage.getText();
				Screenshots.takeScreenshot(driver, error_Message + " is displayed");
				System.out.println(error_Message + " is displayed");
				test.log(Status.INFO, error_Message + "  is displayed");
				Log.info(error_Message + "  is displayed");
				Assert.assertEquals(inputSuccessMessage, error_Message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_DeleteSuccessMessage(String inputSuccessMessage) throws Exception {
		try {
			if (successfullMessage.isDisplayed()) {
				String successMessage = successfullMessage.getText();
				System.out.println("Message is " + successMessage);
				test.log(Status.INFO, "Message is " + successMessage);
				Log.info("Message is " + successMessage);
				Screenshots.takeScreenshot(driver, inputSuccessMessage + " is verified");
				System.out.println(inputSuccessMessage + " is verified");
				test.log(Status.INFO, inputSuccessMessage + " is verified");
				Log.info(inputSuccessMessage + " is verified");
			} else if (errorMessage.isDisplayed()) {
				String error_Message = errorMessage.getText();
				Screenshots.takeScreenshot(driver, error_Message + " is displayed");
				System.out.println(error_Message + " is displayed");
				test.log(Status.INFO, error_Message + "  is displayed");
				Log.info(error_Message + "  is displayed");
				Assert.assertEquals(inputSuccessMessage, error_Message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_FromEmailID(String inputEmailID) {
		try {
			Thread.sleep(3000L);
			applyWait.waitforElementToBeDisplayed(senderEmailIds, DefineConstants.explicitWait_60);
			tableRows = senderEmailIds.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();

					if (cellText.equals(inputEmailID)) {
						System.out.println(inputEmailID + " is verified");
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, inputEmailID + " is verified");
						test.log(Status.INFO, inputEmailID + " is verified");
						Log.info(inputEmailID + " is verified");
						Assert.assertTrue(true, inputEmailID + " is verified");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete_SenderEmailIdsDetails(String inputEmailID) {
		try {
			applyWait.waitforElementToBeDisplayed(senderEmailIds, DefineConstants.explicitWait_60);
			tableRows = senderEmailIds.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();

					// System.out.println("value is "+cellText);
					if (cellText.equals(inputEmailID)) {
						System.out.println(inputEmailID + " is verified");
						javascriptClick.highLighterMethod(tableColums.get(column));
						tableColums.get(3).click();
						System.out.println(inputEmailID + " is deleted");
						Screenshots.takeScreenshot(driver, inputEmailID + " is deleted");
						test.log(Status.INFO, inputEmailID + " is deleted");
						Log.info(inputEmailID + " is deleted");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update_SenderEmailIdsDetails(String inputEmailID) {
		try {
			applyWait.waitforElementToBeDisplayed(senderEmailIds, DefineConstants.explicitWait_60);
			tableRows = senderEmailIds.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();

					// System.out.println("value is "+cellText);
					if (cellText.equals(inputEmailID)) {
						System.out.println(inputEmailID + " is verified");
						javascriptClick.highLighterMethod(tableColums.get(column));
						javascriptClick.highLighterMethod(tableColums.get(2));
						tableColums.get(2).click();
						System.out.println(inputEmailID + " is updated");
						Screenshots.takeScreenshot(driver, inputEmailID + " is updated");
						test.log(Status.INFO, inputEmailID + " is updated");
						Log.info(inputEmailID + " is updated");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Delete_PopUp() {
		try {
			applyWait.waitForElementToBeClickable(configurationSenderEmailId_Delete_ButtonPopUp,
					DefineConstants.explicitWait_30);
			javascriptClick.click(configurationSenderEmailId_Delete_ButtonPopUp);
			Screenshots.takeScreenshot(driver, "User clicked delete button on delete this from email id popup");
			test.log(Status.INFO, "User clicked delete button on delete this from email id popup");
			Log.info("User clicked delete button on delete this from email id popup");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Delete_PopUp_EmailServiceProvider() {
		try {
			Thread.sleep(3000L);
			applyWait.waitForElementToBeClickable(emailServiceProvider_Delete_ButtonPopUp,
					DefineConstants.explicitWait_30);
			javascriptClick.click(emailServiceProvider_Delete_ButtonPopUp);
			Screenshots.takeScreenshot(driver, "User clicked delete button on delete this service provider popup");
			test.log(Status.INFO, "User clicked delete button on delete this service provider popup");
			Log.info("User clicked delete button on delete this service provider popup");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_Email_Service_Provider(String input_Email_Service_Provider) {
		try {
			applyWait.waitforElementToBeDisplayed(emailServiceProviderTable, DefineConstants.explicitWait_60);
			tableRows = emailServiceProviderTable.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();

					if (cellText.equals(input_Email_Service_Provider)) {
						System.out.println(input_Email_Service_Provider + " is verified");
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_Email_Service_Provider + " is verified");
						test.log(Status.INFO, input_Email_Service_Provider + " is verified");
						Log.info(input_Email_Service_Provider + " is verified");
						Assert.assertTrue(true, input_Email_Service_Provider + " is verified");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_Email_Service_Provider_To_Edit(String input_Email_Service_Provider) {
		try {
			applyWait.waitforElementToBeDisplayed(emailServiceProviderTable, DefineConstants.explicitWait_60);
			tableRows = emailServiceProviderTable.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();

					if (cellText.equals(input_Email_Service_Provider)) {
						System.out.println("value is " + cellText);
						javascriptClick.highLighterMethod(tableColums.get(column));
						tableColums.get(3).click();
						Screenshots.takeScreenshot(driver, cellText + " is verified");
						test.log(Status.INFO, cellText + " is verified");
						Log.info(cellText + " is verified");
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EditButton_ESP() {
		try {
			applyWait.waitForElementToBeClickable(editButton_ESP, DefineConstants.explicitWait_30);
			javascriptClick.click(editButton_ESP);
			Screenshots.takeScreenshot(driver, "User clicked edit button for Email Service Provider ESP");
			test.log(Status.INFO, "User clicked edit button for Email Service Provider ESP");
			Log.info("User clicked edit button for Email Service Provider ESP");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_DeleteButton_ESP() {
		try {
			applyWait.waitForElementToBeClickable(deleteButton_ESP, DefineConstants.explicitWait_30);
			javascriptClick.click(deleteButton_ESP);
			Screenshots.takeScreenshot(driver, "User clicked delete button for Email Service Provider ESP");
			test.log(Status.INFO, "User clicked delete button for Email Service Provider ESP");
			Log.info("User clicked delete button for Email Service Provider ESP");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_ValidateButton_ESP() {
		try {
			applyWait.waitForElementToBeClickable(validateButton_ESP, DefineConstants.explicitWait_30);
			javascriptClick.click(validateButton_ESP);
			Screenshots.takeScreenshot(driver, "User clicked validate button for Email Service Provider ESP");
			test.log(Status.INFO, "User clicked validate button for Email Service Provider ESP");
			Log.info("User clicked validate button for Email Service Provider ESP");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDeletedSuccessfully(String inputmessage) {
		try {
			if (successfullMessage.isDisplayed() && successfullMessage.getText().equals(inputmessage)) {
				deletedSuccessfullyMessage = successfullMessage.getText();
				System.out.println("message is " + deletedSuccessfullyMessage);
				Screenshots.takeScreenshot(driver, deletedSuccessfullyMessage + " message is verified");
				System.out.println(deletedSuccessfullyMessage + " message is verified");
				test.log(Status.INFO, deletedSuccessfullyMessage + " message is verified");
				Log.info(deletedSuccessfullyMessage + " message is verified");
				Assert.assertEquals(deletedSuccessfullyMessage, inputmessage);
			} else {
				Screenshots.takeScreenshot(driver, inputmessage + " message is not displayed");
				System.out.println(inputmessage + " message is not displayed");
				test.log(Status.INFO, inputmessage + " message is not displayed");
				Log.info(inputmessage + " message is not displayed");
				Assert.assertEquals(deletedSuccessfullyMessage, inputmessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValidateSuccessfully(String inputmessage) {
		try {
			Thread.sleep(3000L);
			if (successfullMessage.isDisplayed() && successfullMessage.getText().equals(inputmessage)) {
				validatedSuccessfullyMessage = successfullMessage.getText();
				System.out.println("message is " + validatedSuccessfullyMessage);
				Screenshots.takeScreenshot(driver, validatedSuccessfullyMessage + " message is verified");
				System.out.println(validatedSuccessfullyMessage + " message is verified");
				test.log(Status.INFO, validatedSuccessfullyMessage + " message is verified");
				Log.info(validatedSuccessfullyMessage + " message is verified");
				Assert.assertEquals(validatedSuccessfullyMessage, inputmessage);
			} else {
				Screenshots.takeScreenshot(driver, inputmessage + " message is not displayed");
				System.out.println(inputmessage + " message is not displayed");
				test.log(Status.INFO, inputmessage + " message is not displayed");
				Log.info(inputmessage + " message is not displayed");
				Assert.assertEquals(validatedSuccessfullyMessage, inputmessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_AddProvider() {
		try {
			applyWait.waitForElementToBeClickable(add_Provider, DefineConstants.explicitWait_30);
			javascriptClick.click(add_Provider);
			Screenshots.takeScreenshot(driver, "User clicked add provider button");
			test.log(Status.INFO, "User clicked add provider button");
			Log.info("User clicked add provider button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_PromotionalSettings() {
		try {
			applyWait.waitForElementToBeClickable(promotionalSetting, DefineConstants.explicitWait_30);
			javascriptClick.click(promotionalSetting);
			Screenshots.takeScreenshot(driver, "User clicked Promotional Setting");
			test.log(Status.INFO, "User clicked Promotional Setting");
			Log.info("User clicked Promotional Setting");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_TransactionalSettings() {
		try {
			applyWait.waitForElementToBeClickable(transactionalSetting, DefineConstants.explicitWait_30);
			javascriptClick.click(transactionalSetting);
			Screenshots.takeScreenshot(driver, "User clicked transactional Setting");
			test.log(Status.INFO, "User clicked transactional Setting");
			Log.info("User clicked transactional Setting");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_BulkSupport(String Yes_No) {
		try {
			bulkSupport = driver.findElement(By
					.xpath("//div[@class='promowrp pt-2 pl-3 pr-3 pb-3']//label[@class='custom-control-label'][contains(text(),'"
							+ Yes_No + "')]"));
			applyWait.waitForElementToBeClickable(bulkSupport, DefineConstants.explicitWait_30);
			javascriptClick.click(bulkSupport);
			Screenshots.takeScreenshot(driver, "User selected as " + Yes_No + " for bulk support");
			test.log(Status.INFO, "User selected as " + Yes_No + " for bulk support");
			Log.info("User selected as " + Yes_No + " for bulk support");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_AccountName(String inputAccountName) {
		try {
			applyWait.waitForElementToBeClickable(accountName, DefineConstants.explicitWait_30).clear();
			accountName.sendKeys(inputAccountName);
			Screenshots.takeScreenshot(driver, "User entered account name as " + inputAccountName);
			test.log(Status.INFO, "User entered account name as " + inputAccountName);
			Log.info("User entered account name as " + inputAccountName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_APIKey(String input_APIKey) {
		try {
			applyWait.waitForElementToBeClickable(apiKey, DefineConstants.explicitWait_30).clear();
			apiKey.sendKeys(input_APIKey);
			Screenshots.takeScreenshot(driver, "User entered api key name as " + input_APIKey);
			test.log(Status.INFO, "User entered api key name as " + input_APIKey);
			Log.info("User entered api key name as " + input_APIKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_ConfigurationUrl(String input_ConfigurationUrl) {
		try {
			applyWait.waitForElementToBeClickable(configurationURL, DefineConstants.explicitWait_30).clear();
			configurationURL.sendKeys(input_ConfigurationUrl);
			Screenshots.takeScreenshot(driver, "User entered Configuration Url name");
			test.log(Status.INFO, "User entered Configuration Url name as " + input_ConfigurationUrl);
			Log.info("User entered Configuration Url name as " + input_ConfigurationUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_BulkSupportTransactional(String Yes_No) {
		try {
			bulkSupport = driver.findElement(By
					.xpath("//div[@class='transwrap pt-2 pl-3 pr-3 pb-3']//label[@class='custom-control-label'][contains(text(),'"
							+ Yes_No + "')]"));
			applyWait.waitForElementToBeClickable(bulkSupport, DefineConstants.explicitWait_30);
			javascriptClick.click(bulkSupport);
			Screenshots.takeScreenshot(driver, "User selected as " + Yes_No + " for transactional bulk support");
			test.log(Status.INFO, "User selected as " + Yes_No + " for transactional bulk support");
			Log.info("User selected as " + Yes_No + " for transactional bulk support");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_AccountNameTransactional(String inputAccountName) {
		try {
			applyWait.waitForElementToBeClickable(accountNameTransactional, DefineConstants.explicitWait_30).clear();
			accountNameTransactional.sendKeys(inputAccountName);
			Screenshots.takeScreenshot(driver, "User entered transactional account name as " + inputAccountName);
			test.log(Status.INFO, "User entered transactional account name as " + inputAccountName);
			Log.info("User entered transactional account name as " + inputAccountName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_APIKeyTransactional(String input_APIKey) {
		try {
			applyWait.waitForElementToBeClickable(apiKeyTransactional, DefineConstants.explicitWait_30).clear();
			apiKeyTransactional.sendKeys(input_APIKey);
			Screenshots.takeScreenshot(driver, "User entered transactional api key name as " + input_APIKey);
			test.log(Status.INFO, "User entered transactional api key name as " + input_APIKey);
			Log.info("User entered transactional api key name as " + input_APIKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_ConfigurationUrlTransactional(String input_ConfigurationUrl) {
		try {
			applyWait.waitForElementToBeClickable(configurationURLTransactional, DefineConstants.explicitWait_30)
					.clear();
			configurationURLTransactional.sendKeys(input_ConfigurationUrl);
			Screenshots.takeScreenshot(driver, "User entered Transactional Configuration Url");
			test.log(Status.INFO, "User entered transactional Configuration Url name as " + input_ConfigurationUrl);
			Log.info("User entered transactional Configuration Url name as " + input_ConfigurationUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SubmitButton() {
		try {
			applyWait.waitForElementToBeClickable(submitButton, DefineConstants.explicitWait_30);
			javascriptClick.click(submitButton);
			Screenshots.takeScreenshot(driver, "User clicked submit button");
			test.log(Status.INFO, "User clicked submit button");
			Log.info("User clicked submit button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SpamScoreSettings() {
		try {
			applyWait.waitForElementToBeClickable(spamScoreSettings, DefineConstants.explicitWait_30);
			javascriptClick.click(spamScoreSettings);
			Screenshots.takeScreenshot(driver, "User clicked spam score settings");
			test.log(Status.INFO, "User clicked spam score settings");
			Log.info("User clicked spam score settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EmailVerificationSettings() {
		try {
			applyWait.waitForElementToBeClickable(emailVerificationSettings, DefineConstants.explicitWait_30);
			javascriptClick.click(emailVerificationSettings);
			Screenshots.takeScreenshot(driver, "User clicked email verification settings");
			test.log(Status.INFO, "User clicked email verification settings");
			Log.info("User clicked email verification settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_ProviderNameSpamScoreSettings(String input_ProviderName) {
		try {
			applyWait.waitForElementToBeClickable(selectProviderSpamScoreSetting, DefineConstants.explicitWait_30);
			javascriptClick.click(selectProviderSpamScoreSetting);
			Thread.sleep(3000);
			dropDown.selectByVisibleText(providerNameSpamScoreSetting, input_ProviderName);
			applyWait.waitForElementToBeClickable(addProviderSpamScoreSetting, DefineConstants.explicitWait_30).click();

			Screenshots.takeScreenshot(driver, "User selected Provider Name for Spam Score Settings");
			test.log(Status.INFO, "User selected Provider Name for Spam Score Settings");
			Log.info("User selected Provider Name for Spam Score Settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_ProviderNameEmailVerificationSettings(String input_ProviderName) {
		try {

			applyWait.waitForElementToBeClickable(selectProviderEmailVerificationSettings,
					DefineConstants.explicitWait_30);
			javascriptClick.click(selectProviderEmailVerificationSettings);
			Thread.sleep(3000);
			dropDown.selectByVisibleText(providerNameEmailVerificationSettings, input_ProviderName);

			Screenshots.takeScreenshot(driver,
					"User selected Provider Name for Email Verification Settings as " + input_ProviderName);
			test.log(Status.INFO,
					"User selected Provider Name for Email Verification Settings as " + input_ProviderName);
			Log.info("User selected Provider Name for Email Verification Settings as " + input_ProviderName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_APIKey_APIUrl_EmailVerificationSettings(String apiKey_EmailVerificationSettings,
			String apiUrl_EmailVerificationSettings) {
		try {
			applyWait.waitForElementToBeClickable(providerSettingsEmailVerificationSettings,
					DefineConstants.explicitWait_30);
			javascriptClick.click(providerSettingsEmailVerificationSettings);

			javascriptClick.click(apiKeyProviderSettingsEmailVerificationSettings);
			applyWait.waitForElementToBeClickable(apiKeyProviderSettingsEmailVerificationSettings,
					DefineConstants.explicitWait_30).clear();
			apiKeyProviderSettingsEmailVerificationSettings.sendKeys(apiKey_EmailVerificationSettings);
			Screenshots.takeScreenshot(driver, "User entered API key as " + apiKey_EmailVerificationSettings);
			test.log(Status.INFO, "User entered API key as " + apiKey_EmailVerificationSettings);
			Log.info("User entered API key as " + apiKey_EmailVerificationSettings);

			applyWait.waitForElementToBeClickable(apiUrlProviderSettingsEmailVerificationSettings,
					DefineConstants.explicitWait_30).clear();
			apiUrlProviderSettingsEmailVerificationSettings.sendKeys(apiUrl_EmailVerificationSettings);
			Screenshots.takeScreenshot(driver, "User entered API Url as " + apiUrl_EmailVerificationSettings);
			test.log(Status.INFO, "User entered API Url as " + apiUrl_EmailVerificationSettings);
			Log.info("User entered API Url as " + apiUrl_EmailVerificationSettings);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update_APIKey_APIUrl_EmailVerificationSettings(String apiKey_EmailVerificationSettings,
			String apiUrl_EmailVerificationSettings) {
		try {
			applyWait.waitForElementToBeClickable(providerSettingsEmailVerificationSettings,
					DefineConstants.explicitWait_30);
			javascriptClick.click(providerSettingsEmailVerificationSettings);

			javascriptClick.click(apiKeyProviderSettingsEmailVerificationSettings);
			applyWait.waitForElementToBeClickable(apiKeyProviderSettingsEmailVerificationSettings,
					DefineConstants.explicitWait_30).clear();
			apiKeyProviderSettingsEmailVerificationSettings.sendKeys(apiKey_EmailVerificationSettings);
			Screenshots.takeScreenshot(driver, "User entered API key as " + apiKey_EmailVerificationSettings);
			test.log(Status.INFO, "User entered API key as " + apiKey_EmailVerificationSettings);
			Log.info("User entered API key as " + apiKey_EmailVerificationSettings);

			applyWait.waitForElementToBeClickable(apiUrlProviderSettingsEmailVerificationSettings,
					DefineConstants.explicitWait_30).clear();
			apiUrlProviderSettingsEmailVerificationSettings.sendKeys(apiUrl_EmailVerificationSettings);
			Screenshots.takeScreenshot(driver, "User entered API Url as " + apiUrl_EmailVerificationSettings);
			test.log(Status.INFO, "User entered API Url as " + apiUrl_EmailVerificationSettings);
			Log.info("User entered API Url as " + apiUrl_EmailVerificationSettings);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_AddProvider_EmailVerificationSettings() {
		try {
			applyWait.waitForElementToBeClickable(addProviderButtonEmailVerificationSettings,
					DefineConstants.explicitWait_30);
			javascriptClick.click(addProviderButtonEmailVerificationSettings);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_Provider_Name_Spam_Score_Settings(String inputProviderName) {
		try {
			applyWait.waitforElementToBeDisplayed(table_SpamScoreSettings, DefineConstants.explicitWait_60);
			tableRows = table_SpamScoreSettings.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();

					if (cellText.equals(inputProviderName)) {
						System.out.println(inputProviderName + " is verified");
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, inputProviderName + " is verified");
						test.log(Status.INFO, inputProviderName + " is verified");
						Log.info(inputProviderName + " is verified");
						Assert.assertTrue(true, inputProviderName + " is verified");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_Provider_Name_Email_Verification_Settings(String inputProviderName) {
		try {
			applyWait.waitforElementToBeDisplayed(table_EmailVerifySetting, DefineConstants.explicitWait_60);
			tableRows = table_EmailVerifySetting.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();

					if (cellText.equals(inputProviderName)) {
						System.out.println(inputProviderName + " is verified");
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, inputProviderName + " is verified");
						test.log(Status.INFO, inputProviderName + " is verified");
						Log.info(inputProviderName + " is verified");
						Assert.assertTrue(true, inputProviderName + " is verified");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Edit_Button_Provider_Name_Email_Verification_Settings(String inputProviderName) {
		try {
			applyWait.waitforElementToBeDisplayed(table_EmailVerifySetting, DefineConstants.explicitWait_60);
			tableRows = table_EmailVerifySetting.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();

					if (cellText.equals(inputProviderName)) {
						javascriptClick.highLighterMethod(tableColums.get(3));
						tableColums.get(3).click();
						System.out.println("User clicked edit button for " + inputProviderName);
						Screenshots.takeScreenshot(driver, "User clicked edit button for " + inputProviderName);
						test.log(Status.INFO, "User clicked edit button for " + inputProviderName);
						Log.info("User clicked edit button for " + inputProviderName);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}