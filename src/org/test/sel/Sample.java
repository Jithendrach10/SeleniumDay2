package org.test.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ch Dharma\\eclipse-workspace\\SeleniumDay2\\Drivers\\chromedriver.exe ");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     
	     //id="email" find & verify the locator of username file
	     WebElement txtEmail = driver.findElement(By.id("email"));
        //insert
	     txtEmail.sendKeys("jithendra");
	     
	     WebElement txtPassword = driver.findElement(By.id("pass"));
	     txtPassword.sendKeys("Selen@12345");
	     
	     driver.quit();   //close browser
	     
	     
    }
}
