package classPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S_3_For_DynamicWebTable {
	
	@Test
	public void webtabletest()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Pgms\\SDET\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("gmail.com");
		driver.findElement(By.id("profileIdentifier")).click();
		driver.findElement(By.className("whsOnd zHQkBf"));
		
		
		
		//driver.findElement(By.xpath("//table[@class='F cf zt']/tbody/tr[*]/td[6]"));
		
	}

}
