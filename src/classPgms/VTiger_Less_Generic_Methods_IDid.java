package classPgms;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import genericLib.WebDriverUtils;

public class VTiger_Less_Generic_Methods_IDid {
	
	WebDriver driver;
	static Random ram=new Random();
	static int rNum=ram.nextInt(10000);
	public static String Organization_Name="TY_"+rNum;
	
	/*static {
		System.setProperty("webdriver.gecko.driver", "D:\\Eclipse Pgms\\SDET\\drivers\\geckodriver.exe");
		
	
	}*/
	public void createOrganization(WebDriver driver) {      //any return type is needed? Because this method is not calling for 2nd time
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(Organization_Name);
		
	}
	
	
	public void waitForElementToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		WebDriverUtils wb=new WebDriverUtils();
		
		VTiger_Less_Generic_Methods_IDid clsObj=new VTiger_Less_Generic_Methods_IDid();
		
		
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		wb.waitForElementToLoad(driver);
		clsObj.createOrganization(driver);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		System.out.println("tessst");
		driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']")).click();
		
		clsObj.createOrganization(driver);
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(Organization_Name);
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		
		
		
		
		
		driver.close();
	}

}
