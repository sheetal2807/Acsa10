package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\kunal\\OneDrive\\Desktop/Page1.html");
		Thread.sleep(3000);
        WebElement usn = driver.findElement(By.id("t1"));
        usn.sendKeys("sheetal");
        WebElement pwd = driver.findElement(By.id("t2"));
        pwd.sendKeys("sheetal@123");

	}

}
