package com.qa.quickstart.PHPTravels;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TravelHomePage {

	@FindBy(xpath = "//*[@id=\"s2id_autogen10\"]/a/span[1]")
	WebElement locationClick;
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
	WebElement locationSearch;
	@FindBy(xpath = "//*[@id=\"dpd2\"]/input")
	WebElement checkoutClick;
	@FindBy(xpath = "/html/body/div[15]/div[1]/table/tbody/tr[5]/td[1]")
	WebElement checkoutSelect;
	@FindBy(id = "adults")
	WebElement adults;
	@FindBy(xpath = "//*[@id=\"HOTELS\"]/form/div[3]/div[3]/button")
	WebElement search;

	public TravelHomePage(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 3), this);
	}

	public void chooseLocation(String destination) {
		locationClick.click();
		locationSearch.sendKeys(destination);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		locationSearch.sendKeys(Keys.ENTER);
	}

	public void chooseCheckoutDate() {
		checkoutClick.click();

		checkoutSelect.click();

	}

	public void chooseNumberOfAdults(String number) {
		adults.click();

		adults.sendKeys(number);

		adults.submit();

	}

	public void clickSearch() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		search.click();
	}

}
