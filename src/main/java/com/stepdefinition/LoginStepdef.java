package com.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;
import com.utils.Generalfunctions;
import com.utils.Logincrm;
import com.utils.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef extends TestBase{
	Logger log=Logger.getLogger(LoginStepdef.class);
	public LoginStepdef() throws IOException {
		super();
		
	}

	TestBase obj=new TestBase();
	HomePage homepage=new HomePage();
	Generalfunctions general=new Generalfunctions();
Logincrm login=new Logincrm();
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		obj.Initialization();
		log.info("Initialize webdriver");
	}

	@When("^user click on clear cookies button$")
	public void user_click_on_clear_cookies_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage.click();
		log.info("Clicking action");
	}
	
	
	@When("^User gives input as$")
	public void user_gives_input_as() throws Throwable {
     homepage.search();
	}


	@Then("^user sort the price details$")
	public void user_sort_the_price_details() throws Throwable {
	    homepage.sorting();
	}
	 @When("^user launches url$")
	public void user_lanches_the_Url_of_amkemy_trip() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   obj.Initialization();
	}
	 


@When("^user selects round trip radio button$")
public void user_selects_round_trip_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		general.radiobutton();
	}


@Then("^user selects from and to location from the drop down$")
public void user_selects_from_and_to_location_from_the_drop_down() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   general.selectLocation();
	} 

	@Then("^enter the \"(.*)\" and \"(.*)\"$")
	public void enter_the_user_name_and_password(String username,String pssword) throws Throwable {
	    login.logs(username, pssword);
	}

	@Then("^user enter add person icon$")
	public void user_enter_add_person_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user launches url \"([^\"]*)\"$")
	public void user_launches_url(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 obj.Initialization();
	    
	}
	@When("^user selects the departure and return date from calender$")
	public void user_selects_the_departure_and_return_date_from_calender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	   
	}
}
//	@After
//	public void teardown(Scenario scenario) throws IOException {
//		if (scenario.isFailed()) {
//		      // Take a screenshot...
//		     // final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		      //scenario.embed(screenshot, "/MakeMyTrip/test-output/image/.png"); 
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//		      TakesScreenshot ts = (TakesScreenshot) driver;
//		      File sourcePath = ts.getScreenshotAs(OutputType.FILE);
//		      File destinationPath = new File(
//		      System.getProperty("user.dir") + "\\target\\cucumber-reports\\screenshots\\" + screenshotName + ".png");
//		      FileUtils.copyFile(sourcePath, destinationPath);// ... and embed it in the report.
//		    }
//	}

//}
