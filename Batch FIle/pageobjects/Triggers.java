package com.plumb5.pageobjects;

import java.io.IOException;
import java.util.ArrayList;
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

public class Triggers {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;
	private List<String> triggerValues;
	String values[];

	public Triggers(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		this.dropDown = new DropDown(driver);
		triggerValues = new ArrayList<String>();
	}

	@FindBy(linkText = "Create Triggers")
	private WebElement createTriggers;

	@FindBy(xpath = "//label[contains(text(),'Trigger Identifier')]//following::input[1]")
	private WebElement triggerIdentifier;

	@FindBy(xpath = "//label[contains(text(),'Campaign Name')]//following::select[1]")
	private WebElement campaignName;

	private WebElement contentType;

	private WebElement deliveryTime;

	@FindBy(xpath = "//button[@id='ui_btnNext']")
	private WebElement nextButton;

	@FindBy(xpath = "//label[contains(text(),'From Name')]//following::input[1]")
	private WebElement fromName;

	@FindBy(xpath = "//label[contains(text(),'From Address')]//following::select[1]")
	private WebElement fromAddress;

	@FindBy(xpath = "//label[contains(text(),'Reply to Address')]//following::input[1]")
	private WebElement replyToAddress;

	@FindBy(xpath = "//label[contains(text(),'Subject Line')]//following::input[1]")
	private WebElement subjectLine;

	@FindBy(xpath = "//label[contains(text(),'Select Template')]//following::select[1]")
	private WebElement selectTemplate;

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

	@FindBy(id = "ui_div_MasterSuccess")
	private WebElement deleteSuccessfully;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(xpath = "//input[@id='txt_SearchBy']")
	private WebElement search_Triggers;

	@FindBy(xpath = "//table[@id='ui_tblReportData']")
	private WebElement campaignTable;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	private WebElement editTrigger;

	@FindBy(linkText = "Edit")
	private WebElement editButton;

	@FindBy(linkText = "Duplicate")
	private WebElement duplicateButton;

	@FindBy(linkText = "Change Status")
	private WebElement changeStatus;

	@FindBy(linkText = "Delete")
	private WebElement delete;

	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement deleteButtonPopUp;

	public void click_CreateTriggers() {
		try {
			applyWait.waitForElementToBeClickable(createTriggers, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked create triggers");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked create triggers");
		Log.info("User clicked create triggers");
	}

	public void select_CampaignName(String input_CampaignName) {

		applyWait.waitForElementToBeClickable(campaignName, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(campaignName, input_CampaignName);
		try {
			Screenshots.takeScreenshot(driver, input_CampaignName + " is selected as campaign name");
			test.log(Status.INFO, input_CampaignName + " is selected as campaign name");
			Log.info(input_CampaignName + " is selected as campaign name");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void select_ContentType(String input_ContentType) {
		contentType = driver.findElement(By.xpath("//label[text()='" + input_ContentType + "']"));
		applyWait.waitForElementToBeClickable(contentType, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, input_ContentType + " is selected as content type");
			test.log(Status.INFO, input_ContentType + " is selected as content type");
			Log.info(input_ContentType + " is selected as content type");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void select_DeliveryTime(String input_DeliveryTime) {
		deliveryTime = driver.findElement(By.xpath("//label[text()='" + input_DeliveryTime + "']"));
		applyWait.waitForElementToBeClickable(deliveryTime, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, input_DeliveryTime + " is selected as DeliveryTime");
			test.log(Status.INFO, input_DeliveryTime + " is selected as DeliveryTime");
			Log.info(input_DeliveryTime + " is selected as DeliveryTime");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void click_NextButton() {

		applyWait.waitForElementToBeClickable(nextButton, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "User clicked next button");
			test.log(Status.INFO, "User clicked next button");
			Log.info("User clicked next button");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void enter_TriggerIdentifier(String input_TriggerIdentifier) {
		try {
			Thread.sleep(5000L);
			applyWait.waitForElementToBeClickable(triggerIdentifier, DefineConstants.explicitWait_30);
			Thread.sleep(3000L);
			triggerIdentifier.clear();
			triggerIdentifier.sendKeys(input_TriggerIdentifier);
			Screenshots.takeScreenshot(driver, input_TriggerIdentifier + " is entered as input_TriggerIdentifier");
			test.log(Status.INFO, input_TriggerIdentifier + " is entered as input_TriggerIdentifier");
			Log.info(input_TriggerIdentifier + " is entered as input_TriggerIdentifier");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void edit_TriggerIdentifier(String input_TriggerIdentifier) {

		try {
			Thread.sleep(5000L);
			if (!input_TriggerIdentifier.equals(null)) {
				applyWait.waitForElementToBeClickable(triggerIdentifier, DefineConstants.explicitWait_30);
				Thread.sleep(3000l);
				triggerIdentifier.clear();
				triggerIdentifier.sendKeys(input_TriggerIdentifier);
				Screenshots.takeScreenshot(driver, input_TriggerIdentifier + " is entered as input_TriggerIdentifier");
				test.log(Status.INFO, input_TriggerIdentifier + " is entered as input_TriggerIdentifier");
				Log.info(input_TriggerIdentifier + " is entered as input_TriggerIdentifier");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_FromName(String input_FroName) {

		applyWait.waitForElementToBeClickable(fromName, DefineConstants.explicitWait_30).sendKeys(input_FroName);
		try {
			Screenshots.takeScreenshot(driver, input_FroName + " is entered as from name");
			test.log(Status.INFO, input_FroName + " is entered as from name");
			Log.info(input_FroName + " is entered as from name");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void edit_FromName(String input_FroName) {
		try {
			if (!input_FroName.equals("")) {
				applyWait.waitForElementToBeClickable(fromName, DefineConstants.explicitWait_30).clear();
				fromName.sendKeys(input_FroName);
				Screenshots.takeScreenshot(driver, input_FroName + " is entered as from name");
				test.log(Status.INFO, input_FroName + " is entered as from name");
				Log.info(input_FroName + " is entered as from name");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void select_FromAddress(String input_FromAddress) {

		applyWait.waitForElementToBeClickable(fromAddress, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(fromAddress, input_FromAddress);
		try {
			Screenshots.takeScreenshot(driver, input_FromAddress + " is selected as from address");
			test.log(Status.INFO, input_FromAddress + " is selected as from address");
			Log.info(input_FromAddress + " is selected as from address");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void enter_ReplyToAddress(String input_ReplyToAddress) {

		applyWait.waitForElementToBeClickable(replyToAddress, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(replyToAddress, input_ReplyToAddress);
		try {
			Screenshots.takeScreenshot(driver, input_ReplyToAddress + " is selected as reply to address");
			test.log(Status.INFO, input_ReplyToAddress + " is selected as reply to ddress");
			Log.info(input_ReplyToAddress + " is selected as reply to address");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void enter_SubjectLine(String input_SubjectLine) {

		applyWait.waitForElementToBeClickable(subjectLine, DefineConstants.explicitWait_30).sendKeys(input_SubjectLine);
		try {
			Screenshots.takeScreenshot(driver, input_SubjectLine + " is entered as from subject line");
			test.log(Status.INFO, input_SubjectLine + " is entered as from subject line");
			Log.info(input_SubjectLine + " is entered as from subject line");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void edit_SubjectLine(String input_SubjectLine) {
		try {
			if (!input_SubjectLine.equals("")) {
				applyWait.waitForElementToBeClickable(subjectLine, DefineConstants.explicitWait_30).clear();
				subjectLine.sendKeys(input_SubjectLine);

				Screenshots.takeScreenshot(driver, input_SubjectLine + " is entered as from subject line");
				test.log(Status.INFO, input_SubjectLine + " is entered as from subject line");
				Log.info(input_SubjectLine + " is entered as from subject line");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void select_Template(String input_Template) {

		applyWait.waitForElementToBeClickable(selectTemplate, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(selectTemplate, input_Template);
		try {
			Screenshots.takeScreenshot(driver, input_Template + " is selected as select template");
			test.log(Status.INFO, input_Template + " is selected as select template");
			Log.info(input_Template + " is selected as select template");
		} catch (IOException e) {
			e.printStackTrace();
		}
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

	public void verify_SuccessMessage(String inputSuccessMessage) {
		try {
			if (addedSuccessfullyMessage.isDisplayed()) {
				String successMessage = addedSuccessfullyMessage.getText();
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

	public void verify_DeleteSuccessfullyMessage(String inputSuccessMessage) {
		System.out.println("started");
		try {
			if (deleteSuccessfully.isDisplayed()) {
				String successMessage = addedSuccessfullyMessage.getText();
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

	public void search_Draft(String draftName) {
		applyWait.waitForElementToBeClickable(search_Triggers, DefineConstants.explicitWait_10).sendKeys(draftName);
		search_Triggers.sendKeys(Keys.ENTER);
		try {
			Screenshots.takeScreenshot(driver, "User searched draft name");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User searched draft name");
		Log.info("User searched draft name");
	}

	public void verifyInputValue(String input_SearchCampaigns) {
		applyWait.waitforPresenceOfElementLocated(campaignTable, DefineConstants.explicitWait_10);
		tableRows = campaignTable.findElements(By.tagName("tr"));
		System.out.println("value is " + input_SearchCampaigns);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.contains(input_SearchCampaigns)) {
					System.out.println("value is: " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, input_SearchCampaigns + " is verified");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, input_SearchCampaigns + " is verified");
					Log.info(input_SearchCampaigns + " is verified");
					Assert.assertTrue(true, input_SearchCampaigns + " is verified");
				}

				else if (cellText.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_SearchCampaigns + " is not found");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						System.out.println("value is " + cellText);
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, input_SearchCampaigns + " is not found");
					Log.info(input_SearchCampaigns + " is not found");
					Assert.assertTrue(false, input_SearchCampaigns + " is not found");
				}
			}
		}
	}

	public void check_TriggerStatus() {
		try {
			applyWait.waitforPresenceOfElementLocated(campaignTable, DefineConstants.explicitWait_10);
			tableRows = campaignTable.findElements(By.tagName("tr"));
			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();
					triggerValues.add(cellText);
				}
			}
			test.log(Status.INFO, triggerValues.get(0) + " status is " + triggerValues.get(1));
			Log.info(triggerValues.get(0) + " status is " + triggerValues.get(1));
			System.out.println(triggerValues.get(0) + " status is " + triggerValues.get(1));
			triggerValues.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectTriggerToEdit(String input_SearchTriggerCampaigns) {
		System.out.println("started");
		applyWait.waitforPresenceOfElementLocated(campaignTable, DefineConstants.explicitWait_10);
		tableRows = campaignTable.findElements(By.tagName("tr"));

		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				if (cellText.contains(input_SearchTriggerCampaigns)) {
					System.out.println("value is-- " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					System.out.println("hello");
					editTrigger = driver.findElement(By
							.xpath("//div[contains(text(),'" + input_SearchTriggerCampaigns + "')]//following::i[1]"));
					editTrigger.click();
					Assert.assertTrue(true, input_SearchTriggerCampaigns + " is present");
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, input_SearchTriggerCampaigns + " is present");
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(input_SearchTriggerCampaigns + " is present");
					test.log(Status.INFO, input_SearchTriggerCampaigns + " is present");
					Log.info(input_SearchTriggerCampaigns + " is present");
				}

				else if (cellText.equals("There is no data for this view")) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_SearchTriggerCampaigns + " is not found");
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(input_SearchTriggerCampaigns + " is not found");
					test.log(Status.INFO, input_SearchTriggerCampaigns + " is not found");
					Log.info(input_SearchTriggerCampaigns + " is not found");
					Assert.assertTrue(false, input_SearchTriggerCampaigns + " is not found");
				}
			}
		}
	}

	public void selectEditOption() {

		applyWait.waitForElementToBeClickable(editButton, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "User clicked edit button");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked edit button");
		Log.info("User clicked edit button");
	}

	public void selectDuplicateOption() {

		applyWait.waitForElementToBeClickable(duplicateButton, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "User clicked duplicate button");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked duplicate button");
		Log.info("User clicked duplicate button");
	}

	public void select_ChangeStatus() {

		applyWait.waitForElementToBeClickable(changeStatus, DefineConstants.explicitWait_10).click();
		try {
			Screenshots.takeScreenshot(driver, "User clicked change status");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked change status");
		Log.info("User clicked change status");
	}

	public void click_Delete() {

		applyWait.waitForElementToBeClickable(delete, DefineConstants.explicitWait_10).click();
		try {
			Screenshots.takeScreenshot(driver, "User clicked delete button");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked delete button");
		Log.info("User clicked delete button");
	}

	public void clickDeletePopUp() {

		applyWait.waitForElementToBeClickable(deleteButtonPopUp, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "User clicked delete button on delete this group pop up");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked delete button on delete this group pop up");
		Log.info("User clicked delete button on delete this group pop up");
	}

}
