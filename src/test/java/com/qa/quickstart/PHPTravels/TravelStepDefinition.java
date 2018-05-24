package com.qa.quickstart.PHPTravels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;;

public class TravelStepDefinition {
	
	WebDriver driver;
	TravelHomePage homePage;
	TravelSearchPage searchPage;
	TravelResultsPage resultPage;
	ExtentTest test;
	ExtentReports report = new ExtentReports(Constants.extentReportLocation, true);

	
	@Before 
	public void setup() {
		System.setProperty(Constants.chromeDriver, Constants.chromeDriverLocation);
		driver = new ChromeDriver();
		test = report.startTest("This is a test");
		driver.manage().window().maximize();
	}
	
	@Given("^I Go to the correct web page$")
	public void i_Go_to_the_correct_web_page()  {
		driver.get(Constants.websiteURL);
		test.log(LogStatus.INFO, "Reached Home Page");
		driver.manage().window().maximize();
		homePage = new TravelHomePage(driver);
	}

	@When("^I Enter holiday details$")
	public void i_Enter_holiday_details()  {
		homePage.chooseLocation("London");
		homePage.chooseCheckoutDate();
		homePage.chooseNumberOfAdults("3");
		homePage.clickSearch();
	}

	@When("^I click the search button$")
	public void i_click_the_search_button()  {

	}

	@Then("^I am taken to the results page$")
	public void i_am_taken_to_the_results_page()  {

	}

	@When("^I click on the first result$")
	public void i_click_on_the_first_result()  {

	}

	@Then("^It will take me to the hotel page$")
	public void it_will_take_me_to_the_hotel_page() {

	}

	@When("^I click on the book now button$")
	public void i_click_on_the_book_now_button()  {

	}

	@Then("^I am taken to the confirmation page$")
	public void i_am_taken_to_the_confirmation_page() {

	}
	
	@After
	public void teardown() {
		driver.quit();
		report.flush();
	}


}
