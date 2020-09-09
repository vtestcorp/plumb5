package com.plumb5.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.DefineConstants;
import helperMethods.JavascriptClick;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class Contacts {

	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;

	public Contacts(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
	}

	@FindBy(linkText = "Manage Contacts")
	private WebElement manageContacts;

	@FindBy(linkText = "Manage Group")
	private WebElement manageGroups;
	
	@FindBy(linkText = "Contact Import")
	private WebElement contactImport;

	@FindBy(xpath = "//span[contains(text(),'Download Sample file')]")
	private WebElement downloadSampleFile;
	

	public void clickManageContacts() {
		try {
			applyWait.waitForElementToBeClickable(manageContacts, DefineConstants.explicitWait_30);
			javascriptClick.click(manageContacts);
			Screenshots.takeScreenshot(driver, "Managed Contacts");
			test.log(Status.INFO, "User clicked on Manage Contacts");
			Log.info("User clicked on Managed Contacts");
			Thread.sleep(3000L);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickManageGroups() {
		applyWait.waitForElementToBeClickable(manageGroups, DefineConstants.explicitWait_30);
		javascriptClick.click(manageGroups);
		try {
			Screenshots.takeScreenshot(driver, "Managed Groups");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked on Managed Groups");
		Log.info("User clicked on Managed Groups");
	}
	
	public void clickContactImport() {
		applyWait.waitForElementToBeClickable(contactImport, DefineConstants.explicitWait_30);
		javascriptClick.click(contactImport);
		try {
			Screenshots.takeScreenshot(driver, "User clicked contact import");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked contact import");
		Log.info("User clicked contact import");
	}

	public void click_DownloadSampleFile() {
		applyWait.waitForElementToBeClickable(downloadSampleFile, DefineConstants.explicitWait_30);
		javascriptClick.click(downloadSampleFile);
		try {
			Screenshots.takeScreenshot(driver, "User clicked download sample file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked download sample file");
		Log.info("User clicked download sample file");
	}

}
