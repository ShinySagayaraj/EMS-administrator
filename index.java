package ems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class index {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.get("https://qaemsadmin.azurewebsites.net/");
           driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Password@123456");
}}
