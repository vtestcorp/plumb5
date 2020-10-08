package com.plumb5.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.DefineConstants;
import helperMethods.DropDown;
import helperMethods.JavascriptClick;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.ScrollTypes;
import helperMethods.WaitTypes;

public class CreateContacts {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private DropDown dropDown;
	private JavascriptClick javascript;
	private ScrollTypes scrolltypes;
	private ITestResult result;

	public CreateContacts(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		this.dropDown = new DropDown(driver);
		javascript = new JavascriptClick(driver);
		scrolltypes = new ScrollTypes(driver);
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@placeholder='Email Id']")
	private WebElement emailId;

	@FindBy(xpath = "//input[@placeholder='Alternate Email Id']")
	private WebElement alternateEmailId;

	@FindBy(xpath = "//input[@placeholder='Phone Number']")
	private WebElement phoneNumber;

	@FindBy(xpath = "//input[@placeholder='Alternate Phone Number']")
	private WebElement alternatePhoneNumber;

	@FindBy(xpath = "//input[@placeholder='Address 1']")
	private WebElement address1;

	@FindBy(xpath = "//input[@placeholder='Address 2']")
	private WebElement address2;

	@FindBy(xpath = "//input[@placeholder='City']")
	private WebElement city;

	@FindBy(xpath = "//input[@placeholder='State']")
	private WebElement state;

	@FindBy(xpath = "//select[@id='ui_drpdwn_Country']")
	private WebElement country;

	@FindBy(xpath = "//input[@placeholder='Postal Code']")
	private WebElement postalCode;

	@FindBy(xpath = "//input[@placeholder='D.O.B']")
	private WebElement dob;

	@FindBy(xpath = "//input[@placeholder='D.O.B']//following::select[1]")
	private WebElement gender;

	@FindBy(xpath = "//input[@placeholder='D.O.B']//following::select[2]")
	private WebElement maritalStatus;

	@FindBy(xpath = "//input[@placeholder='Educaton EX:BBA, BE, BCA']")
	private WebElement education;

	@FindBy(xpath = "//input[@placeholder='Occupation EX:Doctor']")
	private WebElement occupation;

	@FindBy(xpath = "//input[@placeholder='Interests EX:Cricket']")
	private WebElement interests;

	@FindBy(xpath = "//input[@placeholder='Location']")
	private WebElement location;

	@FindBy(xpath = "//input[@placeholder='Religion']")
	private WebElement religion;

	@FindBy(xpath = "//input[@placeholder='Company Name']")
	private WebElement companyName;

	@FindBy(xpath = "//input[@placeholder='Company Web URL']")
	private WebElement companyWebUrl;

	@FindBy(xpath = "//input[@placeholder='Domain Name']")
	private WebElement domainName;

	@FindBy(xpath = "//input[@placeholder='Company Address']")
	private WebElement companyAddress;

	@FindBy(xpath = "//input[@placeholder='Projects']")
	private WebElement projects;

	@FindBy(xpath = "//input[@placeholder='Projects']//following::select[1]")
	private WebElement stage;

	@FindBy(xpath = "//textarea[@placeholder='Notes']")
	private WebElement notes;

	@FindBy(xpath = "//label[contains(text(),'NewExtra11111111111')]//following::textarea[1]")
	private WebElement newExtra;

	@FindBy(xpath = "//label[contains(text(),'Extra2')]//following::input[1]")
	private WebElement extra2;

	@FindBy(xpath = "//label[contains(text(),'testing only')]//following::input[1]")
	private WebElement testingonly;

	@FindBy(xpath = "//input[@placeholder='Sales Person']")
	private WebElement salesPerson;

	@FindBy(xpath = "//input[@placeholder='Sales Person']//following::input[1]")
	private WebElement Country;

	@FindBy(xpath = "//input[@placeholder='Sales Person']//following::select[1]")
	private WebElement projectCity;

	@FindBy(xpath = "//input[@placeholder='Sales Person']//following::select[2]")
	private WebElement source;

	@FindBy(xpath = "//input[@placeholder='Sales Person']//following::select[3]")
	private WebElement appointmentDone;

	@FindBy(xpath = "//textarea[@placeholder='Query in detail']")
	private WebElement queryInDetail;

	@FindBy(xpath = "//textarea[@placeholder='Query in detail']//following::input[1]")
	private WebElement Projects;

	@FindBy(xpath = "//input[@placeholder='Visitor Location']")
	private WebElement visitorLocation;

	@FindBy(xpath = "//input[@placeholder='Code']")
	private WebElement code;

	@FindBy(xpath = "//input[@placeholder='Code']//following::input[1]")
	private WebElement cityTwo;

	@FindBy(xpath = "//input[@placeholder='Code']//following::input[2]")
	private WebElement locationTwo;

	@FindBy(xpath = "//input[@placeholder='Code']//following::select[1]")
	private WebElement google;

	@FindBy(xpath = "//input[@placeholder='Code']//following::select[2]")
	private WebElement budget;

	@FindBy(xpath = "//input[@placeholder='Code']//following::select[3]")
	private WebElement projectsTwo;

	@FindBy(xpath = "//input[@placeholder='Project Location']")
	private WebElement projectLocation;

	@FindBy(xpath = "//textarea[@placeholder='Additional Question']")
	private WebElement additionalQuestion;

	@FindBy(xpath = "//input[@placeholder='Leads Value']")
	private WebElement leadsValue;

	@FindBy(xpath = "//button[@class='btn btn-primary mr-2']")
	private WebElement createContact;

	@FindBy(xpath = "//button[@class='btn btn-second mr-2 add-custom-fields']")
	private WebElement addCustomFields;

	@FindBy(xpath = "//input[@id='ui_txtFieldName']")
	private WebElement customFieldName;

	@FindBy(xpath = "//select[@id='ui_ddlFieldType']")
	private WebElement customFieldType;

	@FindBy(xpath = "//label[contains(text(),'Yes')]")
	private WebElement customMandateYes;

	@FindBy(xpath = "//label[@class='custom-control-label'][contains(text(),'No')]")
	private WebElement customMandateNo;

	@FindBy(xpath = "//button[@id='ui_btnAddField']")
	private WebElement customAddField;

	@FindBy(xpath = "//textarea[@id='ui_txtArea_CustomField_6']")
	private WebElement customOneTest;

	@FindBy(xpath = "//textarea[@id='ui_txtArea_CustomField_7']")
	private WebElement fieldOne;

	@FindBy(xpath = "//textarea[@id='ui_txtArea_CustomField_8']")
	private WebElement fieldTwo;

	@FindBy(xpath = "//textarea[@id='ui_txtArea_CustomField_9']")
	private WebElement one;

	@FindBy(xpath = "//textarea[@id='ui_txtArea_CustomField_10']")
	private WebElement two;

	@FindBy(xpath = "//textarea[@id='ui_txtArea_CustomField_11']")
	private WebElement oneone;

	@FindBy(xpath = "//textarea[@id='ui_txtArea_CustomField_12']")
	private WebElement kk;

	@FindBy(xpath = "//label[text()='cxxzzxCzxc']//following::input[1]")
	private WebElement cxxzzxCzxc;

	@FindBy(id = "ui_span_MasterSuccess_Message")
	private WebElement successMessage;

	@FindBy(id = "ui_span_MasterError_Message")
	private WebElement errorMessage;

	private WebElement verifyCustomField;

	@FindBy(xpath = "//button[@id='btnCancelCreateContact']")
	private WebElement cancelButton;

	public void enterFirstName(String username) {
		applyWait.waitForElementToBeClickable(firstName, DefineConstants.explicitWait_30).sendKeys(username);
		try {
			Screenshots.takeScreenshot(driver, "First Name entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered first name");
		Log.info("User entered first name");
	}

	public void enterLastName(String last_Name) {
		applyWait.waitForElementToBeClickable(lastName, DefineConstants.explicitWait_30).sendKeys(last_Name);
		try {
			Screenshots.takeScreenshot(driver, "Last Name entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "User entered last name");
		Log.info("User entered last name");
	}

	public void enterEmailID(String emailID) {
		applyWait.waitForElementToBeClickable(emailId, DefineConstants.explicitWait_30).sendKeys(emailID);
		try {
			Screenshots.takeScreenshot(driver, "Email Id is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Email Id is entered");
		Log.info("Email Id is entered");
	}

	public void enterAlternateEmailID(String alternateEmailID) {
		applyWait.waitForElementToBeClickable(alternateEmailId, DefineConstants.explicitWait_30)
				.sendKeys(alternateEmailID);
		try {
			Screenshots.takeScreenshot(driver, "Alternate email Id is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Alternate email Id is entered");
		Log.info("Alternate email Id is entered");
	}

	public void enterPhoneNumber(String phone_Number) {
		applyWait.waitForElementToBeClickable(phoneNumber, DefineConstants.explicitWait_30).sendKeys(phone_Number);
		try {
			Screenshots.takeScreenshot(driver, "Phone number is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Phone number is entered");
		Log.info("Phone number is entered");
	}

	public void enterAlternatePhoneNumber(String alternate_PhoneNumber) {
		applyWait.waitForElementToBeClickable(alternatePhoneNumber, DefineConstants.explicitWait_30)
				.sendKeys(alternate_PhoneNumber);
		try {
			Screenshots.takeScreenshot(driver, "Alternate phone number is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Alternate phone number is entered");
		Log.info("Alternate phone number is entered");
	}

	public void enterAddress1(String address_1) {
		applyWait.waitForElementToBeClickable(address1, DefineConstants.explicitWait_30).sendKeys(address_1);
		try {
			Screenshots.takeScreenshot(driver, "address 1 is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "address 1 is entered");
		Log.info("address 1 is entered");
	}

	public void enterAddress2(String address_2) {
		applyWait.waitForElementToBeClickable(address2, DefineConstants.explicitWait_30).sendKeys(address_2);
		try {
			Screenshots.takeScreenshot(driver, "address 2 is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "address 2 is entered");
		Log.info("address 2 is entered");
	}

	public void enterCity(String inputCity) {
		applyWait.waitForElementToBeClickable(city, DefineConstants.explicitWait_30).sendKeys(inputCity);
		try {
			Screenshots.takeScreenshot(driver, "city is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "city is entered");
		Log.info("city is entered");
	}

	public void enterState(String input_State) {
		applyWait.waitForElementToBeClickable(state, DefineConstants.explicitWait_30).sendKeys(input_State);
		try {
			Screenshots.takeScreenshot(driver, "State is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "State is entered");
		Log.info("State is entered");
	}

	public void enterCountry(String input_Country) {
		applyWait.waitForElementToBeClickable(country, DefineConstants.explicitWait_30).sendKeys(input_Country);
		dropDown.selectByVisibleText(country, input_Country);
		try {
			Screenshots.takeScreenshot(driver, "Country is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Country is entered");
		Log.info("Country is entered");
	}

	public void enterPostalCode(String input_PostalCode) {
		applyWait.waitForElementToBeClickable(postalCode, DefineConstants.explicitWait_30).sendKeys(input_PostalCode);
		try {
			Screenshots.takeScreenshot(driver, "Postal code is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Postal code is entered");
		Log.info("Postal code is entered");
	}

	public void enterDOB(String input_DOB) {
		applyWait.waitForElementToBeClickable(dob, DefineConstants.explicitWait_30).sendKeys(input_DOB);
		try {
			Screenshots.takeScreenshot(driver, "DOB is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "DOB is entered");
		Log.info("DOB is entered");
	}

	public void selectGender(String selectGender) {
		applyWait.waitForElementToBeClickable(gender, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(gender, selectGender);
		try {
			Screenshots.takeScreenshot(driver, "Gender is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Gender is selected");
		Log.info("Gender is selected");
	}

	public void selectMaritalStatus(String select_MaritalStatus) {
		applyWait.waitForElementToBeClickable(gender, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(maritalStatus, select_MaritalStatus);
		try {
			Screenshots.takeScreenshot(driver, "Marital status is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Marital status is selected");
		Log.info("Marital status is selected");
	}

	public void enterEducation(String input_Education) {
		applyWait.waitForElementToBeClickable(education, DefineConstants.explicitWait_30).sendKeys(input_Education);
		try {
			Screenshots.takeScreenshot(driver, "Education is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Education is entered");
		Log.info("Education is entered");
	}

	public void enterOccupation(String input_Occupation) {
		applyWait.waitForElementToBeClickable(occupation, DefineConstants.explicitWait_30).sendKeys(input_Occupation);
		try {
			Screenshots.takeScreenshot(driver, "Occupation is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Occupation is entered");
		Log.info("Occupation is entered");
	}

	public void enterInterests(String input_Interests) {
		applyWait.waitForElementToBeClickable(interests, DefineConstants.explicitWait_30).sendKeys(input_Interests);
		try {
			Screenshots.takeScreenshot(driver, "Interests is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Interests is entered");
		Log.info("Interests is entered");
	}

	public void enterReligion(String input_Religion) {
		applyWait.waitForElementToBeClickable(religion, DefineConstants.explicitWait_30).sendKeys(input_Religion);
		try {
			Screenshots.takeScreenshot(driver, "Religion is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Religion is entered");
		Log.info("Religion is entered");
	}

	public void enterCompanyName(String input_CompanyName) {
		applyWait.waitForElementToBeClickable(companyName, DefineConstants.explicitWait_30).sendKeys(input_CompanyName);
		try {
			Screenshots.takeScreenshot(driver, "Company Name is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Company Name is entered");
		Log.info("Company Name is entered");
	}

	public void enterCompanyUrl(String input_CompanyUrl) {
		applyWait.waitForElementToBeClickable(companyWebUrl, DefineConstants.explicitWait_30)
				.sendKeys(input_CompanyUrl);
		try {
			Screenshots.takeScreenshot(driver, "Company Url is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Company Url is entered");
		Log.info("Company Url is entered");
	}

	public void enterDomainName(String input_DomainName) {
		applyWait.waitForElementToBeClickable(domainName, DefineConstants.explicitWait_30).sendKeys(input_DomainName);
		try {
			Screenshots.takeScreenshot(driver, "Domain name is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Domain name is entered");
		Log.info("Domain name is entered");
	}

	public void enterCompanyAddress(String input_CompanyAddress) {
		applyWait.waitForElementToBeClickable(companyAddress, DefineConstants.explicitWait_30)
				.sendKeys(input_CompanyAddress);
		try {
			Screenshots.takeScreenshot(driver, "Company Address is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Company Address is entered");
		Log.info("Company Address is entered");
	}

	public void enterProject(String input_Projects) {
		applyWait.waitForElementToBeClickable(projects, DefineConstants.explicitWait_30).sendKeys(input_Projects);
		try {
			Screenshots.takeScreenshot(driver, "Project is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Project is entered");
		Log.info("Project is entered");
	}

	public void enterStage(String input_Stage) {
		applyWait.waitForElementToBeClickable(stage, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(stage, input_Stage);
		try {
			Screenshots.takeScreenshot(driver, "stage is selected as " + input_Stage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "stage is selected as " + input_Stage);
		Log.info("stage is selected as " + input_Stage);
	}

	public void enterNotes(String input_Notes) {
		applyWait.waitForElementToBeClickable(notes, DefineConstants.explicitWait_30).sendKeys(input_Notes);
		try {
			Screenshots.takeScreenshot(driver, "stage is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "stage is entered");
		Log.info("stage is entered");
	}

	public void enterNewExtra(String input_NewExtra) {
		applyWait.waitForElementToBeClickable(newExtra, DefineConstants.explicitWait_30).sendKeys(input_NewExtra);
		try {
			Screenshots.takeScreenshot(driver, "NewExtra is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "NewExtra is entered");
		Log.info("NewExtra is entered");
	}

	public void enterExtra2(String input_Extra2) {
		applyWait.waitForElementToBeClickable(extra2, DefineConstants.explicitWait_30).sendKeys(input_Extra2);
		try {
			Screenshots.takeScreenshot(driver, "Extra 2 is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Extra 2 is entered");
		Log.info("Extra 2 is entered");
	}

	public void enterTestingOnly(String input_TestingOnly) {
		applyWait.waitForElementToBeClickable(testingonly, DefineConstants.explicitWait_30).sendKeys(input_TestingOnly);
		try {
			Screenshots.takeScreenshot(driver, "Testing Only is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Testing Only is entered");
		Log.info("Testing Only is entered");
	}

	public void enterCustomOneTest(String input_CustomOneTest) {
		applyWait.waitForElementToBeClickable(customOneTest, DefineConstants.explicitWait_30)
				.sendKeys(input_CustomOneTest);
		try {
			Screenshots.takeScreenshot(driver, input_CustomOneTest + " is entered as custom one test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_CustomOneTest + " is entered as custom one test");
		Log.info(input_CustomOneTest + " is entered as custom one test");
	}

	public void enterFieldOne(String input_FieldOne) {
		applyWait.waitForElementToBeClickable(fieldOne, DefineConstants.explicitWait_30).sendKeys(input_FieldOne);
		try {
			Screenshots.takeScreenshot(driver, input_FieldOne + " is entered as field one");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_FieldOne + " is entered as field one");
		Log.info(input_FieldOne + " is entered as field one");
	}

	public void enterFieldTwo(String input_FieldTwo) {
		applyWait.waitForElementToBeClickable(fieldTwo, DefineConstants.explicitWait_30).sendKeys(input_FieldTwo);
		try {
			Screenshots.takeScreenshot(driver, input_FieldTwo + " is entered as field two");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_FieldTwo + " is entered as field two");
		Log.info(input_FieldTwo + " is entered as field two");
	}

	public void enterOne(String input_One) {
		applyWait.waitForElementToBeClickable(one, DefineConstants.explicitWait_30).sendKeys(input_One);
		try {
			Screenshots.takeScreenshot(driver, input_One + " is entered as one");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_One + " is entered as one");
		Log.info(input_One + " is entered as one");
	}

	public void enterTwo(String input_Two) {
		applyWait.waitForElementToBeClickable(two, DefineConstants.explicitWait_30).sendKeys(input_Two);
		try {
			Screenshots.takeScreenshot(driver, input_Two + " is entered as two");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_Two + " is entered as two");
		Log.info(input_Two + " is entered as two");
	}

	public void enterOneOne(String input_OneOne) {
		applyWait.waitForElementToBeClickable(oneone, DefineConstants.explicitWait_30).sendKeys(input_OneOne);
		try {
			Screenshots.takeScreenshot(driver, input_OneOne + " is entered as one one");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_OneOne + " is entered as one one");
		Log.info(input_OneOne + " is entered as one one");
	}

	public void enterKK(String input_KK) {
		applyWait.waitForElementToBeClickable(kk, DefineConstants.explicitWait_30).sendKeys(input_KK);
		try {
			Screenshots.takeScreenshot(driver, input_KK + " is entered as KK");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, input_KK + " is entered as kk");
		Log.info(input_KK + " is entered as kk");
	}

	public void entercxxzzxCzxc(String inputcxxzzxCzxc) {
		applyWait.waitForElementToBeClickable(cxxzzxCzxc, DefineConstants.explicitWait_30).sendKeys(inputcxxzzxCzxc);
		try {
			Screenshots.takeScreenshot(driver, inputcxxzzxCzxc + " is entered as cxxzzxCzxc");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, inputcxxzzxCzxc + " is entered as cxxzzxCzxc");
		Log.info(inputcxxzzxCzxc + " is entered as cxxzzxCzxc");
	}

	public void enterSalesPerson(String input_SalesPerson) {
		applyWait.waitForElementToBeClickable(salesPerson, DefineConstants.explicitWait_30).sendKeys(input_SalesPerson);
		try {
			Screenshots.takeScreenshot(driver, "Sales Person name is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Sales Person name is entered");
		Log.info("Sales Person name is entered");
	}

	public void enter_Country(String input_Country) {
		applyWait.waitForElementToBeClickable(Country, DefineConstants.explicitWait_30).sendKeys(input_Country);

		try {
			Screenshots.takeScreenshot(driver, "Country name is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Country name is entered");
		Log.info("Country name is entered");
	}

	public void select_ProjectCity(String input_ProjectCity) {
		applyWait.waitForElementToBeClickable(projectCity, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(projectCity, input_ProjectCity);
		try {
			Screenshots.takeScreenshot(driver, "Project city is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Project city is selected");
		Log.info("Project city is selected");
	}

	public void select_Source(String input_Source) {
		applyWait.waitForElementToBeClickable(source, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(source, input_Source);
		try {
			Screenshots.takeScreenshot(driver, "Select Source is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Select Source is selected");
		Log.info("Select Source is selected");
	}

	public void select_AppointmentDone(String input_AppointmentDone) {
		applyWait.waitForElementToBeClickable(appointmentDone, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(appointmentDone, input_AppointmentDone);
		try {
			Screenshots.takeScreenshot(driver, "Appointment Done is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Appointment Done is selected");
		Log.info("Appointment Done is selected");
	}

	public void input_QueryInDetail(String input_QueryInDetail) {
		applyWait.waitForElementToBeClickable(queryInDetail, DefineConstants.explicitWait_30)
				.sendKeys(input_QueryInDetail);
		try {
			Screenshots.takeScreenshot(driver, "Query in detail is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Query in detail is entered");
		Log.info("Query in detail is entered");
	}

	public void input_Projects(String input_Projects) {
		applyWait.waitForElementToBeClickable(Projects, DefineConstants.explicitWait_30).sendKeys(input_Projects);
		try {
			Screenshots.takeScreenshot(driver, "Projects is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Projects is entered");
		Log.info("Projects is entered");
	}

	public void input_VisitorLocation(String input_VisitorLocation) {
		applyWait.waitForElementToBeClickable(visitorLocation, DefineConstants.explicitWait_30)
				.sendKeys(input_VisitorLocation);
		try {
			Screenshots.takeScreenshot(driver, "Visitor Location is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Visitor Location is entered");
		Log.info("Visitor Location is entered");
	}

	public void input_Code(String input_Code) {
		applyWait.waitForElementToBeClickable(code, DefineConstants.explicitWait_30).sendKeys(input_Code);
		try {
			Screenshots.takeScreenshot(driver, "Code is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Code is entered");
		Log.info("Code is entered");
	}

	public void input_City2(String input_City2) {
		applyWait.waitForElementToBeClickable(cityTwo, DefineConstants.explicitWait_30).sendKeys(input_City2);
		try {
			Screenshots.takeScreenshot(driver, "City 2 is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "City 2 is entered");
		Log.info("City 2 is entered");
	}

	public void input_Location2(String input_Location2) {
		applyWait.waitForElementToBeClickable(locationTwo, DefineConstants.explicitWait_30).sendKeys(input_Location2);
		try {
			Screenshots.takeScreenshot(driver, "Location 2 is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Location 2 is entered");
		Log.info("Location 2 is entered");
	}

	public void selectGoogle(String selectGoogle) {
		applyWait.waitForElementToBeClickable(locationTwo, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(google, selectGoogle);
		try {
			Screenshots.takeScreenshot(driver, selectGoogle + " is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, selectGoogle + " is selected");
		Log.info(selectGoogle + " is selected");
	}

	public void selectBudget(String selectBudget) {
		applyWait.waitForElementToBeClickable(budget, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(budget, selectBudget);
		try {
			Screenshots.takeScreenshot(driver, "Budget is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, selectBudget + "Budget is selected");
		Log.info(selectBudget + "Budget is selected");
	}

	public void selectProjectsTwo(String selectProjectsTwo) {
		applyWait.waitForElementToBeClickable(projectsTwo, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(projectsTwo, selectProjectsTwo);
		try {
			Screenshots.takeScreenshot(driver, selectProjectsTwo + " is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, selectProjectsTwo + " is selected");
		Log.info(selectProjectsTwo + " is selected");
	}

	public void input_ProjectLocation(String input_ProjectLocation) {
		applyWait.waitForElementToBeClickable(projectLocation, DefineConstants.explicitWait_30)
				.sendKeys(input_ProjectLocation);
		try {
			Screenshots.takeScreenshot(driver, "Project Location is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Project Location is entered");
		Log.info("Project Location is entered");
	}

	public void input_AdditionalQuestion(String input_AdditionalQuestion) {
		applyWait.waitForElementToBeClickable(additionalQuestion, DefineConstants.explicitWait_30)
				.sendKeys(input_AdditionalQuestion);
		try {
			Screenshots.takeScreenshot(driver, "Additional Question is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Additional Question is entered");
		Log.info("Additional Question is entered");
	}

	public void input_LeadsValue(String input_LeadsValue) {
		applyWait.waitForElementToBeClickable(leadsValue, DefineConstants.explicitWait_30).sendKeys(input_LeadsValue);
		try {
			Screenshots.takeScreenshot(driver, "Leads Value is entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Leads Value is entered");
		Log.info("Leads Value is entered");
	}

	public void clickCreateContact() {
		applyWait.waitForElementToBeClickable(createContact, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Create contact is clicked");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Create contact is clicked");
		Log.info("Create contact is clicked");

		applyWait.waitForElementToBeClickable(successMessage, DefineConstants.explicitWait_30);

		if (successMessage.getText().equals("Contact added successfully")) {
			try {
				Screenshots.takeScreenshot(driver, "Contact added successfully displayed to user");
			} catch (IOException e) {
				e.printStackTrace();
			}
			test.log(Status.INFO, "Contact added successfully displayed to user");
			Log.info("Contact added successfully displayed to user");
		}
	}

	public void clickCustomFields() {
		applyWait.waitForElementToBeClickable(addCustomFields, DefineConstants.explicitWait_30).click();
		try {
			Screenshots.takeScreenshot(driver, "Add custom fields is clicked");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Add custom fields is clicked");
		Log.info("Add custom fields is clicked");
	}

	public void enterCustomFieldName(String inputCustomFieldName) {
		applyWait.waitForElementToBeClickable(customFieldName, DefineConstants.explicitWait_30)
				.sendKeys(inputCustomFieldName);
		try {
			Screenshots.takeScreenshot(driver, inputCustomFieldName + " is entered as field name");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, inputCustomFieldName + " is entered as field name");
		Log.info(inputCustomFieldName + " is entered as field name");
	}

	public void selectFieldType(String inputFieldType) {
		applyWait.waitForElementToBeClickable(customFieldType, DefineConstants.explicitWait_30);
		dropDown.selectByVisibleText(customFieldType, inputFieldType);
		try {
			Screenshots.takeScreenshot(driver, inputFieldType + " is selected as field type");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, inputFieldType + " is selected as field type");
		Log.info(inputFieldType + " is selected as field type");
	}

	public void selectMandate(String inputMandate) {

		if (inputMandate.equalsIgnoreCase("Yes")) {
			applyWait.waitForElementToBeClickable(customMandateYes, DefineConstants.explicitWait_30).click();
		} else if (inputMandate.equalsIgnoreCase("No")) {
			applyWait.waitForElementToBeClickable(customMandateNo, DefineConstants.explicitWait_30).click();
		}
		try {
			Screenshots.takeScreenshot(driver, inputMandate + " is selected");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, inputMandate + " is selected");
		Log.info(inputMandate + " is selected");
	}

	public void clickAddField() {
		applyWait.waitForElementToBeClickable(customAddField, DefineConstants.explicitWait_30).click();
		// javascript.click(customAddField);
		try {
			Screenshots.takeScreenshot(driver, "Add field button is clicked");
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.INFO, "Add field button is clicked");
		Log.info("Add field button is clicked");
	}

	public void verifyCustomFieldSuccessMessage(String fieldName) throws InterruptedException {
		System.out.println("Started");
		if (successMessage.isDisplayed()) {
			javascript.highLighterMethod(successMessage);
			System.out.println("started one");
			System.out.println("Success Message is " + successMessage.getText());
			try {
				Screenshots.takeScreenshot(driver, "Custom field " + fieldName + " created successfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
			test.log(Status.INFO, "Custom field " + fieldName + " created successfully");
			Log.info("Custom field " + fieldName + " created successfully");
			addCustomFields.click();
			Assert.assertEquals(successMessage.getText(), "Custom field created successfully");
			System.out.println("Custom field " + fieldName + " created successfully");
			verifyCustomField(fieldName);
		} else if (errorMessage.isDisplayed()) {
			System.out.println("started two");
			System.out.println("Error Message is " + errorMessage.getText());
			javascript.highLighterMethod(errorMessage);
			try {
				Screenshots.takeScreenshot(driver, "Custom field " + fieldName + " is already created");
			} catch (IOException e) {
				e.printStackTrace();
			}
			test.log(Status.INFO, "Custom field " + fieldName + " is already created");
			Log.info("Custom field " + fieldName + " is already created");
			// addCustomFields.click();
			Assert.assertEquals(errorMessage.getText(), "Custom field created successfully");
			System.out.println("Custom field " + fieldName + " is already created");
		}
	}

	public void verifyCustomField(String inputVerifyCustomField) {
		
		verifyCustomField = driver.findElement(By.xpath("//label[text()='" + inputVerifyCustomField + "']"));
		applyWait.waitForElementToBeClickable(verifyCustomField, DefineConstants.explicitWait_30);

		if (verifyCustomField.isDisplayed() || verifyCustomField.isEnabled()) {
			try {
				scrolltypes.scrollInToView(verifyCustomField);
				javascript.highLighterMethod(verifyCustomField);
				Screenshots.takeScreenshot(driver, inputVerifyCustomField + " is present");
			} catch (IOException e) {
				e.printStackTrace();
			}
			test.log(Status.INFO, inputVerifyCustomField + " is present");
			Log.info(inputVerifyCustomField + " is present");
			Assert.assertTrue(verifyCustomField.isDisplayed() || verifyCustomField.isEnabled());
		} else {
			try {
				Screenshots.takeScreenshot(driver, inputVerifyCustomField + " is not present");
				Assert.assertFalse(false, inputVerifyCustomField + " is not present");
				test.log(Status.INFO, inputVerifyCustomField + " is not present");
				Log.info(inputVerifyCustomField + " is not present");
				Assert.assertTrue(verifyCustomField.isDisplayed() || verifyCustomField.isEnabled());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}