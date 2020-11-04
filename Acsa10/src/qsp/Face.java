package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
        
		WebElement tb1 = driver.findElement(By.xpath("//input[@name='email']"));
        tb1.sendKeys("yourmail@gmail.com");
        WebElement tb2 = driver.findElement(By.xpath("//input[@name='pass']"));
        tb2.sendKeys("yourpass");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//i[@class='hu5pjgll lzf7d6o1 sp_-69RjdrrvoB sx_898f60']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Log Out']")).click();
	}

}