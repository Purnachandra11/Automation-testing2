package QDegrees;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GluepleLogin {
	
	public static void main(String[] args) throws InterruptedException {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Useremail/ID");
		String us=sc.next();
		System.out.println("Please enter password");
		String pw=sc.next();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://glueple.com/#/");
		driver.findElement(By.id("email")).sendKeys("us");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("pw");
		Thread.sleep(2000);
		driver.findElement(By.xpath("submit-btn']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
