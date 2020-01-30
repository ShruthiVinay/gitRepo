package genericLib;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	
	public int getRandomNum() {
		Random ram=new Random();
		return ram.nextInt(10000);
	}
	
	public long getRandomPhoneNum() {
		Random ram=new Random();
		return ram.nextLong(); // ???? can i create random value of 10 digit numbers
	}
	
	public void waitForElementToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForElementToClick(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForElementToVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public void waitAndClickElement(WebDriver driver, WebElement element) throws Throwable {
		int count=0;
		while(count<=20)
		{
			try {
			element.click();
			break;
		}catch(Throwable t) {
			Thread.sleep(1000);
			count++;
		}
			
		}

	}
	
	
	public void select(WebElement element, String option)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(option);
		
	}
	
	
	public void select(WebElement element, int optionIndex)
	{
		Select sel=new Select(element);
		sel.selectByIndex(optionIndex);
	}
	
	
	public void moveMouseonElement(WebElement element, WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(element);
	}
	
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	
	static String parentWinID;
	static String childWinID;
	
	public void switchToChildWindow(WebDriver driver) {
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		parentWinID=it.next();
		childWinID=it.next();
		
		driver.switchTo().window(childWinID);
	}
	
	public void switchToParentWindow(WebDriver driver) {
		driver.switchTo().window(parentWinID);
	}
	
	
	public String createOrganization(WebDriver driver) {      //any return type is needed? Because this method is not calling for 2nd time
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		String orgName="ty_"+ getRandomNum();
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		return orgName;
		
	}
	
}
