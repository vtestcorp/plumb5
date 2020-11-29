package com.plumb5.pageobjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
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

public class Preferences {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropdown;

	public Preferences(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropdown= new DropDown(driver);
	}

	//IP Restrictions
	
	@FindBy(xpath = "//select[@id='ddlAccount']")
	private WebElement selectAccount;
	
	@FindBy(xpath = "//label[contains(text(),'Exclude traffic from')]//following::textarea[1]")
	private WebElement ip_ExcludeTrafficFrom;
	
	@FindBy(xpath = "//label[contains(text(),'Exclude traffic from')]//following::textarea[2]")
	private WebElement subdirectory_ExcludeTrafficFrom;
	
	@FindBy(xpath = "//label[contains(text(),'Exclude traffic from')]//following::textarea[3]")
	private WebElement city_ExcludeTrafficFrom;
	
	@FindBy(xpath = "//label[contains(text(),'Exclude traffic from')]//following::textarea[4]")
	private WebElement country_ExcludeTrafficFrom;

	@FindBy(xpath = "//label[contains(text(),'Include traffic from the Ip/Subdirectory/City/Country')]//following::textarea[1]")
	private WebElement ip_IncludeTrafficFrom;
	
	@FindBy(xpath = "//label[contains(text(),'Include traffic from the Ip/Subdirectory/City/Country')]//following::textarea[2]")
	private WebElement subdirectory_IncludeTrafficFrom;
	
	@FindBy(xpath = "//label[contains(text(),'Include traffic from the Ip/Subdirectory/City/Country')]//following::textarea[3]")
	private WebElement city_IncludeTrafficFrom;
	
	@FindBy(xpath = "//label[contains(text(),'Include traffic from the Ip/Subdirectory/City/Country')]//following::textarea[4]")
	private WebElement country_IncludeTrafficFrom;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement save_Button;
	
	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;
	
	// Campaign Identifier
	@FindBy(xpath = "//div[contains(text(),'Campaign Identifier')]")
	private WebElement campaignIdentifier;
	
	@FindBy(xpath = "//div[contains(text(),'Integration Status')]")
	private WebElement integrationStatus;

	@FindBy(xpath = "//div[contains(text(),'Channel Credits')]")
	private WebElement channelCredits;
	
	@FindBy(xpath = "//a[contains(text(),'Create Campaign Identifier')]")
	private WebElement createCampaignIdentifier;
	
	@FindBy(xpath = "//label[contains(text(),'Campaign Name')]//following::input[1]")
	private WebElement campaignName;
	
	@FindBy(xpath = "//label[contains(text(),'Campaign Description')]//following::textarea[1]")
	private WebElement campaignDescription;
	
	@FindBy(xpath = "//button[@id='ui_btnAdd']")
	private WebElement createCampaign_Button;
	
	@FindBy(xpath = "//table[@id='ui_tblReportData']")
	private WebElement campaignTable;
	
	private List<WebElement> tableRows;

	private List<WebElement> tableColums;
	
	public void select_Account(String input_Account) {
		try {
			applyWait.waitForElementToBeClickable(selectAccount, DefineConstants.explicitWait_30);
			dropdown.selectByVisibleText(selectAccount, input_Account);
			Screenshots.takeScreenshot(driver, "User selected "+input_Account+ " as Account");
			test.log(Status.INFO, "User selected "+input_Account+ " as Account");
			Log.info("User selected "+input_Account+ " as Account");
//			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void enter_IP_ExcludeTrafficFrom(String input_IP_ExcludeTrafficFrom) {
		try {
			applyWait.waitForElementToBeClickable(ip_ExcludeTrafficFrom, DefineConstants.explicitWait_30).clear();
			ip_ExcludeTrafficFrom.sendKeys(input_IP_ExcludeTrafficFrom);			
			Screenshots.takeScreenshot(driver, "User entered IP for Exclude Traffic From");
			test.log(Status.INFO, "User entered "+input_IP_ExcludeTrafficFrom+ " as IP for Exclude Traffic From");
			Log.info("User entered "+input_IP_ExcludeTrafficFrom+ " as IP for Exclude Traffic From");
//			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_Subdirectory_ExcludeTrafficFrom(String input_Subdirectory_ExcludeTrafficFrom) {
		try {
			applyWait.waitForElementToBeClickable(subdirectory_ExcludeTrafficFrom, DefineConstants.explicitWait_30).clear();
			subdirectory_ExcludeTrafficFrom.sendKeys(input_Subdirectory_ExcludeTrafficFrom);			
			Screenshots.takeScreenshot(driver, "User entered "+input_Subdirectory_ExcludeTrafficFrom+ " as Subdirectory for Exclude Traffic From");
			test.log(Status.INFO, "User entered "+input_Subdirectory_ExcludeTrafficFrom+ " as Subdirectory for Exclude Traffic From");
			Log.info("User entered "+input_Subdirectory_ExcludeTrafficFrom+ " as Subdirectory for Exclude Traffic From");
//			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_City_ExcludeTrafficFrom(String input_City_ExcludeTrafficFrom) {
		try {
			applyWait.waitForElementToBeClickable(city_ExcludeTrafficFrom, DefineConstants.explicitWait_30).clear();
			city_ExcludeTrafficFrom.sendKeys(input_City_ExcludeTrafficFrom);			
			Screenshots.takeScreenshot(driver, "User entered "+input_City_ExcludeTrafficFrom+ " as City for Exclude Traffic From");
			test.log(Status.INFO, "User entered "+input_City_ExcludeTrafficFrom+ " as City for Exclude Traffic From");
			Log.info("User entered "+input_City_ExcludeTrafficFrom+ " as City for Exclude Traffic From");
//			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_Country_ExcludeTrafficFrom(String input_Country_ExcludeTrafficFrom) {
		try {
			applyWait.waitForElementToBeClickable(country_ExcludeTrafficFrom, DefineConstants.explicitWait_30).clear();
			country_ExcludeTrafficFrom.sendKeys(input_Country_ExcludeTrafficFrom);			
			Screenshots.takeScreenshot(driver, "User entered "+input_Country_ExcludeTrafficFrom+ " as Country for Exclude Traffic From");
			test.log(Status.INFO, "User entered "+input_Country_ExcludeTrafficFrom+ " as Country for Exclude Traffic From");
			Log.info("User entered "+input_Country_ExcludeTrafficFrom+ " as Country for Exclude Traffic From");
//			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_IP_IncludeTrafficFrom(String input_IP_IncludeTrafficFrom) {
		try {
			applyWait.waitForElementToBeClickable(ip_IncludeTrafficFrom, DefineConstants.explicitWait_30).clear();
			ip_IncludeTrafficFrom.sendKeys(input_IP_IncludeTrafficFrom);			
			Screenshots.takeScreenshot(driver, "User entered IP for Include Traffic From");
			test.log(Status.INFO, "User entered "+input_IP_IncludeTrafficFrom+ " as IP for Include Traffic From");
			Log.info("User entered "+input_IP_IncludeTrafficFrom+ " as IP for Include Traffic From");
//			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_Subdirectory_IncludeTrafficFrom(String input_Subdirectory_IncludeTrafficFrom) {
		try {
			applyWait.waitForElementToBeClickable(subdirectory_IncludeTrafficFrom, DefineConstants.explicitWait_30).clear();
			subdirectory_IncludeTrafficFrom.sendKeys(input_Subdirectory_IncludeTrafficFrom);			
			Screenshots.takeScreenshot(driver, "User entered "+input_Subdirectory_IncludeTrafficFrom+ " as Subdirectory for Include Traffic From");
			test.log(Status.INFO, "User entered "+input_Subdirectory_IncludeTrafficFrom+ " as Subdirectory for Include Traffic From");
			Log.info("User entered "+input_Subdirectory_IncludeTrafficFrom+ " as Subdirectory for Include Traffic From");
//			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_City_IncludeTrafficFrom(String input_City_IncludeTrafficFrom) {
		try {
			applyWait.waitForElementToBeClickable(city_IncludeTrafficFrom, DefineConstants.explicitWait_30).clear();
			city_IncludeTrafficFrom.sendKeys(input_City_IncludeTrafficFrom);			
			Screenshots.takeScreenshot(driver, "User entered "+input_City_IncludeTrafficFrom+ " as City for Include Traffic From");
			test.log(Status.INFO, "User entered "+input_City_IncludeTrafficFrom+ " as City for Include Traffic From");
			Log.info("User entered "+input_City_IncludeTrafficFrom+ " as City for Include Traffic From");
//			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_Country_IncludeTrafficFrom(String input_Country_IncludeTrafficFrom) {
		try {
			applyWait.waitForElementToBeClickable(country_IncludeTrafficFrom, DefineConstants.explicitWait_30).clear();
			country_IncludeTrafficFrom.sendKeys(input_Country_IncludeTrafficFrom);			
			Screenshots.takeScreenshot(driver, "User entered "+input_Country_IncludeTrafficFrom+ " as Country for Include Traffic From");
			test.log(Status.INFO, "User entered "+input_Country_IncludeTrafficFrom+ " as Country for Include Traffic From");
			Log.info("User entered "+input_Country_IncludeTrafficFrom+ " as Country for Include Traffic From");
//			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SaveButton() {
		try {
			applyWait.waitForElementToBeClickable(save_Button, DefineConstants.explicitWait_30).click();						
			Screenshots.takeScreenshot(driver, "User clicked save button");
			test.log(Status.INFO, "User clicked save button");
			Log.info("User clicked save button");
//			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
				Assert.assertEquals(successMessage, errorMessage.getText());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void click_CampaignIdentifier() {
		try {
			applyWait.waitForElementToBeClickable(campaignIdentifier, DefineConstants.explicitWait_30).click();						
			Screenshots.takeScreenshot(driver, "User clicked Campaign Identifier");
			test.log(Status.INFO, "User clicked Campaign Identifier");
			Log.info("User clicked Campaign Identifier");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_IntegrationStatus() {
		try {
			applyWait.waitForElementToBeClickable(integrationStatus, DefineConstants.explicitWait_30).click();						
			Screenshots.takeScreenshot(driver, "User clicked Integration Status");
			test.log(Status.INFO, "User clicked Integration Status");
			Log.info("User clicked Integration Status");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_ChannelCredits() {
		try {
			applyWait.waitForElementToBeClickable(channelCredits, DefineConstants.explicitWait_30).click();						
			Screenshots.takeScreenshot(driver, "User clicked Channel Credits");
			test.log(Status.INFO, "User clicked Channel Credits");
			Log.info("User clicked Channel Credits");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_CreateCampaignIdentifier() {
		try {
			applyWait.waitForElementToBeClickable(createCampaignIdentifier, DefineConstants.explicitWait_30).click();						
			Screenshots.takeScreenshot(driver, "User clicked Create Campaign Identifier");
			test.log(Status.INFO, "User clicked Create Campaign Identifier");
			Log.info("User clicked Create Campaign Identifier");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_CampaignName(String input_CampaignName) {
		try {
			applyWait.waitForElementToBeClickable(campaignName, DefineConstants.explicitWait_30).sendKeys(input_CampaignName);						
			Screenshots.takeScreenshot(driver, "User entered "+input_CampaignName+ " as Campaign Name");
			test.log(Status.INFO, "User entered "+input_CampaignName+ " as Campaign Name");
			Log.info("User entered "+input_CampaignName+ " as Campaign Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_CampaignDescription(String input_CampaignDescription) {
		try {
			applyWait.waitForElementToBeClickable(campaignDescription, DefineConstants.explicitWait_30).sendKeys(input_CampaignDescription);						
			Screenshots.takeScreenshot(driver, "User entered "+input_CampaignDescription+ " as Campaign Description");
			test.log(Status.INFO, "User entered "+input_CampaignDescription+ " as Campaign Description");
			Log.info("User entered "+input_CampaignDescription+ " as Campaign Description");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_CreateCampaign() {
		try {
			applyWait.waitForElementToBeClickable(createCampaign_Button, DefineConstants.explicitWait_30).click();						
			Screenshots.takeScreenshot(driver, "User clicked Create Campaign Button");
			test.log(Status.INFO, "User clicked Create Campaign Button");
			Log.info("User clicked Create Campaign Button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyInputValue(String campaignName) {
		applyWait.waitForElementToBeClickable(campaignTable, DefineConstants.explicitWait_60);
		tableRows = campaignTable.findElements(By.tagName("tr"));
		System.out.println("value is " + campaignName);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.equals(campaignName)) {					
					System.out.println("value is: " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, campaignName + " is verified");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, campaignName + " is verified");
					Log.info(campaignName + " is verified");
					Assert.assertTrue(true, campaignName + " is verified");
				}

				else if (cellText.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, campaignName + " is not found");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						System.out.println("value is " + cellText);
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, campaignName + " is not found");
					Log.info(campaignName + " is not found");
					Assert.assertTrue(false, campaignName + " is not found");
				}
			}
		}
	}

}
