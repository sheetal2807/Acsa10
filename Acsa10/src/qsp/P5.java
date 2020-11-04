package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {//6-AUG-20	 get(), get title()
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	// open the chrome browser
		WebDriver driver = new ChromeDriver();
		//enter url
		driver.get("http://www.fb.com");
		//fetch the fb title page
		String title =driver.getTitle();
		System.out.println("title of page is"+title);
		//to fetch url
		String pageURL= driver.getCurrentUrl();
				System.out.println(pageURL);
		//System.out.println("current url of page is "+driver.getCurrentUrl());
		
		//close the browser
		driver.close();

	}

}
