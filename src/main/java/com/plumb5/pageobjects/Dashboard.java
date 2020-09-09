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
	
	

	public void clickContacts() {
		applyWait.waitForElementToBeClickable(contacts, DefineConstants.explicitWait_30);
		javascriptClick.click(contacts);
		try {
			Screenshots.takeScreenshot(driver, "Contacts");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked on Contacts");
		Log.info("User clicked on Contacts");
	}
	
	public void click_Mail() {
		applyWait.waitForElementToBeClickable(mail, DefineConstants.explicitWait_30);
		javascriptClick.click(mail);
		try {
			Screenshots.takeScreenshot(driver, "User clicked mail");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked mail");
		Log.info("User clicked mail");
	}


}
