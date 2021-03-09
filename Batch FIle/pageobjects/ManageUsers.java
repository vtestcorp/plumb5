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
import helperMethods.JavascriptClick;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class ManageUsers {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;

	public ManageUsers(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'Create User')]")
	private WebElement createUser;

	private List<WebElement> tableRows;

	private List<WebElement> tableColums;

	@FindBy(xpath = "//span[@id='ui_span_MasterSuccess_Message']")
	private WebElement addedSuccessfullyMessage;

	@FindBy(xpath = "//span[@id='ui_span_MasterError_Message']")
	private WebElement errorMessage;

	@FindBy(xpath = "//table[@id='ui_tbUserDetails']")
	private WebElement userTable;

	@FindBy(xpath = "//table[@id='ui_tbRolesDetails']")
	private WebElement roleTable;

	@FindBy(xpath = "//table[@id='ui_tbGroupDetails']")
	private WebElement groupTable;

	// create user
	@FindBy(xpath = "//label[contains(text(),'First Name')]//following::input[1]")
	private WebElement firstName;

	@FindBy(xpath = "//label[contains(text(),'Last Name')]//following::input[1]")
	private WebElement lastName;

	@FindBy(xpath = "//label[contains(text(),'Email Id')]//following::input[1]")
	private WebElement emailId;

	@FindBy(xpath = "//label[contains(text(),'Mobile Number')]//following::input[1]")
	private WebElement mobileNumber;

	@FindBy(xpath = "//label[contains(text(),'Report To')]//following::span[1]")
	private WebElement reportTo;

	@FindBy(xpath = "//label[contains(text(),'Report To')]//following::input[5]")
	private WebElement reportTo_Search;

	@FindBy(xpath = "//label[contains(text(),'Role')]//following::span[1]")
	private WebElement role;

	@FindBy(xpath = "//label[contains(text(),'Role')]//following::input[5]")
	private WebElement role_Search;

	@FindBy(xpath = "//label[contains(text(),'Account')]//following::input[1]")
	private WebElement account;

	@FindBy(xpath = "//label[contains(text(),'Group')]//following::input[1]")
	private WebElement group;

	@FindBy(xpath = "//button[@id='ui_btnSaveOrUpdate']")
	private WebElement saveButton;

	// Roles
	@FindBy(xpath = "//a[contains(text(),'Roles')]")
	private WebElement roles;

	@FindBy(xpath = "//a[contains(text(),'Create Role')]")
	private WebElement createRole;

	@FindBy(xpath = "//label[contains(text(),'Role Name*')]//following::input[1]")
	private WebElement rolename;

	@FindBy(xpath = "//label[contains(text(),'Role Description*')]//following::textarea[1]")
	private WebElement roleDescription;

	@FindBy(xpath = "//label[contains(text(),'Role Description*')]//following::label[1]")
	private WebElement administrator;

	@FindBy(xpath = "//button[@id='ui_SaveRoleDetails']")
	private WebElement saveButton_Roles;

	@FindBy(xpath = "//input[@id='ui_RolesSerach']")
	private WebElement searchRoles;

	// Groups
	@FindBy(xpath = "//a[contains(text(),'Roles')]//following::div[1]")
	private WebElement groups;

	@FindBy(xpath = "//a[contains(text(),'Create Group')]")
	private WebElement createGroups;

	@FindBy(xpath = "//label[contains(text(),'Group Name*')]//following::input[1]")
	private WebElement groupName;

	@FindBy(xpath = "//label[contains(text(),'Group Description*')]//following::textarea[1]")
	private WebElement groupDescription;

	@FindBy(xpath = "//td[contains(text(),'Plumb5V6')]//following::div[1]")
	private WebElement plumb5V6_Checkbox;

	@FindBy(xpath = "//td[contains(text(),'FullControl')]//following::div[1]")
	private WebElement fullControl_Checkbox;

	@FindBy(xpath = "//button[@id='ui_btnSaveGroupDetails']")
	private WebElement saveButton_Group;

	@FindBy(xpath = "//input[@id='ui_SearchByGroupName']")
	private WebElement searchGroups;

	@FindBy(linkText = "Edit")
	private WebElement edit_Button;

	private WebElement users,roleName,groupNames;

	@FindBy(linkText = "Delete")
	private WebElement delete_Button;
	
	@FindBy(xpath = "//button[@id='deleteRowConfirm']")
	private WebElement delete_ButtonPopUp;
	
	public void click_CreateUser() {
		try {
			applyWait.waitForElementToBeClickable(createUser, DefineConstants.explicitWait_30);
			javascriptClick.click(createUser);
			Screenshots.takeScreenshot(driver, "User clicked create user");
			test.log(Status.INFO, "User clicked create user");
			Log.info("User clicked create user");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_FirstName(String input_FirstName) {
		try {
			applyWait.waitForElementToBeClickable(firstName, DefineConstants.explicitWait_30).clear();
			firstName.sendKeys(input_FirstName);
			Screenshots.takeScreenshot(driver, "User entered " + input_FirstName + " as first name");
			test.log(Status.INFO, "User entered " + input_FirstName + " as first name");
			Log.info("User entered " + input_FirstName + " as first name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_LastName(String input_LastName) {
		try {
			applyWait.waitForElementToBeClickable(lastName, DefineConstants.explicitWait_30).clear();
			lastName.sendKeys(input_LastName);
			Screenshots.takeScreenshot(driver, "User entered " + input_LastName + " as last name");
			test.log(Status.INFO, "User entered " + input_LastName + " as last name");
			Log.info("User entered " + input_LastName + " as last name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_EmailID(String input_EmailID) {
		try {
			applyWait.waitForElementToBeClickable(emailId, DefineConstants.explicitWait_30).sendKeys(input_EmailID);
			Screenshots.takeScreenshot(driver, "User entered " + input_EmailID + " as Email Id");
			test.log(Status.INFO, "User entered " + input_EmailID + " as Email Id");
			Log.info("User entered " + input_EmailID + " as Email Id");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_MobileNumber(String input_MobileNumber) {
		try {
			applyWait.waitForElementToBeClickable(mobileNumber, DefineConstants.explicitWait_30).clear();
			mobileNumber.sendKeys(input_MobileNumber);
			Screenshots.takeScreenshot(driver, "User entered " + input_MobileNumber + " as Mobile Number");
			test.log(Status.INFO, "User entered " + input_MobileNumber + " as Mobile Number");
			Log.info("User entered " + input_MobileNumber + " as Mobile Number");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_ReportTo(String input_ReportTo) {
		try {
			applyWait.waitForElementToBeClickable(reportTo, DefineConstants.explicitWait_30).click();
			reportTo_Search.sendKeys(input_ReportTo);
			reportTo_Search.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User entered " + input_ReportTo + " as Report To");
			test.log(Status.INFO, "User entered " + input_ReportTo + " as Report To");
			Log.info("User entered " + input_ReportTo + " as Report To");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_Role(String input_Role) {
		try {
			applyWait.waitForElementToBeClickable(role, DefineConstants.explicitWait_30).click();
			role_Search.sendKeys(input_Role);
			role_Search.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User entered " + input_Role + " as Role");
			test.log(Status.INFO, "User entered " + input_Role + " as Role");
			Log.info("User entered " + input_Role + " as Role");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_Account(String input_Account) {
		try {
			applyWait.waitForElementToBeClickable(account, DefineConstants.explicitWait_30).clear();
			account.sendKeys(input_Account);
			account.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User entered " + input_Account + " as Account");
			test.log(Status.INFO, "User entered " + input_Account + " as Account");
			Log.info("User entered " + input_Account + " as Account");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_Group(String input_Group) {
		try {
			applyWait.waitForElementToBeClickable(group, DefineConstants.explicitWait_30).sendKeys(input_Group);
			group.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User entered " + input_Group + " as Group");
			test.log(Status.INFO, "User entered " + input_Group + " as Group");
			Log.info("User entered " + input_Group + " as Group");
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
			Thread.sleep(3000L);
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

	public void verifyInputValue(String value) {
		applyWait.waitForElementToBeClickable(userTable, DefineConstants.explicitWait_60);
		tableRows = userTable.findElements(By.tagName("tr"));
		System.out.println("value is " + value);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.contains(value)) {
					System.out.println("value is: " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, value + " is verified");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, value + " is verified");
					Log.info(value + " is verified");
					Assert.assertTrue(true, value + " is verified");
				}

				else if (cellText.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, value + " is not found");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						System.out.println("value is " + cellText);
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, value + " is not found");
					Log.info(value + " is not found");
					Assert.assertTrue(false, value + " is not found");
				}
			}
		}
	}

	public void verifyRoleName(String value) {
		applyWait.waitForElementToBeClickable(roleTable, DefineConstants.explicitWait_60);
		tableRows = roleTable.findElements(By.tagName("tr"));
		System.out.println("value is " + value);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.contains(value)) {
					System.out.println("value is: " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, value + " is verified");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, value + " is verified");
					Log.info(value + " is verified");
					Assert.assertTrue(true, value + " is verified");
				}

				else if (cellText.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, value + " is not found");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						System.out.println("value is " + cellText);
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, value + " is not found");
					Log.info(value + " is not found");
					Assert.assertTrue(false, value + " is not found");
				}
			}
		}
	}

	public void click_Roles() {
		try {
			applyWait.waitForElementToBeClickable(roles, DefineConstants.explicitWait_30);
			javascriptClick.click(roles);
			Screenshots.takeScreenshot(driver, "User clicked Roles tab");
			test.log(Status.INFO, "User clicked Roles tab");
			Log.info("User clicked Roles tab");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_CreateRole() {
		try {
			applyWait.waitForElementToBeClickable(createRole, DefineConstants.explicitWait_30);
			javascriptClick.click(createRole);
			Screenshots.takeScreenshot(driver, "User clicked Create Roles Button");
			test.log(Status.INFO, "User clicked Create Roles Button");
			Log.info("User clicked Create Roles Button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_RoleName(String input_RoleName) {
		try {
			applyWait.waitForElementToBeClickable(rolename, DefineConstants.explicitWait_30).sendKeys(input_RoleName);
			Screenshots.takeScreenshot(driver, "User entered " + input_RoleName + " as Role Name");
			test.log(Status.INFO, "User entered " + input_RoleName + " as Role Name");
			Log.info("User entered " + input_RoleName + " as Role Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_RoleDescription(String input_RoleDescription) {
		try {
			applyWait.waitForElementToBeClickable(roleDescription, DefineConstants.explicitWait_30).clear();
			roleDescription.sendKeys(input_RoleDescription);
			Screenshots.takeScreenshot(driver, "User entered " + input_RoleDescription + " as Role Description");
			test.log(Status.INFO, "User entered " + input_RoleDescription + " as Role Description");
			Log.info("User entered " + input_RoleDescription + " as Role Description");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Administrator() {
		try {
			applyWait.waitForElementToBeClickable(administrator, DefineConstants.explicitWait_30);
			javascriptClick.click(administrator);
			Screenshots.takeScreenshot(driver, "User clicked Administrator");
			test.log(Status.INFO, "User clicked Administrator");
			Log.info("User clicked Administrator");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SaveButtonRoles() {
		try {
			applyWait.waitForElementToBeClickable(saveButton_Roles, DefineConstants.explicitWait_30);
			javascriptClick.click(saveButton_Roles);
			Screenshots.takeScreenshot(driver, "User clicked Save button in Create Roles Screen");
			test.log(Status.INFO, "User clicked Save button in Create Roles Screen");
			Log.info("User clicked Save button in Create Roles Screen");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void search_RoleName(String input_RoleName) {
		try {
			applyWait.waitForElementToBeClickable(searchRoles, DefineConstants.explicitWait_30)
					.sendKeys(input_RoleName);
			searchRoles.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User entered " + input_RoleName + " as Role Description");
			test.log(Status.INFO, "User entered " + input_RoleName + " as Role Description");
			Log.info("User entered " + input_RoleName + " as Role Description");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Groups() {
		try {
			applyWait.waitForElementToBeClickable(groups, DefineConstants.explicitWait_30).click();
//			javascriptClick.click(groups);
			Screenshots.takeScreenshot(driver, "User clicked groups tab");
			test.log(Status.INFO, "User clicked groups tab");
			Log.info("User clicked groups tab");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_CreateGroups() {
		try {
			applyWait.waitForElementToBeClickable(createGroups, DefineConstants.explicitWait_30).click();
//			javascriptClick.click(createGroups);
			Screenshots.takeScreenshot(driver, "User clicked Create Groups Button");
			test.log(Status.INFO, "User clicked Create Groups Button");
			Log.info("User clicked Create Groups Button");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_GroupName(String input_GroupName) {
		try {
			applyWait.waitForElementToBeClickable(groupName, DefineConstants.explicitWait_30).sendKeys(input_GroupName);
			Screenshots.takeScreenshot(driver, "User entered " + input_GroupName + " as Group Name");
			test.log(Status.INFO, "User entered " + input_GroupName + " as Group Name");
			Log.info("User entered " + input_GroupName + " as Group Name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_GroupDescription(String input_GroupDescription) {
		try {
			applyWait.waitForElementToBeClickable(groupDescription, DefineConstants.explicitWait_30).clear();
			groupDescription.sendKeys(input_GroupDescription);
			Screenshots.takeScreenshot(driver, "User entered " + input_GroupDescription + " as Group Description");
			test.log(Status.INFO, "User entered " + input_GroupDescription + " as Group Description");
			Log.info("User entered " + input_GroupDescription + " as Group Description");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Plumb5V6Checkbox() {
		try {
			applyWait.waitForElementToBeClickable(plumb5V6_Checkbox, DefineConstants.explicitWait_30).click();
			// javascriptClick.click(plumb5V6_Checkbox);
			Screenshots.takeScreenshot(driver, "User clicked plumb5V6 Checkbox");
			test.log(Status.INFO, "User clicked plumb5V6 Checkbox");
			Log.info("User clicked plumb5V6 Checkbox");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_FullControlCheckbox() {
		try {
			applyWait.waitForElementToBeClickable(fullControl_Checkbox, DefineConstants.explicitWait_30).click();
			// javascriptClick.click(fullControl_Checkbox);
			Screenshots.takeScreenshot(driver, "User clicked Full Control Checkbox");
			test.log(Status.INFO, "User clicked Full Control Checkbox");
			Log.info("User clicked Full Control Checkbox");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_SaveButtonGroup() {
		try {
			applyWait.waitForElementToBeClickable(saveButton_Group, DefineConstants.explicitWait_30);
			javascriptClick.click(saveButton_Group);
			Screenshots.takeScreenshot(driver, "User clicked save button in Group screen");
			test.log(Status.INFO, "User clicked save button in Group screen");
			Log.info("User clicked save button in Group screen");
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void search_GroupName(String input_GroupName) {
		try {
			applyWait.waitForElementToBeClickable(searchGroups, DefineConstants.explicitWait_30)
					.sendKeys(input_GroupName);
			searchGroups.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User searched " + input_GroupName);
			test.log(Status.INFO, "User searched " + input_GroupName);
			Log.info("User searched " + input_GroupName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyGroupName(String value) {
		applyWait.waitForElementToBeClickable(groupTable, DefineConstants.explicitWait_60);
		tableRows = groupTable.findElements(By.tagName("tr"));
		System.out.println("value is " + value);
		for (int row = 0; row < tableRows.size(); row++) {
			tableColums = tableRows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < tableColums.size(); column++) {
				String cellText = tableColums.get(column).getText();
				System.out.println("cell textx is " + cellText);
				if (cellText.contains(value)) {
					System.out.println("value is: " + cellText);
					javascriptClick.highLighterMethod(tableColums.get(column));
					test.log(Status.INFO, "value is " + cellText);
					Log.info("value is " + cellText);
					try {
						Screenshots.takeScreenshot(driver, value + " is verified");
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, value + " is verified");
					Log.info(value + " is verified");
					Assert.assertTrue(true, value + " is verified");
				}

				else if (cellText.equals(DefineConstants.There_is_no_data_for_this_view)) {
					try {
						javascriptClick.highLighterMethod(tableColums.get(column));
						Screenshots.takeScreenshot(driver, value + " is not found");
						test.log(Status.INFO, "value is " + cellText);
						Log.info("value is " + cellText);
						System.out.println("value is " + cellText);
					} catch (IOException e) {
						e.printStackTrace();
					}
					test.log(Status.INFO, value + " is not found");
					Log.info(value + " is not found");
					Assert.assertTrue(false, value + " is not found");
				}
			}
		}
	}

	public void select_UsersToEdit(String input_FirstName) {
		try {
			users = driver.findElement(By.xpath("//*[contains(text(),'" + input_FirstName + "')]//following::i[1]"));
			users.click();
			Screenshots.takeScreenshot(driver, "User selected Users to edit");
			test.log(Status.INFO, "User selected Users to edit");
			Log.info("User selected Users to edit");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void select_RolesToEdit(String input_Roles) {
		try {
			roleName = driver.findElement(By.xpath("//*[contains(text(),'" + input_Roles + "')]//following::i[1]"));
			roleName.click();
			Screenshots.takeScreenshot(driver, "User selected Roles to edit");
			test.log(Status.INFO, "User selected Roles to edit");
			Log.info("User selected Roles to edit");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void select_GroupNameToEdit(String input_GroupName) {
		try {
			groupNames = driver.findElement(By.xpath("//*[contains(text(),'" + input_GroupName + "')]//following::i[1]"));
			groupNames.click();
			Screenshots.takeScreenshot(driver, "User selected Group Name to edit");
			test.log(Status.INFO, "User selected Group Name to edit");
			Log.info("User selected Group Name to edit");
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

	public void click_DeleteButton() {
		try {
			applyWait.waitForElementToBeClickable(delete_Button, DefineConstants.explicitWait_30);
			javascriptClick.click(delete_Button);
			Screenshots.takeScreenshot(driver, "User clicked delete button");
			test.log(Status.INFO, "User clicked delete button");
			Log.info("User clicked delete button");
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
