package ems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class position {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.get("https://qaemsadmin.azurewebsites.net/");
	       driver.findElement(By.xpath("(//div[@class='rederror hide'])[2]")).sendKeys("Steynnn");
	}
}
