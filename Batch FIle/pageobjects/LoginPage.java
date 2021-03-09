package com.plumb5.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class LoginPage {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;

	public LoginPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
	}

	@FindBy(xpath = "//input[@id='EmailId']")
	private WebElement emailID;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@id='ui_btnLogin']")
	private WebElement signInBtn;

	public void enterEmail(String inputEmailID) {
		applyWait.waitForElementToBeClickable(emailID, 30).sendKeys(inputEmailID);
		try {
			Screenshots.takeScreenshot(driver, "User enter email address");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered user email id");
	}

	public void enterPassword(String inputPassword) {
		applyWait.waitForElementToBeClickable(password, 30).sendKeys(inputPassword);
		try {
			Screenshots.takeScreenshot(driver, "User enter password");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered Password");
	}

	public void clickSignInButton() {
		applyWait.waitForElementToBeClickable(signInBtn, 30).click();
		try {
			Screenshots.takeScreenshot(driver, "User enter sign button");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User enter sign button");
	}

}
