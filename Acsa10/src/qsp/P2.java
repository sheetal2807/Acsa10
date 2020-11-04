package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class P2 {
	
	static {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		 EdgeDriver driver= new EdgeDriver();
		Thread.sleep(5000);
		driver.close();

	}

}