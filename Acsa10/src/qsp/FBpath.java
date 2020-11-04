package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBpath {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sheetalrkamble7@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mummy@281997");
			Thread.sleep(2000);
			
		driver.findElement(By.xpath("//button[@name='login']")).click();
    			Thread.sleep(17000);
    		
    	driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
    	Thread.sleep(4000);
    	
    	driver.findElement(By.xpath("//span[text()='Log Out']")).click();
    	driver.findElement(By.xpath("//span[.='Log Out']")).click();
	}
	
}

