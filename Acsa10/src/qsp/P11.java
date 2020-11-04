package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//facebook page clear...sendkeys...click..8/aug/2020 lec
public class P11 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afc2qBrxftWGXzTpxISMW3IDNJqq3KsS_wbcIFapjcLCkjptMhP1CFLjJHtVSOF72F-wpGyp2Z97spU7wWxWZMcNPzLh0B97z4Kd2g6Pn9bgNA&smuh=42474&lh=Ac9Yfro2-8IRWdTP");
		Thread.sleep(2000);
		
		WebElement usern=driver.findElement(By.id("email"));
		usern.sendKeys("sheetalrkamble7@gmail.com");
		Thread.sleep(2000);
		
		WebElement pwtb =driver.findElement(By.id("pass"));
		pwtb.sendKeys("Indian@123");
			Thread.sleep(2000);
			
			WebElement login=driver.findElement(By.id("u_0_b"));
    			login.click();
    			Thread.sleep(2000);
			
			/*WebElement username =driver.findElement(By.id("u_0_m"));
			username.click();
			username.sendKeys("dinga");
			Thread.sleep(2000);
			
			WebElement Surname =driver.findElement(By.id("u_0_o"));
			Surname.click();
			Surname.sendKeys("pinga");
			Thread.sleep(4000);
			
			
			WebElement password =driver.findElement(By.id("u_0_r"));
			password.click();
			password.sendKeys("dinga@123");
			Thread.sleep(4000);
			password.clear();
			
			WebElement pass =driver.findElement(By.id("password_step_input"));
			pass.click();
			pass.sendKeys("india");
			Thread.sleep(4000);
			pass.clear();
			driver.close();*/
	}
	
}
