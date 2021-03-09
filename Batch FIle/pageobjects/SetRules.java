package com.plumb5.pageobjects;

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
import helperMethods.JavascriptClick;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class SetRules {
	
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private JavascriptClick javascriptClick;
	private DropDown dropDown;

	public SetRules(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick = new JavascriptClick(driver);
		dropDown = new DropDown(driver);
	}

	@FindBy(xpath = "//label[contains(text(),'If the visitor type is')]")
	private WebElement Ifthevisitortypeis;

	private WebElement visitorTypeIs, visitorBelongs;

	@FindBy(xpath = "//label[contains(text(),'If the visitor belongs to or does not belong to a group')]")
	private WebElement IfTheVisitorBelongsToOrDoesNotBelongToAGroup;

	@FindBy(xpath = "//input[@id='ui_txtGroups']")
	private WebElement groupName;

	@FindBy(xpath = "//span[contains(text(),'By Behaviour')]")
	private WebElement byBehaviour;

	@FindBy(xpath = "//span[contains(text(),'By Interaction')]")
	private WebElement byInteraction;

	@FindBy(xpath = "//span[contains(text(),'By Event')]")
	private WebElement byEvent;

	@FindBy(xpath = "//span[contains(text(),'By Profile')]")
	private WebElement byProfile;

	@FindBy(xpath = "//h6[contains(text(),'By Behaviour')]//following::label[2]")
	private WebElement ifTheVisitorSession;

	@FindBy(xpath = "//h6[contains(text(),'By Behaviour')]//following::label[3]")
	private WebElement ifTheVisitorSession_IS;

	@FindBy(xpath = "//h6[contains(text(),'By Behaviour')]//following::label[4]")
	private WebElement ifTheVisitorSession_IS_NOT;

	@FindBy(xpath = "//input[@id='ui_txtSession']")
	private WebElement ifTheVisitorSession_EX;
	
	@FindBy(xpath = "//input[@id='ui_txtPageDepthIs']")
	private WebElement ifTheVisitorPageDepth_EX;
	
	@FindBy(xpath = "//h6[contains(text(),'By Behaviour')]//following::label[5]")
	private WebElement ifTheVisitorPageDepth;
	
	@FindBy(xpath = "//h6[contains(text(),'By Behaviour')]//following::label[6]")
	private WebElement ifTheVisitorPageDepth_Is;
	
	@FindBy(xpath = "//h6[contains(text(),'By Behaviour')]//following::label[7]")
	private WebElement ifTheVisitorPageDepth_Is_Not;
	
	// By Interaction
	@FindBy(xpath = "//h6[contains(text(),'By Interaction')]//following::label[5]")
	private WebElement IfTheVisitorResponseToYourMailCampaignsAre;
	
	@FindBy(xpath = "//select[@id='ui_ddlMailScore']")
	private WebElement mailCampaignsDropdown;
	
	@FindBy(xpath = "//h6[contains(text(),'By Interaction')]//following::label[4]")
	private WebElement ifTheVisitorRespondedWithChatAgent;
	
	// By Event
	@FindBy(xpath = "//h6[contains(text(),'By Event')]//following::label[1]")
	private WebElement ifTheVisitorFormImpression;
		
	@FindBy(xpath = "//h6[contains(text(),'By Event')]//following::label[2]")
	private WebElement ifTheVisitorFormClose;
	
	// By Profile
	
	@FindBy(xpath = "//h6[contains(text(),'By Profile')]//following::label[1]")
	private WebElement ifTheCustomerprospectSocialStatusIs;
		
	@FindBy(xpath = "//select[@id='ui_ddlSocialStatus']")
	private WebElement selectSocialStatus;
	
	@FindBy(xpath = "//select[@id='ui_ddlInfluentialScoreIs']")
	private WebElement scoreDropdown;
	
	@FindBy(xpath = "//input[@id='ui_txtInfluentialScore1']")
	private WebElement scoreValue;
	
	@FindBy(xpath = "//h6[contains(text(),'By Profile')]//following::label[2]")
	private WebElement ifTheCustomerProspectInfluentialScoreIs;
	
	public void click_Checkbox_IfTheVisitorSessionIs() {
		try {
			applyWait.waitForElementToBeClickable(ifTheVisitorSession, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked if The Visitor Session Is");
			test.log(Status.INFO, "User clicked if The Visitor Session Is");
			Log.info("User clicked if The Visitor Session Is");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_IfTheVisitorSessionIs(String input_IfTheVisitorSessionIs) {
		try {
			if (input_IfTheVisitorSessionIs.equalsIgnoreCase("Is")) {
				applyWait.waitForElementToBeClickable(ifTheVisitorSession_IS, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User selected IS for If the visitor's session");
				test.log(Status.INFO, "User selected IS for If the visitor's session");
				Log.info("User selected IS for If the visitor's session");
			}			
			if (input_IfTheVisitorSessionIs.equalsIgnoreCase("Is Not")) {
				applyWait.waitForElementToBeClickable(ifTheVisitorSession_IS_NOT, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User selected IS Not for If the visitor's session");
				test.log(Status.INFO, "User selected IS Not for If the visitor's session");
				Log.info("User selected IS Not for If the visitor's session");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Checkbox_IfTheVisitorTypeIs() {
		try {
			applyWait.waitForElementToBeClickable(Ifthevisitortypeis, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked If The Visitor Type Is");
			test.log(Status.INFO, "User clicked If The Visitor Type Is");
			Log.info("User clicked If The Visitor Type Is");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_IfTheVisitorTypeIs(String input_IfTheVisitorTypeIs) {
		try {
			visitorTypeIs = driver.findElement(By.xpath("//label[contains(text(),'" + input_IfTheVisitorTypeIs + "')]"));
			applyWait.waitForElementToBeClickable(visitorTypeIs, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User selected " + input_IfTheVisitorTypeIs + " as visitor type");
			test.log(Status.INFO, "User selected " + input_IfTheVisitorTypeIs + " as visitor type");
			Log.info("User selected " + input_IfTheVisitorTypeIs + " as visitor type");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_Checkbox_IfTheVisitorBelongsToOrDoesNotBelongToAGroup() {
		try {
			applyWait.waitForElementToBeClickable(IfTheVisitorBelongsToOrDoesNotBelongToAGroup,DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver,"User clicked Checkbox_If the visitor belongs to or does not belong to a group");
			test.log(Status.INFO, "User clicked Checkbox_If the visitor belongs to or does not belong to a group");
			Log.info("User clicked Checkbox_If the visitor belongs to or does not belong to a group");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select_IfTheVisitorBelongsToOrDoesNotBelongToAGroup(
			String input_IfTheVisitorBelongsToOrDoesNotBelongToAGroup) {
		try {
			visitorBelongs = driver.findElement(By.xpath("//label[contains(text(),'" + input_IfTheVisitorBelongsToOrDoesNotBelongToAGroup + "')]"));
			applyWait.waitForElementToBeClickable(visitorBelongs, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver,"User selected " + input_IfTheVisitorBelongsToOrDoesNotBelongToAGroup + " as visitor belongs");
			test.log(Status.INFO,"User selected " + input_IfTheVisitorBelongsToOrDoesNotBelongToAGroup + " as visitor belongs");
			Log.info("User selected " + input_IfTheVisitorBelongsToOrDoesNotBelongToAGroup + " as visitor belongs");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_GroupName(String input_GroupName) {
		try {
			applyWait.waitForElementToBeClickable(groupName, DefineConstants.explicitWait_30);
			groupName.sendKeys(input_GroupName);
			Thread.sleep(1000);
			groupName.sendKeys(Keys.ENTER);
			Screenshots.takeScreenshot(driver, "User entered " + input_GroupName + " as group name");
			test.log(Status.INFO, "User entered " + input_GroupName + " as group name");
			Log.info("User entered " + input_GroupName + " as group name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_ByBehaviour() {
		try {
			applyWait.waitForElementToBeClickable(byBehaviour, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked By Behaviour");
			test.log(Status.INFO, "User clicked By Behaviour");
			Log.info("User clicked By Behaviour");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_ByInteraction() {
		try {
			applyWait.waitForElementToBeClickable(byInteraction, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked By Interaction");
			test.log(Status.INFO, "User clicked By Interaction");
			Log.info("User clicked By Interaction");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_ByEvent() {
		try {
			applyWait.waitForElementToBeClickable(byEvent, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked By Event");
			test.log(Status.INFO, "User clicked By Event");
			Log.info("User clicked By Event");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_ByProfile() {
		try {
			applyWait.waitForElementToBeClickable(byProfile, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked By Profile");
			test.log(Status.INFO, "User clicked By Profile");
			Log.info("User clicked By Profile");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_IfTheVisitorSessionIsEx(String input_IfTheVisitorSessionIsEx) {
		try {
			applyWait.waitForElementToBeClickable(ifTheVisitorSession_EX, DefineConstants.explicitWait_30);
			ifTheVisitorSession_EX.sendKeys(input_IfTheVisitorSessionIsEx);
			Screenshots.takeScreenshot(driver, "User entered "+input_IfTheVisitorSessionIsEx+ " as Ex");
			test.log(Status.INFO, "User entered "+input_IfTheVisitorSessionIsEx+ " as Ex");
			Log.info("User entered "+input_IfTheVisitorSessionIsEx+ " as Ex");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_Checkbox_ifTheVisitorPageDepth() {
		try {
			applyWait.waitForElementToBeClickable(ifTheVisitorPageDepth, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked If the visitor's page depth Is");
			test.log(Status.INFO, "User clicked If the visitor's page depth Is");
			Log.info("User clicked If the visitor's page depth Is");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_ifTheVisitorPageDepth(String input_ifTheVisitorPageDepth) {
		try {
			if (input_ifTheVisitorPageDepth.equalsIgnoreCase("Is")) {
				applyWait.waitForElementToBeClickable(ifTheVisitorPageDepth_Is, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User selected IS for If the visitor's page depth");
				test.log(Status.INFO, "User selected IS for If the visitor's page depth");
				Log.info("User selected IS for If the visitor's page depth");
			}			
			if (input_ifTheVisitorPageDepth.equalsIgnoreCase("Is Not")) {
				applyWait.waitForElementToBeClickable(ifTheVisitorPageDepth_Is_Not, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User selected IS Not for If the visitor's page depth");
				test.log(Status.INFO, "User selected IS Not for If the visitor's page depth");
				Log.info("User selected IS Not for If the visitor's page depth");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_ifTheVisitorPageDepth(String input_ifTheVisitorPageDepth) {
		try {
			applyWait.waitForElementToBeClickable(ifTheVisitorPageDepth_EX, DefineConstants.explicitWait_30);
			ifTheVisitorPageDepth_EX.sendKeys(input_ifTheVisitorPageDepth);
			Screenshots.takeScreenshot(driver, "User entered "+input_ifTheVisitorPageDepth+ " as Ex");
			test.log(Status.INFO, "User entered "+input_ifTheVisitorPageDepth+ " as Ex");
			Log.info("User entered "+input_ifTheVisitorPageDepth+ " as Ex");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_IfTheVisitorResponseToYourMailCampaignsAre() {
		try {
			applyWait.waitForElementToBeClickable(IfTheVisitorResponseToYourMailCampaignsAre, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked If the visitor's response to your mail campaigns are");
			test.log(Status.INFO, "User clicked If the visitor's response to your mail campaigns are");
			Log.info("User clicked If the visitor's response to your mail campaigns are");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_IfTheVisitorResponseToYourMailCampaignsAre(String select_IfTheVisitorResponseToYourMailCampaignsAre) {
		try {
			applyWait.waitForElementToBeClickable(mailCampaignsDropdown, DefineConstants.explicitWait_30).click();
			dropDown.selectByVisibleText(mailCampaignsDropdown, select_IfTheVisitorResponseToYourMailCampaignsAre);
			Screenshots.takeScreenshot(driver, "User selected "+select_IfTheVisitorResponseToYourMailCampaignsAre+ " as If the visitor's response to your mail campaigns are");
			test.log(Status.INFO, "User selected "+select_IfTheVisitorResponseToYourMailCampaignsAre+ " as If the visitor's response to your mail campaigns are");
			Log.info("User selected "+select_IfTheVisitorResponseToYourMailCampaignsAre+ " as If the visitor's response to your mail campaigns are");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_Checkbox_IfTheVisitorRespondedWithChatAgent() {
		try {
			applyWait.waitForElementToBeClickable(ifTheVisitorRespondedWithChatAgent, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked If the visitor responded with chat agent");
			test.log(Status.INFO, "User clicked If the visitor responded with chat agent");
			Log.info("User clicked If the visitor responded with chat agent");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//By Event	
	public void click_Checkbox_IfTheVisitorFormImpression() {
		try {
			applyWait.waitForElementToBeClickable(ifTheVisitorFormImpression, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked If the visitor's form impression");
			test.log(Status.INFO, "User clicked If the visitor's form impression");
			Log.info("User clicked If the visitor's form impression");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_Checkbox_IfTheVisitorFormClose() {
		try {
			applyWait.waitForElementToBeClickable(ifTheVisitorFormClose, DefineConstants.explicitWait_30).click();
			Screenshots.takeScreenshot(driver, "User clicked if the visitor form close");
			test.log(Status.INFO, "User clicked if the visitor form close");
			Log.info("User clicked if the visitor form close");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//By Profile	
		public void click_Checkbox_IfTheCustomerprospectSocialStatusIs() {
			try {
				applyWait.waitForElementToBeClickable(ifTheCustomerprospectSocialStatusIs, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User clicked If the customer's/prospect's social status is");
				test.log(Status.INFO, "User clicked If the customer's/prospect's social status is");
				Log.info("User clicked If the customer's/prospect's social status is");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void select_selectSocialStatus(String input_SocialStatus) {
			try {
				applyWait.waitForElementToBeClickable(selectSocialStatus, DefineConstants.explicitWait_30).click();
				dropDown.selectByVisibleText(selectSocialStatus, input_SocialStatus);
				Screenshots.takeScreenshot(driver, "User selected "+input_SocialStatus+" as social status");
				test.log(Status.INFO, "User selected "+input_SocialStatus+" as social status");
				Log.info("User selected "+input_SocialStatus+" as social status");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void click_Checkbox_IfTheCustomerProspectInfluentialScoreIs() {
			try {
				applyWait.waitForElementToBeClickable(ifTheCustomerProspectInfluentialScoreIs, DefineConstants.explicitWait_30).click();
				Screenshots.takeScreenshot(driver, "User clicked If the customer's/prospect's influential score is");
				test.log(Status.INFO, "User clicked If the customer's/prospect's influential score is");
				Log.info("User clicked If the customer's/prospect's influential score is");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void select_Score(String input_Score) {
			try {
				applyWait.waitForElementToBeClickable(scoreDropdown, DefineConstants.explicitWait_30);
				dropDown.selectByVisibleText(scoreDropdown, input_Score);
				Screenshots.takeScreenshot(driver, "User selected "+input_Score+" as score dropdown");
				test.log(Status.INFO, "User selected "+input_Score+" as score dropdown");
				Log.info("User selected "+input_Score+" as score dropdown");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void enter_ScoreValue(String input_ScoreValue) {
			try {
				applyWait.waitForElementToBeClickable(scoreValue, DefineConstants.explicitWait_30).clear();
				scoreValue.sendKeys(input_ScoreValue);
				Screenshots.takeScreenshot(driver, "User selected "+input_ScoreValue+" as score value");
				test.log(Status.INFO, "User selected "+input_ScoreValue+" as score value");
				Log.info("User selected "+input_ScoreValue+" as score value");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}