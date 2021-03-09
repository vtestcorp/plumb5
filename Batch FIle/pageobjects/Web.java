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

public class Web {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;

	public Web(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropDown = new DropDown(driver);
	}

	@FindBy(linkText = "Browser Notifications")
	private WebElement browserNotification;

	@FindBy(linkText = "Forms & Banners")
	private WebElement forms_Banners;
	
	@FindBy(linkText = "Manage Forms")
	private WebElement Manage_Forms;
	
	@FindBy(linkText = "Pop-Up Forms")
	private WebElement pop_Up_Forms;
	
	@FindBy(linkText = "Manage Notifications")
	private WebElement manageNotification;

	@FindBy(linkText = "Templates")
	private WebElement templates;
	
	@FindBy(linkText = "Draft")
	private WebElement draft;
	
	@FindBy(linkText = "Create Draft")
	private WebElement createDraft;

	@FindBy(partialLinkText = "Create Schedul")
	private WebElement createScheduledCampaign;
	
	@FindBy(linkText = "RSS")
	private WebElement rssNotifications;
	
	@FindBy(xpath = "//a[contains(text(),'Create RSS Notifications')]")
	private WebElement createRSSNotifications;

	@FindBy(xpath = "//input[@id='ui_txtName']")
	private WebElement campaignName;

	@FindBy(xpath = "//textarea[@id='ui_txtDescription']")
	private WebElement campaignDescription;

	@FindBy(xpath = "//button[@id='ui_btnAdd']")
	private WebElement createCampaign_Button;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successfullMessage;

	// @FindBy(id = "ui_div_MasterSuccess")
	// private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(xpath = "//input[@id='txt_SearchBy']")
	private WebElement searchCampaignsDraft;

	@FindBy(xpath = "//table[@id='ui_tblReportData']")
	private WebElement webTable;
	
	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	private WebElement draftName_Campaign;
	
	@FindBy(linkText = "Edit")
	private WebElement edit_Button;
	
	@FindBy(xpath = "//button[@id='ui_btnAdd']")
	private WebElement updateCampaign_Button;
	
	@FindBy(linkText = "Duplicate")
	private WebElement duplicate_Button;
	
	@FindBy(linkText = "Delete")
	private WebElement delete_Button;
	
	@FindBy(linkText = "Settings")
	private WebElement settings;

	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement delete_ButtonPopUp;

	
	public void click_BrowserNotification() {
		try {
			applyWait.waitForElementToBeClickable(browserNotification, DefineConstants.explicitWait_30);
			javascriptClick.click(browserNotification);
			Screenshots.takeScreenshot(driver, "User clicked Browser Notification in Web");
			test.log(Status.INFO, "User clicked Browser Notification in Web");
			Log.info("User clicked Browser Notification in Web");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Forms_Banners() {
		try {
			applyWait.waitForElementToBeClickable(forms_Banners, DefineConstants.explicitWait_30);
			javascriptClick.click(forms_Banners);
			Screenshots.takeScreenshot(driver, "User clicked Forms and Banners in Web");
			test.log(Status.INFO, "User clicked Forms and Banners in Web");
			Log.info("User clicked Forms and Banners in Web");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_Manage_Forms() {
		try {
			applyWait.waitForElementToBeClickable(Manage_Forms, DefineConstants.explicitWait_30);
			javascriptClick.click(Manage_Forms);
			Screenshots.takeScreenshot(driver, "User clicked Manage Forms in Forms and Banners");
			test.log(Status.INFO, "User clicked Manage Forms in Forms and Banners");
			Log.info("User clicked Manage Forms in Forms and Banners");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_Pop_Up_Forms() {
		try {
			applyWait.waitForElementToBeClickable(pop_Up_Forms, DefineConstants.explicitWait_30);
			javascriptClick.click(pop_Up_Forms);
			Screenshots.takeScreenshot(driver, "User clicked Manage pop up forms in manage popup forms");
			test.log(Status.INFO, "User clicked Manage pop up forms in manage popup forms");
			Log.info("User clicked Manage pop up forms in manage popup forms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	public void click_ManageNotification() {
		try {
			applyWait.waitForElementToBeClickable(manageNotification, DefineConstants.explicitWait_30);
			javascriptClick.click(manageNotification);
			Screenshots.takeScreenshot(driver, "User clicked Manage Notification in Browser Notifications");
			test.log(Status.INFO, "User clicked Manage Notification in Browser Notifications");
			Log.info("User clicked Manage Notification in Browser Notifications");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Templates() {
		try {
			applyWait.waitForElementToBeClickable(templates, DefineConstants.explicitWait_30);
			javascriptClick.click(templates);
			Screenshots.takeScreenshot(driver, "User clicked Templates in Browser Notifications");
			test.log(Status.INFO, "User clicked Templates in Browser Notifications");
			Log.info("User clicked Templates in Browser Notifications");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void click_Draft() {
		try {
			applyWait.waitForElementToBeClickable(draft, DefineConstants.explicitWait_30);
			javascriptClick.click(draft);
			Screenshots.takeScreenshot(driver, "User clicked Draft in Manage Notifications");
			test.log(Status.INFO, "User clicked Draft in Manage Notifications");
			Log.info("User clicked Draft in Manage Notifications");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_CreateDraft() {
		try {
			applyWait.waitForElementToBeClickable(createDraft, DefineConstants.explicitWait_30);
			javascriptClick.click(createDraft);
			Screenshots.takeScreenshot(driver, "User clicked Create Draft in draft");
			test.log(Status.INFO, "User clicked Create Draft in draft");
			Log.info("User clicked Create Draft in draft");
		} catch (Exception e) {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_CreateScheduledCampaign() {
		try {
			applyWait.waitForElementToBeClickable(createScheduledCampaign, DefineConstants.explicitWait_30);
			javascriptClick.click(createScheduledCampaign);
			Screenshots.takeScreenshot(driver, "User clicked Create Scheduled Campaign button in Draft");
			test.log(Status.INFO, "User clicked Create Scheduled Campaign button in Draft");
			Log.info("User clicked Create Scheduled Campaign button in Draft");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_RSS_Notifications() {
		try {
			applyWait.waitForElementToBeClickable(rssNotifications, DefineConstants.explicitWait_30);
			javascriptClick.click(rssNotifications);
			Screenshots.takeScreenshot(driver, "User clicked RSS Notifications in Manage Notifications");
			test.log(Status.INFO, "User clicked RSS Notifications in Manage Notifications");
			Log.info("User clicked RSS Notifications in Manage Notifications");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_CreateRSSNotifications() {
		try {
			applyWait.waitForElementToBeClickable(createRSSNotifications, DefineConstants.explicitWait_30);
			javascriptClick.click(createRSSNotifications);
			Screenshots.takeScreenshot(driver, "User clicked Create RSS Notifications in Manage Notifications");
			test.log(Status.INFO, "User clicked Create RSS Notifications in Manage Notifications");
			Log.info("User clicked Create RSS Notifications in Manage Notifications");
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

	public void enter_CampaignDescription(String inputCampaignDescription) {
		try {
			applyWait.waitForElementToBeClickable(campaignDescription, DefineConstants.explicitWait_30).clear();
			campaignDescription.sendKeys(inputCampaignDescription);
			Screenshots.takeScreenshot(driver, "User entered " + inputCampaignDescription + " as campaign description");
			test.log(Status.INFO, "User entered " + inputCampaignDescription + " as campaign description");
			Log.info("User entered " + inputCampaignDescription + " as campaign description");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_CreateCampaign_Button() {
		try {
			applyWait.waitForElementToBeClickable(createCampaign_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(createCampaign_Button);
			Screenshots.takeScreenshot(driver, "User clicked create campaign button in create draft campaign");
			test.log(Status.INFO, "User clicked create campaign button in create draft campaign");
			Log.info("User clicked create campaign button in create draft campaign");
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

	public void search_CampaignDraft(String input_search_CampaignDraft) {
		try {
			applyWait.waitForElementToBeClickable(searchCampaignsDraft, DefineConstants.explicitWait_30).clear();
			searchCampaignsDraft.sendKeys(input_search_CampaignDraft);
			searchCampaignsDraft.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User searched " + input_search_CampaignDraft + " in manage campaigns");
			test.log(Status.INFO, "User searched " + input_search_CampaignDraft + " in manage campaigns");
			Log.info("User searched " + input_search_CampaignDraft + " in manage campaigns");
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
					if (cellText.equals(inputEmailAddress)||cellText.contains(inputEmailAddress)) {
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
	
	public void select_DraftToEdit(String draftName) {
		try {
			draftName_Campaign = driver.findElement(By.xpath("//*[text()='" + draftName + "']//following::i[1]"));
			draftName_Campaign.click();
			Screenshots.takeScreenshot(driver, draftName + " is clicked");
			test.log(Status.INFO, draftName + " is clicked");
			Log.info(draftName + " is clicked");
		} catch (IOException e) {
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

	public void click_UpdateCampaign_Button() {
		try {
			applyWait.waitForElementToBeClickable(updateCampaign_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(updateCampaign_Button);
			Screenshots.takeScreenshot(driver, "User clicked update campaign button in update draft campaign");
			test.log(Status.INFO, "User clicked update campaign button in update draft campaign");
			Log.info("User clicked update campaign button in update draft campaign");
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
			Screenshots.takeScreenshot(driver, "User clicked delete button for selected campaign on Delete This Draft pop up");
			test.log(Status.INFO, "User clicked delete button for selected campaign on Delete This Draft pop up");
			Log.info("User clicked delete button for selected campaign on Delete This Draft pop up");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}