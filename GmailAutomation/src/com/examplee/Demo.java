package com.examplee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver(); //this line will open the chrome browser		
		//WebDriver driver=new FirefoxDriver(); // this line will open the fire fox browser
		driver.manage().window().maximize();// this line will maximize the browser



		driver.get("https://www.gmail.com");// this line will navigate to the gmail url 
		WebElement emailid=driver.findElement(By.id("identifierId"));// this line will locate the email id text field 
		emailid.sendKeys("nithyavaishu10@gmail.com");//this line will type the mail id in emailid field

		WebElement ok =driver.findElement(By.className("VfPpkd-RLmnJb"));//this line will locate the next button 
		ok.click(); // this line will click on the next button 
		Thread.sleep(3000); 

		WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));//this line will locate the password field  
		pass.sendKeys("Vaishu@15");//this line will type the password in the password field 
		WebElement next=driver.findElement(By.className("VfPpkd-RLmnJb"));//this line will locate the next button 
		next.click();//this line will click on the next button 
		Thread.sleep(6000);

		WebElement link=driver.findElement(By.xpath("//*[@class='T-I T-I-KE L3']")); //this line will locate the compose field 
		Actions a=new Actions(driver); // creation of action class because we are using keyboard functions 
		a.moveToElement(link).build().perform(); //this line will move to the particular element 
		a.pause(2000).click(); // this line is used to click 
		Thread.sleep(6000);
		driver.close(); // this line is used to close the parent tab 

	
	}

}
