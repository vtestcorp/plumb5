package helperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	WebDriver driver;
	Select select;

	public DropDown(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement selectByVisibleText(WebElement Element, String text) {
		try {
			select = new Select(Element);
			select.selectByVisibleText(text);
		} catch (Exception e) {
			e.getMessage();
		}
		return Element;
	}
	
	public WebElement selectByValue(WebElement Element, String text) {
		try {
			select = new Select(Element);
			select.selectByValue(text);
		} catch (Exception e) {
			e.getMessage();
		}
		return Element;
	}

	public WebElement deSelectByVisibleText(WebElement Element, String text) {
		try {
			select = new Select(Element);
			select.deselectByVisibleText(text);

		} catch (Exception e) {
			e.getMessage();
		}
		return Element;
	}

	public void selectByIndex(WebElement Element, int index) {
		try {
			select = new Select(Element);
			select.selectByIndex(index);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}