package Ecommerce.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BraveBrowser {   
    public static void main(String[] args) {
            System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
                WebDriver driver = new FirefoxDriver();
                driver.get("http//:www.klubba.in");
                WebElement element = driver.findElement(By.name("q"));
                element.sendKeys("mysql excel 2013");
                element.submit();
	}

}
