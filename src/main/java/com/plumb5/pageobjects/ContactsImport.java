package com.plumb5.pageobjects;

import java.io.IOException;

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

	public void click_DownloadSampleFile() {
		applyWait.waitForElementToBeClickable(downloadSampleFile, DefineConstants.explicitWait_30);
		javascript.click(downloadSampleFile);
		try {
			Screenshots.takeScreenshot(driver, "User clicked download sample file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked download sample file");
		Log.info("User clicked download sample file");
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

}
