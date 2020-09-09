package com.plumb5.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.DefineConstants;
import helperMethods.DropDown;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class CreateGroups {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private DropDown dropDown;

	public CreateGroups(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		this.dropDown = new DropDown(driver);
	}

	private WebElement createdFromDate;

	@FindBy(xpath = "//input[@id='ui_txtSearchBy']")
	private WebElement searchGroup;

	@FindBy(xpath = "//input[@id='ui_txtGrpName']")
	private WebElement name;

	@FindBy(xpath = "//div[@id='groupcollapseone']//label[@class='frmlbltxt'][contains(text(),'Name')]//following::input[1]")
	private WebElement group_DuplicateName;

	@FindBy(xpath = "//label[contains(text(),'Description')]//following::textarea[1]")
	private WebElement group_DuplicateDescription;

	@FindBy(xpath = "//button[@id='btnAddToGroup']")
	private WebElement saveGroup;

	@FindBy(xpath = "//textarea[@id='ui_txtGrpDescription']//following::label[1]")
	private WebElement addContacts_Checkbox;

	@FindBy(xpath = "//textarea[@id='ui_txtGrpDescription']//following::a[1]")
	private WebElement addContacts_Button;

	@FindBy(xpath = "//label[text()='FirstName']//following::select[1]")
	private WebElement firstName;

	@FindBy(xpath = "//label[text()='LastName']//following::select[1]")
	private WebElement lastName;

	@FindBy(xpath = "//label[text()='Age Range']//following::input[1]")
	private WebElement ageRangeStart;

	@FindBy(xpath = "//label[text()='Age Range']//following::input[2]")
	private WebElement ageRangeEnd;

	@FindBy(xpath = "//label[text()='Education']//following::input[1]")
	private WebElement education;

	@FindBy(xpath = "//label[text()='Genders']//following::select[1]")
	private WebElement gender;

	@FindBy(xpath = "//label[text()='Occupation']//following::input[1]")
	private WebElement occupation;

	@FindBy(xpath = "//label[text()='MartialStatus']//following::select[1]")
	private WebElement maritalStatus;

	@FindBy(xpath = "//label[text()='Location']//following::input[1]")
	private WebElement location;

	@FindBy(xpath = "//label[text()='Interests']//following::input[1]")
	private WebElement interests;

	@FindBy(xpath = "//label[text()='UtmSource']//following::input[1]")
	private WebElement utmSource;

	@FindBy(xpath = "//label[text()='UtmMedium']//following::input[1]")
	private WebElement utmMedium;

	@FindBy(xpath = "//label[text()='UtmCampaign']//following::input[1]")
	private WebElement utmCampaign;

	@FindBy(xpath = "//label[text()='UtmTerm']//following::input[1]")
	private WebElement utmTerm;

	@FindBy(xpath = "//label[text()='UtmContent']//following::input[1]")
	private WebElement utmContent;

	@FindBy(xpath = "//label[text()='MailSubscribe']//following::select[1]")
	private WebElement mailSubscribe;

	@FindBy(xpath = "//label[text()='Mail Overall Subscribe']//following::select[1]")
	private WebElement mailOverallSubscribe;

	@FindBy(xpath = "//label[text()='SmsSubscribe']//following::select[1]")
	private WebElement mailSMSSubscribe;

	@FindBy(xpath = "//label[text()='SMS Overall Subscribe']//following::select[1]")
	private WebElement sMSOverallSubscribe;

	@FindBy(xpath = "//label[text()='AccountType']//following::input[1]")
	private WebElement accountType;

	@FindBy(xpath = "//input[@id='ui_txtFromDate']")
	private WebElement createdFromDateCalendar;

	@FindBy(xpath = "//label[text()='FromDate']//following::input[1]")
	private WebElement fromDate;

	@FindBy(xpath = "//label[text()='ToDate']//following::input[1]")
	private WebElement toDate;

	@FindBy(xpath = "//input[@id='ui_txtToDate']")
	private WebElement createdToDateCalendar;

	@FindBy(xpath = "//*[text()='IsAccountHolder']//following::select[1]")
	private WebElement isAccountHolderTrue;

	@FindBy(xpath = "//*[text()='Is Account Holder']//following::label[2]")
	private WebElement isAccountHolderFalse;

	@FindBy(xpath = "//label[text()='AccountOpenedSource']//following::input[1]")
	private WebElement accountOpenedSource;

	@FindBy(xpath = "//label[contains(text(),'Start Count')]//following::input[1]")
	private WebElement startCount;

	@FindBy(xpath = "//label[contains(text(),'End Count')]//following::input[1]")
	private WebElement endCount;

	public void enterName(String inputname) {
		applyWait.waitForElementToBeClickable(name, DefineConstants.explicitWait_30).clear();
		name.sendKeys(inputname);
		try {
			Screenshots.takeScreenshot(driver, "Name is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Name is entered");
		Log.info("Name is entered");
	}

	public void enter_GroupDuplicateName(String input_GroupDuplicateName) {

		applyWait.waitForElementToBeClickable(group_DuplicateName, DefineConstants.explicitWait_30).clear();
		group_DuplicateName.sendKeys(input_GroupDuplicateName);
		try {
			Screenshots.takeScreenshot(driver, input_GroupDuplicateName + " name is entered as duplicate name");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_GroupDuplicateName + " name is entered as duplicate name");
		Log.info(input_GroupDuplicateName + " name is entered as duplicate name");
	}

	public void enterDescription(String inputDescription) {

		applyWait.waitForElementToBeClickable(group_DuplicateDescription, DefineConstants.explicitWait_30).clear();
		group_DuplicateDescription.sendKeys(inputDescription);
		try {
			Screenshots.takeScreenshot(driver, inputDescription + " Description is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, inputDescription + " Description is entered");
		Log.info(inputDescription + " Description is entered");
	}

	public void clickSaveGroup() {
		applyWait.waitForElementToBeClickable(saveGroup, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Save Group is clicked");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Save Group is clicked");
		Log.info("Save Group is clicked");
	}

	public void searchGroup(String inputContactName) {
		try {
			Thread.sleep(3000L);
			applyWait.waitForElementToBeClickable(searchGroup, DefineConstants.explicitWait_60)
					.sendKeys(inputContactName);
			searchGroup.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, inputContactName + " is entered");
			test.log(Status.INFO, inputContactName + " is entered");
			Log.info(inputContactName + " is entered");
			Thread.sleep(3000L);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickAddContactsCheckbox() {
		applyWait.waitForElementToBeClickable(addContacts_Checkbox, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Add contacts is clicked");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Add contacts is clicked");
		Log.info("Add contacts is clicked");
	}

	public void clickAddContactsSlider() {
		applyWait.waitForElementToBeClickable(addContacts_Button, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Add contacts slider is opened");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Add contacts slider is opened");
		Log.info("Add contacts slider is opened");
	}

	public void enterFirstName(String inputContactFirstName) {
		applyWait.waitForElementToBeClickable(firstName, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(firstName, inputContactFirstName);
		try {
			Screenshots.takeScreenshot(driver, "User selected " + inputContactFirstName + " from first name dropdown");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + inputContactFirstName + " from first name dropdown");
		Log.info("User selected " + inputContactFirstName + " from first name dropdown");
	}

	public void enterLastName(String inputContactLastName) {
		applyWait.waitForElementToBeClickable(lastName, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(lastName, inputContactLastName);
		try {
			Screenshots.takeScreenshot(driver, "User selected " + inputContactLastName + " as last Name");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + inputContactLastName + " as last Name");
		Log.info("User selected " + inputContactLastName + " as last Name");
	}

	public void startCount(String inputStart) {

		applyWait.waitForElementToBeClickable(startCount, DefineConstants.explicitWait_30).sendKeys(inputStart);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputStart + " as start count");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputStart + " as start count");
		Log.info("User entered " + inputStart + " as start count");
	}

	public void endCount(String inputEndCount) {
		applyWait.waitForElementToBeClickable(endCount, DefineConstants.explicitWait_30).sendKeys(inputEndCount);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputEndCount + " as end count");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputEndCount + " as end count");
		Log.info("User entered " + inputEndCount + " as end count");
	}

	public void enterRangeStart(String inputRangeStart) {
		applyWait.waitForElementToBeClickable(ageRangeStart, DefineConstants.explicitWait_30).sendKeys(inputRangeStart);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputRangeStart + " as start age range");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputRangeStart + " as start age range");
		Log.info("User entered " + inputRangeStart + " as start age range");
	}

	public void enterRangeEnd(String inputRangeEnd) {
		applyWait.waitForElementToBeClickable(ageRangeEnd, DefineConstants.explicitWait_30).sendKeys(inputRangeEnd);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputRangeEnd + " as end age range");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputRangeEnd + " as end age range");
		Log.info("User entered " + inputRangeEnd + " as end age range");
	}

	public void enterEducation(String inputEducation) {
		applyWait.waitForElementToBeClickable(education, DefineConstants.explicitWait_30).sendKeys(inputEducation + 1);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputEducation + " as Education");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputEducation + " as Education");
		Log.info("User entered " + inputEducation + " as Education");
	}

	public void selectGender(String inputSelectGender) {
		applyWait.waitForElementToBeClickable(gender, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(gender, inputSelectGender);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputSelectGender + " as Gender");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputSelectGender + " as Gender");
		Log.info("User entered " + inputSelectGender + " as Gender");
	}

	public void enterOccupation(String Occupation) {
		applyWait.waitForElementToBeClickable(occupation, DefineConstants.explicitWait_30).sendKeys(Occupation + 1);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + Occupation + " as occupation");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + Occupation + " as occupation");
		Log.info("User entered " + Occupation + " as occupation");
	}

	public void selectMartialStatus(String inputMartialStatus) {
		applyWait.waitForElementToBeClickable(maritalStatus, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(maritalStatus, inputMartialStatus);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputMartialStatus + " as Marital Status");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputMartialStatus + " as Marital Status");
		Log.info("User entered " + inputMartialStatus + " as Marital Status");
	}

	public void enterLocation(String inputLocation) {
		applyWait.waitForElementToBeClickable(location, DefineConstants.explicitWait_30).sendKeys(inputLocation);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputLocation + " as location");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputLocation + " as location");
		Log.info("User entered " + inputLocation + " as location");
	}

	public void enterInterests(String inputInterests) {
		applyWait.waitForElementToBeClickable(interests, DefineConstants.explicitWait_30).sendKeys(inputInterests);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputInterests + " as interests");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputInterests + " as interests");
		Log.info("User entered " + inputInterests + " as interests");
	}

	public void enterUtmSource(String inputUtmSource) {
		applyWait.waitForElementToBeClickable(utmSource, DefineConstants.explicitWait_30).sendKeys(inputUtmSource);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputUtmSource + " as input Utm Source");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputUtmSource + " as input Utm Source");
		Log.info("User entered " + inputUtmSource + " as input Utm Source");
	}

	public void enterUtmMedium(String inputUtmTerm) {
		applyWait.waitForElementToBeClickable(utmMedium, DefineConstants.explicitWait_30).sendKeys(inputUtmTerm);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputUtmTerm + " as input Utm Medium");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputUtmTerm + " as input Utm Medium");
		Log.info("User entered " + inputUtmTerm + " as input Utm Medium");
	}

	public void enterUtmCampaign(String input_UtmCampaign) {
		applyWait.waitForElementToBeClickable(utmCampaign, DefineConstants.explicitWait_30).sendKeys(input_UtmCampaign);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + input_UtmCampaign + " as input Utm Campaign");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_UtmCampaign + " as input Utm Campaign");
		Log.info("User entered " + input_UtmCampaign + " as input Utm Campaign");
	}

	public void enterUtmTerm(String input_UtmTerm) {
		applyWait.waitForElementToBeClickable(utmTerm, DefineConstants.explicitWait_30).sendKeys(input_UtmTerm);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + input_UtmTerm + " as input Utm term");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_UtmTerm + " as input Utm term");
		Log.info("User entered " + input_UtmTerm + " as input Utm term");
	}

	public void enterUtmContent(String input_UtmContent) {
		applyWait.waitForElementToBeClickable(utmContent, DefineConstants.explicitWait_30).sendKeys(input_UtmContent);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + input_UtmContent + " as input Utm Content");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + input_UtmContent + " as input Utm Content");
		Log.info("User entered " + input_UtmContent + " as input Utm Content");
	}

	public void selectMailSubscribe(String inputMailSubscribe) {
		applyWait.waitForElementToBeClickable(mailSubscribe, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(mailSubscribe, inputMailSubscribe);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputMailSubscribe + " as Mail Subscribe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputMailSubscribe + " as Mail Subscribe");
		Log.info("User entered " + inputMailSubscribe + " as Mail Subscribe");
	}

	public void selectMailOverallSubscribe(String inputMailOverallSubscribe) {
		applyWait.waitForElementToBeClickable(mailOverallSubscribe, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(mailOverallSubscribe, inputMailOverallSubscribe);
		try {
			Screenshots.takeScreenshot(driver,
					"User entered " + inputMailOverallSubscribe + " as mail Overall Subscribe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputMailOverallSubscribe + " as mail Overall Subscribe");
		Log.info("User entered " + inputMailOverallSubscribe + " as mail Overall Subscribe");
	}

	public void selectSMSSubscribe(String inputSMSSubscribe) {
		applyWait.waitForElementToBeClickable(mailSMSSubscribe, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(mailSMSSubscribe, inputSMSSubscribe);
		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputSMSSubscribe + " as SMS Subscribe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputSMSSubscribe + " as SMS Subscribe");
		Log.info("User entered " + inputSMSSubscribe + " as SMS Subscribe");
	}

	public void selectSMSOverallSubscribe(String inputSMSOverallSubscribe) {
		applyWait.waitForElementToBeClickable(sMSOverallSubscribe, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(sMSOverallSubscribe, inputSMSOverallSubscribe);
		try {
			Screenshots.takeScreenshot(driver,
					"User entered " + inputSMSOverallSubscribe + " as SMS Overall Subscribe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputSMSOverallSubscribe + " as SMS Overall Subscribe");
		Log.info("User entered " + inputSMSOverallSubscribe + " as SMS Overall Subscribe");
	}

	public void inputAccountType(String inputAccountType) {
		applyWait.waitForElementToBeClickable(accountType, DefineConstants.explicitWait_30).sendKeys(inputAccountType);

		try {
			Screenshots.takeScreenshot(driver, "User entered " + inputAccountType + " as account type");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputAccountType + " as account type");
		Log.info("User entered " + inputAccountType + " as account type");
	}

	public void clickCreatedFromDateCalendar(String inputCreatedFromDate) {

		applyWait.waitForElementToBeClickable(createdFromDateCalendar, DefineConstants.explicitWait_30).click();
		createdFromDate = driver.findElement(By.linkText(inputCreatedFromDate));
		applyWait.waitForElementToBeClickable(createdFromDateCalendar, DefineConstants.explicitWait_30).click();

		try {
			Screenshots.takeScreenshot(driver, "User selected " + inputCreatedFromDate + " as created from date");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + inputCreatedFromDate + " as created from date");
		Log.info("User selected " + inputCreatedFromDate + " as created from date");
	}

	public void clickCreatedToDateCalendar(String inputCreatedToDate) {

		applyWait.waitForElementToBeClickable(createdToDateCalendar, DefineConstants.explicitWait_30).click();
		createdFromDate = driver.findElement(By.linkText(inputCreatedToDate));
		applyWait.waitForElementToBeClickable(createdToDateCalendar, DefineConstants.explicitWait_30).click();

		try {
			Screenshots.takeScreenshot(driver, "User selected " + inputCreatedToDate + " as created to date");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + inputCreatedToDate + " as created to date");
		Log.info("User selected " + inputCreatedToDate + " as created to date");
	}

	public void selectIsAccountHolder(String isAccountHolder) {

		// if (isAccountHolder.equalsIgnoreCase("True")) {
		// applyWait.waitForElementToBeClickable(isAccountHolderTrue,
		// DefineConstants.explicitWait_30).click();
		//
		// } else {
		// applyWait.waitForElementToBeClickable(isAccountHolderFalse,
		// DefineConstants.explicitWait_30).click();
		// }
		dropDown.selectByVisibleText(isAccountHolderTrue, isAccountHolder);
		try {
			Screenshots.takeScreenshot(driver, "User selected " + isAccountHolder + " as is account holder");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User selected " + isAccountHolder + " as is account holder");
		Log.info("User selected " + isAccountHolder + " as is account holder");
	}

	public void enterAccountOpenedSource(String inputAccountOpenedSource) {

		applyWait.waitForElementToBeClickable(accountOpenedSource, DefineConstants.explicitWait_30)
				.sendKeys(inputAccountOpenedSource);

		try {
			Screenshots.takeScreenshot(driver,
					"User entered " + inputAccountOpenedSource + " as account opened source");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered " + inputAccountOpenedSource + " as account opened source");
		Log.info("User entered " + inputAccountOpenedSource + " as account opened source");
	}

}
