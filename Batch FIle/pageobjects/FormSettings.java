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
import helperMethods.Keyboard;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class FormSettings {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;

	public FormSettings(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropDown = new DropDown(driver);

	}

	@FindBy(xpath = "//button[contains(text(),'Add Resources')]")
	private WebElement addResources;

	@FindBy(xpath = "//input[@id='frmsettupldresfile']")
	private WebElement uploadSourceFile;

	@FindBy(xpath = "//label[contains(text(),'Resource URL')]//following::input[1]")
	private WebElement resourceUrl;
		
	@FindBy(xpath = "//label[contains(text(),'Resource Description')]//following::textarea[1]")
	private WebElement resourceDescription;

	@FindBy(xpath = "//label[contains(text(),'Resource Type')]//following::select[1]")
	private WebElement resourceType;
	
	@FindBy(xpath = "//button[@id='ui_btn_SaveFormResorces']")
	private WebElement saveButton;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successfullMessage;

	// @FindBy(id = "ui_div_MasterSuccess")
	// private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;
	
	private WebElement selectResourcesSource,resource;

	@FindBy(id = "ui_tableReport")
	private WebElement configurationTable;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	@FindBy(linkText = "Edit")
	private WebElement edit_Button;
	
	@FindBy(linkText = "Change Status")
	private WebElement changeStatus;
	
	@FindBy(linkText = "Delete")
	private WebElement delete;
	
	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement delete_ButtonPopUp;
	
	public void click_AddResources() {
		try {
			applyWait.waitForElementToBeClickable(addResources, DefineConstants.explicitWait_30);
			javascriptClick.click(addResources);
			Screenshots.takeScreenshot(driver, "User clicked add resources in form settings");
			test.log(Status.INFO, "User clicked add resources in form settings");
			Log.info("User clicked add resources in form settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_UploadSourceFile() {
		try {
			applyWait.waitForElementToBeClickable(uploadSourceFile, DefineConstants.explicitWait_30).click();
			// javascriptClick.click(uploadSourceFile);
			Screenshots.takeScreenshot(driver, "User clicked upload source source file");
			test.log(Status.INFO, "User clicked upload source source file");
			Log.info("User clicked upload source source file");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_ResourcesSource(String input_ResourcesSource, String filePath, String Url) {
		try {

			if (input_ResourcesSource.equalsIgnoreCase("URL")) {
				applyWait.waitForElementToBeClickable(resourceUrl, DefineConstants.explicitWait_30);
				resourceUrl.clear();
				resourceUrl.sendKeys(Url);
				Screenshots.takeScreenshot(driver, "User entered " + Url + " as Resources Url");
				test.log(Status.INFO, "User entered " + Url + " as Resources Url");
				Log.info("User entered " + Url + " as Resources Url");
			}

			if (input_ResourcesSource.equalsIgnoreCase("Upload")) {
				addResources = driver.findElement(By.xpath("//label[text()='" + input_ResourcesSource + "']"));
				addResources.click();
				Screenshots.takeScreenshot(driver, "User selected " + input_ResourcesSource + " for Resources Source");
				test.log(Status.INFO, "User selected " + input_ResourcesSource + " for Resources Source");
				Log.info("User selected " + input_ResourcesSource + " for Resources Source");
				Keyboard.pressTab();
				Keyboard.pressTab();
				Keyboard.pressEnter();
				Thread.sleep(1000);
				Keyboard.uploadFileWithRobot(DefineConstants.PROJECT_PATH + "\\" + filePath);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void uploadFile(String filePath) {
		try {
			Keyboard.uploadFileWithRobot(DefineConstants.PROJECT_PATH + "\\" + filePath);
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_ResourcesDescription(String input_ResourcesDescription) {
		try {
			applyWait.waitForElementToBeClickable(resourceDescription, DefineConstants.explicitWait_30).clear();
			resourceDescription.sendKeys(input_ResourcesDescription);
			Screenshots.takeScreenshot(driver, "User entered "+input_ResourcesDescription+ " as resource description");
			test.log(Status.INFO, "User entered "+input_ResourcesDescription+ " as resource description");
			Log.info("User entered "+input_ResourcesDescription+ " as resource description");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_ResourcesType(String input_ResourcesType) {
		try {
			applyWait.waitForElementToBeClickable(resourceType, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(resourceType, input_ResourcesType);
			Screenshots.takeScreenshot(driver, "User selected "+input_ResourcesType+ " as resource tyep");
			test.log(Status.INFO, "User selected "+input_ResourcesType+ " as resource tyep");
			Log.info("User selected "+input_ResourcesType+ " as resource tyep");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_SaveButton() {
		try {
			applyWait.waitForElementToBeClickable(saveButton, DefineConstants.explicitWait_30).click();
			// javascriptClick.click(uploadSourceFile);
			Screenshots.takeScreenshot(driver, "User clicked save button");
			test.log(Status.INFO, "User clicked save button");
			Log.info("User clicked save button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verify_SuccessMessage(String inputSuccessMessage) {
		try {
			if (successfullMessage.isDisplayed()) {
				String successMessage = successfullMessage.getText();
				if (successMessage.equals(inputSuccessMessage)) {
					System.out.println("Message is " + successMessage);
					test.log(Status.INFO, "Message is " + successMessage);
					Log.info("Message is " + successMessage);
					Screenshots.takeScreenshot(driver, inputSuccessMessage + " is verified");
					System.out.println(inputSuccessMessage + " is verified");
					test.log(Status.INFO, inputSuccessMessage + " is verified");
					Log.info(inputSuccessMessage + " is verified");
				}
			} else if (errorMessage.isDisplayed()) {
				String error_Message = errorMessage.getText();
				Screenshots.takeScreenshot(driver, error_Message + " is displayed");
				System.out.println(error_Message + " is displayed");
				test.log(Status.INFO, error_Message + "  is displayed");
				Log.info(error_Message + "  is displayed");
				Assert.assertEquals(inputSuccessMessage, error_Message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void verifyInputValue(String input_LinkType) {

		applyWait.waitforPresenceOfElementLocated(configurationTable, DefineConstants.explicitWait_60);
		tableRows = configurationTable.findElements(By.tagName("tr"));
		System.out.println("value is " + input_LinkType);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.contains(input_LinkType)) {
					System.out.println("value is: " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, input_LinkType + " is verified");
						test.log(Status.INFO, input_LinkType + " is verified");
						Log.info(input_LinkType + " is verified");
						Assert.assertTrue(true, input_LinkType + " is verified");

					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				else if (cellText.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_LinkType + " is not found");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						System.out.println("value is " + cellText);
						test.log(Status.INFO, input_LinkType + " is not found");
						Log.info(input_LinkType + " is not found");
						Assert.assertTrue(false, input_LinkType + " is not found");
					} catch (IOException e) {
						e.printStackTrace();
					}

				}
			}
		}
	}
	
	public void select_ResourceToEdit(String input_Resource) {
		try {
			resource = driver.findElement(By.xpath("//*[text()='" + input_Resource + "']//following::i[1]"));
			resource.click();
			Screenshots.takeScreenshot(driver, input_Resource + " is selected");
			test.log(Status.INFO, input_Resource + " is selected");
			Log.info(input_Resource + " is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void click_EditButton() {
		try {
			applyWait.waitForElementToBeClickable(edit_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(edit_Button);
			Screenshots.takeScreenshot(driver, "User clicked edit button for selected campaign");
			test.log(Status.INFO, "User clicked edit button for selected campaign");
			Log.info("User clicked edit button for selected campaign");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_ChangeStatus() {
		try {
			applyWait.waitForElementToBeClickable(changeStatus, DefineConstants.explicitWait_30);
			javascriptClick.click(changeStatus);
			Screenshots.takeScreenshot(driver, "User clicked Change Status button for selected resources");
			test.log(Status.INFO, "User clicked Change Status button for selected resources");
			Log.info("User clicked Change Status button for selected resources");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_DeleteButton() {
		try {
			applyWait.waitForElementToBeClickable(delete, DefineConstants.explicitWait_30);
			javascriptClick.click(delete);
			Screenshots.takeScreenshot(driver, "User clicked delete button for selected resources");
			test.log(Status.INFO, "User clicked delete button for selected resources");
			Log.info("User clicked delete button for selected resources");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_Delete_PopUp() {
		try {
			applyWait.waitForElementToBeClickable(delete_ButtonPopUp, DefineConstants.explicitWait_30);
			javascriptClick.click(delete_ButtonPopUp);
			Screenshots.takeScreenshot(driver, "User clicked delete button on delete this draft popup");
			test.log(Status.INFO, "User clicked delete button on delete this draft popup");
			Log.info("User clicked delete button on delete this draft popup");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}