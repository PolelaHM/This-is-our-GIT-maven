package com.org.MyfirstRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeweClassDemoget {

	public NeweClassDemoget() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi Git class");
		
		//decalaration and instantiation of the objects and variables 
		
		// For Window
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe"); 
	
// Create an instance of ChromeDriver to execute our tests
 WebDriver driver = new ChromeDriver();	
  String baseUrl = "http:demo.guru99.com/test";
  String execptedTitle = "Expected title";
  String actualTitle = "Actual Titile";
  
  
  //Launch chrome
  driver.get(baseUrl);
  
 //get actual
  actualTitle = driver.getTitle();
  
  //compare
  if (actualTitle.contentEquals(execptedTitle)) {
	  System.out.println("Test passed");
	  
  } else {
	
	  System.out.println("Test failed");
	  System.out.println(actualTitle);
	 
  }
// close browser 
  driver.quit();
	}

}
