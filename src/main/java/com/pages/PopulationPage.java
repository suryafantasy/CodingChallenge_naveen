package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import com.utils.TestBase;
 
public class PopulationPage extends TestBase {
	
	@FindBy(xpath="//span[@rel='current_population']")
	WebElement currentPopulation;

	public PopulationPage(WebDriver driver)throws IOException{
		PageFactory.initElements(driver, this);
	}
	String xpath_count="//span[@rel='current_population']";
	String xpath_Births_today="//span[@rel='births_today']";
	String xpath_deaths_today="//span[@rel='dth1s_today']";
	String xpath_growth_today="//span[@rel='absolute_growth']";
	String xpath_births_year="//span[@rel='births_this_year']";
	String xpath_deaths_year="//span[@rel='dth1s_this_year']";
	String xpath_growth_year="//span[@rel='absolute_growth_year']";
	

	public void getDetails() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS) ;
		long startTime =System.currentTimeMillis();
		long currentTime =startTime;
		System.out.println("startTime:"+currentTime);
		while(currentTime<startTime+20000){
		currentTime =System.currentTimeMillis();
		get_text(xpath_count);
		get_text(xpath_Births_today);
		get_text(xpath_deaths_today);
		get_text(xpath_growth_today);
		get_text(xpath_births_year);
		get_text(xpath_deaths_year);
		get_text(xpath_growth_year);
		
		}
		System.out.println("After 20 sec:"+currentTime);		
	}
	public void get_text(String loc) {
		System.out.println(driver.findElement(By.xpath(loc)).getText());
		
	}
}
