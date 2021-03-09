package com.plumb5.pageobjects;

import java.io.IOException;
import java.util.List;

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

public class Dashboard {

	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;

	public Dashboard(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
	}

	@FindBy(className = "sidebar-nav-link")
	private List<WebElement> sideBarElements;

	@FindBy(linkText = "Contacts")
	private WebElement contacts;

	@FindBy(linkText = "Mail")
	private WebElement mail;

	@FindBy(linkText = "SMS")
	private WebElement sms;
	
	@FindBy(linkText = "Mobile")
	private WebElement mobile;
	
	@FindBy(linkText = "Web")
	private WebElement web;
	
	@FindBy(xpath = "//span[contains(text(),'NewUI')]")
	private WebElement newUi;
	
	@FindBy(xpath = "//span[contains(text(),'NewUI')]//following::a[1]")
	private WebElement profile;
	
	@FindBy(xpath = "//span[contains(text(),'NewUI')]//following::a[4]")
	private WebElement manageUsers;
	
	@FindBy(xpath = "//span[contains(text(),'NewUI')]//following::a[3]")
	private WebElement preferences;
	
	@FindBy(linkText = "Settings")
	private WebElement settings;

	public void click_Profile() {
		try {
			applyWait.waitForElementToBeClickable(profile, DefineConstants.explicitWait_30);
			javascriptClick.click(profile);
			Screenshots.takeScreenshot(driver, "User clicked profile");
			test.log(Status.INFO, "User clicked profile");
			Log.info("User clicked profile");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void click_ManageUsers() {
		try {
			applyWait.waitForElementToBeClickable(manageUsers, DefineConstants.explicitWait_30);
			javascriptClick.click(manageUsers);
			Screenshots.takeScreenshot(driver, "User clicked Manage Users");
			test.log(Status.INFO, "User clicked Manage Users");
			Log.info("User clicked Manage Users");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void click_Preferences() {
		try {
			applyWait.waitForElementToBeClickable(preferences, DefineConstants.explicitWait_30);
			javascriptClick.click(preferences);
			Screenshots.takeScreenshot(driver, "User clicked Preferences");
			test.log(Status.INFO, "User clicked Preferences");
			Log.info("User clicked Preferences");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void click_NewUI() {
		try {
			applyWait.waitForElementToBeClickable(newUi, DefineConstants.explicitWait_30);
			javascriptClick.click(newUi);
			Screenshots.takeScreenshot(driver, "User clicked new UI");
			test.log(Status.INFO, "User clicked new UI");
			Log.info("User clicked new UI");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void clickContacts() {
		try {
			applyWait.waitForElementToBeClickable(contacts, DefineConstants.explicitWait_30);
			javascriptClick.click(contacts);
			Screenshots.takeScreenshot(driver, "Contacts");
			test.log(Status.INFO, "User clicked on Contacts");
			Log.info("User clicked on Contacts");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void click_Mail() {
		try {
			applyWait.waitForElementToBeClickable(mail, DefineConstants.explicitWait_30);
			javascriptClick.click(mail);
			Screenshots.takeScreenshot(driver, "User clicked mail");
			test.log(Status.INFO, "User clicked mail");
			Log.info("User clicked mail");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void click_SMS() {
		try {
			applyWait.waitForElementToBeClickable(sms, DefineConstants.explicitWait_30);
			javascriptClick.click(sms);
			Screenshots.takeScreenshot(driver, "User clicked SMS");
			test.log(Status.INFO, "User clicked SMS");
			Log.info("User clicked SMS");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void click_Mobile() {
		try {
			applyWait.waitForElementToBeClickable(mobile, DefineConstants.explicitWait_30);
			javascriptClick.click(mobile);
			Screenshots.takeScreenshot(driver, "User clicked Mobile Tab");
			test.log(Status.INFO, "User clicked Mobile Tab");
			Log.info("User clicked Mobile Tab");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void click_Web() {
		try {
			applyWait.waitForElementToBeClickable(web, DefineConstants.explicitWait_30);
			javascriptClick.click(web);
			Screenshots.takeScreenshot(driver, "User clicked Web");
			test.log(Status.INFO, "User clicked Web");
			Log.info("User clicked Web");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_SMS_Settings() {
		try {
			applyWait.waitForElementToBeClickable(settings, DefineConstants.explicitWait_30);
			javascriptClick.click(settings);
			Screenshots.takeScreenshot(driver, "User clicked SMS Settings");
			test.log(Status.INFO, "User clicked SMS Settings");
			Log.info("User clicked SMS Settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
