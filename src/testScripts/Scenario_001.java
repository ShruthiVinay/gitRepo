/* Scenario1: In VTiger application, create Organization, then create another organization by adding member(add already created organization)

*/
package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import genericLib.WebDriverUtils;

public class Scenario_001 {
	
	
	WebDriverUtils library=new WebDriverUtils();
	WebDriver driver=new FirefoxDriver();
	
	@Test
	String userName ="admin";
	String password="admin";
	String orgName=library.createOrganization(driver);
	String memberName="ABC_"+library.createOrganization(driver);
	//long phoneNum=library.getRandomPhoneNum();
	String emailID=library.createOrganization(driver)+"@gmail.com";
	
	library.
	

}
