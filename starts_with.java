package ems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class starts_with {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.get("https://qaemsadmin.azurewebsites.net/");
	       driver.findElement(By.xpath("//*[starts-with(@name,'Username')]")).sendKeys("steyn");
	       driver.findElement(By.xpath("//*[starts-with(@name,'Password')]")).sendKeys("Password@123456");
	}
}
