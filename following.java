package ems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class following {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/}");
		   driver.findElement(By.linkText("Create new account")).click();
		   driver.findElement(By.xpath("//input[@name='firstname']//following::<input>[@type='text']")).sendKeys("Elviii");
	}
}
