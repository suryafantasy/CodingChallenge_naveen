package com.utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logincrm extends TestBase{

	@FindBy(xpath="//input[@name='login:usernameDecorate:username']")
	WebElement name;
	@FindBy(xpath="//input[@name='login:passwordDecorate:password']")
	WebElement password;
	@FindBy(xpath="//input[@name='login:login']")
	WebElement login;
	
	public Logincrm() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public void logs(String name1,String password1) {
		driver.findElement(By.xpath("//input[@name='login:usernameDecorate:username']")).sendKeys(name1);
		name.sendKeys(name1);
		password.sendKeys(password1);
		login.click();
	}
	

}
