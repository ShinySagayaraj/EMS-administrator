package ems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class preceding {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");

		   driver.findElement(By.linkText("Create new account")).click();
		   driver.findElement(By.xpath("//*[@name='lastname']//preceding::<input>[@type='text']")).sendKeys("fhbfyvu");

}}