package qsp;
//lec 7-aug-20 //p9  //getwindow handles
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class P4 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> a= driver.getWindowHandles();
				for (String x:a){
		System.out.println(x);
	}
             driver.quit();
          }
}