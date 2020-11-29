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

public class SMS_Scheduled_Campaigns {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;
	String values[];

	public SMS_Scheduled_Campaigns(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		this.dropDown = new DropDown(driver);
	}

	@FindBy(xpath = "//label[contains(text(),'Campaign Identifier')]//following::input[1]")
	private WebElement campaignIdentifier;

	
	@FindBy(xpath = "//span[@id='select2-ui_ddlCampaign-container']")
	private WebElement campaignName;

	@FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
	private WebElement campaignNameDropdownSearch;

	private WebElement campaignType,batchType;

	@FindBy(xpath = "//label[contains(text(),'Send To')]//following::input[1]")
	private WebElement sendTo;

	@FindBy(partialLinkText = "Next")
	private WebElement nextButton;
	
	
	@FindBy(xpath= "//button[@id='ui_btnGroupAnalysisNext']")
	private WebElement nextButtonGroupAnalysis;
	
	@FindBy(xpath = "//button[@id='ui_SaveDistinctContact']")
	private WebElement popUpNextButton;

	@FindBy(xpath = "//label[contains(text(),'From Name')]//following::input[1]")
	private WebElement fromName;

	@FindBy(xpath = "//label[contains(text(),'From Address')]//following::select[1]")
	private WebElement fromAddress;

	@FindBy(xpath = "//label[contains(text(),'Subject Line')]//following::input[1]")
	private WebElement subjectLine;

	@FindBy(xpath = "//label[contains(text(),'Subject Line')]//following::select[2]")
	private WebElement variation_A_50;

	@FindBy(xpath = "//label[contains(text(),'Subject Line')]//following::select[3]")
	private WebElement variation_B_50;

	@FindBy(xpath = "//label[contains(text(),'Select Template')]//following::select[1]")
	private WebElement selectTemplate;

	@FindBy(xpath = "//input[@id='ui_txtSingleSchedule']")
	private WebElement scheduleDate;
	
	@FindBy(xpath = "//input[@id='ui_txtBatchSchedule_1']")
	private WebElement scheduleDate1;
	
	@FindBy(xpath = "//input[@id='ui_txtBatchSchedule_2']")
	private WebElement scheduleDate2;
	
	@FindBy(xpath = "//input[@id='ui_txtBatchSchedule_3']")
	private WebElement scheduleDate3;
	
	@FindBy(xpath = "//input[@id='ui_txtBatchSchedule_4']")
	private WebElement scheduleDate4;

	private WebElement date;

	@FindBy(xpath = "//label[contains(text(),'Hours')]//following::select[1]")
	private WebElement scheduleTimeHours;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleHour_1']")
	private WebElement scheduleTimeHours1;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleHour_2']")
	private WebElement scheduleTimeHours2;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleHour_3']")
	private WebElement scheduleTimeHours3;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleHour_4']")
	private WebElement scheduleTimeHours4;

	@FindBy(xpath = "//label[contains(text(),'Hours')]//following::select[1]//following::select[1]")
	private WebElement scheduleTimeMinutes;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleMinute_1']")
	private WebElement scheduleTimeMinutes1;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleMinute_2']")
	private WebElement scheduleTimeMinutes2;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleMinute_3']")
	private WebElement scheduleTimeMinutes3;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleMinute_4']")
	private WebElement scheduleTimeMinutes4;

	@FindBy(xpath = "//label[contains(text(),'AM/PM')]//following::select[1]")
	private WebElement AM_PM;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleAMPM_1']")
	private WebElement AM_PM1;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleAMPM_2']")
	private WebElement AM_PM2;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleAMPM_3']")
	private WebElement AM_PM3;
	
	@FindBy(xpath = "//select[@id='ui_ddlBatchScheduleAMPM_4']")
	private WebElement AM_PM4;

	private WebElement testCampaign;

	@FindBy(xpath = "//input[@id='ui_txtCampaignTestNumber']")
	private WebElement phoneNumber;

	@FindBy(xpath = "//span[@id='select2-ui_ddlCampaignTestGroup-container']")
	private WebElement testCampaignGroupDropdown;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	private WebElement testCampaignGroupDropdownSearchBar;

	@FindBy(xpath = "//a[contains(text(),'Save')]")
	private WebElement saveButton;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(xpath = "//table[@id='ui_tblReportData']")
	private WebElement campaignTable;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	private WebElement editCampaign;

	@FindBy(id = "ui_tblReportData")
	private WebElement scheduledCampaignsTable;

	@FindBy(linkText = "Delete")
	private WebElement deleteButton;

	@FindBy(linkText = "Edit")
	private WebElement editButton;

	@FindBy(linkText = "Duplicate")
	private WebElement duplicateButton;

	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement deleteButtonPopUp;

	@FindBy(xpath = "//ul[@id='select2-addCampName-results']")
	private List<WebElement> campaignNameDropdownValues;

	@FindBy(xpath = "//label[@class='frmlbltxt'][contains(text(),'Name')]//following::input[1]")
	private WebElement mergedGroupName;

	@FindBy(xpath = "//label[contains(text(),'Description')]//following::textarea[1]")
	private WebElement mergedGroupDescription;

	@FindBy(xpath = "//label[@class='frmlbltxt mb-0']//following::div[1]")
	private WebElement A_BTesting;

	@FindBy(xpath = "//input[@id='txt_SearchBy']")
	private WebElement search_ScheduledCampaign;

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
//			javascriptClick.sendKeys(campaignNameDropdownSearch,input_CampaignName);
			Thread.sleep(3000l);
			campaignNameDropdownSearch.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, input_CampaignName + " is selected as campaign name");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_CampaignName + " is selected");
		Log.info(input_CampaignName + " is selected");
	}

	public void edit_CampaignName(String input_CampaignName) {
		try {
			applyWait.waitforPresenceOfElementLocated(campaignName, DefineConstants.explicitWait_30).click();
			Thread.sleep(3000L);
			campaignNameDropdownSearch.sendKeys(input_CampaignName);
			Thread.sleep(3000L);
			campaignNameDropdownSearch.sendKeys(Keys.ENTER);
			Thread.sleep(3000L);
			System.out.println("input is " + input_CampaignName);
			for (WebElement value : campaignNameDropdownValues) {
				String selectValue = value.getText();
				System.out.println("select value is " + selectValue);
				if (selectValue.equals(input_CampaignName)) {
					System.out.println("value is is is  " + selectValue);
					value.click();
				}
			}
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

	public void select_BatchType(String input_BatchType) {
		batchType = driver.findElement(By.xpath("//label[contains(text(),'"+input_BatchType+"')]"));
		applyWait.waitForElementToBeClickable(batchType, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, input_BatchType + " is selected as batch type");
			test.log(Status.INFO, input_BatchType + " is selected as batch type");
			Log.info(input_BatchType + " is selected as batch type");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	public void clear_SendTo() {
		try {
			applyWait.waitForElementToBeClickable(sendTo, DefineConstants.explicitWait_30).click();
			sendTo.sendKeys(Keys.BACK_SPACE);
			Screenshots.takeScreenshot(driver, "Send to field is cleared");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Send to field is cleared");
		Log.info("Send to field is cleared");
	}

	public void enter_SendTo(JSONArray input_SendTo, String input_MergeGroupName, String input_MergeGroupDescription) {
		try {
			JSONArray values = input_SendTo;

			for (Object value : values) {
				applyWait.waitForElementToBeClickable(sendTo, DefineConstants.explicitWait_30)
						.sendKeys(value.toString());
				sendTo.sendKeys(Keys.ENTER);
				Screenshots.takeScreenshot(driver, value + " is selected");
			}
			click_NextButton();
			if (values.size() > 1) {
				applyWait.waitForElementToBeClickable(mergedGroupName, DefineConstants.explicitWait_30)
						.sendKeys(input_MergeGroupName);
				applyWait.waitForElementToBeClickable(mergedGroupDescription, DefineConstants.explicitWait_30)
						.sendKeys(input_MergeGroupDescription);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_SendTo + " is selected");
		Log.info(input_SendTo + " is selected");
	}
	
	public void enter_SendTo(JSONArray input_SendTo) {
		try {
			JSONArray values = input_SendTo;

			for (Object value : values) {
				applyWait.waitForElementToBeClickable(sendTo, DefineConstants.explicitWait_30)
						.sendKeys(value.toString());
				sendTo.sendKeys(Keys.ENTER);
				Screenshots.takeScreenshot(driver, value + " is selected");
			}
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
	
	public void click_NextButton_GroupAnalysis() {
		try {
			applyWait.waitForElementToBeClickable(nextButtonGroupAnalysis, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked Next button on Group Analysis popup");
			test.log(Status.INFO, "User clicked Next button on Group Analysis popup");
			Log.info("User clicked Next button on Group Analysis popup");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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

	public void clear_FromName() {
		try {
			applyWait.waitForElementToBeClickable(fromName, DefineConstants.explicitWait_30).clear();
			Screenshots.takeScreenshot(driver, "User cleared from name");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User cleared from name");
		Log.info("User cleared from name");
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

	public void select_Variation_A_50(String inputVariation_A_50) {
		try {
			applyWait.waitForElementToBeClickable(variation_A_50, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(variation_A_50, inputVariation_A_50);
			Screenshots.takeScreenshot(driver, inputVariation_A_50 + " is selected for Variation A 50");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, inputVariation_A_50 + " is selected for Variation A 50");
		Log.info(inputVariation_A_50 + " is selected for Variation A 50");
	}

	public void select_Variation_B_50(String inputVariation_B_50) {
		try {
			applyWait.waitForElementToBeClickable(variation_B_50, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(variation_B_50, inputVariation_B_50);
			Screenshots.takeScreenshot(driver, inputVariation_B_50 + " is selected for Variation B 50");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, inputVariation_B_50 + " is selected for Variation B 50");
		Log.info(inputVariation_B_50 + " is selected for Variation B 50");
	}

	public void clear_SubjectLine() {
		try {
			applyWait.waitForElementToBeClickable(subjectLine, DefineConstants.explicitWait_30).clear();
			Screenshots.takeScreenshot(driver, "User clear subject line");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clear subject line");
		Log.info("User clear subject line");
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

	public void enable_A_BTesting() {
		try {
			applyWait.waitForElementToBeClickable(A_BTesting, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User enable A/B Testing");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User enable A/B Testing");
		Log.info("User enable A/B Testing");
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

	public void select_ScheduledDate1(String input_ScheduledDate1) {
		try {
			applyWait.waitForElementToBeClickable(scheduleDate1, DefineConstants.explicitWait_30).click();
			date = driver.findElement(By.xpath("//a[contains(text(),'"+input_ScheduledDate1+"')]"));
			date.click();
			Screenshots.takeScreenshot(driver, "User selected schedule date 1 as " + input_ScheduledDate1);
			test.log(Status.INFO, "User selected schedule date 1 as " + input_ScheduledDate1);
			Log.info("User selected schedule date 1 as " + input_ScheduledDate1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	public void select_ScheduledDate2(String input_ScheduledDate2) {
		try {
			applyWait.waitForElementToBeClickable(scheduleDate2, DefineConstants.explicitWait_30).click();
			date = driver.findElement(By.xpath("//a[contains(text(),'"+input_ScheduledDate2+"')]"));
			date.click();
			Screenshots.takeScreenshot(driver, "User selected schedule date 2 as " + input_ScheduledDate2);
			test.log(Status.INFO, "User selected schedule date 2 as " + input_ScheduledDate2);
			Log.info("User selected schedule date 2 as " + input_ScheduledDate2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_ScheduledDate3(String input_ScheduledDate3) {
		try {
			applyWait.waitForElementToBeClickable(scheduleDate3, DefineConstants.explicitWait_30).click();
			date = driver.findElement(By.xpath("//a[contains(text(),'"+input_ScheduledDate3+"')]"));
			date.click();
			Screenshots.takeScreenshot(driver, "User selected schedule date 3 as " + input_ScheduledDate3);
			test.log(Status.INFO, "User selected schedule date 3 as " + input_ScheduledDate3);
			Log.info("User selected schedule date 3 as " + input_ScheduledDate3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_ScheduledDate4(String input_ScheduledDate4) {
		try {
			applyWait.waitForElementToBeClickable(scheduleDate4, DefineConstants.explicitWait_30).click();
			date = driver.findElement(By.xpath("//a[contains(text(),'"+input_ScheduledDate4+"')]"));
			date.click();
			Screenshots.takeScreenshot(driver, "User selected schedule date 4 as " + input_ScheduledDate4);
			test.log(Status.INFO, "User selected schedule date 4 as " + input_ScheduledDate4);
			Log.info("User selected schedule date 4 as " + input_ScheduledDate4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_ScheduledDate(String input_ScheduledDate) {
		try {
			applyWait.waitForElementToBeClickable(scheduleDate, DefineConstants.explicitWait_30).click();
			date = driver.findElement(By.xpath("//a[contains(text(),'"+input_ScheduledDate+"')]"));
			date.click();
			Screenshots.takeScreenshot(driver, "User selected schedule date as " + input_ScheduledDate);
			test.log(Status.INFO, "User selected schedule date as " + input_ScheduledDate);
			Log.info("User selected schedule date as " + input_ScheduledDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
			test.log(Status.INFO, "User selected schedule time as " + input_ScheduledTime);
			Log.info("User selected schedule time as " + input_ScheduledTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void select_ScheduledTime1(String input_ScheduledTime1) {
		try {

			values = input_ScheduledTime1.split(":");

			applyWait.waitForElementToBeClickable(scheduleTimeHours1, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeHours1, values[0]);
			applyWait.waitForElementToBeClickable(scheduleTimeMinutes1, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeMinutes1, values[1]);
			applyWait.waitForElementToBeClickable(AM_PM1, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(AM_PM1, values[2]);
			Screenshots.takeScreenshot(driver, "User selected schedule time 1");
			test.log(Status.INFO, "User selected schedule time 1 as " + input_ScheduledTime1);
			Log.info("User selected schedule time 1 as " + input_ScheduledTime1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_ScheduledTime2(String input_ScheduledTime2) {
		try {

			values = input_ScheduledTime2.split(":");

			applyWait.waitForElementToBeClickable(scheduleTimeHours2, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeHours2, values[0]);
			applyWait.waitForElementToBeClickable(scheduleTimeMinutes2, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeMinutes2, values[1]);
			applyWait.waitForElementToBeClickable(AM_PM2, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(AM_PM2, values[2]);
			Screenshots.takeScreenshot(driver, "User selected schedule time 2");
			test.log(Status.INFO, "User selected schedule time 2 as " + input_ScheduledTime2);
			Log.info("User selected schedule time 2 as " + input_ScheduledTime2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_ScheduledTime3(String input_ScheduledTime3) {
		try {

			values = input_ScheduledTime3.split(":");

			applyWait.waitForElementToBeClickable(scheduleTimeHours3, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeHours3, values[0]);
			applyWait.waitForElementToBeClickable(scheduleTimeMinutes3, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeMinutes3, values[1]);
			applyWait.waitForElementToBeClickable(AM_PM3, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(AM_PM3, values[2]);
			Screenshots.takeScreenshot(driver, "User selected schedule time 3");
			test.log(Status.INFO, "User selected schedule time 3 as " + input_ScheduledTime3);
			Log.info("User selected schedule time 3 as " + input_ScheduledTime3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_ScheduledTime4(String input_ScheduledTime4) {
		try {

			values = input_ScheduledTime4.split(":");

			applyWait.waitForElementToBeClickable(scheduleTimeHours4, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeHours4, values[0]);
			applyWait.waitForElementToBeClickable(scheduleTimeMinutes4, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(scheduleTimeMinutes4, values[1]);
			applyWait.waitForElementToBeClickable(AM_PM4, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(AM_PM4, values[2]);
			Screenshots.takeScreenshot(driver, "User selected schedule time 4");
			test.log(Status.INFO, "User selected schedule time 4 as " + input_ScheduledTime4);
			Log.info("User selected schedule time 4 as " + input_ScheduledTime4);
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

	public void search_ScheduledCampaign(String input_search_ScheduledCampaign) {
		try {
			applyWait.waitForElementToBeClickable(search_ScheduledCampaign, DefineConstants.explicitWait_30).clear();
			search_ScheduledCampaign.sendKeys(input_search_ScheduledCampaign);
			search_ScheduledCampaign.sendKeys(Keys.ENTER);
			test.log(Status.INFO, "User searched " + input_search_ScheduledCampaign + " in Scheduled Campaign");
			Log.info("User searched " + input_search_ScheduledCampaign + " in Scheduled Campaign");
			Screenshots.takeScreenshot(driver,
					"User searched " + input_search_ScheduledCampaign + " in Scheduled Campaign");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void verifyInputValue(String input_SearchCampaigns) {
		applyWait.waitforPresenceOfElementLocated(campaignTable, DefineConstants.explicitWait_30);
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

	public void selectCampaignToEdit(String input_SearchCampaigns) {
		System.out.println("started");
		applyWait.waitforPresenceOfElementLocated(campaignTable, DefineConstants.explicitWait_30);
		tableRows = campaignTable.findElements(By.tagName("tr"));

		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				if (cellText.contains(input_SearchCampaigns)) {
					System.out.println("value is-- " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					System.out.println("hello");
					editCampaign = driver.findElement(
							By.xpath("//div[contains(text(),'" + input_SearchCampaigns + "')]//following::i[1]"));
					editCampaign.click();
					Assert.assertTrue(true, input_SearchCampaigns + " is present");
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, input_SearchCampaigns + " is present");
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(input_SearchCampaigns + " is present");
					test.log(Status.INFO, input_SearchCampaigns + " is present");
					Log.info(input_SearchCampaigns + " is present");
				}

				else if (cellText.equals("There is no data for this view")) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_SearchCampaigns + " is not found");
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(input_SearchCampaigns + " is not found");
					test.log(Status.INFO, input_SearchCampaigns + " is not found");
					Log.info(input_SearchCampaigns + " is not found");
					Assert.assertTrue(false, input_SearchCampaigns + " is not found");
				}
			}
		}
	}

	public void selectDeleteOption() {

		applyWait.waitForElementToBeClickable(deleteButton, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "User clicked delete button");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked delete button");
		Log.info("User clicked delete button");
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

	public void clickDeletePopUp() {
		try {
			applyWait.waitForElementToBeClickable(deleteButtonPopUp, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked delete button on delete this group pop up");
			test.log(Status.INFO, "User clicked delete button on delete this group pop up");
			Log.info("User clicked delete button on delete this group pop up");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDeletedSuccessfully(String inputmessage) {
		try {
			if (addedSuccessfullyMessage.isDisplayed()) {
				String groupCreatedMessage = addedSuccessfullyMessage.getText();
				Screenshots.takeScreenshot(driver, groupCreatedMessage + " message is verified");
				System.out.println(groupCreatedMessage + " message is verified");
				test.log(Status.INFO, groupCreatedMessage + " message is verified");
				Log.info(groupCreatedMessage + " message is verified");
				Assert.assertTrue(true);
			} else if (errorMessage.isDisplayed()) {
				String groupNotCreatedMessage = errorMessage.getText();
				Screenshots.takeScreenshot(driver, groupNotCreatedMessage + " message is verified");
				System.out.println(groupNotCreatedMessage + " message is verified");
				test.log(Status.INFO, groupNotCreatedMessage + " message is verified");
				Log.info(groupNotCreatedMessage + " message is verified");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}