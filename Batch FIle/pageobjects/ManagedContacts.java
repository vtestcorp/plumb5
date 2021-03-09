package com.plumb5.pageobjects;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class ManagedContacts {

	private List<String> contactDetailsList;
	private List<WebElement> contactDetailsListElements;
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private DropDown dropDown;
	private JavascriptClick javascript;
	private Screenshots screenshots;
	private String oldEmail;
	private String oldPhoneNumber;
	private String newEmail;
	private String newPhoneNumber;

	public ManagedContacts(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		this.dropDown = new DropDown(driver);
		javascript = new JavascriptClick(driver);
		screenshots = new Screenshots(driver);
		contactDetailsList = new ArrayList<String>();
		contactDetailsListElements = new ArrayList<WebElement>();
	}

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm createbtn-pop']")
	private WebElement createContact;

	@FindBy(xpath = "//button[@id='dropdownMenuButton']")
	private WebElement action;

	@FindBy(linkText = "Add remove group")
	private WebElement addRemoveGroup;

	@FindBy(linkText = "Unsubcribe")
	private WebElement unsubcribe;

	@FindBy(linkText = "Invalidate")
	private WebElement invalidate;

	@FindBy(xpath = "//select[@id='addgroupoperation']")
	private WebElement addRemoveGroupDropdownValue;

	@FindBy(xpath = "//button[contains(text(),'Save Changes')]")
	private WebElement saveChangesButton;

	@FindBy(xpath = "//button[contains(text(),'Invalidate')]")
	private WebElement invalidateButtonPopUp;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement invalidatedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement unsubscribeSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement addedToGroupSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(xpath = "//button[@id='unsubconts']")
	private WebElement unsubcribeButtonPopUp;

	@FindBy(xpath = "//label[@class='custom-control-label'][contains(text(),'Email')]")
	private WebElement popUpEmailCheckbox;

	@FindBy(xpath = "//label[contains(text(),'SMS')]")
	private WebElement popUpSMSCheckbox;

	@FindBy(xpath = "//input[@id='e_input']//following::i[3]")
	private WebElement exportReportButton;

	@FindBy(xpath = "//div[@id='downloadModal']//div[@class='modal-content']//div[1]//select[1]")
	private WebElement fileFormat;

	@FindBy(xpath = "//select[@id='exportType']")
	private WebElement exportDataBy;

	@FindBy(xpath = "//button[@id='ui_btnDataExport']")
	private WebElement downloadButtonPopUp;

	// input[@placeholder='Search']
	@FindBy(xpath = "//input[@id='e_input']")
	private WebElement searchContact;

	@FindBy(xpath = "//input[@id='e_input']//following::i[2]")
	private WebElement filterBy_Button;

	@FindBy(xpath = "//a[contains(text(),'Email Id')]")
	private WebElement filterBy_EmailIDOption;

	@FindBy(xpath = "//a[contains(text(),'Phone Number')]")
	private WebElement filterBy_PhoneNumber;

	@FindBy(xpath = "//table[@id='ui_tblReportData']")
	private WebElement contactsTable;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	private WebElement removeGroup;

	private WebElement contactCheckbox;

	@FindBy(xpath = "//*[text()='There is no data for this view']")
	private WebElement noData;

	@FindBy(xpath = "//i[@title='Valid' or @class='icon ion-android-checkmark-circle verifsuccess']")
	private WebElement validIcon;

	@FindBy(xpath = "//i[@title='Invalid' or class='icon ion-android-alert verifalert']")
	private WebElement invalidIcon;

	@FindBy(xpath = "//td[@class='text-center verified']/i")
	private WebElement textCenter;

	public void clickCreateContacts() {
		applyWait.waitForElementToBeClickable(createContact, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Create Contacts");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User clicked on Create Contact");
		Log.info("User clicked on Create Contact");
	}

	public void select_ActionDropdownValue(String input_Action) {

		applyWait.waitForElementToBeClickable(action, DefineConstants.explicitWait_30);
		javascript.click(action);
		try {
			Thread.sleep(3000);
			if (input_Action.equals("Add remove group")) {
				applyWait.waitForElementToBeClickable(addRemoveGroup, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, input_Action + " is clicked");
			} else if (input_Action.equals("Unsubcribe")) {
				applyWait.waitForElementToBeClickable(unsubcribe, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, input_Action + " is clicked");
			} else {
				applyWait.waitForElementToBeClickable(invalidate, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, input_Action + " is clicked");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Action button is clicked");
		Log.info("Action button is clicked");
	}

	public void select_AddRemoveGroupAlertDropdownValue(String input_Action) {

		try {
			Thread.sleep(3000);
			applyWait.waitForElementToBeClickable(addRemoveGroupDropdownValue, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(addRemoveGroupDropdownValue, input_Action);
			Screenshots.takeScreenshot(driver, input_Action + " is selected");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_Action + " is selected");
		Log.info(input_Action + " is selected");
	}

	public void clickSaveChanges() {
		applyWait.waitForElementToBeClickable(saveChangesButton, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Save changes button is clicked");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Save changes button is clicked");
		Log.info("Save changes button is clicked");
	}

	public void verifyAddedToGroupSuccessfully(String inputmessage) throws IOException {
		if (addedToGroupSuccessfullyMessage.isDisplayed()) {
			String groupCreatedMessage = addedToGroupSuccessfullyMessage.getText();
			Screenshots.takeScreenshot(driver, groupCreatedMessage + " message is verified");
			System.out.println(groupCreatedMessage + " message is verified");
			test.log(Status.INFO, groupCreatedMessage + " message is verified");
			Log.info(groupCreatedMessage + " message is verified");
			Assert.assertTrue(true);
		} else if (errorMessage.isDisplayed()) {
			String groupNotCreatedMessage = errorMessage.getText();
			Screenshots.takeScreenshot(driver, groupNotCreatedMessage + " message is verified");
			System.out.println(groupNotCreatedMessage + " message is verified");
			test.log(Status.INFO, groupNotCreatedMessage + " message is verified");
			Log.info(groupNotCreatedMessage + " message is verified");
			Assert.assertTrue(false);
		}
	}

	public void removeGroup(String inputAddRemoveGroup) {

		// removeGroup = driver
		// .findElement(By.xpath("//li[contains(text(),'" + inputAddRemoveGroup
		// + "')]//self::span[1]"));
		//
		// applyWait.waitForElementToBeClickable(removeGroup,
		// DefineConstants.explicitWait_30).click();
		// try {
		// Screenshots.takeScreenshot(driver, inputAddRemoveGroup + " is
		// removed");
		// Keyboard.pressEscape();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// test.log(Status.INFO, inputAddRemoveGroup + " is removed");
		// Log.info(inputAddRemoveGroup + " is removed");

		try {
			Thread.sleep(3000);
			applyWait.waitForElementToBeClickable(addRemoveGroupDropdownValue, DefineConstants.explicitWait_30);
			dropDown.deSelectByVisibleText(addRemoveGroupDropdownValue, inputAddRemoveGroup);
			Screenshots.takeScreenshot(driver, inputAddRemoveGroup + " is deselected");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, inputAddRemoveGroup + " is deselected");
		Log.info(inputAddRemoveGroup + " is deselected");
	}

	public void selectContact(String contactName) {

		contactCheckbox = driver.findElement(By.xpath("//*[text()='" + contactName + "']//preceding::span[3]"));

		applyWait.waitForElementToBeClickable(contactCheckbox, DefineConstants.explicitWait_30);
		javascript.click(contactCheckbox);
		try {
			Screenshots.takeScreenshot(driver, contactName + " is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, contactName + " is selected");
		Log.info(contactName + " is selected");
	}

	public void clickPopUpInvalidate() {

		applyWait.waitForElementToBeClickable(invalidateButtonPopUp, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Invalidate button is clicked");

		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Invalidate button is clicked");
		Log.info("Invalidate button is clicked");
	}

	public void verifyInvalidateMessage() {

		applyWait.waitForElementToBeClickable(invalidatedSuccessfullyMessage, DefineConstants.explicitWait_30);
		String message = invalidatedSuccessfullyMessage.getText();

		try {
			Screenshots.takeScreenshot(driver, "Invalidate button is clicked");
			System.out.println("Message is " + message);
			test.log(Status.INFO, "Message is " + message);
			Log.info("Message is " + message);
			if (message.equals("Invalidated successfully.")) {
				System.out.println(message + " is verified");
				test.log(Status.INFO, message + " is verified");
				Log.info(message + " is verified");
			} else {
				System.out.println(message + " is not verified");
				test.log(Status.INFO, message + " is not verified");
				Log.info(message + " is not verified");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Invalidate button is clicked");
		Log.info("Invalidate button is clicked");
	}

	public void unsubcribePopUp_Email() {

		applyWait.waitForElementToBeClickable(popUpEmailCheckbox, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Email check box is clicked");

		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Email check box is clicked");
		Log.info("Email check box is clicked");
	}

	public void unsubcribePopUp_SMS() {

		applyWait.waitForElementToBeClickable(popUpSMSCheckbox, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "SMS checkbox is clicked");

		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "SMS checkbox is clicked");
		Log.info("SMS checkbox is clicked");
	}

	public void clickPopUpUnsubcribeButton() {

		applyWait.waitForElementToBeClickable(unsubcribeButtonPopUp, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Unsubcribe button is clicked");

		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Unsubcribe button is clicked");
		Log.info("Unsubcribe button is clicked");
	}

	public void verifyUnsubscribeMessage(String message) {

		applyWait.waitForElementToBeClickable(unsubscribeSuccessfullyMessage, DefineConstants.explicitWait_30);
		String message1 = unsubscribeSuccessfullyMessage.getText();

		try {
			if (message1.equals(message)) {
				Screenshots.takeScreenshot(driver, message1 + " is verified");
				System.out.println(message1 + " is verified");
				test.log(Status.INFO, message1 + " is verified");
				Log.info(message1 + " is verified");
			} else if (!message1.equals("Unsubscribed successfully.")) {
				Screenshots.takeScreenshot(driver, "Unsubscribed successfully message is not verified");
				System.out.println("Unsubscribed successfully message is not verified");
				test.log(Status.INFO, "Unsubscribed successfully message is not verified");
				Log.info("Unsubscribed successfully message is not verified");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void clickExportReportButton() {

		applyWait.waitForElementToBeClickable(exportReportButton, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Export Report Button is clicked");

		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Export Report Button is clicked");
		Log.info("Export Report Button is clicked");
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

	public void selectExportDataBy(String inputExportDataBy) {

		try {
			applyWait.waitForElementToBeClickable(exportDataBy, DefineConstants.explicitWait_30);
			dropDown.selectByVisibleText(exportDataBy, inputExportDataBy);
			Screenshots.takeScreenshot(driver, inputExportDataBy + " is selected");

		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, inputExportDataBy + " is selected");
		Log.info(inputExportDataBy + " is selected");
	}

	public void clickExportPopUpDownloadButton() {

		applyWait.waitForElementToBeClickable(downloadButtonPopUp, DefineConstants.explicitWait_30).click();
		try {
			Thread.sleep(3000L);
			Screenshots.takeScreenshot(driver, "Export Report download button is clicked");

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Export Report download button is clicked");
		Log.info("Export Report download button is clicked");
	}

	public void select_FilterByPhoneNumber() {
		try {

			applyWait.waitForElementToBeClickable(filterBy_Button, DefineConstants.explicitWait_60).click();
			Screenshots.takeScreenshot(driver, "User clicked filter by button");
			test.log(Status.INFO, "User clicked filter by button");
			Log.info("User clicked filter by button");

			applyWait.waitForElementToBeClickable(filterBy_PhoneNumber, DefineConstants.explicitWait_60).click();
			Screenshots.takeScreenshot(driver, "User selected filter by phone number option");
			test.log(Status.INFO, "User selected filter by phone number option");
			Log.info("User selected filter by phone number option");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchContact(String inputContactName) {
		try {
			Thread.sleep(3000L);
			applyWait.waitForElementToBeClickable(searchContact, DefineConstants.explicitWait_60).clear();
			searchContact.sendKeys(inputContactName);
			searchContact.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, inputContactName + " is entered");
			test.log(Status.INFO, inputContactName + " is entered");
			Log.info(inputContactName + " is entered");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fetchContactDetails() {
		applyWait.waitForElementToBeClickable(contactsTable, DefineConstants.explicitWait_30);
		tableRows = contactsTable.findElements(By.tagName("tr"));
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				contactDetailsList.add(cellText);
				contactDetailsListElements.add(tableColums.get(column));
				System.out.println("value is " + cellText);
				test.log(Status.INFO, "value is " + cellText);
				Log.info("value is " + cellText);
			}
		}

		try {
			Screenshots.takeScreenshot(driver, "Contact details fetched");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Contact details fetched");
		Log.info("Contact details fetched");
		System.out.println("Contact details from list are " + contactDetailsList);
		System.out.println("Contact items from list are " + contactDetailsListElements);
	}

	public void openContact() {
		try {
			applyWait.waitForElementToBeClickable(contactDetailsListElements.get(0), DefineConstants.explicitWait_30).click();
			contactDetailsListElements.get(0).click();
			Screenshots.takeScreenshot(driver, "User open contact");
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User open contact");
		Log.info("User open contact");
	}

	public void verifyInputValue(String inputEmailAddress) {
		applyWait.waitForElementToBeClickable(contactsTable, DefineConstants.explicitWait_60);
		tableRows = contactsTable.findElements(By.tagName("tr"));

		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				if (cellText.equals(inputEmailAddress)) {
					System.out.println("value is " + cellText);
					javascript.highLighterMethod(tableColums.get(column));
					Assert.assertTrue(true, inputEmailAddress + " is verified");
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, inputEmailAddress + " is verified");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, inputEmailAddress + " is verified");
					Log.info(inputEmailAddress + " is verified");
				}

				else if (cellText.equals("There is no data for this view")) {
					try {
						javascript.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, inputEmailAddress + " is not found");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, inputEmailAddress + " is not found");
					Log.info(inputEmailAddress + " is not found");
					Assert.assertTrue(false, inputEmailAddress + " is not found");
				}
			}
		}
	}

	public void verify_OldEmail(String old_InputEmailAddress) {
		applyWait.waitForElementToBeClickable(contactsTable, DefineConstants.explicitWait_60);
		tableRows = contactsTable.findElements(By.tagName("tr"));

		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				oldEmail = tableColums.get(column).getText();
				if (oldEmail.equals(old_InputEmailAddress)) {
					try {
						System.out.println("Old email " + oldEmail + " is verified");
						javascript.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, "Old email " + oldEmail + " is verified");
						test.log(Status.INFO, "Old email " + oldEmail + " is verified");
						Log.info("Old email " + oldEmail + " is verified");
						Assert.assertEquals(oldEmail, old_InputEmailAddress);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				else if (oldEmail.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						System.out.println(old_InputEmailAddress + "is not found");
						javascript.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, old_InputEmailAddress + " is not found");
						test.log(Status.INFO, old_InputEmailAddress + " is not found");
						Log.info(old_InputEmailAddress + " is not found");
						Assert.assertEquals(DefineConstants.There_is_no_data_for_this_view, old_InputEmailAddress);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void verify_NewEmail(String new_InputEmailAddress) {
		applyWait.waitForElementToBeClickable(contactsTable, DefineConstants.explicitWait_60);
		tableRows = contactsTable.findElements(By.tagName("tr"));

		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				newEmail = tableColums.get(column).getText();
				if (newEmail.equals(new_InputEmailAddress)) {
					try {
						System.out.println("New email " + newEmail + " is verified");
						javascript.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, "New email " + newEmail + " is verified");
						test.log(Status.INFO, "New email " + newEmail + " is verified");
						Log.info("New email " + newEmail + " is verified");
						Assert.assertEquals(newEmail, new_InputEmailAddress);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				else if (newEmail.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						System.out.println(new_InputEmailAddress + "is not found");
						javascript.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, new_InputEmailAddress + " is not found");
						test.log(Status.INFO, new_InputEmailAddress + " is not found");
						Log.info(new_InputEmailAddress + " is not found");
						Assert.assertEquals(DefineConstants.There_is_no_data_for_this_view, new_InputEmailAddress);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void verify_OldPhoneNumber(String input_OldPhoneNumber) {
		applyWait.waitForElementToBeClickable(contactsTable, DefineConstants.explicitWait_60);
		tableRows = contactsTable.findElements(By.tagName("tr"));

		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				oldPhoneNumber = tableColums.get(column).getText();
				if (oldPhoneNumber.equals(input_OldPhoneNumber)) {
					try {
						System.out.println("Old Phone Number " + oldPhoneNumber + " is verified");
						javascript.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, "Old Phone Number " + oldPhoneNumber + " is verified");
						test.log(Status.INFO, "Old PhoneNumber " + oldPhoneNumber + " is verified");
						Log.info("Old PhoneNumber " + oldPhoneNumber + " is verified");
						Assert.assertEquals(oldPhoneNumber, input_OldPhoneNumber);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				else if (oldPhoneNumber.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						System.out.println(input_OldPhoneNumber + "is not found");
						javascript.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_OldPhoneNumber + " is not found");
						test.log(Status.INFO, input_OldPhoneNumber + " is not found");
						Log.info(input_OldPhoneNumber + " is not found");
						Assert.assertEquals(DefineConstants.There_is_no_data_for_this_view, input_OldPhoneNumber);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void verify_NewPhoneNumber(String input_NewPhoneNumber) {
		applyWait.waitForElementToBeClickable(contactsTable, DefineConstants.explicitWait_60);
		tableRows = contactsTable.findElements(By.tagName("tr"));

		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				newPhoneNumber = tableColums.get(column).getText();
				if (newPhoneNumber.equals(input_NewPhoneNumber)) {
					try {
						System.out.println("New Phone Number " + newPhoneNumber + " is verified");
						javascript.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, "New Phone Number " + newPhoneNumber + " is verified");
						test.log(Status.INFO, "New Phone Number " + newPhoneNumber + " is verified");
						Log.info("New Phone Number " + newPhoneNumber + " is verified");
						Assert.assertEquals(newPhoneNumber, input_NewPhoneNumber);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				else if (newPhoneNumber.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						System.out.println(input_NewPhoneNumber + "is not found");
						javascript.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, input_NewPhoneNumber + " is not found");
						test.log(Status.INFO, input_NewPhoneNumber + " is not found");
						Log.info(input_NewPhoneNumber + " is not found");
						Assert.assertEquals(DefineConstants.There_is_no_data_for_this_view, input_NewPhoneNumber);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void verifyEmailAddress(String inputEmailAddress) {

		if (textCenter.getAttribute("title").equals("Valid")) {
			try {
				javascript.highLighterMethod(textCenter);
				Screenshots.takeScreenshot(driver, "Email  " + inputEmailAddress + "  is valid");
			} catch (IOException e) {
				e.printStackTrace();
			}
			test.log(Status.INFO, "Email  " + inputEmailAddress + "  is valid");
			Log.info("Email  " + inputEmailAddress + "  is valid");
			System.out.println("Email  " + inputEmailAddress + "  is valid");
			Assert.assertEquals("Valid", textCenter.getAttribute("title"));
		} else if (textCenter.getAttribute("title").equals("Invalid")) {
			try {
				javascript.highLighterMethod(textCenter);
				Screenshots.takeScreenshot(driver, "Email  " + inputEmailAddress + "  is invalid");
			} catch (IOException e) {
				e.printStackTrace();
			}
			test.log(Status.INFO, "Email  " + inputEmailAddress + "  is invalid");
			Log.info("Email  " + inputEmailAddress + "  is invalid");
			System.out.println("Email  " + inputEmailAddress + "  is invalid");
			Assert.assertEquals("Valid", textCenter.getAttribute("title"));
		} else if (textCenter.getAttribute("title").equals("Not Verified")
				|| textCenter.getAttribute("title").equals(null)) {
			try {
				javascript.highLighterMethod(textCenter);
				Screenshots.takeScreenshot(driver, "Email  " + inputEmailAddress + "  is not verified");
			} catch (IOException e) {
				e.printStackTrace();
			}
			test.log(Status.INFO, "Email  " + inputEmailAddress + "  is not verified");
			Log.info("Email  " + inputEmailAddress + "  is not verified");
			System.out.println("Email  " + inputEmailAddress + "  is not verified");
			Assert.assertEquals("Valid", textCenter.getAttribute("title"));
		}
	}

	public void fetchJsonData(String fileName) {
		System.out.println("Started");
		//
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("Contact Details.json"));

			// A JSON object. Key value pairs are unordered. JSONObject supports
			// java.util.Map interface.
			JSONObject jsonObject = (JSONObject) obj;

			// A JSON array. JSONObject supports java.util.List interface.
			// JSONArray companyList = (JSONArray) jsonObject.get("Details");

			JSONArray companyList = (JSONArray) jsonObject.get(fileName);

			for (int i = 1; i < companyList.size(); i++) {
				System.out.println(companyList.get(i));
			}
			System.out.println("Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
