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
import helperMethods.Keyboard;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class Template {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;

	public Template(WebDriver driver, ExtentTest test) {
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

	@FindBy(xpath = "//div[@id='ui_divDesignTemplate']//label[@class='frmlbltxt'][contains(text(),'Campaign Name')]//following::span[1]")
	private WebElement campaign_Name;

	@FindBy(xpath = "//span[@id='select2-ui_ddlUploadTemplateCampaign-container']")
	private WebElement campaignName_UploadTemplate;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement campaignName_Search;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement campaignName_SearchUploadTemplate;

	@FindBy(xpath = "//span[@id='select2-ui_ddlUploadTemplateCampaign-container']//following::input[1]")
	private WebElement campaignName_SearchUploadButton;

	@FindBy(xpath = "//div[@id='ui_divDesignTemplate']//label[@class='frmlbltxt'][contains(text(),'Template Name')]//following::input[1]")
	private WebElement template_Name;

	@FindBy(xpath = "//input[@id='ui_txtUploadTemplateName']")
	private WebElement templateName_UploadTemplate;

	@FindBy(xpath = "//div[@id='ui_divDesignTemplate']//label[@class='frmlbltxt'][contains(text(),'Template Description')]//following::textarea[1]")
	private WebElement template_Description;

	@FindBy(xpath = "//textarea[@id='ui_txtareaUploadTemplateDesc']")
	private WebElement templateDescription_UploadTemplate;

	@FindBy(xpath = "//button[@id='ui_btnDesignTemplateNext']")
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

	@FindBy(xpath = "//button[@class='BeeButton_beeButton__23sT2 index_c-button__1ZO9z btn-primary Header_saveButton__18AJr BeeButton_buttonPrimary__10G6o index_c-button--primary__42PMR index_c-button--blue_200__nojGj btn-primary']")
	private WebElement saveButton;

	@FindBy(xpath = "//input[@id='ui_txt_TemplateSearch']")
	private WebElement search_Template;

	@FindBy(xpath = "//table[@id='ui_tableReport']")
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

	@FindBy(xpath = "//button[@id='ui_btnDeleteConfirm']")
	private WebElement delete_ButtonPopUp;

	private String groupCreatedMessage;

	@FindBy(xpath = "//button[@id='ui_btnUploadTemplate']")
	private WebElement uploadButtonTemplate;

	public void click_CreateTemplate() {
		try {
			applyWait.waitForElementToBeClickable(create_Template, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked create template");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked create template");
		Log.info("User clicked create template");
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked next button");
		Log.info("User clicked next button");
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
			driver.switchTo().frame(0);
			applyWait.waitForElementToBeClickable(saveButton, DefineConstants.explicitWait_30);
			javascriptClick.click(saveButton);
			Screenshots.takeScreenshot(driver, "User clicked save button");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked save button");
		Log.info("User clicked save button");
	}

	public void search_Template(String templateName) {
		applyWait.waitForElementToBeClickable(search_Template, DefineConstants.explicitWait_30).sendKeys(templateName);
		search_Template.sendKeys(Keys.ENTER);
		try {
			Screenshots.takeScreenshot(driver, "User searched " + templateName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User searched " + templateName);
		Log.info("User searched " + templateName);
	}

	public void verifyInputValue(String draftName) {
		applyWait.waitForElementToBeClickable(templateTable, DefineConstants.explicitWait_60);
		tableRows = templateTable.findElements(By.tagName("tr"));
		System.out.println("value is " + draftName);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.contains(draftName)) {
					System.out.println("value is: " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, draftName + " is verified");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, draftName + " is verified");
					Log.info(draftName + " is verified");
					Assert.assertTrue(true, draftName + " is verified");
				}

				else if (cellText.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, draftName + " is not found");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						System.out.println("value is " + cellText);
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, draftName + " is not found");
					Log.info(draftName + " is not found");
					Assert.assertTrue(false, draftName + " is not found");
				}
			}
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

	public void click_Duplicate() {
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

	public void click_SpamScoreButton() {
		try {
			applyWait.waitForElementToBeClickable(spamScore_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(spamScore_Button);
			Screenshots.takeScreenshot(driver, "User clicked spam score button");
			test.log(Status.INFO, "User clicked spam score button");
			Log.info("User clicked spam score button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectType(String inputType) {
		try {
			spamScorePopUp_Type_Field = driver.findElement(By.xpath("//label[contains(text(),'" + inputType + "')]"));
			applyWait.waitForElementToBeClickable(spamScorePopUp_Type_Field, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User selected " + inputType + " as type");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + inputType + " as type");
		Log.info("User selected " + inputType + " as type");
	}

	public void select_FromEmailID(String emailId) {
		applyWait.waitForElementToBeClickable(spamScorePopUp_fromEmailId, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(spamScorePopUp_fromEmailId, emailId);
		try {
			Screenshots.takeScreenshot(driver, "User selected " + emailId + " as from Email ID");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + emailId + " as from Email ID");
		Log.info("User selected " + emailId + " as from Email ID");
	}

	public void enter_FromName(String name) {
		applyWait.waitForElementToBeClickable(spamScorePopUp_fromName, DefineConstants.explicitWait_30).sendKeys(name);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + name + " as from name");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + name + " as from name");
		Log.info("User entered " + name + " as from name");
	}

	public void enter_Subject(String subject) {
		applyWait.waitForElementToBeClickable(spamScorePopUp_Subject, DefineConstants.explicitWait_30)
				.sendKeys(subject);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + subject + " as subject");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + subject + " as subject");
		Log.info("User entered " + subject + " as subject");
	}

	public void click_VerifyButton() {
		try {
			applyWait.waitForElementToBeClickable(verifyButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked verify button");
			test.log(Status.INFO, "User clicked verify button");
			Log.info("User clicked verify button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_SpamScoreTitle(String spamTitle) {
		try {
			Thread.sleep(6000L);
			applyWait.waitForElementToBeClickable(spamScorePopUp_SpamTitle, DefineConstants.explicitWait_60);
			String title = spamScorePopUp_SpamTitle.getText();
			System.out.println("Title is " + title);
			Screenshots.takeScreenshot(driver, "Title is " + title);
			test.log(Status.INFO, "Title is " + title);
			Log.info("Title is " + title);

			if (title.equals(spamTitle)) {
				System.out.println("Title " + spamTitle + " is verified");
				Screenshots.takeScreenshot(driver, "Title " + spamTitle + " is verified");
				test.log(Status.INFO, "Title " + spamTitle + " is verified");
				Log.info("Title " + spamTitle + " is verified");
				Assert.assertEquals(title, spamTitle);
			} else {
				System.out.println("Title " + spamTitle + " is not verified");
				Screenshots.takeScreenshot(driver, "Title " + spamTitle + " is not verified");
				test.log(Status.INFO, "Title " + spamTitle + " is not verified");
				Log.info("Title " + spamTitle + " is not verified");
				Assert.assertEquals(title, spamTitle);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_ClosePopUp() {
		try {
			applyWait.waitForElementToBeClickable(closePopUp, DefineConstants.explicitWait_30);
			javascriptClick.click(closePopUp);
			Screenshots.takeScreenshot(driver, "User clicked close PopUp");
			test.log(Status.INFO, "User clicked close PopUp");
			Log.info("User clicked close PopUp");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
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

	public void select_FileType(String inputFileType) {
		try {
			WebElement fileType = driver.findElement(By.xpath("//label[contains(text(),'" + inputFileType + "')]"));
			applyWait.waitForElementToBeClickable(fileType, DefineConstants.explicitWait_30).click();
			// javascriptClick.click(fileType);
			Screenshots.takeScreenshot(driver, "User selected " + inputFileType + " to upload");
			test.log(Status.INFO, "User selected " + inputFileType + " to upload");
			Log.info("User selected " + inputFileType + " to upload");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void uploadFile(String filePath) {
		try {
			Keyboard.uploadFileWithRobot(DefineConstants.PROJECT_PATH + "\\" + filePath);
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_SaveButtonUploadTemplate() {
		try {
			applyWait.waitForElementToBeClickable(saveButtonUploadTemplate, DefineConstants.explicitWait_30);
			javascriptClick.click(saveButtonUploadTemplate);
			Screenshots.takeScreenshot(driver, "User clicked save button upload template");
			test.log(Status.INFO, "User clicked save button upload template");
			Log.info("User clicked save button upload template");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}