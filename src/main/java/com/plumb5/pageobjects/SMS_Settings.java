package com.plumb5.pageobjects;

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

public class SMS_Settings {

	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;

	public SMS_Settings(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropDown = new DropDown(driver);
	}

	@FindBy(xpath = "//tbody[@id='ui_tbodySmsConfigurationDetails']")
	private WebElement webTable;

	@FindBy(xpath = "//button[contains(text(),'Add SSP')]")
	private WebElement add_SSP;

	@FindBy(xpath = "//button[contains(text(),'Select Provider')]")
	private WebElement select_Provider;

	@FindBy(xpath = "//input[@id='ui_ServiceProvider']")
	private WebElement providerName;

	private WebElement selectProviderName;

	@FindBy(xpath = "//a[contains(text(),'Promotional Settings')]")
	private WebElement promotionalSetting;

	@FindBy(xpath = "//a[contains(text(),'Transactional Settings')]")
	private WebElement transactionalSetting;

	@FindBy(xpath = "//input[@id='ui_GeneralConfigurationUrlProm']")
	private WebElement promotionalsetting_nameYourConfiguration;

	@FindBy(xpath = "//input[@id='ui_GeneralSenderNameProm']")
	private WebElement promotionalsetting_sendersName;

	@FindBy(xpath = "//input[@id='ui_GeneralUserNameProm']")
	private WebElement promotionalsetting_userName;

	@FindBy(xpath = "//input[@id='ui_GeneralPasswordProm']")
	private WebElement promotionalsetting_password;

	@FindBy(xpath = "//input[@id='ui_GeneralConfigurationUrlTrans']")
	private WebElement transactionalsetting_nameYourConfiguration;

	@FindBy(xpath = "//input[@id='ui_GeneralSenderNameTrans']")
	private WebElement transactionalsetting_sendersName;

	@FindBy(xpath = "//input[@id='ui_GeneralUserNameTrans']")
	private WebElement transactionalsetting_userName;

	@FindBy(xpath = "//input[@id='ui_GeneralPasswordTrans']")
	private WebElement transactionalsetting_password;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successfullMessage;

	// @FindBy(id = "ui_div_MasterSuccess")
	// private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	@FindBy(linkText = "Edit")
	private WebElement edit_Button;

	@FindBy(linkText = "Validate")
	private WebElement validate_Button;

	@FindBy(linkText = "Delete")
	private WebElement delete_Button;

	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement delete_ButtonPopUp;
	
	public void click_SelectProvider() {
		try {
			applyWait.waitForElementToBeClickable(select_Provider, DefineConstants.explicitWait_30);
			javascriptClick.click(select_Provider);
			Screenshots.takeScreenshot(driver, "User clicked select provider button");
			test.log(Status.INFO, "User clicked select provider button");
			Log.info("User clicked select provider button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Add_SSP() {
		try {
			applyWait.waitForElementToBeClickable(add_SSP, DefineConstants.explicitWait_30);
			javascriptClick.click(add_SSP);
			Screenshots.takeScreenshot(driver, "User clicked Add SSP button");
			test.log(Status.INFO, "User clicked Add SSP button");
			Log.info("User clicked Add SSP button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_ProviderName(String input_ProviderName) {
		try {
			applyWait.waitForElementToBeClickable(providerName, DefineConstants.explicitWait_30).clear();
			// providerName.sendKeys
			providerName.click();
			selectProviderName = driver.findElement(By.xpath("//div[contains(text(),'" + input_ProviderName + "')]"));
			selectProviderName.click();
			// javascriptClick.click(providerName);
			Screenshots.takeScreenshot(driver, "User clicked provider name");
			test.log(Status.INFO, "User clicked provider name");
			Log.info("User clicked provider name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_PromotionalSettings() {
		try {
			applyWait.waitForElementToBeClickable(promotionalSetting, DefineConstants.explicitWait_30);
			javascriptClick.click(promotionalSetting);
			Screenshots.takeScreenshot(driver, "User clicked Promotional Setting");
			test.log(Status.INFO, "User clicked Promotional Setting");
			Log.info("User clicked Promotional Setting");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_PromotionalNameYourConfiguration(String input_NameYourConfiguration) {
		try {
			applyWait.waitForElementToBeClickable(promotionalsetting_nameYourConfiguration,
					DefineConstants.explicitWait_30).clear();
			promotionalsetting_nameYourConfiguration.sendKeys(input_NameYourConfiguration);
			Screenshots.takeScreenshot(driver, "User entered promotional name your configuration");
			test.log(Status.INFO, "User entered promotional name your configuration as " + input_NameYourConfiguration);
			Log.info("User entered promotional name your configuration as " + input_NameYourConfiguration);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_PromotionalSendersName(String input_SendersName) {
		try {
			applyWait.waitForElementToBeClickable(promotionalsetting_sendersName, DefineConstants.explicitWait_30)
					.clear();
			promotionalsetting_sendersName.sendKeys(input_SendersName);
			Screenshots.takeScreenshot(driver, "User entered promotional senders name");
			test.log(Status.INFO, "User entered promotional senders name as " + input_SendersName);
			Log.info("User entered promotional senders name as " + input_SendersName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_PromotionalUserName(String input_UserName) {
		try {
			applyWait.waitForElementToBeClickable(promotionalsetting_userName, DefineConstants.explicitWait_30).clear();
			promotionalsetting_userName.sendKeys(input_UserName);
			Screenshots.takeScreenshot(driver, "User entered promotional user name");
			test.log(Status.INFO, "User entered promotional user name as " + input_UserName);
			Log.info("User entered promotional user name as " + input_UserName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_PromotionalPassword(String input_Password) {
		try {
			applyWait.waitForElementToBeClickable(promotionalsetting_password, DefineConstants.explicitWait_30).clear();
			promotionalsetting_password.sendKeys(input_Password);
			Screenshots.takeScreenshot(driver, "User entered promotional password");
			test.log(Status.INFO, "User entered promotional password as " + input_Password);
			Log.info("User entered promotional password as " + input_Password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_TransactionalSettings() {
		try {
			applyWait.waitForElementToBeClickable(transactionalSetting, DefineConstants.explicitWait_30);
			javascriptClick.click(transactionalSetting);
			Screenshots.takeScreenshot(driver, "User clicked transactional Setting");
			test.log(Status.INFO, "User clicked transactional Setting");
			Log.info("User clicked transactional Setting");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// transactional

	public void enter_TransactionalNameYourConfiguration(String input_NameYourConfiguration) {
		try {
			applyWait.waitForElementToBeClickable(transactionalsetting_nameYourConfiguration,
					DefineConstants.explicitWait_30).clear();
			transactionalsetting_nameYourConfiguration.sendKeys(input_NameYourConfiguration);
			Screenshots.takeScreenshot(driver, "User entered promotional name your configuration");
			test.log(Status.INFO, "User entered promotional name your configuration as " + input_NameYourConfiguration);
			Log.info("User entered promotional name your configuration as " + input_NameYourConfiguration);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_TransactionalSendersName(String input_SendersName) {
		try {
			applyWait.waitForElementToBeClickable(transactionalsetting_sendersName, DefineConstants.explicitWait_30)
					.clear();
			transactionalsetting_sendersName.sendKeys(input_SendersName);
			Screenshots.takeScreenshot(driver, "User entered promotional senders name");
			test.log(Status.INFO, "User entered promotional senders name as " + input_SendersName);
			Log.info("User entered promotional senders name as " + input_SendersName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_TransactionalUserName(String input_UserName) {
		try {
			applyWait.waitForElementToBeClickable(transactionalsetting_userName, DefineConstants.explicitWait_30)
					.clear();
			transactionalsetting_userName.sendKeys(input_UserName);
			Screenshots.takeScreenshot(driver, "User entered promotional user name");
			test.log(Status.INFO, "User entered promotional user name as " + input_UserName);
			Log.info("User entered promotional user name as " + input_UserName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_TransactionalPassword(String input_Password) {
		try {
			applyWait.waitForElementToBeClickable(transactionalsetting_password, DefineConstants.explicitWait_30)
					.clear();
			transactionalsetting_password.sendKeys(input_Password);
			Screenshots.takeScreenshot(driver, "User entered promotional password");
			test.log(Status.INFO, "User entered promotional password as " + input_Password);
			Log.info("User entered promotional password as " + input_Password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verify_SuccessMessage(String inputSuccessMessage) throws Exception {
		try {
			Thread.sleep(3000);
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

	public void verifyInputValue(String input_ProviderName) {
		try {
			String noSpace_InputProviderName = input_ProviderName.replaceAll("\\s", "");
			applyWait.waitForElementToBeClickable(webTable, DefineConstants.explicitWait_60);
			tableRows = webTable.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();
					if (cellText.contains(noSpace_InputProviderName)) {
						System.out.println("value is " + cellText);
						javascriptClick.highLighterMethod(tableColums.get(column));
						Assert.assertTrue(true, input_ProviderName + " is verified");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						Screenshots.takeScreenshot(driver, input_ProviderName + " is verified");
						test.log(Status.INFO, input_ProviderName + " is verified");
						Log.info(input_ProviderName + " is verified");
					} else if (cellText.equals("There is no data for this view")) {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_ProviderName + " is not found");
						test.log(Status.INFO, input_ProviderName + " is not found");
						Log.info(input_ProviderName + " is not found");
						Assert.assertTrue(false, input_ProviderName + " is not found");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectProviderToEdit(String input_ProviderName) {
		try {
			String noSpace_InputProviderName = input_ProviderName.replaceAll("\\s", "");
			applyWait.waitForElementToBeClickable(webTable, DefineConstants.explicitWait_60);
			tableRows = webTable.findElements(By.tagName("tr"));

			for (int row = 0; row < tableRows.size(); row++) {
				tableColums = tableRows.get(row).findElements(By.tagName("td"));
				for (int column = 0; column < tableColums.size(); column++) {
					String cellText = tableColums.get(column).getText();
					if (cellText.contains(noSpace_InputProviderName)) {
						System.out.println("value is " + cellText);
						javascriptClick.highLighterMethod(tableColums.get(column));
						applyWait.waitForElementToBeClickable(tableColums.get(3), DefineConstants.explicitWait_60)
								.click();
						Screenshots.takeScreenshot(driver, input_ProviderName + " is selected to edit");
						test.log(Status.INFO, input_ProviderName + " is selected to edit");
						Log.info(input_ProviderName + " is selected to edit");
					} else if (cellText.equals("There is no data for this view")) {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_ProviderName + " is not found");
						test.log(Status.INFO, input_ProviderName + " is not found");
						Log.info(input_ProviderName + " is not found");
						Assert.assertTrue(false, input_ProviderName + " is not found");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EditButton() {
		try {
			applyWait.waitForElementToBeClickable(edit_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(edit_Button);
			Screenshots.takeScreenshot(driver, "User clicked edit button for selected SSP");
			test.log(Status.INFO, "User clicked edit button for selected SSP");
			Log.info("User clicked edit button for selected SSP");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_ValidateButton() {
		try {
			applyWait.waitForElementToBeClickable(validate_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(validate_Button);
			Screenshots.takeScreenshot(driver, "User clicked validate button for selected SSP");
			test.log(Status.INFO, "User clicked validate button for selected SSP");
			Log.info("User clicked validate button for selected SSP");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_DeleteButton() {
		try {
			applyWait.waitForElementToBeClickable(delete_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(delete_Button);
			Screenshots.takeScreenshot(driver, "User clicked delete button for selected SSP");
			test.log(Status.INFO, "User clicked delete button for selected SSP");
			Log.info("User clicked delete button for selected SSP");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_DeleteButtonPopUp() {
		try {
			applyWait.waitForElementToBeClickable(delete_ButtonPopUp, DefineConstants.explicitWait_30);
			javascriptClick.click(delete_ButtonPopUp);
			Screenshots.takeScreenshot(driver, "User clicked delete confirm button for selected SSP");
			test.log(Status.INFO, "User clicked delete confirm button for selected SSP");
			Log.info("User clicked delete confirm button for selected SSP");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}