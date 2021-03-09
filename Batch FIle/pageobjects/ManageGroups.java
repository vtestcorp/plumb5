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

public class ManageGroups {

	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private DropDown dropDown;
	private JavascriptClick javascriptclick;

	public ManageGroups(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		this.dropDown = new DropDown(driver);
		this.javascriptclick = new JavascriptClick(driver);
	}

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm creategroupbtn-pop']")
	private WebElement createGroup;

	@FindBy(linkText = "Edit")
	private WebElement editButton;

	@FindBy(linkText = "Duplicate")
	private WebElement Duplicate;

	@FindBy(linkText = "Validate")
	private WebElement Validate;

	@FindBy(linkText = "Exclusive Contact List")
	private WebElement exclusiveContactList;

	@FindBy(xpath = "//input[@id='ui_txtSearchBy']")
	private WebElement searchGroup;

	@FindBy(linkText = "Delete")
	private WebElement deleteButton;

	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement deleteButtonPopUp;

	@FindBy(id = "ui_tblReportData")
	private WebElement contactsTable;

	@FindBy(xpath = "//input[@id='ui_txtSearchBy']//following::i[1]")
	private WebElement exportReportButton;

	private WebElement editGroup;

	public void clickCreateGroups() {
		applyWait.waitForElementToBeClickable(createGroup, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "User opened popup to edit the selected groupn");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User opened popup to edit the selected groupn");
		Log.info("User opened popup to edit the selected groupn");
	}

	public void selectGroupToEdit(String groupName) {
		applyWait.waitForElementToBeClickable(contactsTable, DefineConstants.explicitWait_60);
		tableRows = contactsTable.findElements(By.tagName("tr"));

		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				if (cellText.equals(groupName)) {
					System.out.println("value is " + cellText);
					javascriptclick.highLighterMethod(tableColums.get(column));
					editGroup = driver.findElement(By.xpath("//span[text()='" + groupName + "']//following::i[1]"));
					editGroup.click();
					Assert.assertTrue(true, groupName + " is present");
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, groupName + " is present");
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(groupName + " is present");
					test.log(Status.INFO, groupName + " is present");
					Log.info(groupName + " is present");
				}

				else if (cellText.equals("There is no data for this view")) {
					try {
						javascriptclick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, groupName + " is not found");
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(groupName + " is not found");
					test.log(Status.INFO, groupName + " is not found");
					Log.info(groupName + " is not found");
					Assert.assertTrue(false, groupName + " is not found");
				}
			}
		}
	}

	public void searchGroup(String groupName) {
		try {
			applyWait.waitForElementToBeClickable(searchGroup, DefineConstants.explicitWait_30).clear();
			searchGroup.sendKeys(groupName);
			searchGroup.sendKeys(Keys.ENTER);
			Thread.sleep(3000L);
			Screenshots.takeScreenshot(driver, groupName + " is searched");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, groupName + " is searched");
		Log.info(groupName + " is searched");
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

		applyWait.waitForElementToBeClickable(Duplicate, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "User clicked Duplicate button");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked Duplicate button");
		Log.info("User clicked Duplicate button");
	}

	public void selectValidateOption() {
		try {
			applyWait.waitForElementToBeClickable(Validate, DefineConstants.explicitWait_30);
			javascriptclick.highLighterMethod(Validate);
			Thread.sleep(3000);
			Validate.click();
			Screenshots.takeScreenshot(driver, "User clicked Validate button");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked Validate button");
		Log.info("User clicked Validate button");
	}

	public void selectExclusiveContactListOption() {
		try {
			applyWait.waitForElementToBeClickable(exclusiveContactList, DefineConstants.explicitWait_30);
			javascriptclick.highLighterMethod(exclusiveContactList);
			Thread.sleep(3000);
			exclusiveContactList.click();
			Thread.sleep(3000);
			Screenshots.takeScreenshot(driver, "User clicked exclusive contact list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked exclusive contact list");
		Log.info("User clicked exclusive contact list");
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

	public void clickExportReportButton() {

		applyWait.waitForElementToBeClickable(exportReportButton, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Export Report Button is clicked");

		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Export Report Button is clicked");
		Log.info("Export Report Button is clicked");
	}

	public void verifyInputValue(String inputEmailAddress) {
		applyWait.waitForElementToBeClickable(contactsTable, DefineConstants.explicitWait_60);
		tableRows = contactsTable.findElements(By.tagName("tr"));

		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				if (cellText.equals(inputEmailAddress)) {
					System.out.println("value is " + cellText);
					javascriptclick.highLighterMethod(tableColums.get(column));
					Assert.assertTrue(true, inputEmailAddress + " is verified");
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, inputEmailAddress + " is verified");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, inputEmailAddress + " is verified");
					Log.info(inputEmailAddress + " is verified");
				}

				else if (cellText.equals("There is no data for this view")) {
					try {
						javascriptclick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, inputEmailAddress + " is not found");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, inputEmailAddress + " is not found");
					Log.info(inputEmailAddress + " is not found");
					Assert.assertTrue(false, inputEmailAddress + " is not found");
				}
			}
		}
	}
}
