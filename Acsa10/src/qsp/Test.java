package qsp;

import org.openqa.selenium.WebDriver;

public class Test {

		   WebDriver driver;
		   
		   Test(WebDriver driver){
			   this.driver = driver;
		   }
		   public void fbTest() throws InterruptedException{
			   driver.get("http://www.facebook.com");
			   Thread.sleep(3000);
		   }
			   
			   public void googleTest() throws InterruptedException{
				   driver.get("http://www.google.com");
				   Thread.sleep(3000);
				   driver.close();

	}

}
