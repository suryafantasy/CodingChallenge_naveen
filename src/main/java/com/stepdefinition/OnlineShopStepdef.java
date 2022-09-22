package com.stepdefinition;

import java.io.IOException;

import com.utils.TestBase;
import org.apache.log4j.Logger;

import com.pages.HomePage;
import com.pages.OnlineshopPage;
import com.pages.PopulationPage;
import com.utils.Generalfunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OnlineShopStepdef extends TestBase {
	Logger log=Logger.getLogger(PopulationStepdef.class);
	public OnlineShopStepdef() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	TestBase obj=new TestBase();
	HomePage homepage=new HomePage();
	Generalfunctions general=new Generalfunctions();
	PopulationPage popPage=new PopulationPage(null);
	OnlineshopPage onlinePage=new OnlineshopPage(null);

	@Given("^launch the url$")
	public void launch_the_url() throws Throwable {
		obj.Initialization();
		log.info("Initialize webdriver");
	}

	@Given("^chose section and display the items in sorted order$")
	public void chose_section_and_display_the_items_in_sorted_order() throws Throwable {
	 onlinePage.getDetails();   
	}
	@When("^login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_and(String arg1, String arg2) throws Throwable {
	   onlinePage.loginDetails(arg1, arg2);
	}

	@Then("^add item with high price to cart$")
	public void add_item_with_high_price_to_cart() throws Throwable {
	    onlinePage.addTocart();
	}

}
