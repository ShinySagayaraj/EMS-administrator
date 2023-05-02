package ems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class single_slash {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	 public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.get("https://qaemsadmin.azurewebsites.net/");
		   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("steyn");
		   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).sendKeys("Password@123456");
		   driver.findElement(By.xpath("//button[.='Login']")).click();
	 }
}
