package com.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;

public class Generalfunctions extends TestBase{

	public Generalfunctions() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void radiobutton() {
		
		driver.findElement(By.xpath("(//*[contains(text(),'Round Trip')])[1]")).click();
		//driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).click();
	}
	public void selectLocation() {
    String month;
    String todaysDate;
		driver.findElement(By.xpath("(//p[@class='blackText font20 code'])[1]")).click();
		//DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		//Date today = Calendar.getInstance().getTime();
	//	String date = dateFormat.format(today);	
		//System.out.println("date:"+date);
		
		Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String formattedDate = sdf.format(date);
		System.out.println("date:"+formattedDate);
	    todaysDate = formattedDate.substring(0, formattedDate.indexOf("/"));
	    todaysDate=todaysDate.replaceFirst("^0*", "");
	    
System.out.println("todaysdate:"+todaysDate);
driver.findElement(By.xpath("(//div[@class='DayPicker-Day']/div/p[text()='"+todaysDate+"'])[1]")).click();
//driver.findElement(By.xpath("(//div[@class='DayPicker-Day']/div/p[text()='"+todaysDate+"'])[1]")).click();
//driver.findElement(By.xpath("(//p[@class='blackText font20 code'])[2]")).click();
//driver.findElement(By.xpath("(//p[@class='blackText font20 code'])[2]")).click();
int returndate=Integer.parseInt(todaysDate);
returndate=returndate+7;
driver.findElement(By.xpath("(//div[@class='DayPicker-Day']/div/p[text()='"+returndate+"'])[1]")).click();

driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();

	}
	
}
