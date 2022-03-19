package com.juaracodingUjianSelenium;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	
public class CobaSelenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}

}
