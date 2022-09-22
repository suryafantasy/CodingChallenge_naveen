package com.pages;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.TestBase;

public class OnlineshopPage extends TestBase {
	@FindBy(xpath="//span[@rel='current_population']")
	WebElement currentPopulation;

	public OnlineshopPage(WebDriver driver)throws IOException{
		PageFactory.initElements(driver, this);
	}
	Float highprice;
	String dynamicString = "Recommended for you";
	String xpath_recomend="//*[contains(text(),'Recommended for you')]/ancestor::div[@class='sc-eXBvqI jsZGLY']//div[@class='swiper-wrapper']//div[@data-qa='product-name']";
	String xpath_products="//*[contains(text(),'\" + dynamicString + \"')]/ancestor::div[@class='sc-eXBvqI jsZGLY']//div[@class='swiper-wrapper']//div[@data-qa='product-name']";
	String username="user-name";
	String password="password";
	String login="login-button";
	String xpath_price="//*[@class=\"inventory_item_price\"]";
	String xpath_cart="//*[contains(text(),'Add to cart')]"; 

	public void loginDetails(String username,String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		click(login);
	}
	public void addTocart() {
		List<WebElement> ele=driver.findElements(By.xpath(xpath_price));
		System.out.println("size: "+ele.size());
		List<Float> pricelist = new LinkedList();
		for(WebElement i:ele) {
			System.out.println(i.getText().replace("$", ""));
			Float price=Float.parseFloat((i.getText().replace("$", "")));
			pricelist.add(price);	
		}
		System.out.println("pricelist: "+pricelist);
		Collections.sort(pricelist);
		highprice=pricelist.get(ele.size()-1);
		System.out.println("highest:"+highprice);
		driver.findElement(By.xpath("//*[normalize-space()='$" + highprice + "']//following::button[contains(text(),'Add to cart')]")).click();;
		
	}
	public void click(String args) {
		driver.findElement(By.id(args)).click();
	}
		
	public void getDetails() throws InterruptedException {
		//get_text(xpath_recomend);
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS) ;
		List<WebElement> li=driver.findElements(By.xpath("//*[contains(text(),'Recommended for you')]/ancestor::div[@class='sc-eXBvqI jsZGLY']//div[@class='swiper-wrapper']//div[@data-qa='product-name']"));
		System.out.println("li:"+li.size());
		WebElement button=driver.findElement(By.partialLinkText("1663761444228"));
		if(button.isEnabled()){
			System.out.println("enabled");
		}
		else {
			System.out.println("Not");
		}
		button.click();
		while(button.isDisplayed()) {
			button.click();
		for(WebElement i: li){
			System.out.println(i.getText());
		}
		}
		
		
	}
	public void get_text(String loc) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS) ;
		//Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath(loc)).getText());
		
	}

}
