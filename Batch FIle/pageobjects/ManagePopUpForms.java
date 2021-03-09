package com.plumb5.pageobjects;

import java.io.IOException;
import java.util.List;

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

public class ManagePopUpForms {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;

	public ManagePopUpForms(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropDown = new DropDown(driver);
	}

	@FindBy(linkText = "Create Forms")
	private WebElement create_Forms;

	@FindBy(partialLinkText = "Next")
	private WebElement nextButton;

	@FindBy(xpath = "//h6[contains(text(),'Choose your form Type')]//following::label[2]")
	private WebElement popUpBox;

	@FindBy(xpath = "//div[contains(text(),'Form Title')]")
	private WebElement formTitle;

	@FindBy(xpath = "//h1[@id='formHeadOne']")
	private WebElement editFormTitle;

	@FindBy(xpath = "//div[contains(text(),'User Name')]")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='addTextBoxName']")
	private WebElement addFieldNameTextbox;

	@FindBy(xpath = "//select[@id='addTextBoxNameMappingField']")
	private WebElement addFieldMappingDropdown;

	@FindBy(xpath = "//input[@id='addEmailBoxName']")
	private WebElement addEmailNameField;

	@FindBy(xpath = "//input[@id='addPhoneBoxName']")
	private WebElement addPhoneNameField;

	@FindBy(xpath = "//input[@id='getSubBtnName']")
	private WebElement addSubmitNameField;

	@FindBy(xpath = "//select[@id='addEmailBoxNameMappingField']")
	private WebElement addEmailFieldMappingDropdown;

	@FindBy(xpath = "//select[@id='addPhoneBoxNameMappingField']")
	private WebElement addPhoneFieldMappingDropdown;

	@FindBy(xpath = "//label[@id='textBoxlblName1']//following::input[1]")
	private WebElement userName_Textbox;

	@FindBy(xpath = "//span[@id='editTextBox']")
	private WebElement editButton;

	@FindBy(xpath = "//span[@id='editEmailBox']")
	private WebElement editButtonEmailBox;

	@FindBy(xpath = "//span[@id='editPhoneBox']")
	private WebElement editButtonPhoneBox;

	@FindBy(xpath = "//span[@id='editSubBtnName']")
	private WebElement editButtonSubmit;

	@FindBy(xpath = "//li[@id='inputEmail']")
	private WebElement emailId;

	@FindBy(xpath = "//label[@id='textBoxEmaillbl1']//following::input[1]")
	private WebElement emailId_Textbox;

	@FindBy(xpath = "//div[contains(text(),'Phone')]")
	private WebElement phone;

	@FindBy(xpath = "//label[@id='textboxPhonelbl1']//following::input[1]")
	private WebElement phone_Textbox;

	@FindBy(xpath = "//div[contains(text(),'Submit Button')]")
	private WebElement submitButton;

	@FindBy(xpath = "//div[@id='btnRow']")
	private WebElement submitButtonRow;

	@FindBy(xpath = "//input[@id='ui_txtFormIdentifier']")
	private WebElement formIdentifier;

	@FindBy(xpath = "//div[@id='setrules']")
	private WebElement setRules;

	@FindBy(xpath = "//div[@id='ui_lnkSaveDetails']")
	private WebElement saveButton;

	private String formNumber;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement successfullMessage;

	// @FindBy(id = "ui_div_MasterSuccess")
	// private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(xpath = "//input[@id='ui_txtSearchBy']")
	private WebElement searchForm;

	@FindBy(xpath = "//input[@id='textBoxYes']")
	private WebElement Yes_RadioButton;

	@FindBy(xpath = "//input[@id='textBoxNo']")
	private WebElement No_RadioButton;

	@FindBy(xpath = "//input[@id='emailBoxYes']")
	private WebElement emailBoxYes;

	@FindBy(xpath = "//input[@id='emailBoxNo']")
	private WebElement emailBoxNo;

	@FindBy(xpath = "//input[@id='phoneBoxYes']")
	private WebElement phoneBoxYes;

	@FindBy(xpath = "//input[@id='phoneBoxNo']")
	private WebElement phoneBoxNo;

	@FindBy(xpath = "//button[@id='addTextboxName']")
	private WebElement addTextBoxName;

	@FindBy(xpath = "//button[@id='addEmailboxName']")
	private WebElement email_AddTextBoxName;

	@FindBy(xpath = "//button[@id='addPhoneboxfieldName']")
	private WebElement phone_AddTextBoxName;

	@FindBy(xpath = "//button[@id='addSubmitName']")
	private WebElement addSubmitName;

	@FindBy(id = "ui_tbodyReportData")
	private WebElement templateTable;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	@FindBy(linkText = "Edit")
	private WebElement edit_Button;

	@FindBy(linkText = "Preview")
	private WebElement preview;

	@FindBy(linkText = "Changes Status")
	private WebElement changeStatus;

	@FindBy(xpath = "//a[@id='ui_aCreatePopUpForm']//following::a[3]")
	private WebElement settings;

	@FindBy(xpath = "//label[contains(text(),'Client Campaign Identifier')]//following::input[1]")
	private WebElement clientCampaignIdentifier;

	@FindBy(xpath = "//input[@id='txtCampaignIdentifier']")
	private WebElement campaignIdentifier;

	private WebElement form, formFrom, formTo;

	@FindBy(xpath = "//label[contains(text(),'Mobile Form')]//following::label[1]")
	private WebElement mobileFormYes;

	@FindBy(xpath = "//label[contains(text(),'Mobile Form')]//following::label[2]")
	private WebElement mobileFormNo;

	@FindBy(xpath = "//label[contains(text(),'OTP Form')]//following::label[1]")
	private WebElement OTPFormYes;

	@FindBy(xpath = "//label[contains(text(),'OTP Form')]//following::label[2]")
	private WebElement OTPFormNo;

	@FindBy(xpath = "//button[@id='btnSaveCampaignDetails']")
	private WebElement saveForm;

	public void click_CreateForms() {
		try {
			applyWait.waitForElementToBeClickable(create_Forms, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked create forms in popup forms");
			test.log(Status.INFO, "User clicked create forms in popup forms");
			Log.info("User clicked create forms in popup forms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SetRules() {
		try {
			applyWait.waitForElementToBeClickable(setRules, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked set rules");
			test.log(Status.INFO, "User clicked set rules");
			Log.info("User clicked set rules");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_PopUpBox() {
		try {
			applyWait.waitForElementToBeClickable(popUpBox, DefineConstants.explicitWait_30);
			javascriptClick.click(popUpBox);
			Screenshots.takeScreenshot(driver, "User clicked pop box in create forms page");
			test.log(Status.INFO, "User clicked pop box in create forms page");
			Log.info("User clicked pop box in create forms page");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_NextButton() {
		try {
			applyWait.waitForElementToBeClickable(nextButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked next button");
			test.log(Status.INFO, "User clicked next button");
			Log.info("User clicked next button");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Form_Title() {
		try {
			applyWait.waitForElementToBeClickable(formTitle, DefineConstants.explicitWait_30);
			javascriptClick.click(formTitle);
			Screenshots.takeScreenshot(driver, "User clicked form title");
			test.log(Status.INFO, "User clicked form title");
			Log.info("User clicked form title");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void edit_Form_Title(String input_Form_Title) {
		try {
			applyWait.waitForElementToBeClickable(editFormTitle, DefineConstants.explicitWait_30).clear();
			editFormTitle.sendKeys(input_Form_Title);
			Screenshots.takeScreenshot(driver, "User edit form title as " + input_Form_Title);
			test.log(Status.INFO, "User edit form title as " + input_Form_Title);
			Log.info("User edit form title as " + input_Form_Title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_UserName() {
		try {
			applyWait.waitForElementToBeClickable(userName, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked username");
			test.log(Status.INFO, "User clicked next button");
			Log.info("User clicked next button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EditUserName() {
		try {
			applyWait.waitForElementToBeClickable(userName_Textbox, DefineConstants.explicitWait_30).click();
			applyWait.waitForElementToBeClickable(editButton, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked edit username");
			test.log(Status.INFO, "User clicked edit username");
			Log.info("User clicked edit username");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Email() {
		try {
			applyWait.waitForElementToBeClickable(emailId, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked email");
			test.log(Status.INFO, "User clicked email");
			Log.info("User clicked email");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EditEmail() {
		try {
			applyWait.waitForElementToBeClickable(emailId_Textbox, DefineConstants.explicitWait_30).click();
			applyWait.waitForElementToBeClickable(editButtonEmailBox, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked edit email");
			test.log(Status.INFO, "User clicked edit email");
			Log.info("User clicked edit email");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Phone() {
		try {
			applyWait.waitForElementToBeClickable(phone, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked phone");
			test.log(Status.INFO, "User clicked phone");
			Log.info("User clicked phone");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EditPhone() {
		try {
			applyWait.waitForElementToBeClickable(phone_Textbox, DefineConstants.explicitWait_30).click();
			applyWait.waitForElementToBeClickable(editButtonPhoneBox, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked Edit Phone");
			test.log(Status.INFO, "User clicked Edit Phone");
			Log.info("User clicked Edit phone");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SubmitButton() {
		try {
			applyWait.waitForElementToBeClickable(submitButton, DefineConstants.explicitWait_30);
			javascriptClick.click(submitButton);
			Screenshots.takeScreenshot(driver, "User clicked submit button");
			test.log(Status.INFO, "User clicked submit button");
			Log.info("User clicked submit button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EditSubmitButton() {
		try {
			applyWait.waitForElementToBeClickable(submitButtonRow, DefineConstants.explicitWait_30);
			javascriptClick.click(submitButtonRow);
			applyWait.waitForElementToBeClickable(editButtonSubmit, DefineConstants.explicitWait_30);
			javascriptClick.click(editButtonSubmit);
			Screenshots.takeScreenshot(driver, "User clicked edit submit button");
			test.log(Status.INFO, "User clicked edit submit button");
			Log.info("User clicked edit submit button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SaveButton() {
		try {
			applyWait.waitForElementToBeClickable(saveButton, DefineConstants.explicitWait_30);
			javascriptClick.click(saveButton);
			Screenshots.takeScreenshot(driver, "User clicked save button");
			test.log(Status.INFO, "User clicked save button");
			Log.info("User clicked save button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void storeFormIdentifierNumber() {
		try {
			applyWait.waitForElementToBeClickable(formIdentifier, DefineConstants.explicitWait_30);
			formNumber = formIdentifier.getAttribute("value");
			Screenshots.takeScreenshot(driver, "Form Number is " + formNumber);
			test.log(Status.INFO, "Form Number is " + formNumber);
			Log.info("Form Number is " + formNumber);
			System.out.println("Form Number is " + formNumber);
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

	public void searchForm() {
		try {
			applyWait.waitForElementToBeClickable(searchForm, DefineConstants.explicitWait_30);
			searchForm.sendKeys(formNumber);
			searchForm.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User searched " + formNumber);
			test.log(Status.INFO, "User searched " + formNumber);
			Log.info("User searched " + formNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchForm(String formName) {
		try {
			applyWait.waitForElementToBeClickable(searchForm, DefineConstants.explicitWait_30);
			searchForm.sendKeys(formName);
			searchForm.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User searched " + formName);
			test.log(Status.INFO, "User searched " + formName);
			Log.info("User searched " + formName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_AddFieldMappingValue(String input_AddFieldMappingValue) {
		try {
			applyWait.waitForElementToBeClickable(addFieldMappingDropdown, DefineConstants.explicitWait_30);
			addFieldMappingDropdown.click();
			dropDown.selectByValue(addFieldMappingDropdown, input_AddFieldMappingValue);
			Screenshots.takeScreenshot(driver, "User selected " + input_AddFieldMappingValue + "from dropdown");
			test.log(Status.INFO, "User selected " + input_AddFieldMappingValue + "from dropdown");
			Log.info("User selected " + input_AddFieldMappingValue + "from dropdown");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_EmailAddFieldMappingValue(String input_EmailAddFieldMappingValue) {
		try {
			applyWait.waitForElementToBeClickable(addEmailFieldMappingDropdown, DefineConstants.explicitWait_30);
			addEmailFieldMappingDropdown.click();
			dropDown.selectByValue(addEmailFieldMappingDropdown, input_EmailAddFieldMappingValue);
			Screenshots.takeScreenshot(driver,
					"User selected " + input_EmailAddFieldMappingValue + " from Add Field Mapping Dropdown");
			test.log(Status.INFO,
					"User selected " + input_EmailAddFieldMappingValue + " from Add Field Mapping Dropdown");
			Log.info("User selected " + input_EmailAddFieldMappingValue + " from Add Field Mapping Dropdown");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_PhoneAddFieldMappingValue(String input_PhoneAddFieldMappingValue) {
		try {
			applyWait.waitForElementToBeClickable(addPhoneFieldMappingDropdown, DefineConstants.explicitWait_30);
			addPhoneFieldMappingDropdown.click();
			dropDown.selectByValue(addPhoneFieldMappingDropdown, input_PhoneAddFieldMappingValue);
			Screenshots.takeScreenshot(driver,
					"User selected " + input_PhoneAddFieldMappingValue + " from Add Field Mapping Dropdown");
			test.log(Status.INFO,
					"User selected " + input_PhoneAddFieldMappingValue + " from Add Field Mapping Dropdown");
			Log.info("User selected " + input_PhoneAddFieldMappingValue + " from Add Field Mapping Dropdown");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_AddTextBoxName() {
		try {
			applyWait.waitForElementToBeClickable(addTextBoxName, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked add Text Box Name");
			test.log(Status.INFO, "User clicked add Text Box Name");
			Log.info("User clicked add Text Box Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_EmailAddTextBoxName() {
		try {
			applyWait.waitForElementToBeClickable(email_AddTextBoxName, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked add Text Box Name");
			test.log(Status.INFO, "User clicked add Text Box Name");
			Log.info("User clicked add Text Box Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_PhoneAddTextBoxName() {
		try {
			applyWait.waitForElementToBeClickable(phone_AddTextBoxName, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked add Text Box Name");
			test.log(Status.INFO, "User clicked add Text Box Name");
			Log.info("User clicked add Text Box Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_AddSubmitName() {
		try {
			applyWait.waitForElementToBeClickable(addSubmitName, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked Add Submit Name");
			test.log(Status.INFO, "User clicked Add Submit Name");
			Log.info("User clicked Add Submit Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_AddFieldName(String input_AddFieldName) {
		try {
			applyWait.waitForElementToBeClickable(addFieldNameTextbox, DefineConstants.explicitWait_30).clear();
			addFieldNameTextbox.sendKeys(input_AddFieldName);
			Screenshots.takeScreenshot(driver, "User entered " + input_AddFieldName + " as Add Field Name");
			test.log(Status.INFO, "User entered " + input_AddFieldName + " as Add Field Name");
			Log.info("User entered " + input_AddFieldName + " as Add Field Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_AddEmailNameField(String input_AddEmailNameField) {
		try {
			applyWait.waitForElementToBeClickable(addEmailNameField, DefineConstants.explicitWait_30).clear();
			addEmailNameField.sendKeys(input_AddEmailNameField);
			Screenshots.takeScreenshot(driver, "User entered " + input_AddEmailNameField + " as Add Email Name Field");
			test.log(Status.INFO, "User entered " + input_AddEmailNameField + " as Add Email Name Field");
			Log.info("User entered " + input_AddEmailNameField + " as Add Email Name Field");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_AddPhoneNameField(String input_AddPhoneNameField) {
		try {
			applyWait.waitForElementToBeClickable(addPhoneNameField, DefineConstants.explicitWait_30).clear();
			addPhoneNameField.sendKeys(input_AddPhoneNameField);
			Screenshots.takeScreenshot(driver, "User entered " + input_AddPhoneNameField + " as Add Phone Name Field");
			test.log(Status.INFO, "User entered " + input_AddPhoneNameField + " as Add Phone Name Field");
			Log.info("User entered " + input_AddPhoneNameField + " as Add Phone Name Field");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_SubmitNameField(String input_SubmitNameField) {
		try {
			applyWait.waitForElementToBeClickable(addSubmitNameField, DefineConstants.explicitWait_30).clear();
			addSubmitNameField.sendKeys(input_SubmitNameField);
			Screenshots.takeScreenshot(driver, "User entered " + input_SubmitNameField + " as Add Message Name Field");
			test.log(Status.INFO, "User entered " + input_SubmitNameField + " as Add Message Name Field");
			Log.info("User entered " + input_SubmitNameField + " as Add Message Name Field");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_Mandatory(String input_Mandatory) {
		try {
			if (input_Mandatory.equalsIgnoreCase("Yes")) {
				applyWait.waitForElementToBeClickable(Yes_RadioButton, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User select Yes for Mandatory");
				test.log(Status.INFO, "User select Yes for Mandatory");
				Log.info("User select Yes for Mandatory");
			}
			if (input_Mandatory.equalsIgnoreCase("No")) {
				applyWait.waitForElementToBeClickable(No_RadioButton, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User select No for Mandatory");
				test.log(Status.INFO, "User select No for Mandatory");
				Log.info("User select No for Mandatory");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_EmailMandatory(String input_EmailMandatory) {
		try {
			if (input_EmailMandatory.equalsIgnoreCase("Yes")) {
				applyWait.waitForElementToBeClickable(emailBoxYes, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User select Yes for Email Mandatory");
				test.log(Status.INFO, "User select Yes for Email Mandatory");
				Log.info("User select Yes for Email Mandatory");
			}
			if (input_EmailMandatory.equalsIgnoreCase("No")) {
				applyWait.waitForElementToBeClickable(emailBoxNo, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User select No for Email Mandatory");
				test.log(Status.INFO, "User select No for Email Mandatory");
				Log.info("User select No for Email Mandatory");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_PhoneMandatory(String input_PhoneMandatory) {
		try {
			if (input_PhoneMandatory.equalsIgnoreCase("Yes")) {
				applyWait.waitForElementToBeClickable(phoneBoxYes, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User select Yes for Phone Mandatory");
				test.log(Status.INFO, "User select Yes for Phone Mandatory");
				Log.info("User select Yes for Phone Mandatory");
			}
			if (input_PhoneMandatory.equalsIgnoreCase("No")) {
				applyWait.waitForElementToBeClickable(phoneBoxNo, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User select No for Phone Mandatory");
				test.log(Status.INFO, "User select No for Phone Mandatory");
				Log.info("User select No for Phone Mandatory");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyInputValue() {

		applyWait.waitforPresenceOfElementLocated(templateTable, DefineConstants.explicitWait_60);
		tableRows = templateTable.findElements(By.tagName("tr"));
		// System.out.println("value is " + input_TemplateName);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.contains(formNumber)) {
					System.out.println("value is: " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, formNumber + " is verified");
						test.log(Status.INFO, formNumber + " is verified");
						Log.info(formNumber + " is verified");
						Assert.assertTrue(true, formNumber + " is verified");

					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				else if (cellText.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, formNumber + " is not found");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						System.out.println("value is " + cellText);
						test.log(Status.INFO, formNumber + " is not found");
						Log.info(formNumber + " is not found");
						Assert.assertTrue(false, formNumber + " is not found");
					} catch (IOException e) {
						e.printStackTrace();
					}

				}
			}
		}
	}

	public void select_FormToEdit() {
		try {
			form = driver.findElement(By.xpath("//*[text()='" + formNumber + "']//following::i[1]"));
			form.click();
			Screenshots.takeScreenshot(driver, "Form is selected to edit");
			test.log(Status.INFO, "Form is selected to edit");
			Log.info("Form is selected to edit");
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

	public void click_SettingsButton() {
		try {
			applyWait.waitForElementToBeClickable(settings, DefineConstants.explicitWait_30);
			javascriptClick.click(settings);
			Screenshots.takeScreenshot(driver, "User clicked Settings button for selected form");
			test.log(Status.INFO, "User clicked Settings button for selected form");
			Log.info("User clicked Settings button for selected form");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_PreviewButton() {
		try {
			applyWait.waitForElementToBeClickable(preview, DefineConstants.explicitWait_30);
			javascriptClick.click(preview);
			Screenshots.takeScreenshot(driver, "User clicked Preview button for selected form and for is Previewed");
			test.log(Status.INFO, "User clicked Preview button for selected form and for is Previewed");
			Log.info("User clicked Preview button for selected form and for is Previewed");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_ChangeStatus() {
		try {
			applyWait.waitForElementToBeClickable(changeStatus, DefineConstants.explicitWait_30);
			javascriptClick.click(changeStatus);
			Screenshots.takeScreenshot(driver, "User clicked Change Status button for selected form");
			test.log(Status.INFO, "User clicked Change Status button for selected form");
			Log.info("User clicked Change Status button for selected form");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_ClientCampaignIdentifier(String input_ClientCampaignIdentifier) {
		try {
			applyWait.waitForElementToBeClickable(clientCampaignIdentifier, DefineConstants.explicitWait_30).clear();
			clientCampaignIdentifier.sendKeys(input_ClientCampaignIdentifier);
			Screenshots.takeScreenshot(driver,
					"User enter Client Campaign Identifier as " + input_ClientCampaignIdentifier);
			test.log(Status.INFO, "User enter Client Campaign Identifier as " + input_ClientCampaignIdentifier);
			Log.info("User enter Client Campaign Identifier as " + input_ClientCampaignIdentifier);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_CampaignIdentifier(String input_CampaignIdentifier) {
		try {
			applyWait.waitForElementToBeClickable(campaignIdentifier, DefineConstants.explicitWait_30).clear();
			campaignIdentifier.sendKeys(input_CampaignIdentifier);
			Thread.sleep(1000);
			campaignIdentifier.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User enter Campaign Identifier as " + input_CampaignIdentifier);
			test.log(Status.INFO, "User enter Campaign Identifier as " + input_CampaignIdentifier);
			Log.info("User enter Campaign Identifier as " + input_CampaignIdentifier);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_MobileForm(String input_MobileForm) {
		try {
			if (input_MobileForm.equalsIgnoreCase("Yes")) {
				applyWait.waitForElementToBeClickable(mobileFormYes, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User selected Yes for Mobile Form");
				test.log(Status.INFO, "User selected Yes for Mobile Form");
				Log.info("User selected Yes for Mobile Form");
			}
			if (input_MobileForm.equalsIgnoreCase("No")) {
				applyWait.waitForElementToBeClickable(mobileFormNo, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User selected No for Mobile Form");
				test.log(Status.INFO, "User selected No for Mobile Form");
				Log.info("User selected No for Mobile Form");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_OTPForm(String input_OTPForm) {
		try {
			if (input_OTPForm.equalsIgnoreCase("Yes")) {
				applyWait.waitForElementToBeClickable(OTPFormYes, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User selected Yes for OTP Form");
				test.log(Status.INFO, "User selected Yes for OTP Form");
				Log.info("User selected Yes for OTP Form");
			}
			if (input_OTPForm.equalsIgnoreCase("No")) {
				applyWait.waitForElementToBeClickable(OTPFormNo, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User selected No for OTP Form");
				test.log(Status.INFO, "User selected No for OTP Form");
				Log.info("User selected No for OTP Form");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SaveForm() {
		try {
			applyWait.waitForElementToBeClickable(saveForm, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked save form button");
			test.log(Status.INFO, "User clicked save form button");
			Log.info("User clicked save form button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void changePriority(String source, String destination) {
		try {			
			Thread.sleep(1000);
			formFrom = driver.findElement(By.xpath("//span[contains(text(),'" + source + "')]"));
			formTo = driver.findElement(By.xpath("//span[contains(text(),'" + destination + "')]"));
			applyWait.waitForElementToBeClickable(formFrom, DefineConstants.explicitWait_30);
			applyWait.waitForElementToBeClickable(formTo, DefineConstants.explicitWait_30);
			dropDown.dragAndDrop(formFrom, formTo);
			Screenshots.takeScreenshot(driver, "User dragged form " + source + " from to " + destination);
			test.log(Status.INFO, "User dragged form " + source + " from to " + destination);
			Log.info("User dragged form " + source + " from to " + destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}