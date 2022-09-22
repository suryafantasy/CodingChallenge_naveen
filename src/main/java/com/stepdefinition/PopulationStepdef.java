package com.stepdefinition;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.pages.HomePage;
import com.pages.PopulationPage;
import com.utils.Generalfunctions;
import com.utils.TestBase;

import cucumber.api.java.en.Given;

public class PopulationStepdef extends TestBase {
	Logger log=Logger.getLogger(PopulationStepdef.class);
	public PopulationStepdef() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	TestBase obj=new TestBase();
	HomePage homepage=new HomePage();
	Generalfunctions general=new Generalfunctions();
	PopulationPage popPage=new PopulationPage(null);

	@Given("^Launch the url of world population$")
	public void launch_the_url_of_world_population() throws Throwable {
		obj.Initialization();
		log.info("Initialize webdriver");

	}

	@Given("^capture current population$")
	public void capture_current_population() throws Throwable {
		popPage.getDetails();
	
	   
	}

}
