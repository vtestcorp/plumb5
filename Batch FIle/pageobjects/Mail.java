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

public class Mail {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;

	public Mail(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
	}

	@FindBy(linkText = "Settings")
	private WebElement settings;
	
	@FindBy(linkText = "Reports")
	private WebElement reports;
	
	@FindBy(xpath = "//a[@href='/Mail/MailDashboard']")
	private WebElement dashboard;
	
	@FindBy(linkText = "Manage")
	private WebElement manage;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaigns;

	@FindBy(linkText = "Templates")
	private WebElement templates;
	
	public void clickManage() {
		try {
			applyWait.waitForElementToBeClickable(manage, DefineConstants.explicitWait_30);
			javascriptClick.click(manage);
			Screenshots.takeScreenshot(driver, "Mail Manage");
			test.log(Status.INFO, "Mail Manage");
			Log.info("User clicked Mail Manage");
			Thread.sleep(3000L);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void click_Settings() {
		try {
			applyWait.waitForElementToBeClickable(settings, DefineConstants.explicitWait_30);
			javascriptClick.click(settings);
			Screenshots.takeScreenshot(driver, "User clicked settings");
			test.log(Status.INFO, "User clicked settings");
			Log.info("User clicked settings");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void click_Reports() {
		try {
			applyWait.waitForElementToBeClickable(reports, DefineConstants.explicitWait_30);
			javascriptClick.click(reports);
			Screenshots.takeScreenshot(driver, "User clicked reports");
			test.log(Status.INFO, "User clicked reports");
			Log.info("User clicked reports");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void click_Dashboard() {
		try {
			applyWait.waitForElementToBeClickable(dashboard, DefineConstants.explicitWait_30);
			javascriptClick.click(dashboard);
			Screenshots.takeScreenshot(driver, "User clicked dashboard");
			test.log(Status.INFO, "User clicked dashboard");
			Log.info("User clicked dashboard");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void click_Campaigns() {
		try {
			applyWait.waitForElementToBeClickable(campaigns, DefineConstants.explicitWait_30);
			javascriptClick.click(campaigns);
			Screenshots.takeScreenshot(driver, "User clicked campaigns");
			test.log(Status.INFO, "User clicked campaigns");
			Log.info("User clicked campaigns");
			Thread.sleep(3000L);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void click_Templates() {
		try {
			applyWait.waitForElementToBeClickable(templates, DefineConstants.explicitWait_30);
			javascriptClick.click(templates);
			Screenshots.takeScreenshot(driver, "User clicked templates");
			test.log(Status.INFO, "User clicked templates");
			Log.info("User clicked templates");
			Thread.sleep(3000L);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
