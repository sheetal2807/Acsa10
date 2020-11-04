package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedownloadpopup2 {
	
	//private static final int KeyEvent.VK. = 0

	static {
		System.setProperty("webdriver.geko.driver","./driver/gekodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("browsersExpand")).click();
		driver.findElement(By.xpath("//h3[.='Firefox']/following-sibling::p[1]/child::a")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("gekodriver releases")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.=gekodriver-v0.27.0-win64.zip']")).click();
		Robot r =new Robot();
		r.keyPress(keyEvent.)
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		driver.close();*/
		

	}

}
