package com.plumb5.pageobjects;

import java.io.IOException;

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

public class ContactsImport {

	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private DropDown dropDown;
	private JavascriptClick javascript;
	private Screenshots screenshots;

	public ContactsImport(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		this.dropDown = new DropDown(driver);
		javascript = new JavascriptClick(driver);
		screenshots = new Screenshots(driver);

	}

	@FindBy(xpath = "//span[contains(text(),'Download Sample file')]")
	private WebElement downloadSampleFile;

	@FindBy(xpath = "//select[@id='ui_ddl_SampleExportFileType']")
	private WebElement fileFormat;

	@FindBy(xpath = "//button[@id='ui_btnSampleDataExport']")
	private WebElement downloadButtonPopUp;

	@FindBy(xpath = "//span[contains(text(),'Download Sample file')]//following::button[1]")
	private WebElement startAnImportButton;

	@FindBy(xpath = "//span[@id='select2-ui_ddlContactImportGroup-container']")
	private WebElement groupName;
	
	@FindBy(xpath = "//span[@id='select2-ui_ddlContactImportGroup-container']//following::input[14]")
	private WebElement groupNameDropdown;
	
	@FindBy(xpath = "//input[@id='ui_btnFileImportChoose']")
	private WebElement chooseFile_Button;
	
	@FindBy(xpath = "//label[contains(text(),'Remove contacts from the selected Group')]//preceding::label[1]")
	private WebElement doNotAddContactToThisGroup_Button;
	
	@FindBy(xpath = "//label[contains(text(),'Remove contacts from the selected Group')]")
	private WebElement removeContacts_Button;
	
	@FindBy(partialLinkText = "Next")
	private WebElement next_Button;
	
	@FindBy(linkText = "Finish Import")
	private WebElement finishImport_Button;
	
	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	
	public void click_DownloadSampleFile() {
		try {
			applyWait.waitForElementToBeClickable(downloadSampleFile, DefineConstants.explicitWait_30);
			javascript.click(downloadSampleFile);
			Screenshots.takeScreenshot(driver, "User clicked download sample file");
			test.log(Status.INFO, "User clicked download sample file");
			Log.info("User clicked download sample file");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectFileFormat(String select_FileFormat) {

		try {
			applyWait.waitForElementToBeClickable(fileFormat, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(fileFormat, select_FileFormat);
			Screenshots.takeScreenshot(driver, select_FileFormat + " is selected");

		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, select_FileFormat + " is selected");
		Log.info(select_FileFormat + " is selected");
	}

	public void clickExportPopUpDownloadButton() {

		applyWait.waitForElementToBeClickable(downloadButtonPopUp, DefineConstants.explicitWait_30);
		javascript.click(downloadButtonPopUp);
		try {
			Screenshots.takeScreenshot(driver, "Download button for sample file in pop up is clicked");

		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Download button for sample file in pop up is clicked");
		Log.info("Download button for sample file in pop up is clicked");
	}

	public void click_StartAnImport() {
		try {
			applyWait.waitForElementToBeClickable(startAnImportButton, DefineConstants.explicitWait_30).click();
//			javascript.click(startAnImportButton);
			Screenshots.takeScreenshot(driver, "User clicked Start An Import Button");
			test.log(Status.INFO, "User clicked Start An Import Button");
			Log.info("User clicked Start An Import Button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_CampaignName(String input_GroupName) {
		try {
			applyWait.waitForElementToBeClickable(groupName, DefineConstants.explicitWait_30).click();
			groupNameDropdown.sendKeys(input_GroupName);
			groupNameDropdown.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, input_GroupName + " is selected");
			test.log(Status.INFO, input_GroupName + " is selected");
			Log.info(input_GroupName + " is selected");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void click_ChooseFileButton() {
		try {
			applyWait.waitForElementToBeClickable(chooseFile_Button, DefineConstants.explicitWait_30);
			javascript.click(chooseFile_Button);
			Screenshots.takeScreenshot(driver, "User clicked choose file button");
			test.log(Status.INFO, "User clicked choose file button");
			Log.info("User clicked choose file button");
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
	
	public void select_DoNotAddContactToThisGroup() {
		try {
			applyWait.waitForElementToBeClickable(doNotAddContactToThisGroup_Button, DefineConstants.explicitWait_30).click();
//			javascript.click(doNotAddContactToThisGroup_Button);
			Screenshots.takeScreenshot(driver, "User selected Do not add existing contacts to this group");
			test.log(Status.INFO, "User selected Do not add existing contacts to this group");
			Log.info("User selected Do not add existing contacts to this group");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_RemoveContacts_Button() {
		try {
			applyWait.waitForElementToBeClickable(removeContacts_Button, DefineConstants.explicitWait_30).click();
//			javascript.click(removeContacts_Button);
			Screenshots.takeScreenshot(driver, "User selected Remove contacts from the selected Group");
			test.log(Status.INFO, "User selected Remove contacts from the selected Group");
			Log.info("User selected Remove contacts from the selected Group");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_NextButton() {
		try {
			applyWait.waitForElementToBeClickable(next_Button, DefineConstants.explicitWait_30);
			javascript.click(next_Button);
			Screenshots.takeScreenshot(driver, "User clicked next button");
			test.log(Status.INFO, "User clicked next button");
			Log.info("User clicked next button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_FinishImportButton() {
		try {
			applyWait.waitForElementToBeClickable(finishImport_Button, DefineConstants.explicitWait_30);
			javascript.click(finishImport_Button);
			Screenshots.takeScreenshot(driver, "User clicked Finish Import button");
			test.log(Status.INFO, "User clicked Finish Import button");
			Log.info("User clicked Finish Import button");
		} catch (Exception e) {
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
}
