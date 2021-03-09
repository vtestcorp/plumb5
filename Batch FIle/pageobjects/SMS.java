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

public class SMS {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
    private DropDown dropDown;

	public SMS(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropDown= new DropDown(driver);
	}

	@FindBy(xpath = "//a[@href='/Sms/SmsDashboard']")
	private WebElement dashboard;

	@FindBy(xpath = "//button[@id='selectdateDropdown']")
	private WebElement showingDataFor;

	@FindBy(xpath = "//input[@id='ui_txtStartDate']")
	private WebElement showingDataFor_StartDate;

	@FindBy(xpath = "//input[@id='ui_txtEndDate']")
	private WebElement showingDataFor_EndDate;

	@FindBy(xpath = "//button[@id='ui_btnCustomDateApply']")
	private WebElement showingDataFor_GoButton;

	@FindBy(xpath = "//button[@id='selectdateDropdown']//following::i[7]")
	private WebElement gearIcon;

	@FindBy(xpath = "//a[contains(text(),'Web Analytics')]")
	private WebElement webAnalytics;

	@FindBy(xpath = "//a[contains(text(),'Web Engagement')]")
	private WebElement webEngagement;

	@FindBy(xpath = "//a[contains(text(),'Mail')]")
	private WebElement mail;

	@FindBy(xpath = "//a[contains(text(),'Sms')]")
	private WebElement Sms;

	@FindBy(xpath = "//a[contains(text(),'Mobile Analytics')]")
	private WebElement mobileAnalytics;

	@FindBy(xpath = "//button[@id='btnWidgetSave']")
	private WebElement saveButton_selectDashBoardWidgets;

	private WebElement showingDataForValue;

	private WebElement webAnalyticsValue;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successfullMessage;

	// @FindBy(id = "ui_div_MasterSuccess")
	// private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(linkText = "Manage")
	private WebElement manage;

	@FindBy(linkText = "Reports")
	private WebElement reports;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaigns;
	
	@FindBy(linkText = "Templates")
	private WebElement templates;

	@FindBy(linkText = "Draft")
	private WebElement draft;
	
	@FindBy(linkText = "Triggers")
	private WebElement triggers;

	@FindBy(linkText = "Create Draft")
	private WebElement createDraft_Button;

	@FindBy(xpath = "//label[contains(text(),'Campaign Name')]//following::input[1]")
	private WebElement campaignName;

	@FindBy(xpath = "//label[contains(text(),'Campaign Description')]//following::textarea[1]")
	private WebElement campaignDescription;

	@FindBy(xpath = "//button[@id='ui_btnAdd']")
	private WebElement createCampaign_Button;

	@FindBy(xpath = "//button[@id='ui_btnAdd']")
	private WebElement updateCampaign_Button;
	
	@FindBy(xpath = "//input[@id='txt_SearchBy']")
	private WebElement searchCampaignsDraft;

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

	private WebElement draftName_Campaign;

	@FindBy(xpath = "//input[@id='txt_SearchBy']//following::i[2]")
	private WebElement exportButton;
	
	@FindBy(xpath = "//label[contains(text(),'File Format')]//following::select[1]")
	private WebElement fileFormat;
	
	@FindBy(xpath = "//label[contains(text(),'Export Data by')]//following::select[1]")
	private WebElement exportDataBy;
	
	@FindBy(xpath = "//input[@id='ui_txtFromRange']")
	private WebElement fromRange_ExportReport;
	
	@FindBy(xpath = "//input[@id='ui_txToRange']")
	private WebElement toRange_ExportReport;
	
	@FindBy(xpath = "//button[@id='ui_btnDataExport']")
	private WebElement downloadButton_ExportReport;
	
	public void click_Dashboard() {
		try {
			applyWait.waitForElementToBeClickable(dashboard, DefineConstants.explicitWait_30);
			javascriptClick.click(dashboard);
			Screenshots.takeScreenshot(driver, "User clicked SMS Dashboard");
			test.log(Status.INFO, "User clicked SMS Dashboard");
			Log.info("User clicked SMS Dashboard");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_GearIcon() {
		try {
			applyWait.waitForElementToBeClickable(gearIcon, DefineConstants.explicitWait_30);
			javascriptClick.click(gearIcon);
			Screenshots.takeScreenshot(driver, "User clicked gear icon on SMS Dashboard");
			test.log(Status.INFO, "User clicked gear icon on SMS Dashboard");
			Log.info("User clicked gear icon on SMS Dashboard");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_WebAnalytics() {
		try {
			applyWait.waitForElementToBeClickable(webAnalytics, DefineConstants.explicitWait_30);
			javascriptClick.click(webAnalytics);
			Screenshots.takeScreenshot(driver, "User clicked Web Analytics on select dashboard widgets");
			test.log(Status.INFO, "User clicked Web Analytics on select dashboard widgets");
			Log.info("User clicked Web Analytics on select dashboard widgets");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_WebEngagement() {
		try {
			applyWait.waitForElementToBeClickable(webEngagement, DefineConstants.explicitWait_30);
			javascriptClick.click(webEngagement);
			Screenshots.takeScreenshot(driver, "User clicked Web Engagement on select dashboard widgets");
			test.log(Status.INFO, "User clicked Web Engagement on select dashboard widgets");
			Log.info("User clicked Web Engagement on select dashboard widgets");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Mail() {
		try {
			applyWait.waitForElementToBeClickable(mail, DefineConstants.explicitWait_30);
			javascriptClick.click(mail);
			Screenshots.takeScreenshot(driver, "User clicked mail on select dashboard widgets");
			test.log(Status.INFO, "User clicked mail on select dashboard widgets");
			Log.info("User clicked mail on select dashboard widgets");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_Reports() {
		try {
			applyWait.waitForElementToBeClickable(reports, DefineConstants.explicitWait_30);
			javascriptClick.click(reports);
			Screenshots.takeScreenshot(driver, "User clicked Reports in SMS section");
			test.log(Status.INFO, "User clicked Reports in SMS section");
			Log.info("User clicked Reports in SMS section");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SelectDashboardWidgets_Sms() {
		try {
			applyWait.waitForElementToBeClickable(Sms, DefineConstants.explicitWait_30);
			javascriptClick.click(Sms);
			Screenshots.takeScreenshot(driver, "User clicked Sms on select dashboard widgets");
			test.log(Status.INFO, "User clicked Sms on select dashboard widgets");
			Log.info("User clicked Sms on select dashboard widgets");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SelectDashboardWidgets_MobileAnalytics() {
		try {
			applyWait.waitForElementToBeClickable(mobileAnalytics, DefineConstants.explicitWait_30);
			javascriptClick.click(mobileAnalytics);
			Screenshots.takeScreenshot(driver, "User clicked mobile analytics on select dashboard widgets");
			test.log(Status.INFO, "User clicked mobile analytics on select dashboard widgets");
			Log.info("User clicked mobile analytics on select dashboard widgets");
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

	public void select_Checkbox(String clickCheckboxName) {
		try {
			webAnalyticsValue = driver.findElement(By.xpath("//label[contains(text(),'" + clickCheckboxName + "')]"));
			applyWait.waitForElementToBeClickable(webAnalyticsValue, DefineConstants.explicitWait_30);
			javascriptClick.click(webAnalyticsValue);
			Screenshots.takeScreenshot(driver, "User clicked " + clickCheckboxName + " on select dashboard widgets");
			test.log(Status.INFO, "User clicked " + clickCheckboxName + " on select dashboard widgets");
			Log.info("User clicked " + clickCheckboxName + " on select dashboard widgets");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_MobileAnalytics_Checkbox(String clickCheckboxName) {
		try {
			webAnalyticsValue = driver
					.findElement(By.xpath("//a[contains(text(),'Mobile Analytics')]//following::label[contains(text(),'"
							+ clickCheckboxName + "')]"));
			applyWait.waitForElementToBeClickable(webAnalyticsValue, DefineConstants.explicitWait_30);
			javascriptClick.click(webAnalyticsValue);
			Screenshots.takeScreenshot(driver, "User clicked " + clickCheckboxName + " on Mobile Analytics");
			test.log(Status.INFO, "User clicked " + clickCheckboxName + " on Mobile Analytics");
			Log.info("User clicked " + clickCheckboxName + " on Mobile Analytics");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SaveButton_SelectDashboardWidgets() {
		try {
			applyWait.waitForElementToBeClickable(saveButton_selectDashBoardWidgets, DefineConstants.explicitWait_30);
			javascriptClick.click(saveButton_selectDashBoardWidgets);
			Screenshots.takeScreenshot(driver, "User save button on Select Dashboard Widgets");
			test.log(Status.INFO, "User save button on Select Dashboard Widgets");
			Log.info("User save button on Select Dashboard Widgets");
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

	public void click_Manage() {
		try {
			applyWait.waitForElementToBeClickable(manage, DefineConstants.explicitWait_30);
			javascriptClick.click(manage);
			Screenshots.takeScreenshot(driver, "User clicked Manage in SMS");
			test.log(Status.INFO, "User clicked Manage in SMS");
			Log.info("User clicked Manage in SMS");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Campaigns() {
		try {
			applyWait.waitForElementToBeClickable(campaigns, DefineConstants.explicitWait_30);
			javascriptClick.click(campaigns);
			Screenshots.takeScreenshot(driver, "User clicked campaigns in SMS manage");
			test.log(Status.INFO, "User clicked campaigns in SMS manage");
			Log.info("User clicked campaigns in SMS manage");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_Templates() {
		try {
			applyWait.waitForElementToBeClickable(templates, DefineConstants.explicitWait_30);
			javascriptClick.click(templates);
			Screenshots.takeScreenshot(driver, "User clicked templates in SMS Manage Section");
			test.log(Status.INFO, "User clicked templates in SMS Manage Section");
			Log.info("User clicked templates in SMS Manage Section");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Draft() {
		try {
			applyWait.waitForElementToBeClickable(draft, DefineConstants.explicitWait_30);
			javascriptClick.click(draft);
			Screenshots.takeScreenshot(driver, "User clicked draft in manage campaigns");
			test.log(Status.INFO, "User clicked draft in manage campaigns");
			Log.info("User clicked draft in manage campaigns");
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

	public void click_CreateDraft_Button() {
		try {
			applyWait.waitForElementToBeClickable(createDraft_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(createDraft_Button);
			Screenshots.takeScreenshot(driver, "User clicked create draft button in manage campaigns");
			test.log(Status.INFO, "User clicked create draft button in manage campaigns");
			Log.info("User clicked create draft button in manage campaigns");
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
	
	
	public void click_ExportButton() {
		try {
			applyWait.waitForElementToBeClickable(exportButton, DefineConstants.explicitWait_30);
			javascriptClick.click(exportButton);
			Screenshots.takeScreenshot(driver, "User clicked Export Button in draft section of manage campaigns");
			test.log(Status.INFO, "User clicked Export Button in draft section of manage campaigns");
			Log.info("User clicked Export Button in draft section of manage campaigns");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_FileFormat(String input_FileFormat) {
		try {
			applyWait.waitForElementToBeClickable(fileFormat, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(fileFormat, input_FileFormat);
			Screenshots.takeScreenshot(driver, "User selected "+input_FileFormat+" as file format on Export Report pop up");
			test.log(Status.INFO, "User selected "+input_FileFormat+" as file format on Export Report pop up");
			Log.info("User selected "+input_FileFormat+" as file format on Export Report pop up");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void select_ExportDataBy(String input_ExportDataBy,String input_FromRange,String input_ToRange) {
		try {
			applyWait.waitForElementToBeClickable(exportDataBy, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(exportDataBy, input_ExportDataBy);
			Screenshots.takeScreenshot(driver, "User selected "+input_ExportDataBy+" as Export Data By on Export Report pop up");
			test.log(Status.INFO, "User selected "+input_ExportDataBy+" as Export Data By on Export Report pop up");
			Log.info("User selected "+input_ExportDataBy+" as Export Data By on Export Report pop up");
			
			if(input_ExportDataBy.equals("Input"))
			{
				//From
				applyWait.waitForElementToBeClickable(fromRange_ExportReport, DefineConstants.explicitWait_30).sendKeys(input_FromRange);
				Screenshots.takeScreenshot(driver, "User entered "+input_FromRange+" as from value for Export Data By on Export Report pop up");
				test.log(Status.INFO, "User entered "+input_FromRange+" as from value for Export Data By on Export Report pop up");
				Log.info("User entered "+input_FromRange+" as from value for Export Data By on Export Report pop up");
				//To
				applyWait.waitForElementToBeClickable(toRange_ExportReport, DefineConstants.explicitWait_30).sendKeys(input_ToRange);
				Screenshots.takeScreenshot(driver, "User entered "+input_ToRange+" as to value for Export Data By on Export Report pop up");
				test.log(Status.INFO, "User entered "+input_ToRange+" as to value for Export Data By on Export Report pop up");
				Log.info("User entered "+input_ToRange+" as to value for Export Data By on Export Report pop up");
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	
	public void click_DownloadButton_ExportReport() {
		try {
			applyWait.waitForElementToBeClickable(downloadButton_ExportReport, DefineConstants.explicitWait_30);
			javascriptClick.click(downloadButton_ExportReport);
			Screenshots.takeScreenshot(driver, "User clicked download button on Export Report popup");
			test.log(Status.INFO, "User clicked download button on Export Report popup");
			Log.info("User clicked download button on Export Report popup");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}