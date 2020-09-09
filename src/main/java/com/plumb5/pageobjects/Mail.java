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

	@FindBy(linkText = "Manage")
	private WebElement manage;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaigns;
	
	
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
	
}
