package BDD_Cucumber.BDD_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Glueple {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://glueple.com/#/");
	}
}

