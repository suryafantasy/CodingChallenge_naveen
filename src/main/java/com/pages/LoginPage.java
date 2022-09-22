package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="username")
	WebElement name;
	@FindBy(xpath="")
	WebElement addperson;

	public LoginPage() throws IOException {
		//super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void userdetails() {
		
	}
	public void launch(String arg1) {
		// TODO Auto-generated method stub
		driver.get(arg1);
	}

}
