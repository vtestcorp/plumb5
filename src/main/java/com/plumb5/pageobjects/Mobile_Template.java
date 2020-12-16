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

public class Mobile_Template {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;

	public Mobile_Template(WebDriver driver, ExtentTest test) {
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

	@FindBy(xpath = "//label[contains(text(),'Campaign Name')]//following::span[1]")
	private WebElement campaign_Name;

	@FindBy(xpath = "//label[contains(text(),'Campaign Name')]//following::input[2]")
	private WebElement campaignName_Search;

	@FindBy(xpath = "//label[contains(text(),'Template Name')]//following::input[1]")
	private WebElement template_Name;
	
	@FindBy(xpath = "//input[@id='ui_txtTemplateName']")
	private WebElement duplicate_TemplateName;

	@FindBy(xpath = "//label[contains(text(),'Template Description')]//following::textarea[1]")
	private WebElement template_Description;
	
	@FindBy(xpath = "//textarea[@id='ui_txtareaTemplateDesc']")
	private WebElement duplicate_TemplateDescription;

	@FindBy(xpath = "//a[contains(text(),'Next')]")
	private WebElement nextButton;

	@FindBy(xpath = "//button[@id='ui_btnTemplateNext']")
	private WebElement duplicate_NextButton;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successfullMessage;

	// @FindBy(id = "ui_div_MasterSuccess")
	// private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(xpath = "//button[@id='ui_btnCreateTemplate']")
	private WebElement saveButton;

	@FindBy(xpath = "//input[@id='ui_txtSearchTemplate']")
	private WebElement search_Template;

	@FindBy(xpath = "//table[@id='ui_tblReportData']")
	private WebElement templateTable;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	private WebElement templateToEdit;

	@FindBy(linkText = "Duplicate")
	private WebElement duplicate_Button;

	@FindBy(linkText = "Delete")
	private WebElement delete_Button;

	@FindBy(linkText = "Edit")
	private WebElement edit_Button;

	@FindBy(id = "close-popup")
	private WebElement closePopUp;

	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement delete_ButtonPopUp;

	@FindBy(xpath = "//label[contains(text(),'Title')]//following::input[1]")
	private WebElement title;
	
	@FindBy(xpath = "//label[contains(text(),'Message')]//following::textarea[1]")
	private WebElement message;
	
	@FindBy(xpath = "//label[contains(text(),'Sub Text')]//following::input[1]")
	private WebElement subText;
	
	@FindBy(xpath = "//label[contains(text(),'Default Click Action')]//following::select[1]")
	private WebElement defaultClickAction;
	
	@FindBy(xpath = "//label[contains(text(),'Enter Deep linking URL')]//following::input[1]")
	private WebElement deepLinkingUrl;
	
	@FindBy(xpath = "//label[contains(text(),'Default Click Action')]//following::select[2]")
	private WebElement specificScreenAndroidApp;
	
	@FindBy(xpath = "//label[contains(text(),'Default Click Action')]//following::select[3]")
	private WebElement specificScreenIOSApp;
	
	@FindBy(xpath = "//div[contains(text(),'OFF')]")
	private WebElement buttons;
	
	@FindBy(xpath = "//input[@id='ui_txtButton1']")
	private WebElement buttonsName;
	
	@FindBy(xpath = "//select[@id='mobdefclickactbtn1']")
	private WebElement buttonsDeafultClickAction;
	
	@FindBy(xpath = "//input[@id='ui_txtDeepLinkingButton1']")
	private WebElement buttonsDeepLinkingUrl;
	
	public void click_CreateTemplate() {
		try {
			applyWait.waitForElementToBeClickable(create_Template, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked create template");
			test.log(Status.INFO, "User clicked create template");
			Log.info("User clicked create template");
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

	public void select_CampaignName(String campaignName) {
		try {
			applyWait.waitForElementToBeClickable(campaign_Name, DefineConstants.explicitWait_30).click();
			applyWait.waitForElementToBeClickable(campaignName_Search, DefineConstants.explicitWait_30).sendKeys(campaignName);
			applyWait.waitForElementToBeClickable(campaignName_Search, DefineConstants.explicitWait_30).sendKeys(Keys.ENTER);
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
			Screenshots.takeScreenshot(driver, "User entered " + input_DuplicateTemplateName + " as duplicate template Name");
			test.log(Status.INFO, "User entered " + input_DuplicateTemplateName + " as duplicate template Name");
			Log.info("User entered " + input_DuplicateTemplateName + " as duplicate template Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
	
	
	public void enter_TemplateTitle(String input_TemplateTitle) {
		try {
			applyWait.waitForElementToBeClickable(title, DefineConstants.explicitWait_30).clear();
			title.sendKeys(input_TemplateTitle);
			Screenshots.takeScreenshot(driver,"User entered " + input_TemplateTitle + " as template Title");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_TemplateTitle + " as template Title");
		Log.info("User entered " + input_TemplateTitle + " as template Title");
	}
	
	
	public void enter_TemplateMessage(String input_TemplateMessage) {
		try {
			applyWait.waitForElementToBeClickable(message, DefineConstants.explicitWait_30).clear();
			message.sendKeys(input_TemplateMessage);
			Screenshots.takeScreenshot(driver,"User entered " + input_TemplateMessage + " as template Message");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_TemplateMessage + " as template Message");
		Log.info("User entered " + input_TemplateMessage + " as template Message");
	}
	
	public void enter_TemplateSubText(String input_TemplateSubText) {
		try {
			applyWait.waitForElementToBeClickable(subText, DefineConstants.explicitWait_30).clear();
			subText.sendKeys(input_TemplateSubText);
			Screenshots.takeScreenshot(driver,"User entered " + input_TemplateSubText + " as template Sub Text");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_TemplateSubText + " as template Sub Text");
		Log.info("User entered " + input_TemplateSubText + " as template Sub Text");
	}
	
	public void select_DefaultAction(String input_DefaultAction) {
		try {
			applyWait.waitForElementToBeClickable(defaultClickAction, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(defaultClickAction, input_DefaultAction);
			Screenshots.takeScreenshot(driver,"User selected " + input_DefaultAction + " as Default Action");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + input_DefaultAction + " as Default Action");
		Log.info("User selected " + input_DefaultAction + " as Default Action");
	}
	
	public void enter_DeepURL(String input_DeepURL) {
		try {
			applyWait.waitForElementToBeClickable(deepLinkingUrl, DefineConstants.explicitWait_30).clear();
			deepLinkingUrl.sendKeys(input_DeepURL);
			Screenshots.takeScreenshot(driver,"User entered " + input_DeepURL + " as Deep Linking Url");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_DeepURL + " as Deep Linking Url");
		Log.info("User entered " + input_DeepURL + " as Deep Linking Url");
	}
	

	public void enter_DuplicateTemplateDescription(String input_DuplicateTemplateDescription) {
		try {
			applyWait.waitForElementToBeClickable(duplicate_TemplateDescription, DefineConstants.explicitWait_30).clear();
			duplicate_TemplateDescription.sendKeys(input_DuplicateTemplateDescription);
			Screenshots.takeScreenshot(driver,"User entered " + input_DuplicateTemplateDescription + " as duplicate template description");
			test.log(Status.INFO, "User entered " + input_DuplicateTemplateDescription + " as duplicate template description");
			Log.info("User entered " + input_DuplicateTemplateDescription + " as duplicate template description");
		} catch (Exception e) {
			e.printStackTrace();
		}

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
//			driver.switchTo().frame(0);
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

	public void verifyInputValue(String templateName) {
		applyWait.waitForElementToBeClickable(templateTable, DefineConstants.explicitWait_60);
		tableRows = templateTable.findElements(By.tagName("tr"));
		System.out.println("value is " + templateName);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.equals(templateName)) {
					System.out.println("value is: " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, templateName + " is verified");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, templateName + " is verified");
					Log.info(templateName + " is verified");
					Assert.assertTrue(true, templateName + " is verified");
				}

				else if (cellText.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, templateName + " is not found");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						System.out.println("value is " + cellText);
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, templateName + " is not found");
					Log.info(templateName + " is not found");
					Assert.assertTrue(false, templateName + " is not found");
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
	
	public void click_Buttons() {
		try {
			applyWait.waitForElementToBeClickable(buttons, DefineConstants.explicitWait_30);
			javascriptClick.click(buttons);
			Screenshots.takeScreenshot(driver, "User clicked Buttons");
			test.log(Status.INFO, "User clicked Buttons");
			Log.info("User clicked Buttons");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void enter_ButtonsName(String input_ButtonName) {
		try {
			applyWait.waitForElementToBeClickable(buttonsName, DefineConstants.explicitWait_30).clear();
			buttonsName.sendKeys(input_ButtonName);
			Screenshots.takeScreenshot(driver, "User entered "+input_ButtonName+ " as Button Name");
			test.log(Status.INFO, "User entered "+input_ButtonName+ " as Button Name");
			Log.info("User entered "+input_ButtonName+ " as Button Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void select_ButtonsDefaultAction(String input_ButtonsDefaultAction) {
		try {
			applyWait.waitForElementToBeClickable(buttonsDeafultClickAction, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(buttonsDeafultClickAction, input_ButtonsDefaultAction);
			Screenshots.takeScreenshot(driver,"User selected " + input_ButtonsDefaultAction + " as Buttons Default Action");
			test.log(Status.INFO, "User selected " + input_ButtonsDefaultAction + " as Buttons Default Action");
			Log.info("User selected " + input_ButtonsDefaultAction + " as Buttons Default Action");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void enter_ButtonsDeepURL(String input_ButtonsDeepURL) {
		try {
			applyWait.waitForElementToBeClickable(buttonsDeepLinkingUrl, DefineConstants.explicitWait_30).clear();
			buttonsDeepLinkingUrl.sendKeys(input_ButtonsDeepURL);
			Screenshots.takeScreenshot(driver, "User entered " + input_ButtonsDeepURL + " as Buttons Deep Linking Url");
			test.log(Status.INFO, "User entered " + input_ButtonsDeepURL + " as Buttons Deep Linking Url");
			Log.info("User entered " + input_ButtonsDeepURL + " as Buttons Deep Linking Url");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}