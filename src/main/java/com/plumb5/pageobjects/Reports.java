package com.plumb5.pageobjects;

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

public class Reports {

	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;
	private WebElement showingDataForValue;

	public Reports(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropDown = new DropDown(driver);
	}

	@FindBy(linkText = "Campaign Responses")
	private WebElement CampaignResponses;

	@FindBy(linkText = "Bounced Contacts")
	private WebElement bouncedContacts;
	
	@FindBy(linkText = "Alerts & Notifications")
	private WebElement Alerts_Notifications;
	
	@FindBy(linkText = "Soft Bounced")
	private WebElement softBounced;

	@FindBy(xpath = "//span[@id='select2-ui_dllMailCampaign-container']")
	private WebElement filterByCampaigns;

	@FindBy(className = "select2-search__field")
	private WebElement search_FilterByCampaigns;

	@FindBy(linkText = "Trigger Campaigns")
	private WebElement triggerCampaigns;

	@FindBy(linkText = "A/B Testing")
	private WebElement A_B_Testing;

	@FindBy(xpath = "//select[@id='ui_sortdate']")
	private WebElement recentActivityDate;

	@FindBy(xpath = "//button[@id='selectdateDropdown']")
	private WebElement showingDataFor;

	@FindBy(xpath = "//input[@id='ui_txtStartDate']")
	private WebElement showingDataFor_StartDate;

	@FindBy(xpath = "//input[@id='ui_txtEndDate']")
	private WebElement showingDataFor_EndDate;

	@FindBy(xpath = "//button[@id='ui_btnCustomDateApply']")
	private WebElement showingDataFor_GoButton;

	@FindBy(xpath = "//span[@id='select2-ui_ddlBouncedReason-container']")
	private WebElement filterByReasonBouncedContacts;

	@FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
	private WebElement search_FilterByReasonBouncedContacts;

	@FindBy(xpath = "//span[@id='select2-ui_ddlBouncedReason-container']//following::i[1]")
	private WebElement dowloadButton_BouncedContacts;

	private WebElement downloadValue;

	@FindBy(id = "ui_ddl_UnsubscribeExportFileType")
	private WebElement fileFormat;
	
	@FindBy(id = "ui_ddl_BounceExportFileType")
	private WebElement fileFormatHardBounced;

	@FindBy(xpath = "//button[@id='ui_btnUnsubscribeDataExport']")
	private WebElement fileFormatDownloadButton;

	@FindBy(xpath = "//button[@id='ui_btnBounceDataExport']")
	private WebElement fileFormatDownloadButtonHardBounced;
	
	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successfullMessage;

	// @FindBy(id = "ui_div_MasterSuccess")
	// private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	public void click_FilterByReasonBouncedContacts() {
		try {
			Thread.sleep(3000L);
			applyWait.waitForElementToBeClickable(filterByReasonBouncedContacts, DefineConstants.explicitWait_30)
					.click();
			// javascriptClick.click(filterByReasonBouncedContacts);
			Screenshots.takeScreenshot(driver, "User clicked filter by reason dropdown");
			test.log(Status.INFO, "User clicked filter by reason dropdown");
			Log.info("User clicked filter by reason dropdown");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_CampaignResponses() {
		try {
			applyWait.waitForElementToBeClickable(CampaignResponses, DefineConstants.explicitWait_30);
			javascriptClick.click(CampaignResponses);
			Screenshots.takeScreenshot(driver, "User clicked Campaign Responses");
			test.log(Status.INFO, "User clicked Campaign Responses");
			Log.info("User clicked Campaign Responses");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_BouncedContacts() {
		try {
			applyWait.waitForElementToBeClickable(bouncedContacts, DefineConstants.explicitWait_30);
			javascriptClick.click(bouncedContacts);
			Screenshots.takeScreenshot(driver, "User clicked bounced contacts");
			test.log(Status.INFO, "User clicked bounced contacts");
			Log.info("User clicked bounced contacts");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_AlertsNotifications() {
		try {
			applyWait.waitForElementToBeClickable(Alerts_Notifications, DefineConstants.explicitWait_30);
			javascriptClick.click(Alerts_Notifications);
			Screenshots.takeScreenshot(driver, "User clicked Alerts and Notifications");
			test.log(Status.INFO, "User clicked Alerts and Notifications");
			Log.info("User clicked Alerts and Notifications");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public void click_SoftBounced() {
		try {
			applyWait.waitForElementToBeClickable(softBounced, DefineConstants.explicitWait_30);
			javascriptClick.click(softBounced);
			Screenshots.takeScreenshot(driver, "User clicked soft bounced");
			test.log(Status.INFO, "User clicked soft bounced");
			Log.info("User clicked soft bounced");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	public void click_TriggerCampaigns() {
		try {
			applyWait.waitForElementToBeClickable(triggerCampaigns, DefineConstants.explicitWait_30);
			javascriptClick.click(triggerCampaigns);
			Screenshots.takeScreenshot(driver, "User clicked trigger campaigns");
			test.log(Status.INFO, "User clicked trigger campaigns");
			Log.info("User clicked trigger campaigns");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_A_B_Testing() {
		try {
			applyWait.waitForElementToBeClickable(A_B_Testing, DefineConstants.explicitWait_30);
			javascriptClick.click(A_B_Testing);
			Screenshots.takeScreenshot(driver, "User clicked A/B Testing");
			test.log(Status.INFO, "User clicked A/B Testing");
			Log.info("User clicked A/B Testing");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_FilterByCampaigns() {
		try {
			Thread.sleep(3000L);
			applyWait.waitForElementToBeClickable(filterByCampaigns, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked filter by campaigns");
			test.log(Status.INFO, "User clicked filter by campaigns");
			Log.info("User clicked filter by campaigns");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_DownloadButton_BouncedContacts(String value) {
		try {
			applyWait.waitForElementToBeClickable(dowloadButton_BouncedContacts, DefineConstants.explicitWait_30)
					.click();
			Screenshots.takeScreenshot(driver, "User clicked download button on Bounced Contacts");
			test.log(Status.INFO, "User clicked download button on Bounced Contacts");
			Log.info("User clicked download button on Bounced Contacts");

			downloadValue = driver.findElement(By.linkText(value));
			downloadValue.click();

			Screenshots.takeScreenshot(driver, "User selected " + value + " as download value");
			test.log(Status.INFO, "User selected " + value + " as download value");
			Log.info("User selected " + value + " as download value");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void search_FilterByCampaigns(String input_FilterByCampaigns) {
		try {
			applyWait.waitForElementToBeClickable(search_FilterByCampaigns, DefineConstants.explicitWait_30)
					.sendKeys(input_FilterByCampaigns);
			search_FilterByCampaigns.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User searched " + input_FilterByCampaigns + " as campaign name");
			test.log(Status.INFO, "User searched " + input_FilterByCampaigns + " as campaign name");
			Log.info("User searched " + input_FilterByCampaigns + " as campaign name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void search_FilterByReason(String input_FilterByReason) {
		try {
			applyWait.waitForElementToBeClickable(search_FilterByReasonBouncedContacts, DefineConstants.explicitWait_30)
					.sendKeys(input_FilterByReason);
//			javascriptClick.click(search_FilterByReasonBouncedContacts);
//			javascriptClick.sendKeys(search_FilterByReasonBouncedContacts, input_FilterByReason);
			search_FilterByReasonBouncedContacts.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User searched " + input_FilterByReason + " as reason name");
			test.log(Status.INFO, "User searched " + input_FilterByReason + " as reason name");
			Log.info("User searched " + input_FilterByReason + " as reason name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_RecentActivityDate(String input_RecentActivityDate) {
		try {
			applyWait.waitForElementToBeClickable(recentActivityDate, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(recentActivityDate, input_RecentActivityDate);
			Screenshots.takeScreenshot(driver,
					"User selected " + input_RecentActivityDate + " as recent activity date");
			test.log(Status.INFO, "User selected " + input_RecentActivityDate + " as recent activity date");
			Log.info("User selected " + input_RecentActivityDate + " as recent activity date");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_ShowingDataFor(String input_ShowingDataFor, String input_StartDate, String input_EndDate) {
		try {
			applyWait.waitForElementToBeClickable(showingDataFor, DefineConstants.explicitWait_30).click();
			showingDataForValue = driver.findElement(By.linkText(input_ShowingDataFor));
			showingDataForValue.click();
			Screenshots.takeScreenshot(driver, "User selected " + input_ShowingDataFor + " for Showing Data For");
			test.log(Status.INFO, "User selected " + input_ShowingDataFor + " for Showing Data For");
			Log.info("User selected " + input_ShowingDataFor + " for Showing Data For");

			if (input_ShowingDataFor.equals("Custom Date Range")) {
				applyWait.waitForElementToBeClickable(showingDataFor_StartDate, DefineConstants.explicitWait_30)
						.sendKeys(input_StartDate);
				Screenshots.takeScreenshot(driver, "User entered " + input_StartDate + " as start date");
				test.log(Status.INFO, "User entered " + input_StartDate + " as start date");
				Log.info("User entered " + input_StartDate + " as start date");

				applyWait.waitForElementToBeClickable(showingDataFor_EndDate, DefineConstants.explicitWait_30)
						.sendKeys(input_EndDate);
				Screenshots.takeScreenshot(driver, "User entered " + input_EndDate + " as end date");
				test.log(Status.INFO, "User entered " + input_EndDate + " as end date");
				Log.info("User entered " + input_EndDate + " as end date");

				applyWait.waitForElementToBeClickable(showingDataFor_GoButton, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User clicked Go button after entering start date as "
						+ input_StartDate + " and end date as " + input_EndDate);
				test.log(Status.INFO, "User clicked Go button after entering start date as " + input_StartDate
						+ " and end date as " + input_EndDate);
				Log.info("User clicked Go button after entering start date as " + input_StartDate + " and end date as "
						+ input_EndDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_FileFormat(String input_FileFormat) {
		try {
			applyWait.waitForElementToBeClickable(fileFormat, DefineConstants.explicitWait_30);
//			javascriptClick.click(fileFormat);
			dropDown.selectByVisibleText(fileFormat, input_FileFormat);
			Screenshots.takeScreenshot(driver, "User selected " + input_FileFormat + " as format Type");
			test.log(Status.INFO, "User selected " + input_FileFormat + " as format Type");
			Log.info("User selected " + input_FileFormat + " as format Type");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_FileFormatHardBounced(String input_FileFormat) {
		try {
			applyWait.waitForElementToBeClickable(fileFormatHardBounced, DefineConstants.explicitWait_30);
//			javascriptClick.click(fileFormat);
			dropDown.selectByVisibleText(fileFormatHardBounced, input_FileFormat);
			Screenshots.takeScreenshot(driver, "User selected " + input_FileFormat + " as format Type");
			test.log(Status.INFO, "User selected " + input_FileFormat + " as format Type");
			Log.info("User selected " + input_FileFormat + " as format Type");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_FileFormatDownloadButton() {
		try {
			applyWait.waitForElementToBeClickable(fileFormatDownloadButton, DefineConstants.explicitWait_30);
			javascriptClick.click(fileFormatDownloadButton);
			Screenshots.takeScreenshot(driver, "User selected clicked download button");
			test.log(Status.INFO, "User selected clicked download button");
			Log.info("User selected clicked download button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_FileFormatDownloadButtonHardBounced() {
		try {
			applyWait.waitForElementToBeClickable(fileFormatDownloadButtonHardBounced, DefineConstants.explicitWait_30);
			javascriptClick.click(fileFormatDownloadButtonHardBounced);
			Screenshots.takeScreenshot(driver, "User selected clicked download button");
			test.log(Status.INFO, "User selected clicked download button");
			Log.info("User selected clicked download button");
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
	
}