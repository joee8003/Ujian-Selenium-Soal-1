package com.juaracodingUjianSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class ujianQASelenium {
	
	public static void main(String [] args) {
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		
		//Complete Code
		// Testing menu Web Tables - Sumbit
		
		WebElement button_element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div"));
		button_element.click();
		
		WebElement button_Element = driver.findElement(By.id("item-0"));
		button_element.click();
		
		WebElement button_webtables = driver.findElement(By.id("item-3"));
		button_element.click();
		
		WebElement field_FirstName = driver.findElement(By.id("First Name"));
		field_FirstName.sendKeys("Cierra"+"Alden"+"Kierra");
		
		WebElement field_LastName = driver.findElement(By.id("Last Name"));
		field_LastName.sendKeys("Vega"+"Cantrell"+"Gentry");
		
		WebElement field_Age = driver.findElement(By.id("Age"));
		field_Age.sendKeys("39"+"45"+"29");
		
		WebElement field_Email = driver.findElement(By.id("Email"));
		field_Email.sendKeys("cierra@example.com"+"alden@example.com"+"kierra@example.com");
		
		WebElement field_salary = driver.findElement(By.id("Salary"));
		field_salary.sendKeys("10000"+"12000"+"2000");
		
		WebElement field_Department = driver.findElement(By.id("Department"));
		field_Department.sendKeys("Insurance"+"Compliance"+"Legal");
		
		WebElement field_Action = driver.findElement(By.id("Action"));
		field_Action.sendKeys();
		
		
		
		
		
		
		
	}
	
}
