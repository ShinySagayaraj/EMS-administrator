package ems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tex {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.get("https://qaemsadmin.azurewebsites.net/");
		   driver.findElement(By.className("form-control")).sendKeys("steyn");
	       driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Password@123456");
	       driver.findElement(By.xpath("//button[.='Login']")).click();
	       driver.findElement(By.xpath("//select[text()='Select Show Name']")).getText();
	}

}
