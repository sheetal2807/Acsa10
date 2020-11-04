package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {//autosuggestion
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");
        //type java in search box it displays auto suggestion
        driver.findElement(By.name("q")).sendKeys("java");
     Thread.sleep(5000);
        List<WebElement> allAutosuggestions = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
        int count=allAutosuggestions.size();
        System.out.println("count"+count);
        
        for (int i=0;i<allAutosuggestions.size();i++) {
        String  autosug =allAutosuggestions.get(i).getText();
        System.out.println(autosug);

	}
       allAutosuggestions.get(8).click();
      Thread.sleep(3000);
       driver.close();
    }
}