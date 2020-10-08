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
import helperMethods.JavascriptClick;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class Campaigns {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;

	public Campaigns(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'Create Scheduled')]")
	private WebElement CreateScheduled_Button;

	@FindBy(linkText = "Draft")
	private WebElement draft;
	
	@FindBy(linkText = "Triggers")
	private WebElement triggers;
	
	@FindBy(xpath = "//button[@id='selectdateDropdown']")
	private WebElement showingDataFor;

	@FindBy(linkText = "Create Draft")
	private WebElement create_Draft;

	@FindBy(xpath = "//label[contains(text(),'Campaign Name')]//following::input[1]")
	private WebElement campaign_Name;

	@FindBy(xpath = "//label[contains(text(),'Campaign Description')]//following::textarea[1]")
	private WebElement campaign_Description;

	@FindBy(xpath = "//button[@id='ui_btnAdd']")
	private WebElement create_Campaign;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(xpath = "//input[@id='txt_SearchBy']")
	private WebElement search_Draft;

	@FindBy(xpath = "//table[@id='ui_tblReportData']")
	private WebElement campaignTable;

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

	private WebElement draftName_Campaign;

	public void click_Draft() {
		try {
			applyWait.waitForElementToBeClickable(draft, DefineConstants.explicitWait_30);
			javascriptClick.click(draft);
			Screenshots.takeScreenshot(driver, "User clicked draft tab");
			test.log(Status.INFO, "User clicked create draft tab");
			Log.info("User clicked create draft tab");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_Triggers() {
		try {
			applyWait.waitForElementToBeClickable(triggers, DefineConstants.explicitWait_30);
			javascriptClick.click(triggers);
			Screenshots.takeScreenshot(driver, "User clicked triggers tab");
			test.log(Status.INFO, "User clicked triggers tab");
			Log.info("User clicked triggers tab");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_ShowingDataFor(String inputTimePeriod) {
		try {
			applyWait.waitForElementToBeClickable(showingDataFor, DefineConstants.explicitWait_30).click();
			WebElement timeperiod=driver.findElement(By.linkText(inputTimePeriod));
			timeperiod.click();
			Screenshots.takeScreenshot(driver, "User selects time period");
			test.log(Status.INFO, "User selects time period");
			Log.info("User selects time period");
			Thread.sleep(5000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void click_CreateScheduled() {
		try {
			applyWait.waitForElementToBeClickable(CreateScheduled_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(CreateScheduled_Button);
			Screenshots.takeScreenshot(driver, "User clicked create scheduled button");
			test.log(Status.INFO, "User clicked create scheduled button");
			Log.info("User clicked create scheduled button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Edit() {
		try {
			applyWait.waitForElementToBeClickable(edit_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(edit_Button);
			Screenshots.takeScreenshot(driver, "User clicked edit button to edit draft campaign");
			test.log(Status.INFO, "User clicked edit button to edit draft campaign");
			Log.info("User clicked edit button to edit draft campaign");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Duplicate() {
		try {
			applyWait.waitForElementToBeClickable(delete_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(duplicate_Button);
			Screenshots.takeScreenshot(driver, "User clicked duplicate button");
			test.log(Status.INFO, "User clicked duplicate button");
			Log.info("User clicked duplicate button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Delete() {
		try {
			applyWait.waitForElementToBeClickable(delete_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(delete_Button);
			Screenshots.takeScreenshot(driver, "User clicked delete button to delete draft");
			test.log(Status.INFO, "User clicked delete button to delete draft");
			Log.info("User clicked delete button to delete draft");
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

	public void click_CreateDraft() {
		try {
			applyWait.waitForElementToBeClickable(create_Draft, DefineConstants.explicitWait_30);
			javascriptClick.click(create_Draft);
			Screenshots.takeScreenshot(driver, "User clicked create draft");
			test.log(Status.INFO, "User clicked create draft");
			Log.info("User clicked create draft");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_CampaignName(String campaignName) {
		applyWait.waitForElementToBeClickable(campaign_Name, DefineConstants.explicitWait_30).sendKeys(campaignName);
		try {
			Screenshots.takeScreenshot(driver, "Campaign name entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Campaign name entered");
		Log.info("Campaign name entered");
	}

	public void update_CampaignName(String campaignName) {
		applyWait.waitForElementToBeClickable(campaign_Name, DefineConstants.explicitWait_30).clear();
		campaign_Name.sendKeys(campaignName);
		try {
			Screenshots.takeScreenshot(driver, "Campaign name entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Campaign name entered");
		Log.info("Campaign name entered");
	}

	public void enter_CampaignDescription(String campaignDescription) {
		applyWait.waitForElementToBeClickable(campaign_Description, DefineConstants.explicitWait_30)
				.sendKeys(campaignDescription);
		try {
			Screenshots.takeScreenshot(driver, "User entered campaign description");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered campaign description");
		Log.info("User entered campaign description");
	}

	public void update_CampaignDescription(String campaignDescription) {
		applyWait.waitForElementToBeClickable(campaign_Description, DefineConstants.explicitWait_30).clear();
		campaign_Description.sendKeys(campaignDescription);
		try {
			Screenshots.takeScreenshot(driver, "User entered campaign description");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered campaign description");
		Log.info("User entered campaign description");
	}

	public void click_CreateCampaign() {
		applyWait.waitForElementToBeClickable(create_Campaign, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "User clicked create campaign button");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked create campaign button");
		Log.info("User clicked create campaign button");
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

	public void search_Draft(String draftName) {
		applyWait.waitForElementToBeClickable(search_Draft, DefineConstants.explicitWait_30).sendKeys(draftName);
		search_Draft.sendKeys(Keys.ENTER);
		try {
			Screenshots.takeScreenshot(driver, "User searched draft name");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User searched draft name");
		Log.info("User searched draft name");
	}

	public void verifyInputValue(String draftName) {
		applyWait.waitForElementToBeClickable(campaignTable, DefineConstants.explicitWait_60);
		tableRows = campaignTable.findElements(By.tagName("tr"));
		System.out.println("value is " + draftName);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.equals(draftName)) {					
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
}
