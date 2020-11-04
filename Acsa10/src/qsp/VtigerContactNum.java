package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerContactNum {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
		}
		public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//tr[contains(text()]"));
		
		
		}

}
