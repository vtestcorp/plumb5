package com.plumb5.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.DefineConstants;
import helperMethods.DropDown;
import helperMethods.JavascriptClick;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class Scheduled_Campaigns {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;
	String values[];

	public Scheduled_Campaigns(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		this.dropDown = new DropDown(driver);
	}

	@FindBy(xpath = "//label[contains(text(),'Campaign Identifier')]//following::input[1]")
	private WebElement campaignIdentifier;

	@FindBy(xpath = "//span[@id='select2-addCampName-container']")
	private WebElement campaignName;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	private WebElement campaignNameDropdownSearch;

	private WebElement campaignType;

	@FindBy(xpath = "//label[contains(text(),'Send To')]//following::input[1]")
	private WebElement sendTo;

	@FindBy(xpath = "//button[@id='ui_btnNext']")
	private WebElement nextButton;

	@FindBy(xpath = "//button[@id='ui_SaveDistinctContact']")
	private WebElement popUpNextButton;

	@FindBy(xpath = "//label[contains(text(),'From Name')]//following::input[1]")
	private WebElement fromName;

	@FindBy(xpath = "//label[contains(text(),'From Address')]//following::select[1]")
	private WebElement fromAddress;

	@FindBy(xpath = "//label[contains(text(),'Subject Line')]//following::input[1]")
	private WebElement subjectLine;

	@FindBy(xpath = "//label[contains(text(),'Select Template')]//following::select[1]")
	private WebElement selectTemplate;

	@FindBy(xpath = "//label[contains(text(),'Schedule Date')]//following::input[1]")
	private WebElement scheduleDate;

	private WebElement date;

	@FindBy(xpath = "//select[@id='ui_hours']")
	private WebElement scheduleTimeHours;

	@FindBy(xpath = "//select[@id='ui_minutes']")
	private WebElement scheduleTimeMinutes;

	@FindBy(xpath = "//select[@id='ui_TimeFormat']")
	private WebElement AM_PM;

	private WebElement testCampaign;

	@FindBy(xpath = "//input[@id='ui_testToEmailId']")
	private WebElement emailAddress;

	@FindBy(xpath = "//span[@id='select2-testcampgroupname-container']")
	private WebElement testCampaignGroupDropdown;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	private WebElement testCampaignGroupDropdownSearchBar;

	@FindBy(xpath = "//button[@id='ui_btnNext']")
	private WebElement saveButton;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement addedSuccessfullyMessage;
	
	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;
	
	public void enter_CampaignIdentifier(String input_CampaignIdentifier) {
		applyWait.waitForElementToBeClickable(campaignIdentifier, DefineConstants.explicitWait_30).clear();
		campaignIdentifier.sendKeys(input_CampaignIdentifier);
		try {
			Screenshots.takeScreenshot(driver, "User entered campaign identifier");
			test.log(Status.INFO, "User entered campaign identifier");
			Log.info("User entered campaign identifier");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void select_CampaignName(String input_CampaignName) {
		try {
			applyWait.waitForElementToBeClickable(campaignName, DefineConstants.explicitWait_30).click();
			campaignNameDropdownSearch.sendKeys(input_CampaignName);
			campaignNameDropdownSearch.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, input_CampaignName + " is selected");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_CampaignName + " is selected");
		Log.info(input_CampaignName + " is selected");
	}

	public void select_CampaignType(String input_CampaignType) {
		campaignType = driver.findElement(By.xpath("//label[text()='" + input_CampaignType + "']"));
		applyWait.waitForElementToBeClickable(campaignType, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, input_CampaignType + " is selected as campaign type");
			test.log(Status.INFO, input_CampaignType + " is selected as campaign type");
			Log.info(input_CampaignType + " is selected as campaign type");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void enter_SendTo(String input_SendTo) {
		try {
			applyWait.waitForElementToBeClickable(sendTo, DefineConstants.explicitWait_30).sendKeys(input_SendTo);
			sendTo.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, input_SendTo + " is selected");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_SendTo + " is selected");
		Log.info(input_SendTo + " is selected");
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

	public void click_PopUpNextButton() {
		try {
			applyWait.waitForElementToBeClickable(popUpNextButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "Pop up next button is clicked");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Pop up next button is clicked");
		Log.info("Pop up next button is clicked");
	}

	public void enter_FromName(String input_FromName) {
		try {
			applyWait.waitForElementToBeClickable(fromName, DefineConstants.explicitWait_30).sendKeys(input_FromName);
			Screenshots.takeScreenshot(driver, input_FromName + " is entered in from name field");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_FromName + " is entered in from name field");
		Log.info(input_FromName + " is entered in from name field");
	}

	public void select_FromAddress(String select_FromAddress) {
		try {
			applyWait.waitForElementToBeClickable(fromAddress, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(fromAddress, select_FromAddress);
			Screenshots.takeScreenshot(driver, select_FromAddress + " is selected for from address");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, select_FromAddress + " is selected for from address");
		Log.info(select_FromAddress + " is selected for from address");
	}

	public void enter_SubjectLine(String input_SubjectLine) {
		try {
			applyWait.waitForElementToBeClickable(subjectLine, DefineConstants.explicitWait_30)
					.sendKeys(input_SubjectLine);
			Screenshots.takeScreenshot(driver, input_SubjectLine + " is entered for subject line");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_SubjectLine + " is entered for subject line");
		Log.info(input_SubjectLine + " is entered for subject line");
	}

	public void select_SelectTemplate(String input_SelectTemplate) {
		try {
			applyWait.waitForElementToBeClickable(selectTemplate, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(selectTemplate, input_SelectTemplate);
			Screenshots.takeScreenshot(driver, input_SelectTemplate + " is selected for select template");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_SelectTemplate + " is selected for select template");
		Log.info(input_SelectTemplate + " is selected for select template");
	}

	public void select_ScheduledDate(String input_ScheduledDate) {
		try {
			applyWait.waitForElementToBeClickable(scheduleDate, DefineConstants.explicitWait_30).click();
			date = driver.findElement(By.linkText(input_ScheduledDate));
			date.click();
			Screenshots.takeScreenshot(driver, "User selected schedule date");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected schedule date");
		Log.info("User selected schedule date");
	}

	public void select_ScheduledTime(String input_ScheduledTime) {
		try {

			values = input_ScheduledTime.split(":");

			applyWait.waitForElementToBeClickable(scheduleTimeHours, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeHours, values[0]);
			applyWait.waitForElementToBeClickable(scheduleTimeMinutes, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeMinutes, values[1]);
			applyWait.waitForElementToBeClickable(AM_PM, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(AM_PM, values[2]);

			Screenshots.takeScreenshot(driver, "User selected schedule time");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected schedule time");
		Log.info("User selected schedule time");
	}

	public void select_TestCampaign(String input_TestCampaign, String value) {
		try {
			testCampaign = driver.findElement(By.xpath("//label[contains(text(),'" + input_TestCampaign + "')]"));
			if (input_TestCampaign.equals("Individual")) {
				testCampaign.click();
				applyWait.waitForElementToBeClickable(emailAddress, DefineConstants.explicitWait_30).sendKeys(value);
			} else if (input_TestCampaign.equals("Group")) {
				testCampaign.click();
				applyWait.waitForElementToBeClickable(testCampaignGroupDropdown, DefineConstants.explicitWait_30)
						.click();
				applyWait.waitForElementToBeClickable(testCampaignGroupDropdownSearchBar,
						DefineConstants.explicitWait_30).sendKeys(value);
				testCampaignGroupDropdownSearchBar.sendKeys(Keys.ENTER);
			}
			Screenshots.takeScreenshot(driver, "User selected test campaign as " + input_TestCampaign);

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected schedule date");
		Log.info("User selected schedule date");
	}

	public void click_SaveButton() {
		try {
			Screenshots.takeScreenshot(driver, "Values entered");
			applyWait.waitForElementToBeClickable(saveButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "Save button is clicked");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Save button is clicked");
		Log.info("Save button is clicked");
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
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
