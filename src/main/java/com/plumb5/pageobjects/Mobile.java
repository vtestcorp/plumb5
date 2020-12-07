package com.plumb5.pageobjects;

import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
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

public class Mobile {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;
	String values[];

	public Mobile(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropDown = new DropDown(driver);
	}

	@FindBy(xpath = "//button[@id='selectdateDropdown']")
	private WebElement showingDataFor;

	@FindBy(xpath = "//input[@id='ui_txtStartDate']")
	private WebElement showingDataFor_StartDate;

	@FindBy(xpath = "//input[@id='ui_txtEndDate']")
	private WebElement showingDataFor_EndDate;

	@FindBy(xpath = "//button[@id='ui_btnCustomDateApply']")
	private WebElement showingDataFor_GoButton;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successfullMessage;

	// @FindBy(id = "ui_div_MasterSuccess")
	// private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(xpath = "//label[contains(text(),'Campaign Name')]//following::span[1]")
	private WebElement campaignName;

	@FindBy(xpath = "//table[@id='ui_tblReportData']")
	private WebElement webTable;

	@FindBy(linkText = "Edit")
	private WebElement edit_Button;

	@FindBy(linkText = "Duplicate")
	private WebElement duplicate_Button;

	@FindBy(linkText = "Delete")
	private WebElement delete_Button;

	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement delete_ButtonPopUp;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	@FindBy(xpath = "//a[contains(text(),'Push')]")
	private WebElement PushNotifications;

	@FindBy(linkText = "Manage Campaigns")
	private WebElement manageCampaigns;

	@FindBy(partialLinkText = "Create")
	private WebElement createScheduledCampaign;

	@FindBy(xpath = "//label[contains(text(),'Campaign Identifier')]//following::input[1]")
	private WebElement campaignIdentifier;

	@FindBy(xpath = "//label[contains(text(),'Campaign Name')]//following::input[7]")
	private WebElement campaignNameDropdownSearch;

	@FindBy(xpath = "//label[contains(text(),'Template Name')]//following::span[1]")
	private WebElement templateName;
	
	@FindBy(xpath = "//label[contains(text(),'Template Name')]//following::input[7]")
	private WebElement templateDropdownSearch;

	@FindBy(xpath = "//label[contains(text(),'Send To')]//following::input[1]")
	private WebElement sendTo;
	
	@FindBy(xpath = "//input[@id='ui_txtSingleSchedule']")
	private WebElement deliveryDate;
	
	private WebElement date,testCampaign;
	
	@FindBy(partialLinkText = "Next")
	private WebElement nextButton;
	
	@FindBy(xpath = "//label[contains(text(),'Hours')]//following::select[1]")
	private WebElement scheduleTimeHours;
	
	@FindBy(xpath = "//label[contains(text(),'Hours')]//following::select[1]//following::select[1]")
	private WebElement scheduleTimeMinutes;
	
	@FindBy(xpath = "//label[contains(text(),'AM/PM')]//following::select[1]")
	private WebElement AM_PM;
	
	@FindBy(xpath = "//input[@id='ui_txtCampaignTestNumber']")
	private WebElement phoneNumber;

	@FindBy(xpath = "//span[@id='select2-ui_ddlCampaignTestGroup-container']")
	private WebElement testCampaignGroupDropdown;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	private WebElement testCampaignGroupDropdownSearchBar;

	@FindBy(xpath = "//a[contains(text(),'Save')]")
	private WebElement saveButton;
	
	public void click_PushNotifications() {
		try {
			applyWait.waitForElementToBeClickable(PushNotifications, DefineConstants.explicitWait_30);
			javascriptClick.click(PushNotifications);
			Screenshots.takeScreenshot(driver, "User clicked Push Notifications");
			test.log(Status.INFO, "User clicked Push Notifications");
			Log.info("User clicked Push Notifications");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_CreateScheduledCampaign() {
		try {
			applyWait.waitForElementToBeClickable(createScheduledCampaign, DefineConstants.explicitWait_30);
			javascriptClick.click(createScheduledCampaign);
			Screenshots.takeScreenshot(driver, "User clicked Create Scheduled Campaign");
			test.log(Status.INFO, "User clicked Create Scheduled Campaign");
			Log.info("User clicked Create Scheduled Campaign");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_ManageCampaigns() {
		try {
			applyWait.waitForElementToBeClickable(manageCampaigns, DefineConstants.explicitWait_30);
			javascriptClick.click(manageCampaigns);
			Screenshots.takeScreenshot(driver, "User clicked Manage Campaigns");
			test.log(Status.INFO, "User clicked Manage Campaigns");
			Log.info("User clicked Manage Campaigns");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_SuccessMessage(String inputSuccessMessage) {
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

	public void enter_CampaignName(String inputCampaignName) {
		try {
			applyWait.waitForElementToBeClickable(campaignName, DefineConstants.explicitWait_30).clear();
			campaignName.sendKeys(inputCampaignName);
			Screenshots.takeScreenshot(driver, "User entered " + inputCampaignName + " as campaign name");
			test.log(Status.INFO, "User entered " + inputCampaignName + " as campaign name");
			Log.info("User entered " + inputCampaignName + " as campaign name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyInputValue(String inputEmailAddress) {
		try {
			applyWait.waitForElementToBeClickable(webTable, DefineConstants.explicitWait_60);
			tableRows = webTable.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();
					if (cellText.equals(inputEmailAddress)) {
						System.out.println("value is " + cellText);
						javascriptClick.highLighterMethod(tableColums.get(column));
						Assert.assertTrue(true, inputEmailAddress + " is verified");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						Screenshots.takeScreenshot(driver, inputEmailAddress + " is verified");
						test.log(Status.INFO, inputEmailAddress + " is verified");
						Log.info(inputEmailAddress + " is verified");
					} else if (cellText.equals("There is no data for this view")) {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, inputEmailAddress + " is not found");
						test.log(Status.INFO, inputEmailAddress + " is not found");
						Log.info(inputEmailAddress + " is not found");
						Assert.assertTrue(false, inputEmailAddress + " is not found");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_DuplicateName(String input_DuplicateName) {
		try {
			applyWait.waitForElementToBeClickable(webTable, DefineConstants.explicitWait_60);
			tableRows = webTable.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();
					if (cellText.contains(input_DuplicateName)) {
						System.out.println("value is " + cellText);
						javascriptClick.highLighterMethod(tableColums.get(column));
						Assert.assertTrue(true, cellText + " is verified as duplicate name");
						test.log(Status.INFO, cellText + " is verified as duplicate name");
						Log.info(cellText + " is verified as duplicate name");
						Screenshots.takeScreenshot(driver, cellText + " is verified as duplicate name");
						test.log(Status.INFO, cellText + " is verified as duplicate name");
						Log.info(cellText + " is verified as duplicate name");
					} else if (cellText.equals("There is no data for this view")) {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_DuplicateName + " is not found");
						test.log(Status.INFO, input_DuplicateName + " is not found");
						Log.info(input_DuplicateName + " is not found");
						Assert.assertTrue(false, input_DuplicateName + " is not found");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EditButton() {
		try {
			applyWait.waitForElementToBeClickable(edit_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(edit_Button);
			Screenshots.takeScreenshot(driver, "User clicked edit button for selected campaign");
			test.log(Status.INFO, "User clicked edit button for selected campaign");
			Log.info("User clicked edit button for selected campaign");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_DuplicateButton() {
		try {
			applyWait.waitForElementToBeClickable(duplicate_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(duplicate_Button);
			Screenshots.takeScreenshot(driver, "User clicked duplicate button for selected campaign");
			test.log(Status.INFO, "User clicked duplicate button for selected campaign");
			Log.info("User clicked duplicate button for selected campaign");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_DeleteButton() {
		try {
			applyWait.waitForElementToBeClickable(delete_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(delete_Button);
			Screenshots.takeScreenshot(driver, "User clicked delete button for selected campaign");
			test.log(Status.INFO, "User clicked delete button for selected campaign");
			Log.info("User clicked delete button for selected campaign");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_DeleteButtonPopUp() {
		try {
			applyWait.waitForElementToBeClickable(delete_ButtonPopUp, DefineConstants.explicitWait_30);
			javascriptClick.click(delete_ButtonPopUp);
			Screenshots.takeScreenshot(driver,
					"User clicked delete button for selected campaign on Delete This Draft pop up");
			test.log(Status.INFO, "User clicked delete button for selected campaign on Delete This Draft pop up");
			Log.info("User clicked delete button for selected campaign on Delete This Draft pop up");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_CampaignIdentifier(String input_CampaignIdentifier) {
		try {
			applyWait.waitForElementToBeClickable(campaignIdentifier, DefineConstants.explicitWait_30).click();
			campaignIdentifier.clear();
			campaignIdentifier.sendKeys(input_CampaignIdentifier);
			Screenshots.takeScreenshot(driver, "User entered campaign identifier as" + input_CampaignIdentifier);
			test.log(Status.INFO, "User entered campaign identifier as" + input_CampaignIdentifier);
			Log.info("User entered campaign identifier as" + input_CampaignIdentifier);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void select_CampaignName(String input_CampaignName) {
		try {
			applyWait.waitForElementToBeClickable(campaignName, DefineConstants.explicitWait_30).click();
			applyWait.waitForElementToBeClickable(campaignNameDropdownSearch, DefineConstants.explicitWait_30).sendKeys(input_CampaignName);
			// javascriptClick.sendKeys(campaignNameDropdownSearch,input_CampaignName);
			Thread.sleep(3000l);
			campaignNameDropdownSearch.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, input_CampaignName + " is selected as campaign name");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_CampaignName + " is selected");
		Log.info(input_CampaignName + " is selected");
	}

	public void select_TemplateName(String input_TemplateName) {
		try {
			applyWait.waitForElementToBeClickable(templateName, DefineConstants.explicitWait_30).click();
			applyWait.waitForElementToBeClickable(templateDropdownSearch, DefineConstants.explicitWait_30).sendKeys(input_TemplateName);
			templateDropdownSearch.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, input_TemplateName + " is selected as template name");
			test.log(Status.INFO, input_TemplateName + " is selected as template name");
			Log.info(input_TemplateName + " is selected as template name");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void enter_SendTo(JSONArray input_SendTo) {
		try {
			JSONArray values = input_SendTo;

			for (Object value : values) {
				applyWait.waitForElementToBeClickable(sendTo, DefineConstants.explicitWait_30).sendKeys(value.toString());
				sendTo.sendKeys(Keys.ENTER);
				Screenshots.takeScreenshot(driver, value + " is selected as Send To");
				test.log(Status.INFO, input_SendTo + " is selected as Send To");
				Log.info(input_SendTo + " is selected as Send To");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_NextButton() {
		try {
			applyWait.waitForElementToBeClickable(nextButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "Next button is clicked");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Next button is clicked");
		Log.info("Next button is clicked");
	}
	
	public void select_DeliveryDate(String input_ScheduledDate) {
		try {
			applyWait.waitForElementToBeClickable(deliveryDate, DefineConstants.explicitWait_30).click();
			date = driver.findElement(By.xpath("//a[contains(text(),'"+input_ScheduledDate+"')]"));
			date.click();
			Screenshots.takeScreenshot(driver, "User selected schedule date as " + input_ScheduledDate);
			test.log(Status.INFO, "User selected schedule date as " + input_ScheduledDate);
			Log.info("User selected schedule date as " + input_ScheduledDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_DeliveryTime(String input_ScheduledTime) {
		try {

			values = input_ScheduledTime.split(":");

			applyWait.waitForElementToBeClickable(scheduleTimeHours, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeHours, values[0]);
			applyWait.waitForElementToBeClickable(scheduleTimeMinutes, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeMinutes, values[1]);
			applyWait.waitForElementToBeClickable(AM_PM, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(AM_PM, values[2]);
			Screenshots.takeScreenshot(driver, "User selected schedule time");
			test.log(Status.INFO, "User selected schedule time as " + input_ScheduledTime);
			Log.info("User selected schedule time as " + input_ScheduledTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_TestCampaign(String input_TestCampaign, String value) {
		try {
			testCampaign = driver.findElement(By.xpath("//label[contains(text(),'" + input_TestCampaign + "')]"));
			if (input_TestCampaign.equals("Individual")) {
				testCampaign.click();
				applyWait.waitForElementToBeClickable(phoneNumber, DefineConstants.explicitWait_30).sendKeys(value);
			} else if (input_TestCampaign.equals("Group")) {
				testCampaign.click();
				applyWait.waitForElementToBeClickable(testCampaignGroupDropdown, DefineConstants.explicitWait_30).click();
				applyWait.waitForElementToBeClickable(testCampaignGroupDropdownSearchBar,DefineConstants.explicitWait_30).sendKeys(value);
				testCampaignGroupDropdownSearchBar.sendKeys(Keys.ENTER);
			}
			Screenshots.takeScreenshot(driver, "User selected test campaign as " + input_TestCampaign);
			test.log(Status.INFO, "User selected test campaign as " + input_TestCampaign);
			Log.info("User selected test campaign as " + input_TestCampaign);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void click_SaveButton() {
		try {
			Screenshots.takeScreenshot(driver, "Values entered");
			applyWait.waitForElementToBeClickable(saveButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "Save button is clicked");
			test.log(Status.INFO, "Save button is clicked");
			Log.info("Save button is clicked");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}