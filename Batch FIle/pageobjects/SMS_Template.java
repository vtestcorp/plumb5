package com.plumb5.pageobjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class SMS_Template {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;

	public SMS_Template(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropDown = new DropDown(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'Create Template')]")
	private WebElement create_Template;

	private WebElement select_Template;

	@FindBy(xpath = "//span[@id='select2-ui_dllCampaign-container']")
	private WebElement campaign_Name;

	@FindBy(xpath = "//span[@id='select2-ui_ddlUploadTemplateCampaign-container']")
	private WebElement campaignName_UploadTemplate;

	@FindBy(xpath = "//span[@id='select2-ui_dllCampaign-container']//following::input[2]")
	private WebElement campaignName_Search;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement campaignName_SearchUploadTemplate;

	@FindBy(xpath = "//span[@id='select2-ui_ddlUploadTemplateCampaign-container']//following::input[1]")
	private WebElement campaignName_SearchUploadButton;

	@FindBy(xpath = "//label[contains(text(),'Template Name')]//following::input[1]")
	private WebElement template_Name;

	@FindBy(xpath = "//input[@id='ui_txtTemplateName']")
	private WebElement duplicate_TemplateName;

	@FindBy(xpath = "//input[@id='ui_txtUploadTemplateName']")
	private WebElement templateName_UploadTemplate;

	@FindBy(xpath = "//label[contains(text(),'Template Description')]//following::textarea[1]")
	private WebElement template_Description;

	@FindBy(xpath = "//textarea[@id='ui_txtareaTemplateDesc']")
	private WebElement duplicate_TemplateDescription;

	@FindBy(xpath = "//textarea[@id='ui_txtareaUploadTemplateDesc']")
	private WebElement templateDescription_UploadTemplate;

	@FindBy(linkText = "Next")
	private WebElement nextButton;

	@FindBy(xpath = "//input[@id='ui_files']")
	private WebElement chooseFilesButton;

	@FindBy(xpath = "//button[@id='ui_btnCreateTemplate']")
	private WebElement uploadTemplateButton;

	@FindBy(xpath = "//button[@id='ui_btnSaveTemplate']")
	private WebElement saveButtonUploadTemplate;

	@FindBy(xpath = "//button[@id='ui_btnTemplateNext']")
	private WebElement duplicate_NextButton;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successfullMessage;

	// @FindBy(id = "ui_div_MasterSuccess")
	// private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(xpath = "//input[@id='ui_txtSearchTemplate']")
	private WebElement search_Template;

	@FindBy(id = "ui_tbodyReportData")
	private WebElement templateTable;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	private WebElement templateToEdit;

	@FindBy(linkText = "Duplicate")
	private WebElement duplicate_Button;

	@FindBy(linkText = "Delete")
	private WebElement delete_Button;

	@FindBy(linkText = "Download")
	private WebElement download_Button;

	@FindBy(linkText = "Edit")
	private WebElement edit_Button;

	@FindBy(linkText = "Spam score")
	private WebElement spamScore_Button;

	private WebElement spamScorePopUp_Type_Field;

	@FindBy(xpath = "//label[contains(text(),'From Email Id')]//following::select[1]")
	private WebElement spamScorePopUp_fromEmailId;

	@FindBy(xpath = "//label[contains(text(),'From Name')]//following::input[1]")
	private WebElement spamScorePopUp_fromName;

	@FindBy(xpath = "//label[contains(text(),'Subject')]//following::input[1]")
	private WebElement spamScorePopUp_Subject;

	@FindBy(xpath = "//button[@id='btncheckSpamScore']")
	private WebElement verifyButton;

	@FindBy(xpath = "//div[@id='dv_spamTitle']")
	private WebElement spamScorePopUp_SpamTitle;

	@FindBy(id = "close-popup")
	private WebElement closePopUp;

	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement delete_ButtonPopUp;

	private String groupCreatedMessage;

	@FindBy(xpath = "//button[@id='ui_btnUploadTemplate']")
	private WebElement uploadButtonTemplate;

	@FindBy(xpath = "//textarea[@id='ui_txtMessageTemplate']")
	private WebElement addMessage_SMSTemplate;

	@FindBy(xpath = "//button[@id='addlandpage']")
	private WebElement addLandingPage_Button;

	@FindBy(xpath = "//input[@id='txtShortenUrl']")
	private WebElement pageUrl;

	@FindBy(xpath = "//button[@id='ui_btnSaveUrl']")
	private WebElement pageurl_AddButton;

	@FindBy(xpath = "//button[@id='ui_btnCreateTemplate']")
	private WebElement saveButton;

	@FindBy(xpath = "//textarea[@id='ui_txtMessageTemplate']//following::i[1]")
	private WebElement userAttributes;

	@FindBy(xpath = "//span[@id='select2-draganddropcutomre-container']")
	private WebElement userAttributes_Dropdown;
//
	@FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
	private WebElement userAttributes_DropdownSearch;

	public void click_CreateTemplate() {
		try {
			applyWait.waitForElementToBeClickable(create_Template, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked Create Template button in SMS section");
			test.log(Status.INFO, "User clicked Create Template button in SMS section");
			Log.info("User clicked Create Template button in SMS section");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectTemplate(String templateName) {
		try {
			select_Template = driver
					.findElement(By.xpath("//h5[contains(text(),'" + templateName + "')]//following::a[1]"));
			applyWait.waitForElementToBeClickable(select_Template, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User selected " + templateName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + templateName);
		Log.info("User selected " + templateName);
	}

	public void uploadTemplate() {
		try {
			applyWait.waitForElementToBeClickable(uploadButtonTemplate, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked upload template button");
			test.log(Status.INFO, "User clicked upload template button");
			Log.info("User clicked upload template button");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void select_CampaignName(String campaignName) {
		try {
			applyWait.waitForElementToBeClickable(campaign_Name, DefineConstants.explicitWait_30).click();
			applyWait.waitForElementToBeClickable(campaignName_Search, DefineConstants.explicitWait_30)
					.sendKeys(campaignName);
			applyWait.waitForElementToBeClickable(campaignName_Search, DefineConstants.explicitWait_30)
					.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User selected " + campaignName + " as Campaign Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + campaignName + " as Campaign Name");
		Log.info("User selected " + campaignName + " as Campaign Name");
	}

	public void select_CampaignNameUploadTemplate(String campaignName) {
		try {
			applyWait.waitForElementToBeClickable(campaignName_UploadTemplate, DefineConstants.explicitWait_30).click();
			applyWait.waitForElementToBeClickable(campaignName_Search, DefineConstants.explicitWait_30)
					.sendKeys(campaignName);
			applyWait.waitForElementToBeClickable(campaignName_Search, DefineConstants.explicitWait_30)
					.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User selected " + campaignName + " as Campaign Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + campaignName + " as Campaign Name");
		Log.info("User selected " + campaignName + " as Campaign Name");
	}

	public void enter_TemplateName(String input_TemplateName) {
		try {
			applyWait.waitForElementToBeClickable(template_Name, DefineConstants.explicitWait_30).clear();
			template_Name.sendKeys(input_TemplateName);
			Screenshots.takeScreenshot(driver, "User entered " + input_TemplateName + " as template Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_TemplateName + " as template Name");
		Log.info("User entered " + input_TemplateName + " as template Name");
	}

	public void enter_DuplicateTemplateName(String input_DuplicateTemplateName) {
		try {
			applyWait.waitForElementToBeClickable(duplicate_TemplateName, DefineConstants.explicitWait_30).clear();
			duplicate_TemplateName.sendKeys(input_DuplicateTemplateName);
			Screenshots.takeScreenshot(driver,
					"User entered " + input_DuplicateTemplateName + " as duplicate template Name");
			test.log(Status.INFO, "User entered " + input_DuplicateTemplateName + " as duplicate template Name");
			Log.info("User entered " + input_DuplicateTemplateName + " as duplicate template Name");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void enter_TemplateNameUploadTemplate(String input_TemplateName) {
		try {
			applyWait.waitForElementToBeClickable(templateName_UploadTemplate, DefineConstants.explicitWait_30).clear();
			templateName_UploadTemplate.sendKeys(input_TemplateName);
			Screenshots.takeScreenshot(driver, "User entered " + input_TemplateName + " as template Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_TemplateName + " as template Name");
		Log.info("User entered " + input_TemplateName + " as template Name");
	}

	public void enter_TemplateDescription(String input_TemplateDescription) {
		try {
			applyWait.waitForElementToBeClickable(template_Description, DefineConstants.explicitWait_30).clear();
			template_Description.sendKeys(input_TemplateDescription);
			Screenshots.takeScreenshot(driver,
					"User entered " + input_TemplateDescription + " as template description");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_TemplateDescription + " as template description");
		Log.info("User entered " + input_TemplateDescription + " as template description");
	}

	public void enter_DuplicateTemplateDescription(String input_DuplicateTemplateDescription) {
		try {
			applyWait.waitForElementToBeClickable(duplicate_TemplateDescription, DefineConstants.explicitWait_30)
					.clear();
			duplicate_TemplateDescription.sendKeys(input_DuplicateTemplateDescription);
			Screenshots.takeScreenshot(driver,
					"User entered " + input_DuplicateTemplateDescription + " as duplicate template description");
			test.log(Status.INFO,
					"User entered " + input_DuplicateTemplateDescription + " as duplicate template description");
			Log.info("User entered " + input_DuplicateTemplateDescription + " as duplicate template description");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void enter_TemplateDescriptionUploadTemplate(String input_TemplateDescription) {
		try {
			applyWait.waitForElementToBeClickable(templateDescription_UploadTemplate, DefineConstants.explicitWait_30)
					.clear();
			templateDescription_UploadTemplate.sendKeys(input_TemplateDescription);
			Screenshots.takeScreenshot(driver,
					"User entered " + input_TemplateDescription + " as template description");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_TemplateDescription + " as template description");
		Log.info("User entered " + input_TemplateDescription + " as template description");
	}

	public void click_NextButton() {
		try {
			applyWait.waitForElementToBeClickable(nextButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked next button");
			test.log(Status.INFO, "User clicked next button");
			Log.info("User clicked next button");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void click_ChooseFilesButton() {
		try {
			applyWait.waitForElementToBeClickable(chooseFilesButton, DefineConstants.explicitWait_30);
			javascriptClick.click(chooseFilesButton);
			Screenshots.takeScreenshot(driver, "User clicked choose files button");
			test.log(Status.INFO, "User clicked choose files button");
			Log.info("User clicked choose files button");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void click_UploadTempalteButton() {
		try {
			applyWait.waitForElementToBeClickable(uploadTemplateButton, DefineConstants.explicitWait_30);
			javascriptClick.click(uploadTemplateButton);
			Screenshots.takeScreenshot(driver, "User clicked upload template button");
			test.log(Status.INFO, "User clicked upload template button");
			Log.info("User clicked upload template button");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void click_DuplicateNextButton() {
		try {
			applyWait.waitForElementToBeClickable(duplicate_NextButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked duplicate next button");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked duplicate next button");
		Log.info("User clicked duplicate next button");
	}

	public void verify_SuccessMessage(String inputSuccessMessage) {
		try {
			if (successfullMessage.isDisplayed()) {
				String successMessage = successfullMessage.getText();
				if (successMessage.equals(inputSuccessMessage)) {
					System.out.println("Message is " + successMessage);
					test.log(Status.INFO, "Message is " + successMessage);
					Log.info("Message is " + successMessage);
					Screenshots.takeScreenshot(driver, inputSuccessMessage + " is verified");
					System.out.println(inputSuccessMessage + " is verified");
					test.log(Status.INFO, inputSuccessMessage + " is verified");
					Log.info(inputSuccessMessage + " is verified");
				}
			} else if (errorMessage.isDisplayed()) {
				String error_Message = errorMessage.getText();
				Screenshots.takeScreenshot(driver, error_Message + " is displayed");
				System.out.println(error_Message + " is displayed");
				test.log(Status.INFO, error_Message + "  is displayed");
				Log.info(error_Message + "  is displayed");
				Assert.assertEquals(inputSuccessMessage, error_Message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void click_SaveButton() {
		try {
			applyWait.waitForElementToBeClickable(saveButton, DefineConstants.explicitWait_30);
			javascriptClick.click(saveButton);
			Screenshots.takeScreenshot(driver, "User clicked save button after adding message and landing page url");
			test.log(Status.INFO, "User clicked save button after adding message and landing page url");
			Log.info("User clicked save button after adding message and landing page url");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void search_Template(String templateName) {
		applyWait.waitForElementToBeClickable(search_Template, DefineConstants.explicitWait_30).clear();
		search_Template.sendKeys(templateName);
		search_Template.sendKeys(Keys.ENTER);
		try {
			Screenshots.takeScreenshot(driver, "User searched " + templateName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User searched " + templateName);
		Log.info("User searched " + templateName);
	}

	public void verifyInputValue(String input_TemplateName) {

		applyWait.waitforPresenceOfElementLocated(templateTable, DefineConstants.explicitWait_60);
		tableRows = templateTable.findElements(By.tagName("tr"));
		System.out.println("value is " + input_TemplateName);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.contains(input_TemplateName)) {
					System.out.println("value is: " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, input_TemplateName + " is verified");
						test.log(Status.INFO, input_TemplateName + " is verified");
						Log.info(input_TemplateName + " is verified");
						Assert.assertTrue(true, input_TemplateName + " is verified");

					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				else if (cellText.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_TemplateName + " is not found");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						System.out.println("value is " + cellText);
						test.log(Status.INFO, input_TemplateName + " is not found");
						Log.info(input_TemplateName + " is not found");
						Assert.assertTrue(false, input_TemplateName + " is not found");
					} catch (IOException e) {
						e.printStackTrace();
					}

				}
			}
		}
	}

	public void click_DeleteButton() {
		try {
			applyWait.waitForElementToBeClickable(delete_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(delete_Button);
			Screenshots.takeScreenshot(driver, "User clicked delete button");
			test.log(Status.INFO, "User clicked delete button");
			Log.info("User clicked delete button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_DownloadButton() {
		try {
			applyWait.waitForElementToBeClickable(download_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(download_Button);
			Screenshots.takeScreenshot(driver, "User clicked download button");
			test.log(Status.INFO, "User clicked download button");
			Log.info("User clicked download button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EditButton() {
		try {
			applyWait.waitForElementToBeClickable(edit_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(edit_Button);
			Screenshots.takeScreenshot(driver, "User clicked edit button");
			test.log(Status.INFO, "User clicked edit button");
			Log.info("User clicked edit button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_DuplicateButton() {
		try {
			applyWait.waitForElementToBeClickable(duplicate_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(duplicate_Button);
			Screenshots.takeScreenshot(driver, "User clicked duplicate button");
			test.log(Status.INFO, "User clicked duplicate button");
			Log.info("User clicked duplicate button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDeletedSuccessfully(String inputmessage) {
		try {
			if (successfullMessage.isDisplayed() && successfullMessage.getText().equals(inputmessage)) {
				groupCreatedMessage = successfullMessage.getText();
				System.out.println("message is " + groupCreatedMessage);
				Screenshots.takeScreenshot(driver, groupCreatedMessage + " message is verified");
				System.out.println(groupCreatedMessage + " message is verified");
				test.log(Status.INFO, groupCreatedMessage + " message is verified");
				Log.info(groupCreatedMessage + " message is verified");
				Assert.assertEquals(groupCreatedMessage, inputmessage);
			} else {
				Screenshots.takeScreenshot(driver, inputmessage + " message is not displayed");
				System.out.println(inputmessage + " message is not displayed");
				test.log(Status.INFO, inputmessage + " message is not displayed");
				Log.info(inputmessage + " message is not displayed");
				Assert.assertEquals(groupCreatedMessage, inputmessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_TemplateMessage(String input_TemplateMessage) {
		try {
			applyWait.waitForElementToBeClickable(addMessage_SMSTemplate, DefineConstants.explicitWait_30).click();
			addMessage_SMSTemplate.clear();
			addMessage_SMSTemplate.sendKeys(input_TemplateMessage);
			Screenshots.takeScreenshot(driver, "User entered " + input_TemplateMessage + " as Message");
			test.log(Status.INFO, "User entered " + input_TemplateMessage + " as Message");
			Log.info("User entered " + input_TemplateMessage + " as Message");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_UserAttributes() {
		try {
			applyWait.waitForElementToBeClickable(userAttributes, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked User Attributes button");
			test.log(Status.INFO, "User clicked User Attributes button");
			Log.info("User clicked User Attributes button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_UserAttributes(String input_UserAttributes) {
		try {
			applyWait.waitForElementToBeClickable(userAttributes, DefineConstants.explicitWait_30).click();
			userAttributes.click();
			Thread.sleep(3000);
			applyWait.waitForElementToBeClickable(userAttributes_Dropdown, DefineConstants.explicitWait_30).click();
			Thread.sleep(3000);
			userAttributes_DropdownSearch.sendKeys(input_UserAttributes);
			Thread.sleep(3000);
			userAttributes_DropdownSearch.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User selected " + input_UserAttributes + " as User Attributes");
			test.log(Status.INFO, "User selected " + input_UserAttributes + " as User Attributes");
			Log.info("User selected " + input_UserAttributes + " as User Attributes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_AddLandingPage() {
		try {
			applyWait.waitForElementToBeClickable(addLandingPage_Button, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked add landing page button in create SMS template");
			test.log(Status.INFO, "User clicked add landing page button in create SMS template");
			Log.info("User clicked add landing page button in create SMS template");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_PageUrl(String input_PageUrl) {
		try {
			applyWait.waitForElementToBeClickable(pageUrl, DefineConstants.explicitWait_30).clear();
			pageUrl.sendKeys(input_PageUrl);
			Screenshots.takeScreenshot(driver,
					"User entered " + input_PageUrl + " as page url in Creatae SMS Template Page");
			test.log(Status.INFO, "User entered " + input_PageUrl + " as page url in Creatae SMS Template Page");
			Log.info("User entered " + input_PageUrl + " as page url in Creatae SMS Template Page");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_AddButton_PageUrl() {
		try {
			applyWait.waitForElementToBeClickable(pageurl_AddButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked add button after adding page url");
			test.log(Status.INFO, "User clicked add button after adding page url");
			Log.info("User clicked add button after adding page url");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectTemplateToEdit(String templateName) {
		try {
			templateToEdit = driver
					.findElement(By.xpath("//span[contains(text(),'" + templateName + "')]//following::i[1]"));
			applyWait.waitForElementToBeClickable(templateToEdit, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User selected " + templateName + " template to edit");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + templateName + " template to edit");
		Log.info("User selected " + templateName + " template to edit");
	}

	public void click_Delete_PopUp() {
		try {
			applyWait.waitForElementToBeClickable(delete_ButtonPopUp, DefineConstants.explicitWait_30);
			javascriptClick.click(delete_ButtonPopUp);
			Screenshots.takeScreenshot(driver, "User clicked delete button on delete this draft popup");
			test.log(Status.INFO, "User clicked delete button on delete this draft popup");
			Log.info("User clicked delete button on delete this draft popup");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}